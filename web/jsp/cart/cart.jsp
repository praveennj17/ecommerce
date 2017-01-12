
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
                        <h1>My Shopping Bag </h1>


                        <div class="in-check" >
                            <ul class="unit">
                                <li><span>Item</span></li>
                                <li><span>Product Name</span></li>		
                                <li><span>Unit Price</span></li>
                                <li><span>Quantity</span></li>
                                <div class="clearfix"> </div>
                            </ul>
                            
                            <c:forEach var="product" items="${productForm.productList}">
                            <ul class="cart-header simpleCart_shelfItem">

                                <li class="ring-in"><a href="#" ><img src="${product.image}" class="img-responsive" alt=""></a>
                                </li>
                                <li><span>${product.name}</span></li>
                                <li><span class="item_price">${product.price}</span></li>
                                <li><span class="item_price">1</span></li>
                                <li> <a href="#" class="add-cart cart-check">Remove</a></li>
                                
                                <div class="clearfix"> </div>
                              </ul>
                           </c:forEach>
                                <a href="" class="add-cart">Checkout</a>
                        </div>
                    </div>  
                </div>
            </div>
        </div>
        <!--end-ckeckout-->
        <%@include file="/jsp/footer.jsp" %>
    </body>
</html>