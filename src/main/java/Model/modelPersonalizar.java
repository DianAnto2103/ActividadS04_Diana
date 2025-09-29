/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author diana
 */
public class modelPersonalizar {
    private String bebida;
    private String acompa;
    private String extra;
    
    public modelPersonalizar(String bebida, String acompa, String extra)
    {
        this.bebida = bebida;
        this.acompa = acompa;
        this.extra = extra;
    }
    
    //getters -> Para entregar los datos
    
    public String getBebida() {
        return bebida;
    }

    public String getAcompa() {
        return acompa;
    }

    public String getExtra() {
        return extra;
    }
    
}
