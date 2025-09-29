/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

/**
 *
 * @author diana
 */
public class Hamburguesa implements Combo{

    @Override
    public String nombre() {
        return "Combo Hamburguesa";
    }

    @Override
    public String descripcion() {
        return "Deliciosa combo hamburguesa rellena de queso.";
    }

    @Override
    public double precio() {
        return 25.50;
    }
    
}
