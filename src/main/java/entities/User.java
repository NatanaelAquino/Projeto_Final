package main.java.entities;

import java.io.Reader;

public class User {
    private String name;
    private String email;
    private String Password;
    private String Telefone;

    public User( String name, String email, String password) {
        
        this.name = name;
        this.email = email;
        Password = password;
    }
    public String getTelefone() {
        return Telefone;
    }
    public void setTelefone(String telefone) {
        Telefone = telefone;
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
        return Password;
    }
    public void setPassword(String password) {
        Password = password;
    }
}
