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
    public String nombre() {
        return "Combo Vegetariano";
    }

    @Override
    public String descripcion() {
        return "Combo vegetariano, ideal para personas a dieta.";
    }

    @Override
    public double precio() {
        return 20.5;
    }    
}
