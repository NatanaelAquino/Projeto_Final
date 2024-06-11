package main.java.DAO;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import javax.swing.JOptionPane;

import com.mysql.cj.xdevapi.DbDoc;
import com.mysql.cj.xdevapi.JsonParser;

public class Local {

    public void pesquisa(String cpfsString,javax.swing.JTextField jxJLabel2Field, javax.swing.JTextField jxJLabel1Field ,javax.swing.JTextField jxJLabel4Field ,
    javax.swing.JTextField jxJLabel5Field ,javax.swing.JTextField jxJLabel6Field ,javax.swing.JTextField jxJLabel7Field ,javax.swing.JTextField jxJLabel8Field){
        if (cpfsString.matches("\\d{11}")) {
            // Verificar CPF
            boolean isValido = isCPF(cpfsString);
            if (isValido) {
                JOptionPane.showMessageDialog(null,"CPF válido: " + cpfsString);
            } else {
               JOptionPane.showMessageDialog(null,"CPF inválido: " + cpfsString);
            }
        } else if (cpfsString.matches("\\d{14}")) {
            try {
                var client = HttpClient.newHttpClient();
                URI url = URI.create("https://www.receitaws.com.br/v1/cnpj/" + cpfsString);
                var request = HttpRequest.newBuilder(url).header("accept", "application/json").build();
                var response = client.send(request, HttpResponse.BodyHandlers.ofString());
                System.out.println(response.body());
                DbDoc json = JsonParser.parseDoc(response.body());
                System.out.println(json);
                jxJLabel1Field.setText(json.get("municipio").toString().replaceAll("\"", "")) ;
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
            JOptionPane.showMessageDialog(null, "Número fornecido não é um CPF ou CNPJ válido: " + cpfsString);
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
