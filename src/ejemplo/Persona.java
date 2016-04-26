/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
/**
 *
 * @author usuario
 */
public class Persona implements Serializable {
    private int Id;
    private String Nombre;
    private String Direccion;
    private List<Auto> autos= new ArrayList<Auto>();

    
    public Persona (){
    }

    public Persona(int Id, String Nombre, String Direccion, List<Auto> autos) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.autos = autos;
    }
    
 
    public void setId(int Id) {
        this.Id = Id;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getId() {
        return Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }
    public void setAutos(List<Auto> autos) {
        this.autos = autos;
    }

    public List<Auto> getAutos() {
        return autos;
    }
    
    public void addAuto(Auto a)
    {
        this.autos.add(a);
    }
}
