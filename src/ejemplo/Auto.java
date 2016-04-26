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
public class Auto implements Serializable{
    private int Id_auto;
    private String Marca;
    private String Patente;
    
    private int Id_person;
    private Persona person;
    
    
    
    public Auto (){
        
    }
    public Auto(int id_auto, String marca, String patente, int id_person)  {
        this.Id_auto = id_auto;
        this.Marca = marca;
        this.Patente = patente;
        this.Id_person = id_person;
    }

    @Override
    public String toString() {
        return "Auto{" + "id_auto=" + Id_auto + ", marca=" + Marca + ", patente=" + Patente + ", id_person=" + Id_person + '}';
    }

    public void setId_auto(int id_auto) {
        this.Id_auto = id_auto;
    }

    public void setMarca(String marca) {
        this.Marca = marca;
    }

    public void setPatente(String patente) {
        this.Patente = patente;
    }

    public void setId_person(int id_person) {
        this.Id_person = id_person;
    }

    public int getId_auto() {
        return Id_auto;
    }

    public String getMarca() {
        return Marca;
    }

    public String getPatente() {
        return Patente;
    }

    public int getId_person() {
        return Id_person;
    }
    
}
