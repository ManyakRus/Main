/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import BD.Country;
import javax.annotation.Resource;
import javax.transaction.Transactional;
import nikitin.sanek.ApplicationContextConfig;
import nikitin.sanek.HibernateSessionFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Пользователь2
 */

@Repository
public class CountryDAO {
    
//    @Autowired
//    private SessionFactory sessionFactory;
//    
////    @Autowired
////    public CountryDAO(SessionFactory sessionFactory) {
////        this.sessionFactory = sessionFactory;
////    }
//    
//    //@Resource(name="sessionFactory")
////    @Autowired
////    public void setSessionFactory(SessionFactory sessionFactory) {
////        this.sessionFactory = sessionFactory;
////    }
//
//    
//    @Transactional
//    public void add(String code, String name) {
////      AnnotationConfigApplicationContext context = 
////            new AnnotationConfigApplicationContext(ApplicationContextConfig.class);
////        HibernateSessionFactory hibernateSessionFactory = context.getBean(HibernateSessionFactory.class);
////        SessionFactory sessionFactory = hibernateSessionFactory.getSessionFactory();
//        Session session = sessionFactory.getCurrentSession();
//        
//        Country c = new Country();
//        c.setCode(code);
//        c.setName(name);
//        session.saveOrUpdate(c);
//        //session.flush();
//        //transaction.commit();
//        
//        
//        //transaction.commit();
//        //session.close();
//    
//    }
}
