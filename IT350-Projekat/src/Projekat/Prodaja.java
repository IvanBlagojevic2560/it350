/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projekat;

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
 * @author Marko
 */
@Entity
@Table(name = "prodaja", catalog = "it350pz01", schema = "")
@NamedQueries({
    @NamedQuery(name = "Prodaja.findAll", query = "SELECT p FROM Prodaja p"),
    @NamedQuery(name = "Prodaja.findByIDprodaja", query = "SELECT p FROM Prodaja p WHERE p.iDprodaja = :iDprodaja"),
    @NamedQuery(name = "Prodaja.findByIDradnik", query = "SELECT p FROM Prodaja p WHERE p.iDradnik = :iDradnik"),
    @NamedQuery(name = "Prodaja.findByDatum", query = "SELECT p FROM Prodaja p WHERE p.datum = :datum")})
public class Prodaja implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_prodaja")
    private Integer iDprodaja;
    @Column(name = "ID_radnik")
    private Integer iDradnik;
    @Column(name = "datum")
    @Temporal(TemporalType.DATE)
    private Date datum;

    public Prodaja() {
    }

    public Prodaja(Integer iDprodaja) {
        this.iDprodaja = iDprodaja;
    }

    public Integer getIDprodaja() {
        return iDprodaja;
    }

    public void setIDprodaja(Integer iDprodaja) {
        Integer oldIDprodaja = this.iDprodaja;
        this.iDprodaja = iDprodaja;
        changeSupport.firePropertyChange("IDprodaja", oldIDprodaja, iDprodaja);
    }

    public Integer getIDradnik() {
        return iDradnik;
    }

    public void setIDradnik(Integer iDradnik) {
        Integer oldIDradnik = this.iDradnik;
        this.iDradnik = iDradnik;
        changeSupport.firePropertyChange("IDradnik", oldIDradnik, iDradnik);
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        Date oldDatum = this.datum;
        this.datum = datum;
        changeSupport.firePropertyChange("datum", oldDatum, datum);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDprodaja != null ? iDprodaja.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Prodaja)) {
            return false;
        }
        Prodaja other = (Prodaja) object;
        if ((this.iDprodaja == null && other.iDprodaja != null) || (this.iDprodaja != null && !this.iDprodaja.equals(other.iDprodaja))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Projekat.Prodaja[ iDprodaja=" + iDprodaja + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
