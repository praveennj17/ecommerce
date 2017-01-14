<!DOCTYPE HTML>
<html>
    <%@include file="/head.jsp" %>
    <body>
        <%@include file="/jsp/header.jsp" %>

        <!--start-ckeckout-->
        <div class="ckeckout">
            <div class="container">
                <div class="ckeckout-top">
                    <div class=" cart-items heading">

                        <h1>Product Update</h1>
                        <div class="in-check" >
                            <ul class="unit">
                                <li><span>Item</span></li>
                                <li><span>Category</span></li>
                                <li><span>Product Name</span></li>
                                <li><span>Description</span></li>
                                <li><span>Unit Price</span></li>
                                <!--                                <li><span>Quantity</span></li>-->
                                <div class="clearfix"> </div>
                            </ul>

                            <ul class="cart-header simpleCart_shelfItem">
                                <cong:form action="addproduct.do?action=Addproduct" method="post" name="adminproductForm">
                                    <li class="ring-in"><a href="#" ><img src="images/c.jpg" class="img-responsive" alt=""></a>
                                    </li>


                                    <li><span><cong:text name="category"/></span></li>
                                    <li><span><cong:text name="name"/></span></li>

                                    <li><span><cong:text name="description"/></span></li>
                                    <li><span><cong:text name="price"/></span></li

                                    <li> <input type="submit" value="Submit"> 

                                    </cong:form>
                                    <div class="clearfix"> </div>
                            </ul>

                        </div>
                    </div>  
                </div>
                <div class="ckeckout-top">
                    <div class=" cart-items heading">
                        <h1>List Products</h1>


                        <div class="in-check" >
                            <ul class="unit">
                                <li><span>Item</span></li>
                                <li><span>Category</span></li>

                                <li><span>Product Name</span></li>
                                <li><span>Description</span></li>
                                <li><span>Unit Price</span></li>
                                <!--<li><span>Quantity</span></li>-->
                                <div class="clearfix"> </div>
                            </ul>
                            <c:forEach var="product" items="${productForm.productList}">
                                <ul class="cart-header simpleCart_shelfItem">

                                    <li class="ring-in"><a href="#" ><img src="${product.image}" class="img-responsive" alt=""></a>
                                    </li>
                                    <li><span>${product.category}</span></li>
                                    <li><span>${product.name}</span></li>
                                    <li><span>${product.description}</span></li>
                                    <li><span class="item_price">${product.price}</span></li>

                                    <li> <a href="addproduct.do?action=remove&id=${product.id}" class="add-cart cart-check">Remove</a>

                                        <a href="addproduct.do?action=edit&id=${product.id}" class="add-cart cart-check">edit</a>
                                    </li>

                                    <div class="clearfix"> </div>
                                </ul>
                            </c:forEach>

                        </div>
                    </div>  
                </div>
            </div>
        </div>
        <!--end-ckeckout-->
        <%@include file="/jsp/footer.jsp" %>
    </body>
</html>
