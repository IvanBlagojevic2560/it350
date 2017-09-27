/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projekat;


import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Marko
 */
public class Panel extends JPanel{
    public JButton a1=new JButton("Upit 1");
     public JButton a2=new JButton("Upit 2");
      public JButton a3=new JButton("Upit 3");
       public JButton a4=new JButton("Upit 4");
    public Panel() {
        setSize(300, 250);
        setVisible(true);
        setLayout(null);
        a1.setBounds(30, 50, 100, 30);
        a2.setBounds(150, 50, 100, 30);
        a3.setBounds(30, 100, 100, 30);
        a4.setBounds(150, 100, 100, 30);
        add(a1);
       add(a2);
        add(a3);
        add(a4);
        a1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
              Baza.listaSelect1();
            }
        });
        a2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Baza.listaSelect2();
            }
        });
        a3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Baza.listaSelect3();
            }
        });
        a4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               Baza.listaSelect4();
            }
        });
    }

    
    
}
