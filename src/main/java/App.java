package main.java;

import main.java.DAO.DatabaseQuery;
import main.java.entities.GUI.Criar;
import main.java.entities.GUI.DescarteNovo;
import main.java.entities.GUI.Login;
import main.java.entities.GUI.Menu;
import main.java.entities.GUI.PerfilNovo;
import main.java.entities.GUI.DesempenhoNovo;
import main.java.entities.GUI.Editar;

public class App {
    public static String userID;
    public static DatabaseQuery dados = new DatabaseQuery();
    public static Menu menu = new Menu();
    public static DescarteNovo DescarteNovo = new DescarteNovo();
    public static DesempenhoNovo DesempenhoNovo = new DesempenhoNovo();
    public static Editar Editar = new Editar();
    public static PerfilNovo PerfilNovo = new PerfilNovo();
    public static Login login = new Login(); 
    public static Criar Criar = new Criar();

    public static void main(String[] args) {
        login.setVisible(true);
    }
}
