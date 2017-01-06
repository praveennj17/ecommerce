package com.cong.logiware.hibernate.dao;

import com.cong.logiware.hibernate.BaseHibernateDAO;
import com.cong.logiware.hibernate.entity.Product;

/**
 *
 * @author admin
 */
public class ProductDAO extends BaseHibernateDAO<Product> {

    public ProductDAO() {
        super(Product.class);
    }

}
