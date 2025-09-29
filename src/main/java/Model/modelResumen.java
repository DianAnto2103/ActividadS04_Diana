/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author diana
 */
public class modelResumen {
    private modelCombo combo;
    private modelPersonalizar personalizar;
    
    public modelResumen(modelCombo combo,modelPersonalizar personalizar){
        this.combo = combo;
        this.personalizar = personalizar;
    }
    
    
    //Colocar valor dentro de resumen -> Guardamos 
    public void setPersonalizar(modelPersonalizar personalizar) {
        this.personalizar = personalizar;
    }

    public void setCombo(modelCombo combo) {
        this.combo = combo;
    }

    //Dar valor, es decir, entregar valores -> Entregamos
    
    public modelCombo getCombo() {
        return combo;
    }
    
    public modelPersonalizar getPersonalizar() {
        return personalizar;
    }
       
}
