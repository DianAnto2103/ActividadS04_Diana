/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

/**
 *
 * @author diana
 */

import Model.modelPersonalizar;
import View.viewPersonalizar;
import View.viewHome;


public class controlPersonalizar {
    private viewPersonalizar vista;
    
    public controlPersonalizar(viewHome vista_g, modelPersonalizar modelo, controlResumen controlResumen)
    {
        this.vista = vista_g.getViewPersonalizar();
        
        vista.getAceptar().addActionListener(e -> 
        {
            //Guardar seleccion realizada
            
            modelo.setBebida( vista.getEleccionBebida());
            modelo.setAcompa(vista.getEleccionAcompa());
            modelo.setExtra(vista.getEleccionExtra());
            
            
            // Actualizar el resumen ANTES de mostrar la pantalla
            controlResumen.mostrarResumen();
            
            //Pasar a la siguiente pantalla
            vista_g.showScreen("resumen");
        });
        
        vista.getRegresar().addActionListener(e -> vista_g.showScreen("combo"));
    }

  
}
