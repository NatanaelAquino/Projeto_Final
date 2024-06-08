package main.java.utils;

import main.java.App;

public class Muda {


    public void perfil(){
        App.menu.setVisible(false);
        App.PerfilNovo.setVisible(true);
        App.DescarteNovo.setVisible(false);
        App.DesempenhoNovo.setVisible(false);
        App.Editar.setVisible(false);

    }
    public void Home(){
        App.menu.setVisible(true);
        App.PerfilNovo.setVisible(false);
        App.DescarteNovo.setVisible(false);
        App.DesempenhoNovo.setVisible(false);
        App.Editar.setVisible(false);

    }
    public void desempenho(){
        App.menu.setVisible(false);
        App.PerfilNovo.setVisible(false);
        App.DescarteNovo.setVisible(false);
        App.DesempenhoNovo.setVisible(true);
        App.Editar.setVisible(false);

    }
    public void descartado(){
        App.menu.setVisible(false);
        App.PerfilNovo.setVisible(false);
        App.DescarteNovo.setVisible(true);
        App.DesempenhoNovo.setVisible(false);
        App.Editar.setVisible(false);

    }
    public void Editar(){
        App.menu.setVisible(false);
        App.PerfilNovo.setVisible(false);
        App.DescarteNovo.setVisible(false);
        App.Editar.setVisible(true);
        App.DesempenhoNovo.setVisible(false);
    }








    
}
