package model;

import java.io.Serializable;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author Munezero
 */
public class HibernateUtil implements Serializable{

    private static final SessionFactory sessionFactory;
    
    static {
        try {
            Configuration configuration = new Configuration();
            configuration.setProperty("hibernate.id.new_generator_mappings", "true");
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
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
