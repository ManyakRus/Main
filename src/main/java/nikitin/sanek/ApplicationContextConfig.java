/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nikitin.sanek;

import BD.City;
import BD.Country;
import BD.CountryLanguage;
import BD.CountryLanguagePK;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.hibernate.ejb.HibernatePersistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 *
 * @author Пользователь2
 */
@Configuration
@ComponentScan 
@PropertySource("classpath:db.properties")
//@ComponentScan(basePackages = {"DAO"})
@EnableTransactionManagement
//@ImportResource({"classpath:applicationContext.xml"})
@EnableJpaRepositories("ICRUD")
public class ApplicationContextConfig {
   @Autowired
   private Environment environment;
   
//    private final String PROPERTY_DRIVER = "com.mysql.jdbc.Driver";
//    private final String PROPERTY_URL = "jdbc:mysql://localhost:3306/world?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=Europe/Moscow";
//    private final String PROPERTY_USERNAME = "root";
//    private final String PROPERTY_PASSWORD = "112299";
    private final String PROPERTY_SHOW_SQL = "hibernate.show_sql";
    private final String PROPERTY_DIALECT = "hibernate.dialect";
        
//   @Autowired
//   private LocalSessionFactoryBean sessionFactory;

   //@Autowired
   //private HibernateTransactionManager transactionManager;

   //public LocalSessionFactoryBean getSessionFactory() {
//       return sessionFactory;
//   }
   
   
   @Bean
   public DataSource dataSource() {
      BasicDataSource dataSource = new BasicDataSource();
      dataSource.setDriverClassName(environment.getProperty("db.driver"));
      dataSource.setUrl(environment.getProperty("db.url"));
      dataSource.setUsername(environment.getProperty("db.username"));
      dataSource.setPassword(environment.getProperty("db.password"));
      return dataSource;
   }
   
    @Bean
    LocalContainerEntityManagerFactoryBean entityManagerFactory() {
	LocalContainerEntityManagerFactoryBean lfb = new LocalContainerEntityManagerFactoryBean();
	lfb.setDataSource(dataSource());
	lfb.setPersistenceProviderClass(HibernatePersistence.class);
	lfb.setPackagesToScan("BD");
	lfb.setJpaProperties(hibernateProps());
	return lfb;
}  
    
    Properties hibernateProps() {
        Properties properties = new Properties();
        //properties.setProperty(PROPERTY_DIALECT, environment.getProperty(PROPERTY_DIALECT));
        properties.setProperty(PROPERTY_SHOW_SQL, environment.getProperty(PROPERTY_SHOW_SQL));
        return properties;
    }

    @Bean
    JpaTransactionManager transactionManager() {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(entityManagerFactory().getObject());
        return transactionManager;
    }

//   @Bean
//   public LocalSessionFactoryBean sessionFactory() {
//      LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
//      factoryBean.setDataSource(dataSource());
//      
//      Properties props=new Properties();
//      props.put("hibernate.show_sql", env.getProperty("hibernate.show_sql"));
//      props.put("hibernate.hbm2ddl.auto", env.getProperty("hibernate.hbm2ddl.auto"));
//
//      factoryBean.setHibernateProperties(props);
////      factoryBean.setAnnotatedClasses(Country.class);
////      factoryBean.setAnnotatedClasses(City.class);
////      factoryBean.setAnnotatedClasses(CountryLanguage.class);
////      factoryBean.setAnnotatedClasses(CountryLanguagePK.class);
//      
//      //factoryBean.setAnnotatedPackages( Country.class.getPackage().getName ());
//      //factoryBean.setAnnotatedPackages("Nikitin.Sanek.BD");
//      factoryBean.setPackagesToScan("BD");
//
//      //factoryBean.setAnnotatedClasses(Country.class, City.class, CountryLanguage.class, CountryLanguagePK.class);
//      
//      return factoryBean;
//   }
//
//   @Bean
//   public HibernateTransactionManager transactionManager() {
//      HibernateTransactionManager transactionManager = new HibernateTransactionManager();
//      transactionManager.setSessionFactory(sessionFactory().getObject());
//      return transactionManager;
//   }    
}
