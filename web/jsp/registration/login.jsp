<%@include file="/head.jsp" %>
<html>
    <head>
        <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
    </head>
    <body>
        <div class="main">
            <div class="header" >
                <h1>Login or Create a Free Account!</h1>
            </div>
            <p>Lorem iopsum dolor sit amit,consetetur sadipscing eliter,sed diam voluptua.At vero  eso et accusam et justo duo dolores et ea rebum. </p>

            <ul class="left-form">
                <h2>New Account:</h2>
                <li>
                    <input type="text"   placeholder="Username" required/>
                    <a href="#" class="icon ticker"> </a>
                    <div class="clear"> </div>
                </li> 
                <li>
                    <input type="text"   placeholder="Email" required/>
                    <a href="#" class="icon ticker"> </a>
                    <div class="clear"> </div>
                </li> 
                <li>
                    <input type="password"   placeholder="password" required/>
                    <a href="#" class="icon into"> </a>
                    <div class="clear"> </div>
                </li> 
                <li>
                    <input type="password"   placeholder="password" required/>
                    <a href="#" class="icon into"> </a>
                    <div class="clear"> </div>
                </li> 
                <label class="checkbox"><input type="checkbox" name="checkbox" checked=""><i> </i>Please inform me of upcoming  w3layouts, Promotions and news</label>
                <input type="submit" onclick="myFunction()" value="Create Account">
                <div class="clear"> </div>
            </ul>
            <ul class="right-form">
                <cong:form action="login.do?action=login" method="post" name="loginForm">
                    <h3>Login:</h3>
                    <c:if test="${not empty loginForm.errorMessage}">
                        <div class="error">${loginForm.errorMessage}</div>
                    </c:if>
                    <div>
                        <li><cong:text  name="userName"/></li>
                        <li><cong:text  name="password"/></li>
                        <h4>I forgot my Password!</h4>
                        <input type="submit" onclick="myFunction()" value="Login" >
                    </div>
                    <div class="clear"> </div>
                </cong:form>
            </ul>
            <div class="clear"> </div>


        </div>
        <!-----start-copyright---->
        <div class="copy-right">
            <p>Template by <a href="http://w3layouts.com">w3layouts</a></p> 
        </div>
        <!-----//end-copyright---->


    </body>
</html>