package main.java.DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
        private long id;

        public DatabaseDescarte() {
        }

        public void setId(long id) {
            this.id = id;
        }

        public DatabaseDescarte(Long quantidadeSTR, String nomeResiduo, String tipoResiduo, String tipoFase,
                String setor,
                String formaReciclagem, String comoDescartado, String descricaoDescarte) {
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
                                App.home.preencherTabela();
                        }
                } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "A quantidade não é um número válido.");Are you sure you want to continue connecting 
                        
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
                                App.home.preencherTabela();
                        }
                } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "A quantidade não é um número válido.");
                } catch (Exception e) {
                        e.printStackTrace();
                        JOptionPane.showMessageDialog(null, "Erro ao inserir os dados no banco de dados.");
                }
        }
        
}
