
<!DOCTYPE HTML>
<html>
    <%@include file="/head.jsp" %>
    <body>
        <%@include file="/jsp/header.jsp" %>

        <!--product start here-->

        <!--flex slider-->
        <script defer src="js/jquery.flexslider.js"></script>
        <link rel="stylesheet" href="css/flexslider.css" type="text/css" media="screen" />

        <script>
            // Can also be used with $(document).ready()
            $(window).load(function () {
                $('.flexslider').flexslider({
                    animation: "slide",
                    controlNav: "thumbnails"
                });
            });
        </script>
        <script src="js/imagezoom.js"></script>
        <!--flex slider-->
        <!--single start here-->
        <div class="single">
            <div class="container">
                <div class="single-main">
                    <div class="single-top-main">
                        <div class="col-md-5 single-top">	
                            <div class="flexslider">
                                <ul class="slides">
                                    <li data-thumb="${productForm.product.image}">
                                        <div class="thumb-image"> <img src="${productForm.product.image}" data-imagezoom="true" class="img-responsive"> </div>
                                    </li>
                                    <li data-thumb="${productForm.product.image}">
                                        <div class="thumb-image"> <img src="${productForm.product.image}" data-imagezoom="true" class="img-responsive"> </div>
                                    </li>
                                    <li data-thumb="${productForm.product.image}">
                                        <div class="thumb-image"> <img src="${productForm.product.image}" data-imagezoom="true" class="img-responsive"> </div>
                                    </li> 
                                </ul>
                            </div>
                        </div>
                        <div class="col-md-7 single-top-left simpleCart_shelfItem">
                            <h3>${productForm.product.name}</h3>

                            <h6 class="item_price">Rs. ${productForm.product.price}</h6>	
                            <p>${productForm.product.description}</p>
                            <h6>Quantity</h6>

                            <cong:select  value="quant" name="quantity">
                                <cong:option value="quant">1</cong:option>

                            </cong:select>
                            <br>    <br>
                            <ul class="bann-btns">

                                <li><a href="cart.do?action=cart&productId=${productForm.product.id}" class="item_add">Add To Cart</a></li>	
                              
                            </ul>
                        </div>
                        <div class="clearfix"> </div>
                    </div>

                </div>
            </div>
        </div>
        <!--single end here-->




        <%@include file="/jsp/footer.jsp" %>

    </body>
</html>