/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import ejemplo.hibernate;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.logging.Logger;
import javax.persistence.Entity;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


/**
 *
 * @author usuario
 */
public class GenericDAOImplHibernate <T, PK extends Serializable> implements GenericDAO<T, PK> {
      SessionFactory sessionFactory;
      private Session session;
      public Class<Entity> domainClass = getDomainClass();
      private Transaction tx;
      private final static Logger LOGGER = Logger.getLogger(GenericDAOImplHibernate.class.getName());
  
      public GenericDAOImplHibernate() {
           sessionFactory=(SessionFactory) hibernate.getSessionFactory().openSession();
       } 
      public void manejaExcepcion(HibernateException he) throws HibernateException {
       tx.rollback();
       throw new HibernateException("Ocurrió un error en la capa de acceso a datos", he);
      }
      public Session getHibernateTemplate() {
       session =  hibernate.getSessionFactory().openSession();
       session.beginTransaction();
        return session;
      }
      protected Class getDomainClass()  { ///gethibernate
      if (domainClass == null) {
         ParameterizedType thisType = (ParameterizedType) getClass().getGenericSuperclass();
          domainClass = (Class) thisType.getActualTypeArguments()[0];
      }
           return domainClass;
      }
     @Override
      public void Guardar(Entity t){
       try {
         session.save(t);
         session.getTransaction().commit();
       } catch (HibernateException e) {
           manejaExcepcion(e);
      }
 }

      @Override
      public Entity Buscar(PK id) {
      Entity returnValue = (Entity) getHibernateTemplate().load(domainClass, id);
      session.getTransaction().commit();
      return returnValue;
 }
      
      @Override
      public void Actualizar(Entity t) {
      try {
        getHibernateTemplate().update(t);
        session.getTransaction().commit();
      } catch (HibernateException e) {
        manejaExcepcion(e);
      }
      }
      
      @Override
      public void Eliminar(Entity t) {
      getHibernateTemplate().delete(t);
      session.getTransaction().commit();
      }
}
