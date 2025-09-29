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
        switch(tipo.toLowerCase()) {
            case "hamburguesa" -> {
                return new HamburguesaFactory();
            }
            case "pollo" -> {
                return new PolloFactory();
            }
            case "vegetariana" -> {
                return new VegetarianaFactory();
            }
            
            case "infantil" -> {
                return new InfantilFactory();
            }
            default -> throw new IllegalArgumentException("Tipo no válido");
        }
    }
    
    public Combo getCombo(){
        return combo;
    }
}
