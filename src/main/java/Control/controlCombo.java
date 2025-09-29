/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

/**
 *
 * @author diana
 */

import Model.modelCombo;
import View.viewCombo;
import View.viewHome;
import View.viewPersonalizar;

public class controlCombo {
    private modelCombo modelo;
    private viewCombo vista;
    private viewHome vista_g;
    private viewPersonalizar panel_p;
    
    public controlCombo()
    {
        modelo = new modelCombo();
        vista_g = new viewHome();
        vista = vista_g.getViewCombo();
        panel_p = new viewPersonalizar();
        
        
        vista.getAceptar().addActionListener(e -> 
        {
            //Guardar lo que selecciono el usuario
            modelo.setCombo((String) vista.getEleccion());
            
            //Pasar a la pantalla siguiente
            
           vista_g.getContentPane().removeAll();
           vista_g.setContentPane(panel_p);
           vista_g.revalidate();
           vista_g.repaint();
           
        });
        
       
    }
    
    public void run(){
        vista_g.run();
    }
    
    
}
