/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cong.logiware.hibernate;

import org.hibernate.Session;

/**
 *
 * @author ourHome
 */
public class DataSyncIBaseHibernateDAO {

    public Session getSession() {
        return this.getCurrentSession();
    }

    public void closeSession() {
        DataSyncHibernateSessionFactory.closeSession();
    }

    public Session getCurrentSession() {
        return DataSyncHibernateSessionFactory.getSession();
    }

    public Session getSessionConsoleApp() {
        return DataSyncHibernateSessionFactory.getSession();
    }
}
