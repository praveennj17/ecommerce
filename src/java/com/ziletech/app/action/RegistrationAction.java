package com.ziletech.app.action;

import com.cong.logiware.hibernate.Property;
import com.cong.logiware.hibernate.dao.RegistrationDAO;
import com.cong.logiware.hibernate.entity.Registration;
import com.cong.logiware.struts.LogiwareDispatchAction;
import com.ziletech.app.form.RegistrationForm;
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
public class RegistrationAction extends LogiwareDispatchAction {

    private static final String SUCCESS = "success";

    public ActionForward registration(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        RegistrationForm registrationForm = (RegistrationForm) form;

        //Delete Registration entity and Registration DAO instead use User entity
        //Delete the table from DB
        //Remove the entity entry from hibernate.cfg.xml
        RegistrationDAO registrationDAO = new RegistrationDAO();
        Registration registration = new Registration();

        registration.setUserName(registrationForm.getUserName());
        registration.setEmail(registrationForm.getEmail());
        registration.setPassword(registrationForm.getPassword());
        registrationDAO.saveOrUpdate(registration);
        return mapping.findForward(SUCCESS);

    }
}
