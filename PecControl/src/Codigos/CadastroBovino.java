
package Codigos;

import java.util.Date;


public class CadastroBovino {
    
    private int numero;
    private double peso;
    private String sexo; 
    private Date dataNasc;

    public CadastroBovino(int numero, double peso, String sexo, Date dataNasc) {
        this.numero = numero;
        this.peso = peso;
        this.sexo = sexo;
        this.dataNasc = dataNasc;
    }
   
    
}