package com.cong.logiware.hibernate.dao;

import com.cong.logiware.hibernate.BaseHibernateDAO;
import com.cong.logiware.hibernate.entity.Address;

public class AddressDAO extends BaseHibernateDAO<Address> {

    public AddressDAO() {
        super(Address.class);
    }

}
