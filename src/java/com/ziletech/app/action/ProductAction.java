package com.ziletech.app.action;

import com.cong.logiware.hibernate.dao.RegistrationDAO;
import com.cong.logiware.hibernate.entity.Product;
import com.cong.logiware.hibernate.entity.Registration;
import com.cong.logiware.struts.LogiwareDispatchAction;
import com.ziletech.app.form.AdminProductForm;
import com.ziletech.app.form.ProductForm;
import com.ziletech.app.service.ProductService;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author sks
 */
public class ProductAction extends LogiwareDispatchAction {

    private static final String PRODUCTS = "products";
    private static final String MANAGE_PRODUCT = "manageProduct";
    private static final String PRODUCT_DETAILS = "product_details";
    private static final String ADD_PRODUCT = "addProductPage";

    public ActionForward showAll(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Get all products from the service class and put into form.
        ProductForm productForm = (ProductForm) form;
        productForm.setProductList(new ProductService().getAllProducts());

        return mapping.findForward(PRODUCTS);
    }

    public ActionForward displayProduct(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        ProductForm productForm = (ProductForm) form;
        Product product = new ProductService().getById(productForm.getProductId());
        productForm.setProduct(product);

        return mapping.findForward(PRODUCT_DETAILS);
    }

    public ActionForward manage(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        ProductForm productForm = (ProductForm) form;
        productForm.setProductList(new ProductService().getAllProducts());

        return mapping.findForward(MANAGE_PRODUCT);
    }

  
}
