package com.cong.logiware.hibernate.dao;

import com.cong.logiware.hibernate.BaseHibernateDAO;
import com.cong.logiware.hibernate.Property;
import com.cong.logiware.hibernate.entity.Admin;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Yukti
 */

public class AdminDAO extends BaseHibernateDAO<Admin> {
      public AdminDAO() {
        super(Admin.class);
    }
       public boolean isUserFound(String adminName, String password){
        List<Property> properties = new ArrayList<>();
  
        properties.add(Property.getInstance("adminName", adminName));
        properties.add(Property.getInstance("password", password));
        List<Admin> list = findByProperties(properties);
        return (list.size() > 0);
}
}