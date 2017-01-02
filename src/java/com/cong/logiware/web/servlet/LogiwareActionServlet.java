package com.cong.logiware.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionServlet;
import org.apache.struts.action.RequestProcessor;
import org.apache.struts.config.ModuleConfig;

/**
 *
 * @author sunil
 */
public class LogiwareActionServlet extends ActionServlet {

    @Override
    protected void process(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        try {
            super.process(request, response);
        } catch (Exception e) {
//            ModuleConfig config = getModuleConfig(request);
//            RequestProcessor processor = new LogiwareRequestProcessor();
//            processor.init(this, config);
//            processor.process(request, response);
        }
    }

}
