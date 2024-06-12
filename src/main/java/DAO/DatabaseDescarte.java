package main.java.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import main.java.App;
import main.java.utils.Conexao;

public class DatabaseDescarte {
        private Long quantidadeSTR;
        private String nomeResiduo;
        private String tipoResiduo;
        private String tipoFase;
        private String setor;
        private String formaReciclagem;
        private String comoDescartado;
        private String descricaoDescarte;
        private Integer id;

        public DatabaseDescarte() {
        }


        public DatabaseDescarte(Long quantidadeSTR, String nomeResiduo, String tipoResiduo,
        String tipoFase,String setor,String formaReciclagem, String comoDescartado, String descricaoDescarte) {
                this.quantidadeSTR = quantidadeSTR;
                this.nomeResiduo = nomeResiduo;
                this.tipoResiduo = tipoResiduo;
                this.tipoFase = tipoFase;
                this.setor = setor;
                this.formaReciclagem = formaReciclagem;
                this.comoDescartado = comoDescartado;
                this.descricaoDescarte = descricaoDescarte;
        }

        public void novodescarte() {
                try {
                        if (nomeResiduo == null || nomeResiduo.isEmpty() || tipoResiduo == null || tipoFase == null ||
                                        setor == null || quantidadeSTR == null || comoDescartado == null
                                        || descricaoDescarte.isEmpty()) {
                                JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos.");
                        } else {
                                String sql = "INSERT INTO descarte (nome_residuo, tipo_residuo, tipo_fase, setor, forma_reciclagem, quantidade, como_descartado, descricao_descarte, usuario_id) VALUES (?,?,?,?,?,?,?,?,?)";
                                try (PreparedStatement ps = Conexao.getConnection().prepareStatement(sql)) {
                                        ps.setString(1, nomeResiduo);
                                        ps.setString(2, tipoResiduo);
                                        ps.setString(3, tipoFase);
                                        ps.setString(4, setor);
                                        ps.setString(5, formaReciclagem);
                                        ps.setLong(6, quantidadeSTR);
                                        ps.setString(7, comoDescartado);
                                        ps.setString(8, descricaoDescarte);
                                        ps.setString(9, App.userID);
                                        ps.executeUpdate();
                                }
                        }
                } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "A quantidade não é um número válido.");

                } catch (Exception e) {
                        e.printStackTrace();
                        JOptionPane.showMessageDialog(null, "Erro ao inserir os dados no banco de dados.");
                }
        }

        public void editardescarte(String nomeResiduo, String tipoResiduo, String tipoFase, String setor,
                        long quantidade, String formaReciclagem, String comoDescartado, String descricaoDescarte,
                        long id) {

                try {
                        if (nomeResiduo == null || nomeResiduo.isEmpty() || tipoResiduo == null || tipoFase == null
                                        || setor == null || quantidade <= 0 || comoDescartado == null
                                        || descricaoDescarte.isEmpty()) {
                                JOptionPane.showMessageDialog(null,
                                                "Por favor, preencha todos os campos corretamente.");
                        } else {
                                String sql = "UPDATE descarte SET nome_residuo = ?, tipo_residuo = ?, tipo_fase = ?, setor = ?, forma_reciclagem = ?, quantidade = ?, como_descartado = ?, descricao_descarte = ? WHERE id = ?";
                                try (PreparedStatement ps = Conexao.getConnection().prepareStatement(sql)) {
                                        ps.setString(1, nomeResiduo);
                                        ps.setString(2, tipoResiduo);
                                        ps.setString(3, tipoFase);
                                        ps.setString(4, setor);
                                        ps.setString(5, formaReciclagem);
                                        ps.setLong(6, quantidade);
                                        ps.setString(7, comoDescartado);
                                        ps.setString(8, descricaoDescarte);
                                        ps.setLong(9, id);
                                        ps.executeUpdate();
                                }
                        }
                } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "A quantidade não é um número válido.");
                } catch (Exception e) {
                        e.printStackTrace();
                        JOptionPane.showMessageDialog(null, "Erro ao inserir os dados no banco de dados.");
                }
        }

        public void preencha(javax.swing.JComboBox jComboBox1, javax.swing.JComboBox jComboBox2,
                        javax.swing.JComboBox jComboBox3, javax.swing.JComboBox jComboBox4,
                        javax.swing.JComboBox jComboBox5, javax.swing.JTextArea jTextArea1,
                        javax.swing.JTextField jTextField1,javax.swing.JTextField jTextField3, String id) {

                Connection conn = null;
                PreparedStatement pstmt = null;
                ResultSet rs = null;

                try {
                        conn = Conexao.getConnection();
                        String sql = "SELECT * FROM descarte WHERE id = " + id;
                        pstmt = conn.prepareStatement(sql);
                        rs = pstmt.executeQuery();

                        if (rs.next()) {
                                Integer quantidadeSTR = rs.getInt("quantidade");
                                String nomeResiduo = rs.getString("nome_residuo");
                                String tipoResiduo = rs.getString("tipo_residuo");
                                String tipoFase = rs.getString("tipo_fase");
                                String setor = rs.getString("setor");
                                String formaReciclagem = rs.getString("forma_reciclagem");
                                String comoDescartado = rs.getString("como_descartado");
                                String descricaoDescarte = rs.getString("descricao_descarte");

                                jComboBox1.setSelectedItem(formaReciclagem);
                                jComboBox2.setSelectedItem(comoDescartado);
                                jComboBox3.setSelectedItem(tipoResiduo);
                                jComboBox4.setSelectedItem(tipoFase);
                                jComboBox5.setSelectedItem(setor);
                                jTextArea1.setText(descricaoDescarte);
                                jTextField3.setText(nomeResiduo);
                                jTextField1.setText(Integer.toString(quantidadeSTR));
                        }
                } catch (SQLException e) {
                        e.printStackTrace();
                }
        }

}
