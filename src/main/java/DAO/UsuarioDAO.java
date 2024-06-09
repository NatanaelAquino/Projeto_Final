package main.java.DAO;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import main.java.entities.User;
import main.java.utils.Conexao;


public class UsuarioDAO {
    


    public void cadastrarUsuario(User User) throws SQLException{

        String sql = "INSERT INTO USUARIO (NOME, SENHA,EMAIL) VALUES (?,?,?)";

        PreparedStatement ps = null; 


        try {

            ps = Conexao.getConnection().prepareStatement(sql);
            ps.setString(1, User.getName());
            ps.setString(2, User.getPassword());
            ps.setString(3, User.getEmail());
            ps.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }
     
    }
}

