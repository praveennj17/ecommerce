package com.cong.logiware.hibernate.dao;

import com.cong.logiware.hibernate.BaseHibernateDAO;

import com.cong.logiware.hibernate.entity.AdminProduct;

public class AdminProductDAO extends BaseHibernateDAO<AdminProduct> {

    public AdminProductDAO() {
        super(AdminProduct.class);
    }

}
