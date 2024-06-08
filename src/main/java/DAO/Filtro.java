package main.java.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import main.java.utils.Conexao;

public class Filtro {

    public long quantidadeProducao() {
        long quantidade = 0;
        try {
            Connection conn = Conexao.getConnection();
            String sql = "SELECT SUM(quantidade) AS soma_quantidade FROM descarte WHERE setor = 'produção'";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                quantidade = rs.getLong("soma_quantidade");
                System.out.println(quantidade);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return quantidade;
    }

    public long quantidadeAdministracao() {
        long quantidade = 0;
        try {
            Connection conn = Conexao.getConnection();
            String sql = "SELECT SUM(quantidade) AS soma_quantidade FROM descarte WHERE setor = 'Administração'";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                quantidade = rs.getLong("soma_quantidade");
                System.out.println(quantidade);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return quantidade;
    }

    public long quantidadeLogistica() {
        long quantidade = 0;
        try {
            Connection conn = Conexao.getConnection();
            String sql = "SELECT SUM(quantidade) AS soma_quantidade FROM descarte WHERE setor = 'Logística'";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                quantidade = rs.getLong("soma_quantidade");
                System.out.println(quantidade);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return quantidade;
    }
    public long quantidadeReciclagemPorSetor(String setor) {
        long quantidade = 0;
        try {
            Connection conn = Conexao.getConnection();
            String sql = "SELECT SUM(quantidade) AS soma_quantidade FROM descarte WHERE setor = ? AND forma_reciclagem = 1";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, setor);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                quantidade = rs.getLong("soma_quantidade");
                System.out.println("Quantidade de itens recicláveis no setor " + setor + ": " + quantidade);
            }

            pstmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return quantidade;
    }
   
    
}