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


public class viewResumen extends JPanel{
    public JLabel valorCombo;
    public JLabel valorBebida;
    public JLabel valorAcompa;
    public JLabel valorExtra;
    public JButton aceptar;
    public JButton regresar;
    
    public viewResumen(){
        setLayout(null);
        crearComponentes();
    }
    
    public void crearComponentes(){
        
        // Título
        JLabel titulo = new JLabel("Resumen del Pedido");
        titulo.setBounds(150, 10, 200, 30);
        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        titulo.setForeground(Color.darkGray);
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        add(titulo);

        // Combo
        JLabel labelCombo = new JLabel("Combo:");
        labelCombo.setBounds(50, 60, 120, 25);
        labelCombo.setFont(new Font("Arial", Font.PLAIN, 16));
        add(labelCombo);

        valorCombo = new JLabel("........................"); 
        valorCombo.setBounds(200, 60, 200, 25);
        valorCombo.setFont(new Font("Arial", Font.BOLD, 16));
        valorCombo.setForeground(Color.BLUE);
        add(valorCombo);

        // Bebida
        JLabel labelBebida = new JLabel("Bebida:");
        labelBebida.setBounds(50, 100, 120, 25);
        labelBebida.setFont(new Font("Arial", Font.PLAIN, 16));
        add(labelBebida);

        valorBebida = new JLabel("........................");
        valorBebida.setBounds(200, 100, 200, 25);
        valorBebida.setFont(new Font("Arial", Font.BOLD, 16));
        valorBebida.setForeground(Color.BLUE);
        add(valorBebida);

        // Acompañamiento
        JLabel labelAcompa = new JLabel("Acompañamiento:");
        labelAcompa.setBounds(50, 140, 150, 25);
        labelAcompa.setFont(new Font("Arial", Font.PLAIN, 16));
        add(labelAcompa);

        valorAcompa = new JLabel("........................");
        valorAcompa.setBounds(200, 140, 200, 25);
        valorAcompa.setFont(new Font("Arial", Font.BOLD, 16));
        valorAcompa.setForeground(Color.BLUE);
        add(valorAcompa);

        // Extra
        JLabel labelExtra = new JLabel("Extra:");
        labelExtra.setBounds(50, 180, 120, 25);
        labelExtra.setFont(new Font("Arial", Font.PLAIN, 16));
        add(labelExtra);

        valorExtra = new JLabel("........................");
        valorExtra.setBounds(200, 180, 200, 25);
        valorExtra.setFont(new Font("Arial", Font.BOLD, 16));
        valorExtra.setForeground(Color.BLUE);
        add(valorExtra);

        // Botones
        aceptar = new JButton("Aceptar");
        aceptar.setBounds(120, 220, 100, 30);
        add(aceptar);

        regresar = new JButton("Regresar");
        regresar.setBounds(260, 220, 100, 30);
        add(regresar);  
    }
    
    public void setValorCombo(JLabel valorCombo) {
        this.valorCombo = valorCombo;
    }

    public void setValorBebida(JLabel valorBebida) {
        this.valorBebida = valorBebida;
    }

    public void setValorAcompa(JLabel valorAcompa) {
        this.valorAcompa = valorAcompa;
    }

    public void setValorExtra(JLabel valorExtra) {
        this.valorExtra = valorExtra;
    }
    
    public JButton getAceptar() {
        return aceptar;
    }

    public JButton getRegresar() {
        return regresar;
    }
    
}
