/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import ejemplo.Persona;
import java.io.Serializable;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author usuario
 */
public class PersonaDAOImple extends GenericDAOImplHibernate<Persona,Integer>  {
     GenericDAOImplHibernate<Persona, Serializable> p= new GenericDAOImplHibernate<>();

     Session session;
       public void Leer (){
       try{  
       p.getHibernateTemplate();
       Query query = session.createQuery("FROM Persona");
       List<Persona> personas = query.list();
       for (Persona pe : personas) {
            System.out.println(pe.getNombre()+"--" +pe.getDireccion());
          }
       if (session != null)
                session.close();
       }catch(HibernateException he){ 
        p.manejaExcepcion(he);
        throw he; 
       }
    }

    
    
}
