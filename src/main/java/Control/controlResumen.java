/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

/**
 *
 * @author diana
 */

import Model.modelResumen;
import View.viewResumen;
import View.viewHome;

public class controlResumen {
    private viewResumen view;
    private modelResumen model;
    private viewHome vist_g;
    
    public controlResumen(viewHome vista_g)
    {
        this.vist_g = vist_g;
        view = new viewResumen();
    }
    
    
    
}
