package com.cong.logiware.web.servlet;

import com.cong.logiware.constant.RequestConstant;
import com.cong.logiware.constant.SessionConstant;
import com.cong.logiware.hibernate.dao.UserDAO;
import com.cong.logiware.hibernate.entity.User;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sunil
 */
public class Login extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try {
            String userName = request.getParameter(RequestConstant.USER_NAME);
            String password = request.getParameter(RequestConstant.PASSWORD);
            RequestDispatcher rd = request.getRequestDispatcher("/jsp/login.jsp");
            User user = new UserDAO().getUser(userName, password);
            if(user != null){
                request.getSession().setAttribute(SessionConstant.USER, user);
                request.getSession().setAttribute("isLoggedIn",true);
                response.sendRedirect("home.do");
            }else{
                rd.forward(request, response);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String invalidate = request.getParameter("invalidate");
        if ("true".equalsIgnoreCase(invalidate)) {
            request.getSession().invalidate();
            request.getSession().removeAttribute(SessionConstant.USER);
        }
        request.getRequestDispatcher("/jsp/login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
