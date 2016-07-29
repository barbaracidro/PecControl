
package Conexão;
import Codigos.CadastroBovino;
import java.sql.*;
import  java.util.List;


public class ManipulaarDados {
    
    private Conexao conex = new Conexao();
    private PreparedStatement stm;
    private ResultSet rsDados;
    private Connection con = null;
    
    
    public void carregarView(){
        String sql = "select * from bovino";
        Statement st;
        
        try{
            conex.conectar();
            con = conex.getConn();
            int x = ResultSet.TYPE_SCROLL_SENSITIVE;
            int y = ResultSet.CONCUR_UPDATABLE;
            
            stm = con.prepareStatement(sql, x, y);
            rsDados = stm.executeQuery();
            rsDados.next();
        } catch (Exception e){
            throw new RuntimeException(e);
    
        }
    }
    public BovinoDao getBovino(){
        BovinoDao b = new BovinoDao();
        
        try{
            b.setNumero(rsDados.getString("numero"));
            b.setPeso(rsDados.getString("peso"));
            b.setSexo(rsDados.getString("sexo"));
            b.setDataNasc(rsDados.getString("datanasc"));
            
            return b;
            
        } catch(Exception e){
            throw new RuntimeException(e);
            
            
                }
    }
        public void proximo(){
            try{
                if(rsDados.next() == false) rsDados.previous();
            } catch(Exception e){
                throw new RuntimeException(e);
                   
                           
            }
        }
        public boolean finalLista(){
            try{
                return rsDados.isLast();
            }
            catch(Exception e){
                throw  new RuntimeException(e);
            }
        
    }
        public void cadastroBovino(BovinoDao b, int i) throws SQLException{
        String sql = "insert into boi  (numero, peso, dataNasc, codigoVenda)";
        Mensagens ms = new Mensagens("boi");
        
        try{
            
            i=i++;       
            conex.conectar();
            con = conex.getConn();
            stm = con.prepareStatement(sql);
            stm.setString(i, b.getNumeroStr());
            stm.setString(i, b.getPesoStr());
            stm.setString(i, b.getSexo());
            stm.execute();
            ms.informacao("cadastrado");
            stm.close();
        }
        catch (Exception e){
            throw new RuntimeException(e);
            
        }
        
      
        
        }
        }
    

