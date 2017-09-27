/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projekat;

import java.util.Date;

/**
 *
 * @author Marko
 */
public class Fabrika {
    public Integer ID_recept;
    public String kolicina;
    public String imeSastojka;
    public String ime;
    public String adresa;
    public String imeRadnika;
    public Integer ukupno;
    public Integer jmbg;
    public Date datum;
    public Integer ukupno2;
    public String imeSastojka2;
    public Integer ukupnaKolicina;

    public Fabrika(Integer ID_recept, String kolicina, String imeSastojka, String ime, String adresa, String imeRadnika, Integer ukupno, Integer jmbg, Date datum, Integer ukupno2, String imeSastojka2, Integer ukupnaKolicina) {
        this.ID_recept = ID_recept;
        this.kolicina = kolicina;
        this.imeSastojka = imeSastojka;
        this.ime = ime;
        this.adresa = adresa;
        this.imeRadnika = imeRadnika;
        this.ukupno = ukupno;
        this.jmbg = jmbg;
        this.datum = datum;
        this.ukupno2 = ukupno2;
        this.imeSastojka2 = imeSastojka2;
        this.ukupnaKolicina = ukupnaKolicina;
    }
    
   

    public String getImeSastojka2() {
        return imeSastojka2;
    }

    public void setImeSastojka2(String imeSastojka2) {
        this.imeSastojka2 = imeSastojka2;
    }

    public Integer getUkupnaKolicina() {
        return ukupnaKolicina;
    }

    public void setUkupnaKolicina(Integer ukupnaKolicina) {
        this.ukupnaKolicina = ukupnaKolicina;
    }
    
    public Integer getJmbg() {
        return jmbg;
    }

    public void setJmbg(Integer jmbg) {
        this.jmbg = jmbg;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public Integer getUkupno2() {
        return ukupno2;
    }

    public void setUkupno2(Integer ukupno2) {
        this.ukupno2 = ukupno2;
    }
    
    

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getImeRadnika() {
        return imeRadnika;
    }

    public void setImeRadnika(String imeRadnika) {
        this.imeRadnika = imeRadnika;
    }

    public Integer getUkupno() {
        return ukupno;
    }

    public void setUkupno(Integer ukupno) {
        this.ukupno = ukupno;
    }
    
   

    public Integer getID_recept() {
        return ID_recept;
    }

    public void setID_recept(Integer ID_recept) {
        this.ID_recept = ID_recept;
    }

    public String getKolicina() {
        return kolicina;
    }

    public void setKolicina(String kolicina) {
        this.kolicina = kolicina;
    }

    public String getImeSastojka() {
        return imeSastojka;
    }

    public void setImeSastojka(String imeSastojka) {
        this.imeSastojka = imeSastojka;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }
    
}
