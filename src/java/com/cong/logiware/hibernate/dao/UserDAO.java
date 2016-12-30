package com.cong.logiware.hibernate.dao;

import com.cong.logiware.hibernate.BaseHibernateDAO;
import com.cong.logiware.hibernate.Property;
import com.cong.logiware.hibernate.entity.User;
import java.util.ArrayList;
import java.util.List;

public class UserDAO extends BaseHibernateDAO<User> {

    public UserDAO() {
        super(User.class);
    }
    
    public boolean isUserFound(String userName, String password){
        List<Property> properties = new ArrayList<>();
        properties.add(Property.getInstance("loginName", userName));
        properties.add(Property.getInstance("password", password));
        List<User> list = findByProperties(properties);
        return (list.size() > 0);
    }

}
