package com.cong.logiware.hibernate;

import java.io.IOException;
import java.util.Properties;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * Configures and provides access to Hibernate sessions, tied to the current
 * thread of execution. Follows the Thread Local Session pattern, see {@link http://hibernate.org/42.html
 * }.
 */
public class DataHibernateSessionFactory {

    private static final String CONFIGURATION_FILE_LOCATION = "/com/cong/logiware/hibernate/hibernate.cfg.xml";
    private static final String PROPERTIES_FILE_LOCATION = "/com/cong/logiware/properties/datahibernate.properties";
    private static final ThreadLocal<Session> threadLocal = new ThreadLocal<>();
    private static Configuration configuration = null;
    private static SessionFactory sessionFactory;
    private static ServiceRegistry serviceRegistry;

    private DataHibernateSessionFactory() {
    }

    public static Session getSession() throws HibernateException {
        Session session = (Session) threadLocal.get();
        if (session == null || !session.isOpen()) {
            if (sessionFactory == null) {
                rebuildSessionFactory();
            }
            session = (sessionFactory != null) ? sessionFactory.openSession()
                    : null;
            threadLocal.set(session);
        }

        return session;
    }

    public static void rebuildSessionFactory() {
        try {
            configuration = new Configuration().configure(CONFIGURATION_FILE_LOCATION);
            Properties properties = new Properties();
            properties.load(DataHibernateSessionFactory.class.getResourceAsStream(PROPERTIES_FILE_LOCATION));
            configuration.addProperties(properties);
            serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        } catch (HibernateException | IOException e) {
            System.err.println("%%% Error Creating SessionFactory %%%");
            System.err.println(e.getMessage());
//            e.printStackTrace();
        }
    }

    public static void closeSession() throws HibernateException {
        Session session = (Session) threadLocal.get();
        threadLocal.set(null);

        if (session != null) {
            session.close();
        }
    }

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            rebuildSessionFactory();
        }
        return sessionFactory;
    }

    public static Configuration getConfiguration() {
        return configuration;
    }
}
