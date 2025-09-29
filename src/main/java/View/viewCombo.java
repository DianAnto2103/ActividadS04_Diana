/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

/**
 *
 * @author diana
 */
public class viewCombo extends JPanel {
    public JComboBox<String> eleccion;
    public JButton aceptar;
    public JButton cancelar;
    
    public viewCombo()
    {
        setLayout(null);
        crearComponentes();
    }
    
    public void crearComponentes()
    {
        
        //Textos
        JLabel texto1 = new JLabel("¡Comida Rápida!");
        texto1.setBounds(145, 10, 200, 30); 
        texto1.setFont(new Font("Arial", Font.BOLD, 20));
        texto1.setForeground(Color.RED);
        texto1.setHorizontalAlignment(SwingConstants.CENTER);
        add(texto1);
        
        JLabel texto2 = new JLabel("Seleccionar Combo:");
        texto2.setBounds(40, 95, 200, 30);
        texto2.setFont(new Font("Arial", Font.PLAIN, 18));
        add(texto2);
        
        //Eleccion
        eleccion = new JComboBox<>(new String[]{"Hamburguesa", "Pollo", "Vegetariana"});
        eleccion.setBounds(280, 95, 150, 30);
        add(eleccion);
        
        //Botones
        
        aceptar = new JButton("Aceptar");
        aceptar.setBounds(100, 180, 100, 30);
        add(aceptar);
        
        cancelar = new JButton("Cancelar");
        cancelar.setBounds(270, 180, 100, 30);
        add(cancelar);
        
    }
    
    public String getEleccion() {
        return (String) eleccion.getSelectedItem();
    }

    public JButton getAceptar() {
        return aceptar;
    }

    public JButton getCancelar() {
        return cancelar;
    }
    
}
