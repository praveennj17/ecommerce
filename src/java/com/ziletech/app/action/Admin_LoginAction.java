package com.ziletech.app.action;

import com.cong.logiware.hibernate.dao.AdminDAO;
import com.cong.logiware.struts.LogiwareDispatchAction;
import com.ziletech.app.form.Admin_LoginForm;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author admin
 */
public class Admin_LoginAction extends LogiwareDispatchAction {

    private static final String ADMINHOME = "adminhome";
    private static final String FAILURE = "failure";
  private static final String LOGIN_ERROR = "Wrong username or password!";
    public ActionForward adminlogin(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        Admin_LoginForm admin_loginForm = (Admin_LoginForm) form;
        AdminDAO adminDAO = new AdminDAO();

        if (adminDAO.isUserFound(admin_loginForm.getAdminName(), admin_loginForm.getPassword())) {
            return mapping.findForward(ADMINHOME);
        } else {

           admin_loginForm.setErrorMessage(LOGIN_ERROR);
            return mapping.findForward(FAILURE);
        }

    }

}
