package com.ziletech.app.action;

import com.cong.logiware.hibernate.dao.ProductDAO;
import com.cong.logiware.hibernate.dao.UserDAO;
import com.cong.logiware.hibernate.entity.Product;
import com.cong.logiware.struts.LogiwareDispatchAction;
import com.ziletech.app.form.LoginForm;
import com.ziletech.app.service.ProductService;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author admin
 */
public class LoginAction extends LogiwareDispatchAction {

    private static final String HOME = "home";
    private static final String LOGIN_ERROR = "Wrong username or password!";

    public ActionForward login(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        LoginForm loginForm = (LoginForm) form;
     
        request.setAttribute("productList", new ProductService().getAllProducts());

        UserDAO userDAO = new UserDAO();
        if (userDAO.isUserFound(loginForm.getUserName(), loginForm.getPassword())) {
            return mapping.findForward(HOME);
        } else {
            loginForm.setErrorMessage(LOGIN_ERROR);
            return mapping.findForward(FAILURE);
        }
    }
}
