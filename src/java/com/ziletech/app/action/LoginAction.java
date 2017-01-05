package com.ziletech.app.action;

import com.cong.logiware.hibernate.dao.UserDAO;
import com.cong.logiware.service.OrderService;
import com.cong.logiware.struts.LogiwareDispatchAction;

import com.ziletech.app.form.LoginForm;
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
    private static final String FAILURE = "failure";
    private static final String LOGIN_ERROR = "Wrong username or password!";

    public ActionForward login(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        LoginForm loginForm = (LoginForm) form;

        UserDAO userDAO = new UserDAO();
        if (userDAO.isUserFound(loginForm.getUserName(), loginForm.getPassword())) {
            return mapping.findForward(HOME);
        } else {
            loginForm.setErrorMessage(LOGIN_ERROR);
            return mapping.findForward(FAILURE);
        }
    }

}
