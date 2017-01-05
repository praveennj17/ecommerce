<%-- 
    Document   : admin_product
    Created on : Jan 4, 2017, 1:05:53 PM
    Author     : yukti
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@include file="/head.jsp" %>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>PRODUCT PAGE</title>
    </head>
    <body>
        <div class="product">
            <div class="container">

                <div class="product-main" >
                    <h1>PRODUCT PAGE</h1>
                    <h2>Informations</h2>
                    <cong:form action="product.do?action=product" method="post" name="Admin_ProductForm">
                        <label>CATEGORY</label>
                        <br><cong:text name="category"/><br>
                        <label>Name</label>
                        <br><cong:text name="name"/>
                        <br><label>PRICE</label>
                        <br><cong:password name="price"/>
                        <br><label>DESCRIPTION</label>
                        <br><cong:password name="description"/>
                        <br><input type="submit" value="Submit">
                    </cong:form>
                </div>
            </div>
        </div>
    </body>
</html>
