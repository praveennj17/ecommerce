package com.cong.logiware.hibernate;

import org.hibernate.Session;

/**
 *
 * @author shanmugam
 */
public class IBaseHibernateDAO {

    public Session getSession() {
        return this.getCurrentSession();
    }

    public void closeSession() {
        HibernateSessionFactory.closeSession();
    }

    public Session getCurrentSession() {
        return HibernateSessionFactory.getSession();
    }

    public Session getSessionConsoleApp() {
        return HibernateSessionFactory.getSession();
    }
}
