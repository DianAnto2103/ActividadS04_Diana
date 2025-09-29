/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory.Factory;

import Factory.Combo;
import Factory.Infantil;

/**
 *
 * @author diana
 */
public class InfantilFactory extends ComboFactory {

    @Override
    public Combo crearCombo() {
        return new Infantil();
    }
    
}
