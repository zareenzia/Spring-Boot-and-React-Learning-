package utils;

import com.mysql.cj.xdevapi.SessionFactory;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.lang.module.Configuration;

public class HibernateUtil {

    private static SessionFactory sessionFactory;

    static{
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }

    public static void shutDown(){
        getSessionFactory().close();
    }
}