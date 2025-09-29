/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

/**
 *
 * @author diana
 */
public class Pollo implements Combo{
    @Override
    public String getNombre() {
        return "Pollo";
    }

    @Override
    public double getPrecio() {
        return 35.5;
    }
}
