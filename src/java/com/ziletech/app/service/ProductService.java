package com.ziletech.app.service;

import com.cong.logiware.hibernate.dao.ProductDAO;
import com.cong.logiware.hibernate.entity.Product;
import java.util.List;

/**
 *
 * @author sks
 */
public class ProductService {
    
    public List<Product> getAllProducts(){
        ProductDAO productDAO = new ProductDAO();
        List<Product> productList = productDAO.findAll();
        return productList;
    }
    
    public Product getById(Long id){
        ProductDAO productDAO = new ProductDAO();
        return productDAO.findById(id);
    }
    
}
