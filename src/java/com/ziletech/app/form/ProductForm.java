package com.ziletech.app.form;

import com.cong.logiware.hibernate.entity.Product;
import com.cong.logiware.struts.LogiwareActionForm;
import java.util.List;

/**
 *
 * @author sks
 */
public class ProductForm extends LogiwareActionForm{
    
    private List<Product> productList;
    private Long productId;  //requested parameter
    private Product product; //response product
    

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }
    
    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
