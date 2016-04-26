/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

import java.io.Serializable;

/**
 *
 * @author usuario
 */
public class Tecnico extends Empleado implements Serializable {
    
    private int aniosExp= 0;

  
   public Tecnico() {
       
    }
    public Tecnico(int id, String dni, String nombre, String direccion, String telefono) {
        super(id, dni, nombre, direccion, telefono);
    }

    
  
    public void setAniosExp(int aniosExp) {
        this.aniosExp = aniosExp;
    }

    public int getAniosExp() {
        return aniosExp;
    }
    
}
