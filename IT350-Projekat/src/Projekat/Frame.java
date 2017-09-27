/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projekat;

import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 *
 * @author Marko
 */
public class Frame extends JFrame{

    public Frame() throws HeadlessException {
        setSize(300, 250);
        setContentPane(new Panel());
        setLocationRelativeTo(null);
        setTitle("Projekat");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    
}
