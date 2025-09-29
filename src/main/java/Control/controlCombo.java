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


public class controlCombo {
    private modelCombo modelo;
    private viewCombo vista;
    private viewHome vista_g;
    
    public controlCombo(viewHome vista_g)
    {
        this.vista_g = vista_g;
        modelo = new modelCombo();
        vista = vista_g.getViewCombo();
        
        
        vista.getAceptar().addActionListener(e -> 
        {
            //Guardar lo que selecciono el usuario
            modelo.setCombo((String) vista.getEleccion());
            
           //Pasar a la pantalla siguiente
           vista_g.showScreen("personalizar");
        });
        
        vista.getCancelar().addActionListener(e -> System.exit(0));

    }
    
    public void run(){
        vista_g.run();
    }
    
    
}
