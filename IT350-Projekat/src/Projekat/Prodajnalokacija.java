/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projekat;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Marko
 */
@Entity
@Table(name = "prodajnalokacija", catalog = "it350pz01", schema = "")
@NamedQueries({
    @NamedQuery(name = "Prodajnalokacija.findAll", query = "SELECT p FROM Prodajnalokacija p"),
    @NamedQuery(name = "Prodajnalokacija.findByIDprodajnaLokacija", query = "SELECT p FROM Prodajnalokacija p WHERE p.iDprodajnaLokacija = :iDprodajnaLokacija")})
public class Prodajnalokacija implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_prodajnaLokacija")
    private Integer iDprodajnaLokacija;
    @Lob
    @Column(name = "adresa")
    private String adresa;

    public Prodajnalokacija() {
    }

    public Prodajnalokacija(Integer iDprodajnaLokacija) {
        this.iDprodajnaLokacija = iDprodajnaLokacija;
    }

    public Integer getIDprodajnaLokacija() {
        return iDprodajnaLokacija;
    }

    public void setIDprodajnaLokacija(Integer iDprodajnaLokacija) {
        Integer oldIDprodajnaLokacija = this.iDprodajnaLokacija;
        this.iDprodajnaLokacija = iDprodajnaLokacija;
        changeSupport.firePropertyChange("IDprodajnaLokacija", oldIDprodajnaLokacija, iDprodajnaLokacija);
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        String oldAdresa = this.adresa;
        this.adresa = adresa;
        changeSupport.firePropertyChange("adresa", oldAdresa, adresa);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDprodajnaLokacija != null ? iDprodajnaLokacija.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Prodajnalokacija)) {
            return false;
        }
        Prodajnalokacija other = (Prodajnalokacija) object;
        if ((this.iDprodajnaLokacija == null && other.iDprodajnaLokacija != null) || (this.iDprodajnaLokacija != null && !this.iDprodajnaLokacija.equals(other.iDprodajnaLokacija))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Projekat.Prodajnalokacija[ iDprodajnaLokacija=" + iDprodajnaLokacija + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
