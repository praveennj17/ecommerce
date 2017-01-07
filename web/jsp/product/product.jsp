
<!DOCTYPE HTML>
<html>
    <%@include file="/head.jsp" %>
    <body>
        <%@include file="/jsp/header.jsp" %>
        <!--product start here-->
        <div class="product">
            <div class="container">
                <div class="product-main">
                    <div class=" product-menu-bar">

                    </div>	
                    <div class="col-md-12 product-block">

                        <c:forEach var="product" items="${productForm.productList}">

                            <div class="col-md-4 home-grid">
                                <div class="home-product-main">
                                    <div class="home-product-top">
                                        <a href="product.do?action=displayProduct&productId=${product.id}"><img src="${product.image}" alt="" class="img-responsive zoom-img"></a>
                                    </div>
                                    <div class="home-product-bottom">
                                        <h3><a href="product.do?action=displayProduct&productId=${product.id}">${product.name}</a></h3>
                                        <p>Explore Now</p>						
                                    </div>
                                    <div class="srch">
                                        <span>${product.price}</span>
                                    </div>
                                </div>
                            </div>

                        </c:forEach>
                        <div class="clearfix"> </div>
                    </div>
                </div>
            </div>
        </div>
        <!--product end here-->
         <%@include file="/jsp/footer.jsp" %>
    </body>
</html>