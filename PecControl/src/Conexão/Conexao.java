
package Conexão;

import java.sql.Connection;
import java.sql.DriverManager;


public class Conexao {
     public static void main(String[] args) {  
       
    try {  
 // jdbc:postgresql://localhost:5432/TesteJava
            String url = "C:\\Program Files (x86)\\PostgreSQL\\9.0\\data\\boi";  
            String usuario = "postgres";  
            String senha = "root";  
  
            Class.forName("org.postgresql.Driver");  
  
            Connection con;  
  
            con = DriverManager.getConnection(url, usuario, senha);  
  
            System.out.println("Conexão realizada com sucesso.");  
  
           // Statement stm = con.createStatement();  
  
            ///stm.executeQuery("INSERT INTO teste VALUES (1,'Cynthia')");  
  
            //stm.executeUpdate("INSERT INTO teste VALUES (1,'Cynthia')");  
            //Editado 21/09/2011 para correção: executeQuery é usado para pesquisa, executeUpdate deve ser usado para inserir  
            con.close();  
  
        } catch (Exception e) {  
             e.printStackTrace();  
        }  
    }  
    
}


