package main.java.entities;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import com.mysql.cj.xdevapi.DbDoc;
import com.mysql.cj.xdevapi.JsonParser;
import main.java.App;
import main.java.utils.Conexao;
import main.java.utils.Muda;

public class User {
    private String name;
    private String email;
    private String password;
    private String telefone;
    private String cep;
    private String uf;
    private String bairro;
    private String cidade;
    private String numero;
    private String rua;

    public User() {
    }

    public User(String name, String email, String password, String telefone, String cep, String uf, String cidade,
            String numero, String rua) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.telefone = telefone;
        this.cep = cep;
        this.uf = uf;
        this.cidade = cidade;
        this.numero = numero;
        this.rua = rua;
    }

    public User(String name, String email, String password, String telefone, String cep, String uf, String bairro,
            String cidade, String numero, String rua) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.telefone = telefone;
        this.cep = cep;
        this.uf = uf;
        this.bairro = bairro;
        this.cidade = cidade;
        this.numero = numero;
        this.rua = rua;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void consultCep(String cep, JTextField jTextField8, JTextField jTextField9, JTextField jTextField7) {
        var client = HttpClient.newHttpClient();
        URI url = URI.create("https://viacep.com.br/ws/" + cep + "/json/");
        var request = HttpRequest.newBuilder(url).header("accept", "application/json").build();
        try {
            var response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());
            DbDoc json = JsonParser.parseDoc(response.body());
            jTextField7.setText(json.get("logradouro").toString().replaceAll("\"", "")+ json.get("bairro").toString().replaceAll("\"", ""));
            jTextField9.setText(json.get("localidade").toString().replaceAll("\"", ""));
            jTextField8.setText(json.get("uf").toString().replaceAll("\"", ""));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "CEP INVALIDO");
        }
    }

    public void consultCepCria(String cep, JTextField jTextField8, JTextField jTextField6, JTextField jTextField11,
            JTextField jTextField5) {
       
        try {
            var client = HttpClient.newHttpClient();
            URI url = URI.create("https://viacep.com.br/ws/" + cep + "/json/");
            var request = HttpRequest.newBuilder(url).header("accept", "application/json").build();
            var response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());
            DbDoc json = JsonParser.parseDoc(response.body());
            jTextField8.setText(json.get("localidade").toString().replaceAll("\"", ""));
            jTextField6.setText(json.get("logradouro").toString().replaceAll("\"", ""));
            jTextField11.setText(json.get("bairro").toString().replaceAll("\"", ""));
            jTextField5.setText(json.get(" uf").toString().replaceAll("\"", ""));
        } catch (Exception e) {
        }
    }

    public void alterarDados() {
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            conn = Conexao.getConnection();

            String sql = "UPDATE Usuario SET Nome = ?, Senha = ?, Email = ?, Telefone = ?, CEP = ?, UF = ?, Cidade = ?, Numero = ?, Rua = ? WHERE idUsuario = "
                    + App.userID;

            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, name);
            pstmt.setString(2, password);
            pstmt.setString(3, email);
            pstmt.setString(4, telefone);
            pstmt.setString(5, cep);
            pstmt.setString(6, uf);
            pstmt.setString(7, cidade);
            pstmt.setString(8, numero);
            pstmt.setString(9, rua);

            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Atualização bem-sucedida!");
            } else {
                System.out.println("Nenhuma linha foi atualizada.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void criarUsuario() {
        String sql = "INSERT INTO USUARIO (Nome, Senha, Email, telefone, cep, uf, cidade, numero, rua) VALUES (?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = null;
        try {
            ps = Conexao.getConnection().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, password);
            ps.setString(3, email);
            ps.setString(4, telefone);
            ps.setString(5, cep);
            ps.setString(6, uf);
            ps.setString(7, cidade);
            ps.setString(8, numero);
            ps.setString(9, rua);
            // Execute the statement
            ps.executeUpdate();
            Muda muda = new Muda();
            muda.Volta();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
