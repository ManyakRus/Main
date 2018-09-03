/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nikitin.sanek;

import javax.transaction.Transactional;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 *
 * @author Пользователь2
 */
@Repository
@Transactional
public class HibernateSessionFactory {

    //@Autowired
    //private static LocalSessionFactoryBean sessionFactory;
    
    //@Autowired
    private SessionFactory sessionFactory;
    
    //@Autowired
    private HibernateTransactionManager transactionManager;
    
//    private static SessionFactory sessionFactory = buildSessionFactory();

//    protected static SessionFactory buildSessionFactory() {
//        // A SessionFactory is set up once for an application!
//        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
//                .configure() // configures settings from hibernate.cfg.xml
//                .build();
//        try {
//            sessionFactory = new MetadataSources( registry ).buildMetadata().buildSessionFactory();
//        }
//        catch (Exception e) {
//            // The registry would be destroyed by the SessionFactory, but we had trouble building the SessionFactory
//            // so destroy it manually.
//            StandardServiceRegistryBuilder.destroy( registry );
//
//            throw new ExceptionInInitializerError("Initial SessionFactory failed" + e);
//        }
//        return sessionFactory;
//    }


    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public HibernateTransactionManager getTransactionManager() {
        return transactionManager;
    }

    public void close() {
        // Close caches and connection pools
        //getSessionFactory().close();
    }

}