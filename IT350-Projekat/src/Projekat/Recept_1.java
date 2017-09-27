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
@Table(name = "recept", catalog = "it350pz01", schema = "")
@NamedQueries({
    @NamedQuery(name = "Recept_1.findAll", query = "SELECT r FROM Recept_1 r"),
    @NamedQuery(name = "Recept_1.findByIDrecept", query = "SELECT r FROM Recept_1 r WHERE r.iDrecept = :iDrecept"),
    @NamedQuery(name = "Recept_1.findByIDsastojak", query = "SELECT r FROM Recept_1 r WHERE r.iDsastojak = :iDsastojak"),
    @NamedQuery(name = "Recept_1.findByIDsladoled", query = "SELECT r FROM Recept_1 r WHERE r.iDsladoled = :iDsladoled")})
public class Recept_1 implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_recept")
    private Integer iDrecept;
    @Column(name = "ID_sastojak")
    private Integer iDsastojak;
    @Column(name = "ID_sladoled")
    private Integer iDsladoled;

    public Recept_1() {
    }

    public Recept_1(Integer iDrecept) {
        this.iDrecept = iDrecept;
    }

    public Integer getIDrecept() {
        return iDrecept;
    }

    public void setIDrecept(Integer iDrecept) {
        Integer oldIDrecept = this.iDrecept;
        this.iDrecept = iDrecept;
        changeSupport.firePropertyChange("IDrecept", oldIDrecept, iDrecept);
    }

    public Integer getIDsastojak() {
        return iDsastojak;
    }

    public void setIDsastojak(Integer iDsastojak) {
        Integer oldIDsastojak = this.iDsastojak;
        this.iDsastojak = iDsastojak;
        changeSupport.firePropertyChange("IDsastojak", oldIDsastojak, iDsastojak);
    }

    public Integer getIDsladoled() {
        return iDsladoled;
    }

    public void setIDsladoled(Integer iDsladoled) {
        Integer oldIDsladoled = this.iDsladoled;
        this.iDsladoled = iDsladoled;
        changeSupport.firePropertyChange("IDsladoled", oldIDsladoled, iDsladoled);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDrecept != null ? iDrecept.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Recept_1)) {
            return false;
        }
        Recept_1 other = (Recept_1) object;
        if ((this.iDrecept == null && other.iDrecept != null) || (this.iDrecept != null && !this.iDrecept.equals(other.iDrecept))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Projekat.Recept_1[ iDrecept=" + iDrecept + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
