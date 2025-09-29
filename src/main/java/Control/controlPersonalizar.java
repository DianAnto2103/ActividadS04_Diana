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
    private modelPersonalizar modelo;
    private viewPersonalizar vista;
    private viewHome vista_g;
    
    public controlPersonalizar(viewHome vista_g)
    {
        this.vista_g = vista_g;
        modelo = new modelPersonalizar();
        vista = vista_g.getViewPersonalizar();
        
        vista.getAceptar().addActionListener(e -> 
        {
            //Guardar seleccion realizada
            
            modelo.setBebida((String) vista.getEleccionBebida());
            modelo.setAcompa((String) vista.getEleccionAcompa());
            modelo.setExtra((String) vista.getEleccionExtra());
            
            //Pasar a la siguiente pantalla
            vista_g.showScreen("resumen");
        });
        
        vista.getRegresar().addActionListener(e -> vista_g.showScreen("combo"));
    }

    public void run() {
        
    }
    
}
