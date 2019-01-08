/* !
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nikitin.sanek;

import BD.Country;
import CRUD.CountryCRUD;
import DAO.CountryDAO;
import java.sql.SQLException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.SessionFactory;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ICRUD.ICountryCRUD;


/**
 *
 * @author Пользователь2
 */
//@Repository
//@Transactional
//@SpringBootApplication
public class Main  
        //implements CommandLineRunner 
    {
    //private static SessionFactory sessionFactory;
    //@Autowired
    //ICountryCRUD crud;
    
//    @Override
//    public void run(String... args) throws Exception {
////        Country c = crud.findByCode("RUS");
////        System.out.println("Country: " + c);
//        
//        
//    }
    
    @Transactional
    public static void main(String[] args)  throws SQLException {
        //SpringApplication.run(Main.class, args);  

        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(ApplicationContextConfig.class);
        ICountryCRUD crud = context.getBean(ICountryCRUD.class);

        Country c = crud.findByCode("RUS");
        System.out.println("Country: " + c);
        
        Country c2 = new Country();
        c2.setCode("AAA");
        c2.setName("TEST");        
        crud.save(c2);

//      AnnotationConfigApplicationContext context = 
//            new AnnotationConfigApplicationContext(ApplicationContextConfig.class);

//        HibernateSessionFactory hibernateSessionFactory = context.getBean(HibernateSessionFactory.class);
//        SessionFactory sessionFactory = hibernateSessionFactory.getSessionFactory();
//        Session session = sessionFactory.getCurrentSession();
        
        //CountryDAO dao = context.getBean(CountryDAO.class);
        //dao.add("AAA", "TEST");

        //ICountryCRUD crud = context.getBean(ICountryCRUD.class);
        //CountryCRUD crud = new CountryCRUD();
        
//        Session session = null;
//        try {
//            session = sessionFactory.getCurrentSession();
//        } catch (HibernateException e) {
//            session = sessionFactory.openSession();
//        }
        //HibernateTransactionManager transactionManager = hibernateSessionFactory.getTransactionManager();
        
        //Session session = hibernateSessionFactory.getSessionFactory().openSession();
        //Transaction transaction = null;

        //transaction = session.beginTransaction();
        //Criteria criteria = session.createCriteria(Country.class);
        //criteria.add(Restrictions.gt("population", 0));
        //List<Country> list = criteria.list();

//        Query query = session.createQuery("SELECT C FROM Country AS C ");
//        List list2 = query.getResultList();
        
    
//        Query query = session.createQuery("SELECT C FROM Country AS C ");
//        List<Country> list2 = query.getResultList();
        
        //list.forEach(System.out::println);
        
        //Transaction transaction = session.beginTransaction();
//        Country c = new Country();
//        c.setName("Test");
//        c.setCode("TST");
//        session.saveOrUpdate(c);
        //session.flush();
        //transaction.commit();
        
        
        //transaction.commit();
        //session.close();

        //hibernateSessionFactory.close();



    
//    EntityManager em = HibernateUtil.getEm();
//    
//    Query query = em.createQuery("SELECT C FROM Country AS C ");
//    List list = query.getResultList();
//    
//    //list.forEach(System.out::println);
//    
//    for (Object list1: list) {
//        System.out.println(list1);
//    }
    
    //manager.find(Country.class, 1L);
    //manager.close();        
    //manager = null;
    
//    Country c = new Country();
//    c.setName("Test");
//    c.setCode("TST");
//    em.merge(c);
//    
//    em.getTransaction().begin();
//    em.flush();
//    em.getTransaction().commit();
//    
//    Country c2 = new Country();
//    //c2.setCode("TST");
//    c2 = em.find(Country.class, "TST");
//    System.out.println("Name: " + c2.getName());

    //em.close();
//    HibernateUtil.close();
        
    }
    
}
