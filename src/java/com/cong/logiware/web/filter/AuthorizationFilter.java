package com.cong.logiware.web.filter;

import com.cong.logiware.constant.SessionConstant;
import com.cong.logiware.util.URLUTF8Encoder;
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sunil
 */
public class AuthorizationFilter implements Filter {

    private static final boolean debug = false;
    // The filter configuration object we are associated with.  If
    // this value is null, this filter instance is not currently
    // configured.
    private FilterConfig filterConfig = null;

    public AuthorizationFilter() {
    }

    public boolean isLoggedInUser(ServletRequest request) {
        boolean success = false;
        HttpServletRequest _request = (HttpServletRequest) request;
        if (_request.getSession() != null && _request.getSession() != null && _request.getSession().getAttribute(SessionConstant.USER) != null) {
             success = true;
        }
        _request.getSession().setAttribute("isLoggedIn", success);
        return success;
    }

    /**
     *
     * @param request The servlet request we are processing
     * @param response The servlet response we are creating
     * @param chain The filter chain we are processing
     *
     * @exception IOException if an input/output error occurs
     * @exception ServletException if a servlet error occurs
     */
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        if (debug) {
            log("AuthorizationFilter:doFilter()");
        }
        if (request.getParameter("accessKey") != null) {
            forwardToMessagePage(request, response);
        } else if (!isLoggedInUser(request)) {
            forwardToLoginPage(request, response);
        } else {

            Throwable problem = null;
            try {
                chain.doFilter(request, response);
            } catch (Throwable t) {
                forwardToLoginPage(request, response);
                problem = t;
                t.printStackTrace();
            }
            // If there was a problem, we want to rethrow it if it is
            // a known type, otherwise log it.
            if (problem != null) {
                if (problem instanceof ServletException) {
                    throw (ServletException) problem;
                }
                if (problem instanceof IOException) {
                    throw (IOException) problem;
                }
                forwardToLoginPage(request, response);
            }
        }
    }

    public void forwardToLoginPage(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        HttpServletRequest req = (HttpServletRequest) request;
        if (req.getRequestURL().toString().contains("login.jsp")) {
            request.getRequestDispatcher("/jsp/login.jsp").forward(request, response);
        } else {
            ((HttpServletResponse) response).sendRedirect(req.getContextPath()
                    + "/jsp/login.jsp?continue=" + URLUTF8Encoder.encode(req.getRequestURL().toString() + "?" + req.getQueryString()));
        }
    }

    public void forwardToMessagePage(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        HttpServletRequest req = (HttpServletRequest) request;
        ((HttpServletResponse) response).sendRedirect(req.getContextPath() + "/jsp/message.jsp?msg=" + req.getAttribute("msg"));
    }

    /**
     * Destroy method for this filter
     */
    public void destroy() {
    }

    /**
     * Init method for this filter
     */
    public void init(FilterConfig filterConfig) {
        this.filterConfig = filterConfig;
        if (filterConfig != null) {
            if (debug) {
                log("AuthorizationFilter:Initializing filter");
            }
        }
    }

    public void log(String msg) {
        filterConfig.getServletContext().log(msg);
    }
}
