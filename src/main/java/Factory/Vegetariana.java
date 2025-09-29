/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

/**
 *
 * @author diana
 */
public class Vegetariana implements Combo{
    @Override
    public String getNombre() {
        return "Vegetariano";
    }

    @Override
    public double getPrecio() {
        return 20.5;
    }    
}
