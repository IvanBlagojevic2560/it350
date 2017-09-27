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
@Table(name = "sladoled", catalog = "it350pz01", schema = "")
@NamedQueries({
    @NamedQuery(name = "Sladoled.findAll", query = "SELECT s FROM Sladoled s"),
    @NamedQuery(name = "Sladoled.findByIDsladoled", query = "SELECT s FROM Sladoled s WHERE s.iDsladoled = :iDsladoled"),
    @NamedQuery(name = "Sladoled.findByIDtip", query = "SELECT s FROM Sladoled s WHERE s.iDtip = :iDtip")})
public class Sladoled implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_sladoled")
    private Integer iDsladoled;
    @Column(name = "ID_tip")
    private Integer iDtip;
    @Lob
    @Column(name = "ime")
    private String ime;

    public Sladoled() {
    }

    public Sladoled(Integer iDsladoled) {
        this.iDsladoled = iDsladoled;
    }

    public Integer getIDsladoled() {
        return iDsladoled;
    }

    public void setIDsladoled(Integer iDsladoled) {
        Integer oldIDsladoled = this.iDsladoled;
        this.iDsladoled = iDsladoled;
        changeSupport.firePropertyChange("IDsladoled", oldIDsladoled, iDsladoled);
    }

    public Integer getIDtip() {
        return iDtip;
    }

    public void setIDtip(Integer iDtip) {
        Integer oldIDtip = this.iDtip;
        this.iDtip = iDtip;
        changeSupport.firePropertyChange("IDtip", oldIDtip, iDtip);
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        String oldIme = this.ime;
        this.ime = ime;
        changeSupport.firePropertyChange("ime", oldIme, ime);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDsladoled != null ? iDsladoled.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sladoled)) {
            return false;
        }
        Sladoled other = (Sladoled) object;
        if ((this.iDsladoled == null && other.iDsladoled != null) || (this.iDsladoled != null && !this.iDsladoled.equals(other.iDsladoled))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Projekat.Sladoled[ iDsladoled=" + iDsladoled + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
