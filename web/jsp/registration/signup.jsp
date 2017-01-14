<!--Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE HTML>
<html>

    <body>
   
        
        
        
        
        
        
        
        
        
        
        
        
        
        

        <!--sign in start here-->
        <div class="signin">
            <div class="container">

                <div class="signin-main" >
                    <h1>Sign up</h1>
                    <h2>Informations</h2>
                    <cong:form action="registration.do?action=registration" method="post" name="registrationForm">
                        <label>User Name</label>
                        <br><cong:text name="userName"/><br>
                        <label>Email</label>
                        <br><cong:text name="email"/>
                        <br><label>Password</label>
                        <br><cong:password name="password"/>

                        <br><input type="submit" value="Submit">
                    </cong:form>
                </div>
            </div>
        </div>
        <!--sign in end here-->

    </body>
</html>