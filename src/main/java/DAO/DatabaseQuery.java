package main.java.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.table.DefaultTableModel;

import main.java.App;
import main.java.utils.Conexao;

public class DatabaseQuery {

    private String senha;
    private String id;
    private String nome;
    private String email;
    public DatabaseQuery() {
    }
  

    public DatabaseQuery(String senha, String id) {
        this.senha = senha;
        this.id = id;
    }

    public DatabaseQuery(String senha, String id, String nome, String email) {
        this.senha = senha;
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void Login() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = Conexao.getConnection();
            String sql = "SELECT * FROM usuario WHERE idUsuario = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, id);
            rs = pstmt.executeQuery();

            if (rs.next()) {
                String senhaBanco = rs.getString("senha");
                if (senhaBanco.equals(this.senha)) {
                    App.userID = rs.getString("idUsuario");
                    System.out.println("Login bem-sucedido, ID do usuário: " + App.userID);
                    App.login.setVisible(false);
                    App.menu.setVisible(true);
                    App.menu.preencherTabela();
                    App.menu.preencherDados();
                    App.DesempenhoNovo.preencherDados();
                } else {
                    System.out.println("Senha incorreta");
                }
            } else {
                System.out.println("Usuário não encontrado");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } 
        
    }

    public void preencherTabela(javax.swing.JTable jTable) {
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        model.setRowCount(0);

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = Conexao.getConnection();
            String id = App.userID;

            if (id == null) {
                System.out.println(
                        "ID do usuário não definido. Certifique-se de que o login foi realizado corretamente.");
                return;
            }
            System.out.println("ID do usuário: " + id);
            String sql = "SELECT tipo_residuo, quantidade, data_descarte, id , nome_residuo FROM descarte WHERE usuario_id = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, id);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                String tipo = rs.getString("tipo_residuo");
                Long quantidade = rs.getLong("quantidade");
                Date data = rs.getDate("data_descarte");
                String nome = rs.getString("nome_residuo");
                int idDescarte = rs.getInt("id");

                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                String dataFormatada = sdf.format(data);

                System.out.println("Tipo: " + tipo + ", Quantidade: " + quantidade + ", Data: " + dataFormatada);

                model.addRow(new Object[] { idDescarte, nome, tipo, quantidade, dataFormatada, });
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } 
        }
    }
