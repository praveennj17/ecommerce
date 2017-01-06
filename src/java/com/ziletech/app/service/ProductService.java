package com.ziletech.app.service;

import com.cong.logiware.hibernate.dao.ProductDAO;
import com.cong.logiware.hibernate.entity.Product;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author sks
 */
public class ProductService {

    //1. what will be input type and number of inputs, arguments or parameter
    //2. What it will perform.
    //3. What it will return. 
    public List<Product> getAllProducts() {
        ProductDAO productDAO = new ProductDAO();
        List<Product> productList = productDAO.findAll();
        return productList;
    }

    public Product getById(Long id) {
        ProductDAO productDAO = new ProductDAO();
        return productDAO.findById(id);
    }

    public Product getProductById(Long productId){
        Map<Long,Product> map = new HashMap<>();
        for(Product product : getAllProducts()){
            map.put(product.getId(), product);
        }
        return map.get(productId);
    }
    
     public Product getProductByName(String productName){
        Map<String,Product> map = new HashMap<>();
        for(Product product : getAllProducts()){
            map.put(product.getName(), product);
        }
        return map.get(productName);
    }
            
    
}
