/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import ejemplo.Persona;

/**
 *
 * @author usuario
 */
public abstract class PersonaCtrl extends GenericDAOImplHibernate<Persona,Integer> implements  PersonaIC {
    PersonaDAO pe;
    
    public PersonaCtrl() {
            }
    
}
