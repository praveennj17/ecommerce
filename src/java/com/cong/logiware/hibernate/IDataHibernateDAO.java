package com.cong.logiware.hibernate;

import org.hibernate.Session;

/**
 *
 * @author Prakash S
 */
public class IDataHibernateDAO {

    public Session getSession() {
        return this.getCurrentSession();
    }

    public void closeSession() {
        DataHibernateSessionFactory.closeSession();
    }

    public Session getCurrentSession() {
        return DataHibernateSessionFactory.getSession();
    }

    public Session getSessionConsoleApp() {
        return DataHibernateSessionFactory.getSession();
    }
}
