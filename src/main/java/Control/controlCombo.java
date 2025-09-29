/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

/**
 *
 * @author diana
 */

import Factory.Combo;
import Factory.Factory.ComboFactory;
import Model.modelCombo;
import View.viewCombo;
import View.viewHome;


public class controlCombo {
    private viewCombo vista;
    
    public controlCombo(viewHome vista_g, modelCombo modelo)
    {
        this.vista = vista_g.getViewCombo();
        
        
        //Listener
        vista.getAceptar().addActionListener(e -> 
        {
            //Conseguir el tipo seleccionado
            String tipoSeleccionado = vista.getEleccion();
            
            //Guardar lo que selecciono el usuario
            modelo.crearComboconTipo(tipoSeleccionado);
            
            //Pasar a la pantalla siguiente
            vista_g.showScreen("personalizar");
        });
        
        vista.getCancelar().addActionListener(e -> System.exit(0));
    }
    
  
}
