<%-- 
    Document   : home
    Created on : 02-Mar-2021, 10:53:40
    Author     : kien pham
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!--
	ustora by freshdesignweb.com
	Twitter: https://twitter.com/freshdesignweb
	URL: https://www.freshdesignweb.com/ustora/
-->
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Ustora Demo</title>
    
    <!-- Google Fonts -->
    <link href='http://fonts.googleapis.com/css?family=Titillium+Web:400,200,300,700,600' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Roboto+Condensed:400,700,300' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Raleway:400,100' rel='stylesheet' type='text/css'>
    
    <!-- Bootstrap -->
    <link rel="stylesheet" href="css/bootstrap.min_1.css">
    
    <!-- Font Awesome -->
    <link rel="stylesheet" href="css/font-awesome.min.css">
    
    <!-- Custom CSS -->
    <link rel="stylesheet" href="css/owl.carousel.css">
    <link rel="stylesheet" href="style_1.css">
    <link rel="stylesheet" href="css/responsive.css">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
  <body style="background-image: url();">
      
   
    <div class="header-area">
        <div class="container">
            <div class="row">
                <div class="col-md-8">
                    <div class="user-menu">
                        <ul>
                            <li><a href="#"><i class="fa fa-user"></i> My Account</a></li>
                            
                            <li><a href="ShowCart"><i class="fa fa-user"></i> My Cart</a></li>
                            
                            <li><a href="Login.jsp"><i class="fa fa-user"></i> Login</a></li>
                        </ul>
                    </div>
                </div>
                
                <div class="col-md-4">
                    <div class="header-right">
                        
                    </div>
                </div>
            </div>
        </div>
    </div> <!-- End header area -->
    
    <div class="site-branding-area">
        <div class="container">
            <div class="row">
                <div class="col-sm-12">
                    <div class="logo">
                        <h1><a href="HomeController"><img src="img/logo.png"></a></h1>
                    </div>
                </div>
                

            </div>
        </div>
    </div> <!-- End site branding area -->
    
    <div class="mainmenu-area">
        <div class="container">
            <div class="row">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                </div> 
                <div class="navbar-collapse collapse">
                    <ul class="nav navbar-nav">
                        <li class="active"><a href="HomeController">Home</a></li>
                        <li><a href="#i">Item</a></li>
                        
                        
                        <li><a href="ShowCart">Checkout</a></li>
                        <li><a href="#c">Category</a></li>
                        <li><a href="#h">Hot</a></li>
                        <li><a href="#contact">Contact</a></li>
                    </ul>
                </div>  
            </div>
        </div>
    </div> <!-- End mainmenu area -->
    
    <div class="slider-area">
        	<!-- Slider -->
                <div class="block-slider block-slider4">
                    <ul class="" id="bxslider-home4">
                          <li>
                            <img src="https://images.fpt.shop/unsafe/fit-in/800x300/filters:quality(90):fill(white)/fptshop.com.vn/Uploads/Originals/2021/3/31/637528127260161086_F-H1_800x300@2x.png" alt="Slide" style="max-width: 100%; height: 200px;">
                            <div class="caption-group">
                            </div>
                        </li>
                        
                        <li>
                            <img src="https://images.fpt.shop/unsafe/fit-in/800x300/filters:quality(90):fill(white)/fptshop.com.vn/Uploads/Originals/2021/4/1/637528336485995467_F_H1_800x300.png" alt="Slide" style="max-width: 100%; height: 200px;">
                            <div class="caption-group">
                            </div>
                        </li>
                        <li>
                            <img src="https://images.fpt.shop/unsafe/fit-in/800x300/filters:quality(90):fill(white)/fptshop.com.vn/Uploads/Originals/2021/3/31/637528127713609460_F-H1_800x300.png" alt="Slide" style="max-width: 100%; height: 200px;">
                            <div class="caption-group">
                            </div>
                        </li>
                        <li>
                            <img src="https://images.fpt.shop/unsafe/fit-in/800x300/filters:quality(90):fill(white)/fptshop.com.vn/Uploads/Originals/2021/3/31/637528283006150749_8B0ED455-C5BE-4FA5-AD76-177A802D9600.png" alt="Slide" style="max-width: 100%; height: 200px;">
                            <div class="caption-group">
                            </div>
                        </li>
                       <li>

                            <img src="https://images.fpt.shop/unsafe/fit-in/800x300/filters:quality(90):fill(white)/fptshop.com.vn/Uploads/Originals/2021/4/1/637528690776004857_F-H1_800x300.png" alt="Slide" style="max-width: 100%; height: 200px;">
                            <div class="caption-group">
                            </div>
                        </li>
                    </ul>
                </div>
			<!-- ./Slider -->
    </div> <!-- End slider area -->
      <!-- End main content area -->
      
   
   
    
    <div class="product-widget-area">
        <div class="zigzag-bottom"></div>
        <div class="container">
            <div class="row">
                <div class="col-md-4">
                    <div id="h" class="single-product-widget">
                        <h2 style="text-align: center" class="product-wid-title">Hot Product</h2>
                       
                        <div class="single-wid-product">
                            <a href="single-product.jsp"><img style="width:350px;height:350px;" src="${p.img}" alt="" class="product-thumb"></a>
                            <h2 style="text-align: center" ><a href="single-product.jsp">${p.name}</a></h2>
                            <div style="text-align: center" class="product-wid-rating">
                                <i class="fa fa-star"></i>
                                <i class="fa fa-star"></i>
                                <i class="fa fa-star"></i>
                                <i class="fa fa-star"></i>
                                <i class="fa fa-star"></i>
                            </div>
                            <div style="text-align: center" class="product-wid-price">
                                <ins>${p.price}</ins> <del>$425.00</del>
                            </div>                            
                        </div>
                       
                    </div>
                </div>
                <div class="col-md-8">
                    <div class="single-product-widget">
                        <h2 style="text-align: center" class="product-wid-title">Top New Product</h2>
                        
                         <c:forEach items="${n}" var="o">
                            
                        

                                 <div style=" float: left; padding:15px; " class="single-product">
                                <div class="product-f-image">
                                    <img style="width:200px;height:200px; " src="${o.img}" alt="">
                                    <div class="product-hover">
                                        <a href="cart?id=${o.id}" class="add-to-cart-link"><i class="fa fa-shopping-cart"></i> Add to cart</a>
                                        <a href="Detailcontroller?pid=${o.id}" class="view-details-link"><i class="fa fa-link"></i> See details</a>
                                    </div>
                                </div>
                                
                                <h2><a href="SingleControl">${o.name}</a></h2>
                                
                                <div class="product-carousel-price">
                                    <ins>$${o.price}</ins> <del>$1000.00</del>
                                </div> 
                            </div>
                           </c:forEach>
                    </div>
                </div>
            </div>
        </div>
    </div> <!-- End product widget area -->
    <div class="brands-area">
        <div class="zigzag-bottom"></div>

     <!-- End promo area -->
    <h2 style="color: red; " class="section-title">Famous brand</h2>
    <div id="c" class="container">
            <div class="row">
                <div class="col-md-12">
                    <div class="brand-wrapper">
                        <div class="brand-list">
                             
                            <jsp:useBean id="mrBean2" scope="page" class="model.Dataprocess"/>
                             <c:forEach items="${mrBean2.category}" var="c">
                                 <a href="homecate?cid=${c.id}#cate"><img style="width:250px;height:150px; " src="${c.img}" alt=""></a>
                                                         </c:forEach>                            
                        </div>
                    </div>
                </div>
            </div>
        </div>
                             
                             <div id="cate" class="maincontent-area">
        <div class="zigzag-bottom"></div>
        <div class="container">
            <div id="content" class="row">
                <div class="  col-md-12">
                    <div id="i" class="latest-product">
                        <h2 style="color: black;" class="section-title">All Products</h2>
                        
                        
                           
                             <c:forEach items="${listP}" var="o">
                            
                        

                                 <div style=" float: left; padding:15px; " class=" product single-product">
                                <div class="product-f-image">
                                    <img style="width:250px;height:250px; " src="${o.img}" alt="">
                                    <div class="product-hover">
                                        <a href="cart?id=${o.id}" class="add-to-cart-link"><i class="fa fa-shopping-cart"></i> Add to cart</a>
                                        <a href="Detailcontroller?pid=${o.id}" class="view-details-link"><i class="fa fa-link"></i> See details</a>
                                    </div>
                                </div>
                                
                                <h2><a href="single-product.jsp">${o.name}</a></h2>
                                
                                <div class="product-carousel-price">
                                    <ins>$${o.price}</ins> <del>$1000.00</del>
                                </div> 
                            </div>
                           </c:forEach>
                        
                                
                        </div>
                    
                    </div>
                </div>
            <button style="text-align: center" onclick="loadMore()" class="btn btn-primary">Load more</button>
            
            </div>
        </div>
              <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
               <script>
                        function loadMore() {
                            var amount = document.getElementsByClassName("product").length;
                            $.ajax({
                                url: "/ShoppingOnline/LoadmoreControl",
                                type: "get", //send it through get method
                                data: {
                                    exits: amount
                                },
                                success: function (data) {
                                    var row = document.getElementById("content");
                                    row.innerHTML += data;
                                },
                                error: function (xhr) {
                                    //Do Something to handle error
                                }
                            });
                        }
        </script>  
    </div>
                             <div id="contact"  class="footer-top-area">
        <div class="zigzag-bottom"></div>
        <div class="container">
            <div class="row">
                <div class="col-md-3 col-sm-6">
                    <div class="footer-about-us">
                        <h2>u<span>Stora</span></h2>
                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Perferendis sunt id doloribus vero quam laborum quas alias dolores blanditiis iusto consequatur, modi aliquid eveniet eligendi iure eaque ipsam iste, pariatur omnis sint! Suscipit, debitis, quisquam. Laborum commodi veritatis magni at?</p>
                        <div class="footer-social">
                            <a href="#" target="_blank"><i class="fa fa-facebook"></i></a>
                            <a href="#" target="_blank"><i class="fa fa-twitter"></i></a>
                            <a href="#" target="_blank"><i class="fa fa-youtube"></i></a>
                            <a href="#" target="_blank"><i class="fa fa-linkedin"></i></a>
                        </div>
                    </div>
                </div>
                
                <div class="col-md-3 col-sm-6">
                    <div class="footer-menu">
                        <h2 class="footer-wid-title">User Navigation </h2>
                        <ul>
                            <li><a href="#">My account</a></li>
                            <li><a href="#">Order history</a></li>
                            <li><a href="#">Wishlist</a></li>
                            <li><a href="#">Vendor contact</a></li>
                            <li><a href="#">Front page</a></li>
                        </ul>                        
                    </div>
                </div>
                
                <div class="col-md-3 col-sm-6">
                    <div class="footer-menu">
                        <h2 class="footer-wid-title">Categories</h2>
                        <ul>
                            <li><a href="#">Mobile Phone</a></li>
                            <li><a href="#">Home accesseries</a></li>
                            <li><a href="#">LED TV</a></li>
                            <li><a href="#">Computer</a></li>
                            <li><a href="#">Gadets</a></li>
                        </ul>                        
                    </div>
                </div>
                
                <div class="col-md-3 col-sm-6">
                    <div class="footer-newsletter">
                        <h2 class="footer-wid-title">Newsletter</h2>
                        <p>Sign up to our newsletter and get exclusive deals you wont find anywhere else straight to your inbox!</p>
                        <div class="newsletter-form">
                            <form action="#">
                                <input type="email" placeholder="Type your email">
                                <input type="submit" value="Subscribe">
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div> <!-- End footer top area -->
    
    <div class="footer-bottom-area">
        <div class="container">
            <div class="row">
                <div class="col-md-8">
                    <div class="copyright">
                        <p>&copy; 2015 uCommerce. All Rights Reserved. <a href="http://www.freshdesignweb.com" target="_blank">freshDesignweb.com</a></p>
                    </div>
                </div>
                
                <div class="col-md-4">
                    <div class="footer-card-icon">
                        <i class="fa fa-cc-discover"></i>
                        <i class="fa fa-cc-mastercard"></i>
                        <i class="fa fa-cc-paypal"></i>
                        <i class="fa fa-cc-visa"></i>
                    </div>
                </div>
            </div>
        </div>
    </div> <!-- End footer bottom area -->
   
    <!-- Latest jQuery form server -->
    <script src="https://code.jquery.com/jquery.min.js"></script>
    
    <!-- Bootstrap JS form CDN -->
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
    
    <!-- jQuery sticky menu -->
    <script src="js/owl.carousel.min.js"></script>
    <script src="js/jquery.sticky.js"></script>
    
    <!-- jQuery easing -->
    <script src="js/jquery.easing.1.3.min.js"></script>
    
    <!-- Main Script -->
    <script src="js/main.js"></script>
    
    <!-- Slider -->
    <script type="text/javascript" src="js/bxslider.min.js"></script>
	<script type="text/javascript" src="js/script.slider.js"></script>
  </body>
</html>
