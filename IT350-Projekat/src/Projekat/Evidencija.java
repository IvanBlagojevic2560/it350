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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Marko
 */
@Entity
@Table(name = "evidencija", catalog = "it350pz01", schema = "")
@NamedQueries({
    @NamedQuery(name = "Evidencija.findAll", query = "SELECT e FROM Evidencija e"),
    @NamedQuery(name = "Evidencija.findByIDevidencija", query = "SELECT e FROM Evidencija e WHERE e.iDevidencija = :iDevidencija"),
    @NamedQuery(name = "Evidencija.findByIDsladoled", query = "SELECT e FROM Evidencija e WHERE e.iDsladoled = :iDsladoled"),
    @NamedQuery(name = "Evidencija.findByIDprodaja", query = "SELECT e FROM Evidencija e WHERE e.iDprodaja = :iDprodaja")})
public class Evidencija implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_evidencija")
    private Integer iDevidencija;
    @Column(name = "ID_sladoled")
    private Integer iDsladoled;
    @Column(name = "ID_prodaja")
    private Integer iDprodaja;

    public Evidencija() {
    }

    public Evidencija(Integer iDevidencija) {
        this.iDevidencija = iDevidencija;
    }

    public Integer getIDevidencija() {
        return iDevidencija;
    }

    public void setIDevidencija(Integer iDevidencija) {
        Integer oldIDevidencija = this.iDevidencija;
        this.iDevidencija = iDevidencija;
        changeSupport.firePropertyChange("IDevidencija", oldIDevidencija, iDevidencija);
    }

    public Integer getIDsladoled() {
        return iDsladoled;
    }

    public void setIDsladoled(Integer iDsladoled) {
        Integer oldIDsladoled = this.iDsladoled;
        this.iDsladoled = iDsladoled;
        changeSupport.firePropertyChange("IDsladoled", oldIDsladoled, iDsladoled);
    }

    public Integer getIDprodaja() {
        return iDprodaja;
    }

    public void setIDprodaja(Integer iDprodaja) {
        Integer oldIDprodaja = this.iDprodaja;
        this.iDprodaja = iDprodaja;
        changeSupport.firePropertyChange("IDprodaja", oldIDprodaja, iDprodaja);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDevidencija != null ? iDevidencija.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Evidencija)) {
            return false;
        }
        Evidencija other = (Evidencija) object;
        if ((this.iDevidencija == null && other.iDevidencija != null) || (this.iDevidencija != null && !this.iDevidencija.equals(other.iDevidencija))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Projekat.Evidencija[ iDevidencija=" + iDevidencija + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
