/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import ejemplo.Persona;
import java.util.List;

/**
 *
 * @author usuario
 */
public interface PersonaIC extends GenericDAO<Persona, Integer>{
    public void GuardarPersona(Persona pacargar);
    public void ActualizarPersona(Persona cursoacargar);
    public void EliminarPersona(Persona p);
    public List<Persona> ListarPersona();
}
