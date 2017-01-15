 package com.cong.logiware.struts;

import com.cong.logiware.constant.CommonConstant;
import com.cong.logiware.constant.FormConstant;
import com.cong.logiware.constant.RequestConstant;
import com.cong.logiware.constant.SessionConstant;
import com.cong.logiware.constant.MessageConstant;
import com.cong.logiware.constant.JspPathConstant;
import com.cong.logiware.hibernate.Domain;
import com.cong.logiware.constant.MimeTypeConstant;
import com.cong.logiware.constant.SpecialCharacterConstant;
import com.cong.logiware.constant.SystemRulesConstant;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import com.cong.logiware.hibernate.BaseHibernateDAO;
import com.cong.logiware.hibernate.entity.User;
import java.util.Collection;
import java.util.Date;

/**
 *
 * @author sunil
 */
public class LogiwareDispatchAction extends DispatchAction implements CommonConstant, RequestConstant, SessionConstant, MessageConstant, JspPathConstant, FormConstant, MimeTypeConstant, SpecialCharacterConstant, SystemRulesConstant {

    protected static final String INPUT = "input";
    protected BaseHibernateDAO baseHibernateDAO = new BaseHibernateDAO();

    public ActionForward refresh(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        return mapping.findForward(SUCCESS);
    }

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        try {
            final Date start = new Date();
            ActionForward actionForward = perform(mapping, form, request, response);
            return actionForward;
        } catch (Exception e) {
          
            return mapping.findForward(SUCCESS);
        }
//        return super.execute(mapping, form, request, response);
    }

    public ActionForward perform(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        ActionForward forward = super.execute(mapping, form, request, response);
        return forward;
    }

    public void setMessage(HttpServletRequest request, String message) {
        request.setAttribute(MESSAGE, message);
    }

    public void setScript(HttpServletRequest request, String message) {
        request.setAttribute(SCRIPT, message);
    }

    public void setAlert(HttpServletRequest request, String message) {
        request.setAttribute(ALERT, message);
    }

    public void setError(HttpServletRequest request, String message) {
        request.setAttribute(ERROR, message);
    }

    public void setErrors(HttpServletRequest request, Collection<String> errors) {
        request.setAttribute(ERRORS, errors);
    }

    public void setFatal(HttpServletRequest request, String message) {
        request.setAttribute(FATAL, message);
    }

    public void setInfo(HttpServletRequest request, String message) {
        request.setAttribute(INFO, message);
    }

    public String getPage(HttpServletRequest request) {
        return request.getParameter("page") == null ? null : request.getParameter("page");
    }
    
    public void removeSessionAtrribute(HttpServletRequest request, String attribute){
        request.getSession().removeAttribute(attribute);
    }
    
    public void setSessionAtrribute(HttpServletRequest request, String attribute, Object object){
        request.getSession().setAttribute(attribute, object);
    }
    
    public Object getSessionAtrribute(HttpServletRequest request, String attribute){
        return request.getSession().getAttribute(attribute);
    }

    public void save(Domain instance) {
        baseHibernateDAO.save(instance);
    }

    public void saveOrUpdate(Domain instance) {
        baseHibernateDAO.saveOrUpdate(instance);
    }

    public void update(Domain instance) {
        baseHibernateDAO.update(instance);
    }

    public void reattach(Domain domain) {
        baseHibernateDAO.reattach(domain);
    }

    public void disablePage(HttpServletRequest request, boolean disable) {
        request.setAttribute(DISABLE_PAGE, disable);
    }

    public User getCurrentUser(HttpServletRequest request) {
        Object o = request.getSession().getAttribute(USER);
        if (o != null) {
            return (User) o;
        } else {
            return null;
        }
    }
    /*
     * public boolean isCustomerPortal(HttpServletRequest request) { User user =
     * getCurrentUser(request); return (user != null && user.getCustomerPortal()
     * != null && user.getCustomerPortal()); }
     */

    @Override
    protected ActionForward dispatchMethod(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response, String name) throws Exception {
        //TODO: Register event for notesform
        return super.dispatchMethod(mapping, form, request, response, name);
    }
}
