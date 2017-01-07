/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cong.logiware.hibernate.dao;

import com.cong.logiware.hibernate.BaseHibernateDAO;
import com.cong.logiware.hibernate.entity.Cart;
import com.cong.logiware.hibernate.entity.User;

/**
 *
 * @author admin
 */
public class CartDAO  extends BaseHibernateDAO<Cart>{
    
       public CartDAO() {
        super(Cart.class);
    }
    
}
