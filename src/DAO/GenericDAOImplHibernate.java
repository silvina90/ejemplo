/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import ejemplo.Persona;
import ejemplo.hibernate;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


/**
 *
 * @author usuario
 */
public class GenericDAOImplHibernate <T extends Serializable> implements GenericDAO<T> {
      SessionFactory sessionFactory;
      private Session session;
      private Transaction tx;
      private final static Logger LOGGER = Logger.getLogger(GenericDAOImplHibernate.class.getName());
  
      public GenericDAOImplHibernate() {
        session= hibernate.getSessionFactory().openSession();
        tx = session.beginTransaction();
      }
      
      public void manejaExcepcion(HibernateException he) throws HibernateException {
       tx.rollback();
       throw new HibernateException("Ocurrió un error en la capa de acceso a datos", he);
      }

      @Override
      public void Guardar(T t){
        try {
          session= hibernate.getSessionFactory().openSession();
          tx = session.beginTransaction();  
          session.save(t);
          session.getTransaction().commit();
          if (session != null)
           session.close();
        } catch (HibernateException e) {
            manejaExcepcion(e);
       }
 }

      @Override
      public List<T> Buscar() {
          session= hibernate.getSessionFactory().openSession();
            tx = session.beginTransaction();
        Query query = session.createQuery("from Persona p ");
     //   query.setParameter("ID", 24);
        List<Persona> personas = query.list();
        session.getTransaction().commit();

       return (List<T>) personas;
 }
      @Override
      public void Actualizar(T t) {
        try {
          session= hibernate.getSessionFactory().openSession();
          tx = session.beginTransaction();            
          session.update(t);
          session.getTransaction().commit();
        } catch (HibernateException e) {
          manejaExcepcion(e);
        }
      }
      
      @Override
      public void Eliminar(int t) {
          
         try {

            session= hibernate.getSessionFactory().openSession();
            tx = session.beginTransaction();
            String hql = "delete from Persona P where P.Id = :id_person ";
            Query query = session.createQuery(hql);
            query.setParameter("id_person",t);
            int i=query.executeUpdate();
            session.getTransaction().commit();
            
        } catch (HibernateException e) {
        manejaExcepcion(e);
      }
      }

    @Override
    public List<T> BuscarPersona(String t) {
            String hql = "from Persona P where P.Nombre = :t";
            Query query = session.createQuery(hql);
            query.setParameter("t",t);
            List<Persona> personas = query.list();
            return (List<T>) personas;
    }
    
}   
   
