/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nikitin.sanek;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

/**
 *
 * @author Пользователь2
 */
public interface IHibernateSessionFactory {
    
    public SessionFactory getSessionFactory();

    public void close();
}
