package main.java.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import main.java.App;
import main.java.utils.Conexao;

public class Filtro {

    public void calcularQuantidades(javax.swing.JLabel  lbDescription,javax.swing.JLabel  lbDescription1,javax.swing.JLabel  lbDescription2) {
        Connection conn = null;
        PreparedStatement pstmtReciclavel = null;
        PreparedStatement pstmtNaoReciclavel = null;
        ResultSet rsReciclavel = null;
        ResultSet rsNaoReciclavel = null;
        Integer  quantidadeReciclavel = 0;
        Integer  quantidadeNaoReciclavel= 0;
       

        try {
            conn = Conexao.getConnection();
            String id = App.userID;

            if (id == null) {
                System.out.println(
                        "ID do usuário não definido. Certifique-se de que o login foi realizado corretamente.");
                return;
            }
            System.out.println("ID do usuário: " + id);

            String sqlReciclavel = "SELECT SUM(quantidade) AS quantidade_reciclavel FROM descarte WHERE usuario_id = ? AND forma_reciclagem = 'Reciclavel'";
            pstmtReciclavel = conn.prepareStatement(sqlReciclavel);
            pstmtReciclavel.setString(1, id);
            rsReciclavel = pstmtReciclavel.executeQuery();

            String sqlNaoReciclavel = "SELECT SUM(quantidade) AS quantidade_nao_reciclavel FROM descarte WHERE usuario_id = ? AND forma_reciclagem = 'Não Reciclavel'";
            pstmtNaoReciclavel = conn.prepareStatement(sqlNaoReciclavel);
            pstmtNaoReciclavel.setString(1, id);
            rsNaoReciclavel = pstmtNaoReciclavel.executeQuery();

            if (rsReciclavel.next()) {
                quantidadeReciclavel = rsReciclavel.getInt("quantidade_reciclavel");
                System.out.println("Quantidade de resíduos  recicláveis: " + quantidadeReciclavel);
                lbDescription1.setText(Integer.toString(quantidadeReciclavel));

            }
            
            if (rsNaoReciclavel.next()) {
                quantidadeNaoReciclavel = rsNaoReciclavel.getInt("quantidade_nao_reciclavel");
                System.out.println("Quantidade de resíduos não recicláveis: " + quantidadeNaoReciclavel);
                lbDescription2.setText(Integer.toString(quantidadeNaoReciclavel));
            }
    
            Integer Total = quantidadeReciclavel + quantidadeNaoReciclavel;
            lbDescription.setText(Integer.toString(Total));
            
            

        } catch (SQLException e) {
            e.printStackTrace();
        } 

    }
   
    public void calcularQuantidadesAdm(javax.swing.JLabel lbDescription9,javax.swing.JLabel lbDescription10,javax.swing.JLabel lbDescription6) {

        Connection conn = null;
        PreparedStatement pstmtReciclavel = null;
        PreparedStatement pstmtNaoReciclavel = null;
        ResultSet rsReciclavel = null;
        ResultSet rsNaoReciclavel = null;
        Integer  quantidadeReciclavel = 0;
        Integer  quantidadeNaoReciclavel= 0;;


        try {
            conn = Conexao.getConnection();
            String id = App.userID;
            System.out.println("ID do usuário: " + id);
            String sqlReciclavel = "SELECT SUM(quantidade) AS quantidade_reciclavel FROM descarte WHERE setor = 'Administração' AND forma_reciclagem = 'Reciclavel'";
            pstmtReciclavel = conn.prepareStatement(sqlReciclavel);
            rsReciclavel = pstmtReciclavel.executeQuery();

            String sqlNaoReciclavel = "SELECT SUM(quantidade) AS quantidade_nao_reciclavel FROM descarte WHERE setor = 'Administração' AND forma_reciclagem = 'Não Reciclável'";
            pstmtNaoReciclavel = conn.prepareStatement(sqlNaoReciclavel);
            rsNaoReciclavel = pstmtNaoReciclavel.executeQuery();

            if (rsReciclavel.next()) {
                quantidadeReciclavel = rsReciclavel.getInt("quantidade_reciclavel");
                System.out.println("Quantidade de resíduos  recicláveis: " + quantidadeReciclavel);
                lbDescription9.setText(Integer.toString(quantidadeReciclavel));
            }
            
            if (rsNaoReciclavel.next()) {
                quantidadeNaoReciclavel = rsNaoReciclavel.getInt("quantidade_nao_reciclavel");
                System.out.println("Quantidade de resíduos não recicláveis: " + quantidadeNaoReciclavel);
                lbDescription10.setText(Integer.toString(quantidadeNaoReciclavel));
            }
           
            Integer Total = quantidadeReciclavel + quantidadeNaoReciclavel;
            lbDescription6.setText(Integer.toString(Total));
            

        } catch (SQLException e) {
            e.printStackTrace();
        } 

    }
    public void calcularQuantidadesProducao(javax.swing.JLabel lbDescription17,javax.swing.JLabel lbDescription16,javax.swing.JLabel lbDescription15) {
       
        Connection conn = null;
        PreparedStatement pstmtReciclavel = null;
        PreparedStatement pstmtNaoReciclavel = null;
        ResultSet rsReciclavel = null;
        ResultSet rsNaoReciclavel = null;
        Integer  quantidadeReciclavel = 0;
        Integer  quantidadeNaoReciclavel= 0;;


        try {
            conn = Conexao.getConnection();
            String id = App.userID;
            System.out.println("ID do usuário: " + id);
            String sqlReciclavel = "SELECT SUM(quantidade) AS quantidade_reciclavel FROM descarte WHERE setor = 'Produção' AND forma_reciclagem = 'Reciclavel'";
            pstmtReciclavel = conn.prepareStatement(sqlReciclavel);
            rsReciclavel = pstmtReciclavel.executeQuery();

            String sqlNaoReciclavel = "SELECT SUM(quantidade) AS quantidade_nao_reciclavel FROM descarte WHERE setor = 'Produção' AND forma_reciclagem = 'Não Reciclável'";
            pstmtNaoReciclavel = conn.prepareStatement(sqlNaoReciclavel);
            rsNaoReciclavel = pstmtNaoReciclavel.executeQuery();

            if (rsReciclavel.next()) {
                quantidadeReciclavel = rsReciclavel.getInt("quantidade_reciclavel");
                System.out.println("Quantidade de resíduos  recicláveis: " + quantidadeReciclavel);
                lbDescription17.setText(Integer.toString(quantidadeReciclavel));
            }
            
            if (rsNaoReciclavel.next()) {
                quantidadeNaoReciclavel = rsNaoReciclavel.getInt("quantidade_nao_reciclavel");
                System.out.println("Quantidade de resíduos não recicláveis: " + quantidadeNaoReciclavel);
                lbDescription16.setText(Integer.toString(quantidadeNaoReciclavel));
            }
           
            Integer Total = quantidadeReciclavel + quantidadeNaoReciclavel;
            lbDescription15.setText(Integer.toString(Total));
            

        } catch (SQLException e) {
            e.printStackTrace();
        } 

    }
    public void calcularQuantidadesLog( javax.swing.JLabel lbDescription12,javax.swing.JLabel lbDescription14,javax.swing.JLabel lbDescription13) {
        
        Connection conn = null;
        PreparedStatement pstmtReciclavel = null;
        PreparedStatement pstmtNaoReciclavel = null;
        ResultSet rsReciclavel = null;
        ResultSet rsNaoReciclavel = null;
        Integer  quantidadeReciclavel = 0;
        Integer  quantidadeNaoReciclavel= 0;;


        try {
            conn = Conexao.getConnection();
            String id = App.userID;
            System.out.println("ID do usuário: " + id);
            String sqlReciclavel = "SELECT SUM(quantidade) AS quantidade_reciclavel FROM descarte WHERE setor = 'Logistica' AND forma_reciclagem = 'Reciclavel'";
            pstmtReciclavel = conn.prepareStatement(sqlReciclavel);
            rsReciclavel = pstmtReciclavel.executeQuery();

            String sqlNaoReciclavel = "SELECT SUM(quantidade) AS quantidade_nao_reciclavel FROM descarte WHERE setor = 'Logistica' AND forma_reciclagem = 'Não Reciclável'";
            pstmtNaoReciclavel = conn.prepareStatement(sqlNaoReciclavel);
            rsNaoReciclavel = pstmtNaoReciclavel.executeQuery();

            if (rsReciclavel.next()) {
                quantidadeReciclavel = rsReciclavel.getInt("quantidade_reciclavel");
                System.out.println("Quantidade de resíduos  recicláveis: " + quantidadeReciclavel);
                lbDescription12.setText(Integer.toString(quantidadeReciclavel));
            }
            
            if (rsNaoReciclavel.next()) {
                quantidadeNaoReciclavel = rsNaoReciclavel.getInt("quantidade_nao_reciclavel");
                System.out.println("Quantidade de resíduos não recicláveis: " + quantidadeNaoReciclavel);
                lbDescription14.setText(Integer.toString(quantidadeNaoReciclavel));
            }
           
            Integer Total = quantidadeReciclavel + quantidadeNaoReciclavel;
            lbDescription13.setText(Integer.toString(Total));
            

        } catch (SQLException e) {
            e.printStackTrace();
        } 
   
    }
}