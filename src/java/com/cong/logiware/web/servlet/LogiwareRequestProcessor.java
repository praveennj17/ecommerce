package com.cong.logiware.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.RequestProcessor;

/**
 *
 * @author sunil
 */
public class LogiwareRequestProcessor extends RequestProcessor {

    @Override
    public void process(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String path = processPath(request, response);
        ActionMapping mapping = processMapping(request, response, path);
        ActionForm form = processActionForm(request, response, mapping);
        Action action = processActionCreate(request, response, mapping);
        if (action == null) {
            return;
        }
        ActionForward forward = processActionPerform(request, response, action, form, mapping);
        processActionPerform(request, response, action, form, mapping);
        processForwardConfig(request, response, forward);
    }

}
