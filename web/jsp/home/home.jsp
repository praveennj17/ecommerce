
<!DOCTYPE HTML>
<html>
    <%@include file="/head.jsp" %>
    <body>
        <%@include file="/jsp/header.jsp" %>
        <!--banner strat here-->
        <div class="banner">
            <div class="container">
                <div class="banner-main">
                    <div class="col-md-6 banner-left">
                        <a href="single.html"><img src="images/ba.png" alt="" class="img-responsive"></a>
                    </div>

                    <div class="clearfix"> </div>
                </div>
            </div>
        </div>

        <div class="home-block">
            <div class="container">
                <div class="home-block-main">

                    <c:forEach var="product" items="${homeForm.productList}" begin="1" end="4">

                        <div class="col-md-3 home-grid">
                            <div class="home-product-main">
                                <div class="home-product-top">
                                    <a href="product.do?action=displayProduct&productId=${product.id}"><img src="${product.image}" alt="" class="img-responsive zoom-img"></a>
                                </div>
                                <div class="home-product-bottom">
                                    <h3><a href="product.do?action=displayProduct&productId=${product.id}">${product.name}</a></h3>

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
        <!--home block end here-->
        <%@include file="/jsp/footer.jsp" %>
    </body>
</html>