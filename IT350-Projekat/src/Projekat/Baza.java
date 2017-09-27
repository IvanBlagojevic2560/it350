package Projekat;

import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Marko
 */
public class Baza {

    private static java.sql.Connection con = null;
    private static String url = "jdbc:mysql://localhost/it350pz01";
    private static String username = "root";
    private static String password = "";

    public static void listaSelect1() {
        try {
            con = DriverManager.getConnection(url, username, password);
            Statement st = (Statement) con.createStatement();
            String sql = "SELECT ID_recept, sastojci.kolicina ,sastojci.imeSastojka,sladoled.ime FROM `recept` \n"
                    + "join `sastojci` on \n"
                    + "sastojci.`ID_sastojak` = recept.`ID_sastojak` \n"
                    + "join `sladoled` on \n"
                    + "recept.`ID_sladoled`= sladoled.`ID_sladoled` \n"
                    + "WHERE sladoled.ime= \"rumenko\"";
            ResultSet rs = st.executeQuery(sql);
            // st.execute("SELECT id, marka, vrsta, serijskiBroj, visina, sirina, duzina FROM korisnici");
            while (rs.next()) {
                //dobi
                int id = rs.getInt("ID_recept");
                String kolicna = rs.getString("kolicina");
                String imeSastojka = rs.getString("imeSastojka");
                String ime = rs.getString("ime");

                //pokazi
                JOptionPane.showMessageDialog(null, "ID_Recepta: "+id+" Kolicina: "+kolicna+" ImeSastojka: "+ime+"\n");
                System.out.print("ID_Recepta: " + id);
                System.out.print(", Kolicina: " + kolicna);
                System.out.print(", Ime Sastojka: " + imeSastojka);

                System.out.print(", Ime: " + ime + "\n");

            }
            rs.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();

        }
    }

    public static void listaSelect2() {
        try {
            con = DriverManager.getConnection(url, username, password);
            Statement st = (Statement) con.createStatement();
            String sql = "SELECT prodajnaLokacija.adresa,radnik.imeRadnika,sum(evidencija.`ID_prodaja`) ukupno \n"
                    + "FROM `evidencija` join sladoled \n"
                    + "on sladoled.`ID_sladoled` = evidencija.`ID_sladoled` \n"
                    + "join prodaja\n"
                    + "on evidencija.`ID_prodaja` = prodaja.`ID_prodaja` \n"
                    + "join radnik on \n"
                    + "prodaja.id_radnik = radnik.id_radnik \n"
                    + "join prodajnaLokacija on \n"
                    + "radnik.id_prodajnaLokacija = prodajnaLokacija.id_prodajnaLokacija \n"
                    + "WHERE radnik.imeRadnika=\"Milos\" AND prodajnaLokacija.adresa=\"Aleksinac\"";
            ResultSet rs = st.executeQuery(sql);
            // st.execute("SELECT id, marka, vrsta, serijskiBroj, visina, sirina, duzina FROM korisnici");
            while (rs.next()) {
                //dobi

                String adresa = rs.getString("adresa");
                String imeRadnika = rs.getString("imeRadnika");
                int ukupno = rs.getInt("ukupno");

                //pokazi
                JOptionPane.showMessageDialog(null, "Adresa: "+adresa+" Ime Radnika: "+imeRadnika+" Ukupno: "+ukupno+"\n");
                System.out.print("Adresa: " + adresa);
                System.out.print(", Ime Radnika: " + imeRadnika);
                System.out.print(", Ukupno: " + ukupno + "\n");

            }
            rs.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();

        }
    }

    public static void listaSelect3() {
        try {
            con = DriverManager.getConnection(url, username, password);
            Statement st = (Statement) con.createStatement();
            String sql = "SELECT radnik.jmbg,prodaja.datum, count(prodaja.id_prodaja) as ukupno\n"
                    + "FROM `evidencija` join prodaja\n"
                    + "on evidencija.`ID_prodaja` = prodaja.`ID_prodaja`\n"
                    + "join radnik\n"
                    + "on prodaja.id_radnik = radnik.id_radnik\n"
                    + "group by evidencija.id_sladoled\n"
                    + "order by ukupno desc limit 1";
            ResultSet rs = st.executeQuery(sql);
            // st.execute("SELECT id, marka, vrsta, serijskiBroj, visina, sirina, duzina FROM korisnici");
            while (rs.next()) {
                //dobi
                //String imeSastojka = rs.getString("imeSastojka");
                int jmbg = rs.getInt("jmbg");
                Date datum = rs.getDate("datum");

                int ukupno = rs.getInt("ukupno");

                //pokazi
                JOptionPane.showMessageDialog(null, "JMBG: "+jmbg+" Datum: "+datum+" Ukupno: "+ukupno+"\n");
                System.out.print("Jmbg: " + jmbg);
                System.out.print(", Datum: " + datum);
                System.out.print(", Ukupno: " + ukupno + "\n");

            }
            rs.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();

        }
    }

    public static void listaSelect4() {
        try {
            con = DriverManager.getConnection(url, username, password);
            Statement st = (Statement) con.createStatement();
            String sql = "SELECT imeSastojka ,sum(kolicina)  ukupnaKolicina\n"
                    + "FROM `sastojci` \n"
                    + "Group by imeSastojka\n"
                    + "having imeSastojka= \"cokolada\"";
            ResultSet rs = st.executeQuery(sql);
            // st.execute("SELECT id, marka, vrsta, serijskiBroj, visina, sirina, duzina FROM korisnici");
            while (rs.next()) {
                //dobi
                String imeSastojka = rs.getString("imeSastojka");
                Integer uk = (Integer) rs.getInt("ukupnaKolicina");
                

                //pokazi
                JOptionPane.showMessageDialog(null, "Ime Sastojka: "+imeSastojka+" ukupna Kolicina: "+uk+"\n");
                System.out.print("Ime Sastojka: " + imeSastojka);
                System.out.print(", Ukupna kolicna: " + uk+"\n");
                

            }
            rs.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();

        }
    }

}
