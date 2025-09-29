/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory.Factory;

import Factory.Combo;

/**
 *
 * @author diana
 */
public abstract class ComboFactory {
    
    public abstract Combo crearCombo();
    
    public String obtenerInformacionCombo()
    {
        Combo combo = crearCombo();
        
        return combo.nombre() + combo.precio();
    }
}
