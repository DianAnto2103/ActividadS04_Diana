/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import View.viewHome;

/**
 *
 * @author diana
 */
public class homeController {
    private viewHome vista_g;
    private controlCombo controlCombo;
    private controlPersonalizar controlPersonalizar;
    
    public homeController() {
        
        // Crear la vista principal
        vista_g = new viewHome();

        controlCombo = new controlCombo(vista_g);
        controlPersonalizar = new controlPersonalizar(vista_g);
    }
    
    public void run() {
        vista_g.run();
    }
     
}
