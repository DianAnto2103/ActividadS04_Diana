/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import javax.swing.*;
import View.viewCombo;

/**
 *
 * @author diana
 */
public class viewHome extends JFrame{
    public viewHome(){
        setTitle("Programa");
        setSize(490,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        this.setResizable(false);
        
        //Panel inicial
        setContentPane(new viewCombo());
        setVisible(true);
    }
    

}

