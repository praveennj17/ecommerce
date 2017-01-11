
<!--header strat here-->
<div class="header">
    <div class="container">
        <div class="header-main">
            <div class="top-nav">
                <div class="content white">
                    <nav class="navbar navbar-default" role="navigation">
                        <div class="navbar-header">
                            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                                <span class="sr-only">Toggle navigation</span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                            </button>
                            <div class="navbar-brand logo">
                                <a href="${path}/home.do"><img src="images/logo1.png" alt=""></a>
                            </div>
                        </div>
                        <!--/.navbar-header-->
                        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                            <ul class="nav navbar-nav">
                                <li><a href="home.do">Home</a></li>
                                <li><a href="product.do?action=showAll">Product</a></li>

                                <c:if test="${user.role eq 'admin'}">
                                    <li><a href="manage.do?action=manage">Manage Products</a></li>
                                </c:if>

                            </ul>
                        </div>
                        <!--/.navbar-collapse-->
                    </nav>
                    <!--/.navbar-->
                </div>
            </div>
            <div class="header-right">
                <div class="search">

                    <div class="cart box_1">
                        <a href="cart.do">
                            <h3>
                                <img src="images/cart.png" alt=""/>

                            </h3>
                        </a>
                        <p><a href="" class="simpleCart_empty">Empty Cart</a></p>
                    </div> 



                    <div class="head-signin">
                        <h5><i class="hd-dign"></i>Hello ${user.userName} - ${user.email}</h5>
                        <c:if test="${isLoggedIn}">
                            <a  href="${path}/secure.login?invalidate=true">Logout</a>
                        </c:if>
                    </div>              
                    <div class="clearfix"> </div>					
                </div>
            </div>
            <div class="clearfix"> </div>
        </div> 
    </div>
</div>
<!--header end here-->