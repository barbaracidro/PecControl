
package Conexão;

import java.sql.Connection;
import java.sql.DriverManager;


public class Conexao {
    
    private Connection con;
    private String url="jdbc:postgresql://localhost:5432/boi";
    private String usuario = "postgres";
    private String senha = "root";
    
    public void conectar(){
        Mensagens ms = new Mensagens("PecControl");
        try{
            Class.forName("org.postgresql.Driver");
            this.con= DriverManager.getConnection(url, usuario,senha);
           
        }catch(Exception e){
            ms.erro("Conexão falhou");
            
                    
        }
    }
    
    public Connection getConn(){
        return con;
    }
 
    
}