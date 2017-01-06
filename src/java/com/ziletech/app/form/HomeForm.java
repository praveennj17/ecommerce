package com.ziletech.app.form;

import com.cong.logiware.hibernate.entity.Product;
import com.cong.logiware.struts.LogiwareActionForm;
import java.util.List;

/**
 *
 * @author sks
 */
public class HomeForm extends LogiwareActionForm{
    
    private List<Product> productList;

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
    
}
