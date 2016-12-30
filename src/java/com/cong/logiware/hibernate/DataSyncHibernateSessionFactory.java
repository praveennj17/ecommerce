/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cong.logiware.hibernate;

import java.util.Properties;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author ourHome
 */
public class DataSyncHibernateSessionFactory {

    private static String CONFIG_FILE_LOCATION = "/com/cong/logiware/hibernate/datasyncHibernate.cfg.xml";
    private static String PROPERTIES_FILE_LOCATION = "/com/cong/logiware/properties/datasyncHibernate.properties";
    private static final ThreadLocal<Session> threadLocal = new ThreadLocal<Session>();
    private static Configuration configuration = null;
    private static org.hibernate.SessionFactory sessionFactory;

    private DataSyncHibernateSessionFactory() {
    }

    public static Session getSession() throws HibernateException {
        Session session = (Session) threadLocal.get();
        if (session == null || !session.isOpen()) {
            if (sessionFactory == null) {
                rebuildSessionFactory();
            }
            session = (sessionFactory != null) ? sessionFactory.openSession() : null;
            threadLocal.set(session);
        }
        return session;
    }

    /**
     *  Rebuild hibernate session factory
     *
     */
    public static void rebuildSessionFactory() {
        try {
            configuration = new AnnotationConfiguration().configure(CONFIG_FILE_LOCATION);
            Properties hibernateProperties = new Properties();
            hibernateProperties.load(DataSyncHibernateSessionFactory.class.getResourceAsStream(PROPERTIES_FILE_LOCATION));
            configuration.addProperties(hibernateProperties);
            sessionFactory = configuration.buildSessionFactory();
        } catch (Exception e) {
            System.err.println("%%%% Error Creating DATA Sync SessionFactory %%%%");
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     *  Close the single hibernate session instance.
     *
     *  @throws HibernateException
     */
    public static void closeSession() throws HibernateException {
        Session session = (Session) threadLocal.get();
        threadLocal.set(null);

        if (session != null) {
            session.close();
        }
    }

    /**
     *  return session factory
     *
     */
    public static org.hibernate.SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            rebuildSessionFactory();
        }
        return sessionFactory;
    }

    /**
     *  return hibernate configuration
     *
     */
    public static Configuration getConfiguration() {
        return configuration;
    }
}
