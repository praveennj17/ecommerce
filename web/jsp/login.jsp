
<!DOCTYPE HTML>
<html>
    <%@include file="/head.jsp" %>
    <body>
        <%@include file="/jsp/header.jsp" %>
        <!--log in start here-->
        <div class="login">
            <div class="container">
                <div class="login-main">
                    <h1>Login</h1>
                    <div class="col-md-6 login-left">
                        <h2>Existing User</h2>
                        <form action="${path}/secure.login" method="post" name="loginForm">


                            <label>User Name</label>
                            <input type="text"  name="userName"/>
                            <label>Password</label>
                            <input type="password" name="password"/>
                            <input type="submit" onclick="myFunction()" value="Login" >

                        </form>
                    </div>
                    <div class="col-md-6 login-right">
                        <h3>New User? Create an Account</h3>
                        <p>But I must explain to you how all this mistaken idea of denouncing pleasure and praising pain was born and I will give you a complete account of the system. and expound the actual teachings of the great.</p>

                        <a href="RegistrationPage.do">Create an Account </a>

                    </div>
                    <div class="clearfix"> </div>
                </div>
            </div>
        </div>
        <!--log in end here-->
            <%@include file="/jsp/footer.jsp" %>
    </body>
</html>