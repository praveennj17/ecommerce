<%-- 
    Document   : admin_login
    Created on : Jan 5, 2017, 11:12:33 AM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
            <%@include file="/head.jsp" %>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>admin login page</title>
    </head>
    <body>
              <div class="login">
            <div class="container">
                <div class="login-main">
                    <h1>Login</h1>
                    <div class="col-md-6 login-left">
                      
                        <cong:form action="adminlogin.do?action=adminlogin" method="post" name="Admin_LoginForm">


                            <label>Admin Name</label>
                            <cong:text  name="adminName"/>
                            <label>Password</label>
                            <cong:text  name="password"/>
                            <c:if test="${not empty loginForm.errorMessage}">
                                <div class="error">${loginForm.errorMessage}</div>
                            </c:if>
                            <input type="submit" onclick="myFunction()" value="Login" >
                          
                        </cong:form>
                    </div>
                    <div class="col-md-6 login-right">
                       

                       
                    </div>
                    <div class="clearfix"> </div>
                </div>
            </div>
        </div>
    </body>
</html>
