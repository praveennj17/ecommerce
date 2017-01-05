package com.ziletech.app.action;

import com.cong.logiware.hibernate.dao.AdminProductDAO;
import com.cong.logiware.hibernate.entity.AdminProduct;
import com.cong.logiware.struts.LogiwareDispatchAction;
import com.ziletech.app.form.Admin_ProductForm;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author admin
 */
public class Admin_ProductAction extends LogiwareDispatchAction {

    private static final String SUCCESS = "success";

    public ActionForward product(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        Admin_ProductForm admin_productForm = (Admin_ProductForm) form;

        AdminProductDAO productDAO = new AdminProductDAO();
        AdminProduct adminproduct = new AdminProduct();
       adminproduct.setCategory(admin_productForm.getCategory());
        adminproduct.setName(admin_productForm.getName());
        adminproduct.setPrice(admin_productForm.getPrice());
        adminproduct.setDescription(admin_productForm.getDescription());
       productDAO.saveOrUpdate(adminproduct);
       
        return mapping.findForward(SUCCESS);

    }
}
