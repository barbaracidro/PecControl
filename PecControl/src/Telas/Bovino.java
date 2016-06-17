/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Barbara Cidro
 */
@Entity
@Table(name = "bovino", catalog = "boi", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Bovino.findAll", query = "SELECT b FROM Bovino b"),
    @NamedQuery(name = "Bovino.findByNumero", query = "SELECT b FROM Bovino b WHERE b.numero = :numero"),
    @NamedQuery(name = "Bovino.findByPeso", query = "SELECT b FROM Bovino b WHERE b.peso = :peso"),
    @NamedQuery(name = "Bovino.findBySexo", query = "SELECT b FROM Bovino b WHERE b.sexo = :sexo"),
    @NamedQuery(name = "Bovino.findByDatanasc", query = "SELECT b FROM Bovino b WHERE b.datanasc = :datanasc"),
    @NamedQuery(name = "Bovino.findByCodigovenda", query = "SELECT b FROM Bovino b WHERE b.codigovenda = :codigovenda")})
public class Bovino implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "numero")
    private Integer numero;
    @Column(name = "peso")
    private Long peso;
    @Column(name = "sexo")
    private Character sexo;
    @Column(name = "datanasc")
    @Temporal(TemporalType.DATE)
    private Date datanasc;
    @Column(name = "codigovenda")
    private Integer codigovenda;

    public Bovino() {
    }

    public Bovino(Integer numero) {
        this.numero = numero;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        Integer oldNumero = this.numero;
        this.numero = numero;
        changeSupport.firePropertyChange("numero", oldNumero, numero);
    }

    public Long getPeso() {
        return peso;
    }

    public void setPeso(Long peso) {
        Long oldPeso = this.peso;
        this.peso = peso;
        changeSupport.firePropertyChange("peso", oldPeso, peso);
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        Character oldSexo = this.sexo;
        this.sexo = sexo;
        changeSupport.firePropertyChange("sexo", oldSexo, sexo);
    }

    public Date getDatanasc() {
        return datanasc;
    }

    public void setDatanasc(Date datanasc) {
        Date oldDatanasc = this.datanasc;
        this.datanasc = datanasc;
        changeSupport.firePropertyChange("datanasc", oldDatanasc, datanasc);
    }

    public Integer getCodigovenda() {
        return codigovenda;
    }

    public void setCodigovenda(Integer codigovenda) {
        Integer oldCodigovenda = this.codigovenda;
        this.codigovenda = codigovenda;
        changeSupport.firePropertyChange("codigovenda", oldCodigovenda, codigovenda);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numero != null ? numero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bovino)) {
            return false;
        }
        Bovino other = (Bovino) object;
        if ((this.numero == null && other.numero != null) || (this.numero != null && !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Telas.Bovino[ numero=" + numero + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
