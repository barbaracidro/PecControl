/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexão;

import java.util.Objects;


public class BovinoDao {
    private int numero;
    private double peso;
    private String sexo;
    private String datanasc;
    private int codigovenda;
    
    
    public int getNumero(){
        return numero;
    }
    public String getNumeroStr(){
        return String.valueOf(numero);
    }
    
    public void setNumero(int numero){
        this.numero = numero;
    }
    public void setNumero(String numero){
        this.numero = Integer.parseInt(numero);
    }
 
        
    public double getPeso(){
        return peso;
    }
    public String getPesoStr(){
        return String.valueOf(peso);
    }
    public  void setPeso(double peso){
        this.peso = peso;
    }
    public void setPeso(String peso){
        this.peso = Double.parseDouble(peso);
    }
    public String getSexo(){
        return sexo;
    }
    
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    
    public String getDataNasc(){
        return datanasc;
    }
    
    public void setDataNasc(String dataNasc){
        this.datanasc = dataNasc;
    }
    
    public int getCodigoVenda(){
        return codigovenda;
            }
    public String getCodigoVendaStr(){
        return String.valueOf(codigovenda);
    }
     @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.numero;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final BovinoDao other = (BovinoDao) obj;
        if (this.numero!= other.numero) {
            return false;
        }
        if (this.peso!= other.peso) {
            return false;
        }
            if (this.codigovenda!= other.codigovenda) {
            return false;
        }   
       
        if (!Objects.equals(this.datanasc, other.datanasc)) {
            return false;
        }
        if (!Objects.equals(this.sexo, other.sexo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Bovino dao{" + "numero=" + numero + '}';
    }
    
}
    

