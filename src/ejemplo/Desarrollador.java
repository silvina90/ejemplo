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
public class Desarrollador extends Empleado implements  Serializable{
    private String lenguajeExp;
    
    public  Desarrollador() {
    }
    public Desarrollador(int id, String dni, String nombre, String direccion, String telefono) {
        super(id, dni, nombre, direccion, telefono);
    }

    

    public String getLenguajeExp() {
        return lenguajeExp;
    }

    public void setLenguajeExp(String lenguajeExp) {
        this.lenguajeExp = lenguajeExp;
    }
    
}
