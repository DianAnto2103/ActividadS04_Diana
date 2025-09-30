/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Builder.PersonalizacionBuilder;
import Model.modelCombo;
import Model.modelPersonalizar;
import Model.modelResumen;
import View.viewHome;

/**
 *
 * @author diana
 */
public class controlHome {
    private viewHome vista_g;

    private modelCombo modeloCombo;
    private modelPersonalizar modeloPersonalizar;
    private modelResumen modeloResumen;

    private controlCombo controlCombo;
    private controlPersonalizar controlPersonalizar;
    private controlResumen controlResumen;
    
    public controlHome() {
        
        // Crear la vista principal
        vista_g = new viewHome();
        modeloCombo = new modelCombo();
        
        //Builder
        modeloPersonalizar = new PersonalizacionBuilder().construir();
        
        modeloResumen = new modelResumen(modeloCombo, modeloPersonalizar);
        controlCombo = new controlCombo(vista_g, modeloCombo);     
        controlResumen = new controlResumen(vista_g, modeloResumen);
        controlPersonalizar = new controlPersonalizar(vista_g, modeloPersonalizar, controlResumen);
    }
    
    public void run() {
        vista_g.run();
    }
     
}
