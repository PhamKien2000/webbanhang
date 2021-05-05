package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--\n");
      out.write("\tustora by freshdesignweb.com\n");
      out.write("\tTwitter: https://twitter.com/freshdesignweb\n");
      out.write("\tURL: https://www.freshdesignweb.com/ustora/\n");
      out.write("-->\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <title>Ustora Demo</title>\n");
      out.write("    \n");
      out.write("    <!-- Google Fonts -->\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Titillium+Web:400,200,300,700,600' rel='stylesheet' type='text/css'>\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Roboto+Condensed:400,700,300' rel='stylesheet' type='text/css'>\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Raleway:400,100' rel='stylesheet' type='text/css'>\n");
      out.write("    \n");
      out.write("    <!-- Bootstrap -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min_1.css\">\n");
      out.write("    \n");
      out.write("    <!-- Font Awesome -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\n");
      out.write("    \n");
      out.write("    <!-- Custom CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/owl.carousel.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"style_1.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/responsive.css\">\n");
      out.write("\n");
      out.write("    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("  </head>\n");
      out.write("  <body style=\"background-image: url();\">\n");
      out.write("      \n");
      out.write("   \n");
      out.write("    <div class=\"header-area\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-8\">\n");
      out.write("                    <div class=\"user-menu\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-user\"></i> My Account</a></li>\n");
      out.write("                            \n");
      out.write("                            <li><a href=\"ShowCart\"><i class=\"fa fa-user\"></i> My Cart</a></li>\n");
      out.write("                            \n");
      out.write("                            <li><a href=\"Login.jsp\"><i class=\"fa fa-user\"></i> Login</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <div class=\"header-right\">\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div> <!-- End header area -->\n");
      out.write("    \n");
      out.write("    <div class=\"site-branding-area\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-12\">\n");
      out.write("                    <div class=\"logo\">\n");
      out.write("                        <h1><a href=\"HomeController\"><img src=\"img/logo.png\"></a></h1>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div> <!-- End site branding area -->\n");
      out.write("    \n");
      out.write("    <div class=\"mainmenu-area\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\n");
      out.write("                        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                    </button>\n");
      out.write("                </div> \n");
      out.write("                <div class=\"navbar-collapse collapse\">\n");
      out.write("                    <ul class=\"nav navbar-nav\">\n");
      out.write("                        <li class=\"active\"><a href=\"HomeController\">Home</a></li>\n");
      out.write("                        <li><a href=\"#i\">Item</a></li>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        <li><a href=\"ShowCart\">Checkout</a></li>\n");
      out.write("                        <li><a href=\"#c\">Category</a></li>\n");
      out.write("                        <li><a href=\"#h\">Hot</a></li>\n");
      out.write("                        <li><a href=\"#contact\">Contact</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>  \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div> <!-- End mainmenu area -->\n");
      out.write("    \n");
      out.write("    <div class=\"slider-area\">\n");
      out.write("        \t<!-- Slider -->\n");
      out.write("                <div class=\"block-slider block-slider4\">\n");
      out.write("                    <ul class=\"\" id=\"bxslider-home4\">\n");
      out.write("                          <li>\n");
      out.write("                            <img src=\"https://images.fpt.shop/unsafe/fit-in/800x300/filters:quality(90):fill(white)/fptshop.com.vn/Uploads/Originals/2021/3/31/637528127260161086_F-H1_800x300@2x.png\" alt=\"Slide\" style=\"max-width: 100%; height: 200px;\">\n");
      out.write("                            <div class=\"caption-group\">\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("                        \n");
      out.write("                        <li>\n");
      out.write("                            <img src=\"https://images.fpt.shop/unsafe/fit-in/800x300/filters:quality(90):fill(white)/fptshop.com.vn/Uploads/Originals/2021/4/1/637528336485995467_F_H1_800x300.png\" alt=\"Slide\" style=\"max-width: 100%; height: 200px;\">\n");
      out.write("                            <div class=\"caption-group\">\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <img src=\"https://images.fpt.shop/unsafe/fit-in/800x300/filters:quality(90):fill(white)/fptshop.com.vn/Uploads/Originals/2021/3/31/637528127713609460_F-H1_800x300.png\" alt=\"Slide\" style=\"max-width: 100%; height: 200px;\">\n");
      out.write("                            <div class=\"caption-group\">\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <img src=\"https://images.fpt.shop/unsafe/fit-in/800x300/filters:quality(90):fill(white)/fptshop.com.vn/Uploads/Originals/2021/3/31/637528283006150749_8B0ED455-C5BE-4FA5-AD76-177A802D9600.png\" alt=\"Slide\" style=\"max-width: 100%; height: 200px;\">\n");
      out.write("                            <div class=\"caption-group\">\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("                       <li>\n");
      out.write("\n");
      out.write("                            <img src=\"https://images.fpt.shop/unsafe/fit-in/800x300/filters:quality(90):fill(white)/fptshop.com.vn/Uploads/Originals/2021/4/1/637528690776004857_F-H1_800x300.png\" alt=\"Slide\" style=\"max-width: 100%; height: 200px;\">\n");
      out.write("                            <div class=\"caption-group\">\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("\t\t\t<!-- ./Slider -->\n");
      out.write("    </div> <!-- End slider area -->\n");
      out.write("      <!-- End main content area -->\n");
      out.write("      \n");
      out.write("   \n");
      out.write("   \n");
      out.write("    \n");
      out.write("    <div class=\"product-widget-area\">\n");
      out.write("        <div class=\"zigzag-bottom\"></div>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <div id=\"h\" class=\"single-product-widget\">\n");
      out.write("                        <h2 style=\"text-align: center\" class=\"product-wid-title\">Hot Product</h2>\n");
      out.write("                       \n");
      out.write("                        <div class=\"single-wid-product\">\n");
      out.write("                            <a href=\"single-product.jsp\"><img style=\"width:350px;height:350px;\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.img}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" alt=\"\" class=\"product-thumb\"></a>\n");
      out.write("                            <h2 style=\"text-align: center\" ><a href=\"single-product.jsp\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a></h2>\n");
      out.write("                            <div style=\"text-align: center\" class=\"product-wid-rating\">\n");
      out.write("                                <i class=\"fa fa-star\"></i>\n");
      out.write("                                <i class=\"fa fa-star\"></i>\n");
      out.write("                                <i class=\"fa fa-star\"></i>\n");
      out.write("                                <i class=\"fa fa-star\"></i>\n");
      out.write("                                <i class=\"fa fa-star\"></i>\n");
      out.write("                            </div>\n");
      out.write("                            <div style=\"text-align: center\" class=\"product-wid-price\">\n");
      out.write("                                <ins>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</ins> <del>$425.00</del>\n");
      out.write("                            </div>                            \n");
      out.write("                        </div>\n");
      out.write("                       \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-8\">\n");
      out.write("                    <div class=\"single-product-widget\">\n");
      out.write("                        <h2 style=\"text-align: center\" class=\"product-wid-title\">Top New Product</h2>\n");
      out.write("                        \n");
      out.write("                         ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div> <!-- End product widget area -->\n");
      out.write("    <div class=\"brands-area\">\n");
      out.write("        <div class=\"zigzag-bottom\"></div>\n");
      out.write("\n");
      out.write("     <!-- End promo area -->\n");
      out.write("    <h2 style=\"color: red; \" class=\"section-title\">Famous brand</h2>\n");
      out.write("    <div id=\"c\" class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                    <div class=\"brand-wrapper\">\n");
      out.write("                        <div class=\"brand-list\">\n");
      out.write("                             \n");
      out.write("                            ");
      model.Dataprocess mrBean2 = null;
      synchronized (_jspx_page_context) {
        mrBean2 = (model.Dataprocess) _jspx_page_context.getAttribute("mrBean2", PageContext.PAGE_SCOPE);
        if (mrBean2 == null){
          mrBean2 = new model.Dataprocess();
          _jspx_page_context.setAttribute("mrBean2", mrBean2, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("                             ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("                             \n");
      out.write("                             <div id=\"cate\" class=\"maincontent-area\">\n");
      out.write("        <div class=\"zigzag-bottom\"></div>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div id=\"content\" class=\"row\">\n");
      out.write("                <div class=\"  col-md-12\">\n");
      out.write("                    <div id=\"i\" class=\"latest-product\">\n");
      out.write("                        <h2 style=\"color: black;\" class=\"section-title\">All Products</h2>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                           \n");
      out.write("                             ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        \n");
      out.write("                                \n");
      out.write("                        </div>\n");
      out.write("                    \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            <button style=\"text-align: center\" onclick=\"loadMore()\" class=\"btn btn-primary\">Load more</button>\n");
      out.write("            \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("              <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("               <script>\n");
      out.write("                        function loadMore() {\n");
      out.write("                            var amount = document.getElementsByClassName(\"product\").length;\n");
      out.write("                            $.ajax({\n");
      out.write("                                url: \"/ShoppingOnline/LoadmoreControl\",\n");
      out.write("                                type: \"get\", //send it through get method\n");
      out.write("                                data: {\n");
      out.write("                                    exits: amount\n");
      out.write("                                },\n");
      out.write("                                success: function (data) {\n");
      out.write("                                    var row = document.getElementById(\"content\");\n");
      out.write("                                    row.innerHTML += data;\n");
      out.write("                                },\n");
      out.write("                                error: function (xhr) {\n");
      out.write("                                    //Do Something to handle error\n");
      out.write("                                }\n");
      out.write("                            });\n");
      out.write("                        }\n");
      out.write("        </script>  \n");
      out.write("    </div>\n");
      out.write("                             <div id=\"contact\"  class=\"footer-top-area\">\n");
      out.write("        <div class=\"zigzag-bottom\"></div>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-3 col-sm-6\">\n");
      out.write("                    <div class=\"footer-about-us\">\n");
      out.write("                        <h2>u<span>Stora</span></h2>\n");
      out.write("                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Perferendis sunt id doloribus vero quam laborum quas alias dolores blanditiis iusto consequatur, modi aliquid eveniet eligendi iure eaque ipsam iste, pariatur omnis sint! Suscipit, debitis, quisquam. Laborum commodi veritatis magni at?</p>\n");
      out.write("                        <div class=\"footer-social\">\n");
      out.write("                            <a href=\"#\" target=\"_blank\"><i class=\"fa fa-facebook\"></i></a>\n");
      out.write("                            <a href=\"#\" target=\"_blank\"><i class=\"fa fa-twitter\"></i></a>\n");
      out.write("                            <a href=\"#\" target=\"_blank\"><i class=\"fa fa-youtube\"></i></a>\n");
      out.write("                            <a href=\"#\" target=\"_blank\"><i class=\"fa fa-linkedin\"></i></a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"col-md-3 col-sm-6\">\n");
      out.write("                    <div class=\"footer-menu\">\n");
      out.write("                        <h2 class=\"footer-wid-title\">User Navigation </h2>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"#\">My account</a></li>\n");
      out.write("                            <li><a href=\"#\">Order history</a></li>\n");
      out.write("                            <li><a href=\"#\">Wishlist</a></li>\n");
      out.write("                            <li><a href=\"#\">Vendor contact</a></li>\n");
      out.write("                            <li><a href=\"#\">Front page</a></li>\n");
      out.write("                        </ul>                        \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"col-md-3 col-sm-6\">\n");
      out.write("                    <div class=\"footer-menu\">\n");
      out.write("                        <h2 class=\"footer-wid-title\">Categories</h2>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"#\">Mobile Phone</a></li>\n");
      out.write("                            <li><a href=\"#\">Home accesseries</a></li>\n");
      out.write("                            <li><a href=\"#\">LED TV</a></li>\n");
      out.write("                            <li><a href=\"#\">Computer</a></li>\n");
      out.write("                            <li><a href=\"#\">Gadets</a></li>\n");
      out.write("                        </ul>                        \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"col-md-3 col-sm-6\">\n");
      out.write("                    <div class=\"footer-newsletter\">\n");
      out.write("                        <h2 class=\"footer-wid-title\">Newsletter</h2>\n");
      out.write("                        <p>Sign up to our newsletter and get exclusive deals you wont find anywhere else straight to your inbox!</p>\n");
      out.write("                        <div class=\"newsletter-form\">\n");
      out.write("                            <form action=\"#\">\n");
      out.write("                                <input type=\"email\" placeholder=\"Type your email\">\n");
      out.write("                                <input type=\"submit\" value=\"Subscribe\">\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div> <!-- End footer top area -->\n");
      out.write("    \n");
      out.write("    <div class=\"footer-bottom-area\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-8\">\n");
      out.write("                    <div class=\"copyright\">\n");
      out.write("                        <p>&copy; 2015 uCommerce. All Rights Reserved. <a href=\"http://www.freshdesignweb.com\" target=\"_blank\">freshDesignweb.com</a></p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <div class=\"footer-card-icon\">\n");
      out.write("                        <i class=\"fa fa-cc-discover\"></i>\n");
      out.write("                        <i class=\"fa fa-cc-mastercard\"></i>\n");
      out.write("                        <i class=\"fa fa-cc-paypal\"></i>\n");
      out.write("                        <i class=\"fa fa-cc-visa\"></i>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div> <!-- End footer bottom area -->\n");
      out.write("   \n");
      out.write("    <!-- Latest jQuery form server -->\n");
      out.write("    <script src=\"https://code.jquery.com/jquery.min.js\"></script>\n");
      out.write("    \n");
      out.write("    <!-- Bootstrap JS form CDN -->\n");
      out.write("    <script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js\"></script>\n");
      out.write("    \n");
      out.write("    <!-- jQuery sticky menu -->\n");
      out.write("    <script src=\"js/owl.carousel.min.js\"></script>\n");
      out.write("    <script src=\"js/jquery.sticky.js\"></script>\n");
      out.write("    \n");
      out.write("    <!-- jQuery easing -->\n");
      out.write("    <script src=\"js/jquery.easing.1.3.min.js\"></script>\n");
      out.write("    \n");
      out.write("    <!-- Main Script -->\n");
      out.write("    <script src=\"js/main.js\"></script>\n");
      out.write("    \n");
      out.write("    <!-- Slider -->\n");
      out.write("    <script type=\"text/javascript\" src=\"js/bxslider.min.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/script.slider.js\"></script>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${n}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("o");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                            \n");
          out.write("                        \n");
          out.write("\n");
          out.write("                                 <div style=\" float: left; padding:15px; \" class=\"single-product\">\n");
          out.write("                                <div class=\"product-f-image\">\n");
          out.write("                                    <img style=\"width:200px;height:200px; \" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.img}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\">\n");
          out.write("                                    <div class=\"product-hover\">\n");
          out.write("                                        <a href=\"cart?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"add-to-cart-link\"><i class=\"fa fa-shopping-cart\"></i> Add to cart</a>\n");
          out.write("                                        <a href=\"Detailcontroller?pid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"view-details-link\"><i class=\"fa fa-link\"></i> See details</a>\n");
          out.write("                                    </div>\n");
          out.write("                                </div>\n");
          out.write("                                \n");
          out.write("                                <h2><a href=\"SingleControl\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></h2>\n");
          out.write("                                \n");
          out.write("                                <div class=\"product-carousel-price\">\n");
          out.write("                                    <ins>$");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</ins> <del>$1000.00</del>\n");
          out.write("                                </div> \n");
          out.write("                            </div>\n");
          out.write("                           ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mrBean2.category}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("c");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                 <a href=\"homecate?cid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("#cate\"><img style=\"width:250px;height:150px; \" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.img}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\"></a>\n");
          out.write("                                                         ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listP}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_2.setVar("o");
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                            \n");
          out.write("                        \n");
          out.write("\n");
          out.write("                                 <div style=\" float: left; padding:15px; \" class=\" product single-product\">\n");
          out.write("                                <div class=\"product-f-image\">\n");
          out.write("                                    <img style=\"width:250px;height:250px; \" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.img}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\">\n");
          out.write("                                    <div class=\"product-hover\">\n");
          out.write("                                        <a href=\"cart?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"add-to-cart-link\"><i class=\"fa fa-shopping-cart\"></i> Add to cart</a>\n");
          out.write("                                        <a href=\"Detailcontroller?pid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"view-details-link\"><i class=\"fa fa-link\"></i> See details</a>\n");
          out.write("                                    </div>\n");
          out.write("                                </div>\n");
          out.write("                                \n");
          out.write("                                <h2><a href=\"single-product.jsp\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></h2>\n");
          out.write("                                \n");
          out.write("                                <div class=\"product-carousel-price\">\n");
          out.write("                                    <ins>$");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</ins> <del>$1000.00</del>\n");
          out.write("                                </div> \n");
          out.write("                            </div>\n");
          out.write("                           ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }
}
