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
    public String nombre() {
        return "Combo de Pollo";
    }

    @Override
    public String descripcion() {
        return "Delicioso combo de pollo caliente.";
    }

    @Override
    public double precio() {
        return 35.5;
    }
}
