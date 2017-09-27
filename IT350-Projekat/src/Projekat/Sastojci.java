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
@Table(name = "sastojci", catalog = "it350pz01", schema = "")
@NamedQueries({
    @NamedQuery(name = "Sastojci.findAll", query = "SELECT s FROM Sastojci s"),
    @NamedQuery(name = "Sastojci.findByIDsastojak", query = "SELECT s FROM Sastojci s WHERE s.iDsastojak = :iDsastojak")})
public class Sastojci implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_sastojak")
    private Integer iDsastojak;
    @Lob
    @Column(name = "kolicina")
    private String kolicina;
    @Lob
    @Column(name = "imeSastojka")
    private String imeSastojka;

    public Sastojci() {
    }

    public Sastojci(Integer iDsastojak) {
        this.iDsastojak = iDsastojak;
    }

    public Integer getIDsastojak() {
        return iDsastojak;
    }

    public void setIDsastojak(Integer iDsastojak) {
        Integer oldIDsastojak = this.iDsastojak;
        this.iDsastojak = iDsastojak;
        changeSupport.firePropertyChange("IDsastojak", oldIDsastojak, iDsastojak);
    }

    public String getKolicina() {
        return kolicina;
    }

    public void setKolicina(String kolicina) {
        String oldKolicina = this.kolicina;
        this.kolicina = kolicina;
        changeSupport.firePropertyChange("kolicina", oldKolicina, kolicina);
    }

    public String getImeSastojka() {
        return imeSastojka;
    }

    public void setImeSastojka(String imeSastojka) {
        String oldImeSastojka = this.imeSastojka;
        this.imeSastojka = imeSastojka;
        changeSupport.firePropertyChange("imeSastojka", oldImeSastojka, imeSastojka);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDsastojak != null ? iDsastojak.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sastojci)) {
            return false;
        }
        Sastojci other = (Sastojci) object;
        if ((this.iDsastojak == null && other.iDsastojak != null) || (this.iDsastojak != null && !this.iDsastojak.equals(other.iDsastojak))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Projekat.Sastojci[ iDsastojak=" + iDsastojak + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
