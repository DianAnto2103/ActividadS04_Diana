/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import javax.swing.*;
import View.viewCombo;
import View.viewPersonalizar;
import View.viewResumen;
import java.awt.CardLayout;

/**
 *
 * @author diana
 */
public class viewHome extends JFrame{
    private JPanel panel;
    private CardLayout cardLayout;
    
    
    //Vistas
    private viewCombo combo;
    private viewPersonalizar personalizar;
    private viewResumen resumen;
    
    public viewHome()
    {
        setTitle("Programa");
        setSize(490,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        this.setResizable(false);
        
        cardLayout = new CardLayout();
        panel = new JPanel(cardLayout);
   
        // Crear vistas
        combo = new viewCombo();
        personalizar = new viewPersonalizar();
        resumen = new viewResumen();
        
        // Agregarlas con un nombre
        panel.add(combo, "combo");
        panel.add(personalizar, "personalizar");
        panel.add(resumen, "resumen");
        
        setContentPane(panel);
        
        // Pantalla inicial
        cardLayout.show(panel, "combo");  
    }
    
    
    // Método para cambiar pantallas
    public void showScreen(String name) {
        cardLayout.show(panel, name);
    }
    
    //Getters para acceder a las vistas
    public viewCombo getViewCombo() {
        return combo;
    }

    public viewPersonalizar getViewPersonalizar() {
        return personalizar;
    }

    public viewResumen getViewResumen() {
        return resumen;
    }
    
    //Para hacer visible el frame
    public void run()
    {
        this.setVisible(true);
    }
    
}

