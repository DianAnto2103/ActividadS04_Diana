/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Factory.Combo;
import Factory.Factory.ComboFactory;
import Factory.Factory.HamburguesaFactory;
import Factory.Factory.InfantilFactory;
import Factory.Factory.PolloFactory;
import Factory.Factory.VegetarianaFactory;

/**
 *
 * @author diana
 */
public class modelCombo {
    private Combo combo;
    
    public void crearComboconTipo(String tipo) {
        ComboFactory factory = obtenerFactory(tipo);
        this.combo = factory.crearCombo();
    }
 
    private ComboFactory obtenerFactory(String tipo) {
        switch(tipo) {
            case "Hamburguesa" -> {
                return new HamburguesaFactory();
            }
            case "Pollo" -> {
                return new PolloFactory();
            }
            case "Vegetariana" -> {
                return new VegetarianaFactory();
            }
            
            case "Infantil" -> {
                return new InfantilFactory();
            }
            default -> throw new IllegalArgumentException("Tipo no válido");
        }
    }
    
    public Combo getCombo(){
        return combo;
    }
}
