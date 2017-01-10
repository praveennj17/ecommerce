package com.cong.logiware.hibernate.dao;

import com.cong.logiware.hibernate.BaseHibernateDAO;
import com.cong.logiware.hibernate.entity.Cart;
import com.cong.logiware.hibernate.entity.User;

/**
 *
 * @author admin
 */
public class CartDAO extends BaseHibernateDAO<Cart> {

    public CartDAO() {
        super(Cart.class);
    }

}
