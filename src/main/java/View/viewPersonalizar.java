/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

/**
 *
 * @author diana
 */

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;


public class viewPersonalizar extends JPanel {
    public JComboBox eleccionBebida;
    public JComboBox eleccionAcompa;
    public JComboBox eleccionExtra;
    public JButton aceptar;
    public JButton regresar;
    
    public viewPersonalizar(){
        setLayout(null);
        crearComponentes();
    }
    
    public void crearComponentes(){
        //Textos
        JLabel texto1 = new JLabel("Personalizar pedido");
        texto1.setBounds(145, 10, 200, 30); 
        texto1.setFont(new Font("Arial", Font.PLAIN, 20));
        texto1.setForeground(Color.MAGENTA);
        texto1.setHorizontalAlignment(SwingConstants.CENTER);
        add(texto1);
        
        JLabel labelBebida = new JLabel("Bebida:");
        labelBebida.setBounds(50, 60, 120, 25); 
        labelBebida.setFont(new Font("Arial", Font.PLAIN, 16));
        add(labelBebida);
        
        JLabel labelAcomp = new JLabel("Acompañamiento:");
        labelAcomp.setBounds(50, 100, 200, 25); 
        labelAcomp.setFont(new Font("Arial", Font.PLAIN, 16));
        add(labelAcomp);
        
        JLabel labelExtra = new JLabel("Extra:");
        labelExtra.setBounds(50, 140, 120, 25); 
        labelExtra.setFont(new Font("Arial", Font.PLAIN, 16));
        add(labelExtra);
        
        //Elecciones
        
        eleccionBebida = new JComboBox<>(new String[]{"CocaCola", "IncaKola", "Sprite", "NO"});
        eleccionBebida.setBounds(210, 60, 150, 25);
        add(eleccionBebida);
        
        eleccionAcompa = new JComboBox<>(new String[]{"Papas", "Puré", "NO"});
        eleccionAcompa.setBounds(210, 100, 150, 25);
        add(eleccionAcompa);
        
        
        eleccionExtra = new JComboBox<>(new String[]{"Helado", "Palomitas", "Cajita Feliz", "NO"});
        eleccionExtra.setBounds(210, 140, 150, 25);
        add(eleccionExtra);
        
        //Botones
        
        aceptar = new JButton("Aceptar");
        aceptar.setBounds(120, 200, 100, 30);
        add(aceptar);

        regresar = new JButton("Regresar");
        regresar.setBounds(260, 200, 100, 30);
        add(regresar);
        
    }
    
    public JComboBox getEleccionBebida() {
        return eleccionBebida;
    }

    public JComboBox getEleccionAcompa() {
        return eleccionAcompa;
    }

    public JComboBox getEleccionExtra() {
        return eleccionExtra;
    }

    public JButton getAceptar() {
        return aceptar;
    }

    public JButton getRegresar() {
        return regresar;
    }
    
}
