package main.java.DAO;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import com.mysql.cj.xdevapi.DbDoc;
import com.mysql.cj.xdevapi.JsonParser;

import main.java.utils.Conexao;

public class Local {
    private String name;
    private String cpf_String;
    private String cep;
    private String uf;
    private String cidade;
    private String bairro;
    private String rua;
    private String numero;

    public Local() {
    }

    public Local(String name, String cpf_String, String cep, String uf, String cidade, String bairro, String rua,
            String numero) {
        this.name = name;
        this.cpf_String = cpf_String;
        this.cep = cep;
        this.uf = uf;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
    }

    public void preecnherLocal(JComboBox<String> jComboBox5 ) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        try {
            conn = Conexao.getConnection();
            String sql = "SELECT nome FROM informacoesdescarte";
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            while (rs.next()) {
              model.addElement(rs.getString("nome"));
            }
            jComboBox5.setModel(model);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void salve() {

        String cpnj = cpf_String.replaceAll("\\.", "").replaceAll("-", "").replaceAll("/", "").replaceAll(" ", "");

        if (cpnj.matches("\\d{11}")) {
            // Verificar CPF
            boolean isValido = isCPF(cpnj);
            if (isValido) {
                JOptionPane.showMessageDialog(null, "CPF válido: " + cpnj);
            } else {
                JOptionPane.showMessageDialog(null, "CPF inválido: " + cpnj);
            }
        } else if (cpnj.matches("\\d{14}")) {
            try {
                if (name == null || cpnj.isEmpty() || cep == null || uf == null ||
                        cidade == null || bairro == null || rua == null || numero == null) {
                    JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos.");
                } else {
                    String checkIfExistsQuery = "SELECT COUNT(*) FROM InformacoesDescarte WHERE cpf_cnpj = ?";
                    try (PreparedStatement checkIfExistsStatement = Conexao.getConnection()
                            .prepareStatement(checkIfExistsQuery)) {
                        checkIfExistsStatement.setString(1, cpnj);
                        try (ResultSet resultSet = checkIfExistsStatement.executeQuery()) {
                            resultSet.next();
                            int count = resultSet.getInt(1);
                            if (count > 0) {
                                JOptionPane.showMessageDialog(null, "O CNPJ ou CPF já está cadastrado.");
                                return;
                            }
                        }
                    }
                    String sql = "INSERT INTO InformacoesDescarte (nome, cpf_cnpj, cep, uf, cidade, bairro, rua, numero) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
                    try (PreparedStatement ps = Conexao.getConnection().prepareStatement(sql)) {
                        ps.setString(1, name);
                        ps.setString(2, cpnj);
                        ps.setString(3, cep);
                        ps.setString(4, uf);
                        ps.setString(5, cidade);
                        ps.setString(6, bairro);
                        ps.setString(7, rua);
                        ps.setString(8, numero);
                        ps.executeUpdate();
                        JOptionPane.showMessageDialog(null, "O CNPJ ou CPF está cadastrado.");

                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro ao inserir os dados no banco de dados.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Número fornecido não é um CPF ou CNPJ válido: " + cpnj);
        }
    }

    public void pesquisa(String cpfsString, javax.swing.JTextField jxJLabel2Field,
            javax.swing.JTextField jxJLabel1Field, javax.swing.JTextField jxJLabel4Field,
            javax.swing.JTextField jxJLabel5Field, javax.swing.JTextField jxJLabel6Field,
            javax.swing.JTextField jxJLabel7Field, javax.swing.JTextField jxJLabel8Field) {
                
       
        String cpnj = cpfsString.replaceAll("\\.", "").replaceAll("-", "").replaceAll("/", "").replaceAll(" ", "");
        System.out.println(cpnj);
        if (cpnj.matches("\\d{11}")  ) {
            // Verificar CPF
            boolean isValido = isCPF(cpnj);
            if (isValido) {
                JOptionPane.showMessageDialog(null, "CPF válido: " + cpnj);
            } else {
                JOptionPane.showMessageDialog(null, "CPF inválido: " + cpnj);
            }
        } else if (cpnj.matches("\\d{14}") ) {
            try {
                var client = HttpClient.newHttpClient();
                URI url = URI.create("https://www.receitaws.com.br/v1/cnpj/" + cpnj);
                var request = HttpRequest.newBuilder(url).header("accept", "application/json").build();
                var response = client.send(request, HttpResponse.BodyHandlers.ofString());
                System.out.println(response.body());
                DbDoc json = JsonParser.parseDoc(response.body());
                System.out.println(json);
                jxJLabel1Field.setText(json.get("municipio").toString().replaceAll("\"", ""));
                jxJLabel2Field.setText(json.get("nome").toString().replaceAll("\"", ""));
                jxJLabel4Field.setText(json.get("uf").toString().replaceAll("\"", ""));
                jxJLabel5Field.setText(json.get("logradouro").toString().replaceAll("\"", ""));
                jxJLabel6Field.setText(json.get("numero").toString().replaceAll("\"", ""));
                jxJLabel7Field.setText(json.get("bairro").toString().replaceAll("\"", ""));
                jxJLabel8Field.setText(json.get("cep").toString().replaceAll("\"", ""));

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "CNPJ INVALIDO");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Número fornecido não é um CPF ou CNPJ válido: " + cpnj);
        }
    }

    public static boolean isCPF(String CPF) {
        if (CPF.length() != 11 || CPF.matches("(\\d)\\1{10}"))
            return false;

        try {
            int sum1 = 0, sum2 = 0;
            for (int i = 0; i < 9; i++) {
                int num = CPF.charAt(i) - '0';
                sum1 += num * (10 - i);
                sum2 += num * (11 - i);
            }
            sum2 += (CPF.charAt(9) - '0') * 2;
            int check1 = (sum1 * 10 % 11) % 10;
            int check2 = (sum2 * 10 % 11) % 10;
            return check1 == CPF.charAt(9) - '0' && check2 == CPF.charAt(10) - '0';
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
