
<html>

     <%@include file="/head.jsp" %>
    <body>
        <%@include file="/jsp/header.jsp" %>

        <!--sign in start here-->
        <div class="signin">
            <div class="container">

                <div class="signin-main" >
                    <h1>Delivery Address</h1>
                    <h2>Informations</h2>
                    <cong:form action="Shiped.do?Shiped" method="post" name="shippingForm">
                        <label>Full Name</label>
                        <br><cong:text name="fullName"/><br>
                        <label>Mobile number</label>
                        <br><cong:text name="mobilenumber"/>
                        <br><label>Pincode</label>
                        <br><cong:text name="pincode"/>
                        <br><label>Flat / House No. / Floor / Building: </label>
                        <br><cong:text name="enterAddressAddressLine1"/>
                        <br><label>Colony / Street / Locality:  </label>
                        <br><cong:text name="enterAddressAddressLine2"/>
                         <br><label>Town/City:   </label>
                        <br><cong:text name="towncity"/>
                          <br><label>State:   </label>
                        <br><cong:text name="state"/>
                       <br><input type="submit" value="Place Order">
                    </cong:form>
                </div>
            </div>
        </div>
        <!--sign in end here-->

       <%@include file="/jsp/footer.jsp" %>
    </body>
</html>