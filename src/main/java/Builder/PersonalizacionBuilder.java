/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Builder;

import Model.modelPersonalizar;

/**
 *
 * @author diana
 */
public class PersonalizacionBuilder {
    private String bebida = null;
    private String acompa = null;
    private String extra = null;
    
    
    public PersonalizacionBuilder conBebida(String bebida){
        this.bebida = bebida;
        return this;
    }
    
    public PersonalizacionBuilder conAcompa(String acompa){
        this.acompa = acompa;
        return this;
    }
    
    public PersonalizacionBuilder conExtra(String extra){
        this.extra = extra;
        return this;
    }
    
    
    public modelPersonalizar construir()
    {
        return new modelPersonalizar(bebida,acompa,extra);
    }
}
