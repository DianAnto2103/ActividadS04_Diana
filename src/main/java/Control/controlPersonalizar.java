/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

/**
 *
 * @author diana
 */

import Builder.PersonalizacionBuilder;
import Model.modelPersonalizar;
import View.viewPersonalizar;
import View.viewHome;


public class controlPersonalizar {
    private viewPersonalizar vista;
    private modelPersonalizar modelo;
    private controlResumen controlResumen;
    private viewHome vista_g;

    
    public controlPersonalizar(viewHome vista_g, modelPersonalizar modelo, controlResumen controlResumen)
    {
        this.vista_g = vista_g;
        this.modelo = modelo;
        this.controlResumen = controlResumen;
        this.vista = vista_g.getViewPersonalizar();
        
        
        vista.getAceptar().addActionListener(e -> 
        {
            //Guardar seleccion realizada   
            this.modelo = new PersonalizacionBuilder()
                .conBebida(vista.getEleccionBebida())
                .conAcompa(vista.getEleccionAcompa()) 
                .conExtra(vista.getEleccionExtra())
                .construir();
                
            
            // Actualizar el resumen ANTES de mostrar la pantalla
            controlResumen.actualizarModelo(this.modelo);
            controlResumen.mostrarResumen();
            
            //Pasar a la siguiente pantalla
            vista_g.showScreen("resumen");
        });
        
        vista.getRegresar().addActionListener(e -> vista_g.showScreen("combo"));
    }

  
}
