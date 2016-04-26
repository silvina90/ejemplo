/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;


import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

/**
 * hibernate Utility class with a convenient method to get Session Factory
 object.
 *
 * @author usuario
 */
public class hibernate {
    
    private static final SessionFactory sessionFactory;
    
    static {
        try {
            // Create the SessionFactory from standard (hibernate.cfg.xml) 
            // config file.
           // sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
     //   Configuration configuration = new Configuration();
      //  configuration.configure("/hibernate.cfg.xml");
     //   serviceRegistry = (ServiceRegistry) new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
     //   sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        sessionFactory = new Configuration().configure().buildSessionFactory();
      
        
        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
