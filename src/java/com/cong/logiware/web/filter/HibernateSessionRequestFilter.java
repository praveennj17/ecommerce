package com.cong.logiware.web.filter;

import com.cong.logiware.hibernate.BaseHibernateDAO;
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import org.hibernate.Session;
import org.hibernate.StaleObjectStateException;

public class HibernateSessionRequestFilter extends BaseHibernateDAO implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        Session hibSession = null;
        try {
            request.setCharacterEncoding("UTF-8");
            response.setCharacterEncoding("UTF-8");
            hibSession = getCurrentSession();
            hibSession.beginTransaction();
            // Call the next filter (continue request processing)
            chain.doFilter(request, response);

            // Commit and cleanup
            hibSession.getTransaction().commit();
            
        } catch (StaleObjectStateException staleEx) {
	    // Rollback, close everything, possibly compensate for any permanent changes
            // during the conversation, and finally restart business conversation. Maybe
            // give the user of the application a chance to merge some of his work with
            // fresh data... what you do here depends on your applications design.
            throw staleEx;
	} catch (Throwable ex) {
            throw new ServletException(ex);
        } finally {
            if (null != hibSession && hibSession.isOpen()) {
                hibSession.close();
            }
        }
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
//        this.initializeSessionFactory();
    }

    @Override
    public void destroy() {
    }
}
