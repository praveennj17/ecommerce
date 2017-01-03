package com.ziletech.app.action;

import com.cong.logiware.hibernate.dao.RegistrationDAO;
import com.cong.logiware.hibernate.entity.Registration;
import com.cong.logiware.struts.LogiwareDispatchAction;
import com.ziletech.app.form.RegistrationForm;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author admin
 */
public class RegistrationAction extends LogiwareDispatchAction {

    private static final String SUCCESS = "success";

    public ActionForward registration(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        RegistrationForm registrationForm = (RegistrationForm) form;





        RegistrationDAO registrationDAO = new RegistrationDAO();
        Registration registration = new Registration();
registration.setUserName(registrationForm.getUserName());
registration.setEmail(registrationForm.getEmail());
registration.setPassword(registrationForm.getPassword());
        registrationDAO.saveOrUpdate(registration);
        return mapping.findForward(SUCCESS);
    }
}
