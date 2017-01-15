package com.ziletech.app.action;

import com.cong.logiware.struts.LogiwareDispatchAction;

import com.ziletech.app.form.HomeForm;
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
public class HomeAction extends LogiwareDispatchAction {

    private static final String HOME = "home";

    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        //Get all products from the service class and put into form.
        HomeForm homeForm = (HomeForm) form;
        homeForm.setProductList(new ProductService().getAllProducts());

        return mapping.findForward(HOME);
    }
}
