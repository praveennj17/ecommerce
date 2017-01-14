package com.cong.logiware.hibernate.dao;

import com.cong.logiware.hibernate.BaseHibernateDAO;
import com.cong.logiware.hibernate.Property;
import com.cong.logiware.hibernate.entity.Product;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class ProductDAO extends BaseHibernateDAO<Product> {

    public ProductDAO() {
        super(Product.class);
    }
    
    public List<Product> findProductsByCategory(String category){
        return findByProperty("category", category);
    }
    
    public List<Product> findProductsByNameAndCategory(String name, String category){
        List<Property> properties = new ArrayList<>();
        properties.add(Property.getInstance("name", name));
        properties.add(Property.getInstance("category", category));
        return findByProperties(properties);
    }

    public void delete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}



   