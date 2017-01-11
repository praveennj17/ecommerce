package com.ziletech.app.action;


import com.cong.logiware.hibernate.entity.Product;
import com.cong.logiware.struts.LogiwareDispatchAction;
import com.ziletech.app.form.AdminProductForm;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author sks
 */
public class AddProductAction extends LogiwareDispatchAction {

   
    private static final String ADD_PRODUCT = "addProductPage";

   
    public ActionForward addProduct(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        AdminProductForm adminProdcutForm = (AdminProductForm) form;

        ProductDAO productDAO = new ProductDAO();
        Product product = new Product();
        product.setCategory(adminProdcutForm.getCategory());
        product.setName(adminProdcutForm.getName());
        product.setDescription(adminProdcutForm.getDescription());
        product.setPrice(adminProdcutForm.getPrice());
        productDAO.saveOrUpdate(product);
        return mapping.findForward(ADD_PRODUCT);

    }
}
