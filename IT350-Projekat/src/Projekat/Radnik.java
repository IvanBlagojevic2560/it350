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
@Table(name = "radnik", catalog = "it350pz01", schema = "")
@NamedQueries({
    @NamedQuery(name = "Radnik.findAll", query = "SELECT r FROM Radnik r"),
    @NamedQuery(name = "Radnik.findByIDradnik", query = "SELECT r FROM Radnik r WHERE r.iDradnik = :iDradnik"),
    @NamedQuery(name = "Radnik.findByIDprodajnaLokacija", query = "SELECT r FROM Radnik r WHERE r.iDprodajnaLokacija = :iDprodajnaLokacija")})
public class Radnik implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_radnik")
    private Integer iDradnik;
    @Column(name = "ID_prodajnaLokacija")
    private Integer iDprodajnaLokacija;
    @Lob
    @Column(name = "imeRadnika")
    private String imeRadnika;
    @Lob
    @Column(name = "prezime")
    private String prezime;
    @Lob
    @Column(name = "jmbg")
    private String jmbg;

    public Radnik() {
    }

    public Radnik(Integer iDradnik) {
        this.iDradnik = iDradnik;
    }

    public Integer getIDradnik() {
        return iDradnik;
    }

    public void setIDradnik(Integer iDradnik) {
        Integer oldIDradnik = this.iDradnik;
        this.iDradnik = iDradnik;
        changeSupport.firePropertyChange("IDradnik", oldIDradnik, iDradnik);
    }

    public Integer getIDprodajnaLokacija() {
        return iDprodajnaLokacija;
    }

    public void setIDprodajnaLokacija(Integer iDprodajnaLokacija) {
        Integer oldIDprodajnaLokacija = this.iDprodajnaLokacija;
        this.iDprodajnaLokacija = iDprodajnaLokacija;
        changeSupport.firePropertyChange("IDprodajnaLokacija", oldIDprodajnaLokacija, iDprodajnaLokacija);
    }

    public String getImeRadnika() {
        return imeRadnika;
    }

    public void setImeRadnika(String imeRadnika) {
        String oldImeRadnika = this.imeRadnika;
        this.imeRadnika = imeRadnika;
        changeSupport.firePropertyChange("imeRadnika", oldImeRadnika, imeRadnika);
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        String oldPrezime = this.prezime;
        this.prezime = prezime;
        changeSupport.firePropertyChange("prezime", oldPrezime, prezime);
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        String oldJmbg = this.jmbg;
        this.jmbg = jmbg;
        changeSupport.firePropertyChange("jmbg", oldJmbg, jmbg);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDradnik != null ? iDradnik.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Radnik)) {
            return false;
        }
        Radnik other = (Radnik) object;
        if ((this.iDradnik == null && other.iDradnik != null) || (this.iDradnik != null && !this.iDradnik.equals(other.iDradnik))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Projekat.Radnik[ iDradnik=" + iDradnik + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
