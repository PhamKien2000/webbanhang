package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ViewCategory_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"UTF-8\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\" />\n");
      out.write("    <title>Product Page - Admin HTML Template</title>\n");
      out.write("    <link\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("      href=\"https://fonts.googleapis.com/css?family=Roboto:400,700\"\n");
      out.write("    />\n");
      out.write("    <!-- https://fonts.google.com/specimen/Roboto -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/fontawesome.min.css\" />\n");
      out.write("    <!-- https://fontawesome.com/ -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" />\n");
      out.write("    <!-- https://getbootstrap.com/ -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/templatemo-style.css\">\n");
      out.write("    <!--\n");
      out.write("\tProduct Admin CSS Template\n");
      out.write("\thttps://templatemo.com/tm-524-product-admin\n");
      out.write("\t-->\n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body id=\"reportsPage\">\n");
      out.write("    <nav class=\"navbar navbar-expand-xl\">\n");
      out.write("      <div class=\"container h-100\">\n");
      out.write("        <a class=\"navbar-brand\" href=\"index.html\">\n");
      out.write("          <h1 class=\"tm-site-title mb-0\">Product Admin</h1>\n");
      out.write("        </a>\n");
      out.write("        <button\n");
      out.write("          class=\"navbar-toggler ml-auto mr-0\"\n");
      out.write("          type=\"button\"\n");
      out.write("          data-toggle=\"collapse\"\n");
      out.write("          data-target=\"#navbarSupportedContent\"\n");
      out.write("          aria-controls=\"navbarSupportedContent\"\n");
      out.write("          aria-expanded=\"false\"\n");
      out.write("          aria-label=\"Toggle navigation\"\n");
      out.write("        >\n");
      out.write("          <i class=\"fas fa-bars tm-nav-icon\"></i>\n");
      out.write("        </button>\n");
      out.write("\n");
      out.write("       <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                    <ul class=\"navbar-nav mx-auto h-100\">\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link active\" href=\"#\">\n");
      out.write("                                <i class=\"fas fa-tachometer-alt\"></i>\n");
      out.write("                                Dashboard\n");
      out.write("                                <span class=\"sr-only\">(current)</span>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item dropdown\">\n");
      out.write("\n");
      out.write("                            <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\"\n");
      out.write("                                aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                                <i class=\"far fa-file-alt\"></i>\n");
      out.write("                                <span>\n");
      out.write("                                    Category  <i class=\"fas fa-angle-down\"></i>\n");
      out.write("                                </span>\n");
      out.write("                            </a>\n");
      out.write("                            <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                                <a class=\"dropdown-item\" href=\"addCategory.jsp\">Add Category</a>\n");
      out.write("                                <a class=\"dropdown-item\" href=\"ViewCategory.jsp\">View,Edit,Delete</a>\n");
      out.write("                               \n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("                        \n");
      out.write("                        <li class=\"nav-item dropdown\">\n");
      out.write("\n");
      out.write("                            <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\"\n");
      out.write("                                aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                                <i class=\"fas fa-shopping-cart\"></i>\n");
      out.write("                                <span>\n");
      out.write("                                    Product <i class=\"fas fa-angle-down\"></i>\n");
      out.write("                                </span>\n");
      out.write("                            </a>\n");
      out.write("                            <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                                <a class=\"dropdown-item\" href=\"add-product.jsp\">Add product</a>\n");
      out.write("                                <a class=\"dropdown-item\" href=\"products.jsp\">View</a>\n");
      out.write("                              \n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("                         <li class=\"nav-item dropdown\">\n");
      out.write("\n");
      out.write("                            <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\"\n");
      out.write("                                aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                                <i class=\"fas fa-image\"></i>\n");
      out.write("                                <span>\n");
      out.write("                                    Home Shopping<i class=\"fas fa-angle-down\"></i>\n");
      out.write("                                </span>\n");
      out.write("                            </a>\n");
      out.write("                            <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                                <a class=\"dropdown-item\" href=\"HomeController\">Home</a>\n");
      out.write("                               <a class=\"dropdown-item\" href=\"ViewCart.jsp\">View Cart</a>\n");
      out.write("                              \n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("                       \n");
      out.write("\n");
      out.write("                        <li class=\"nav-item dropdown\">\n");
      out.write("\n");
      out.write("                            <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\"\n");
      out.write("                               aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                                <i class=\"fas fa-user\"></i>\n");
      out.write("                                <span>\n");
      out.write("                                    Account <i class=\"fas fa-angle-down\"></i>\n");
      out.write("                                </span>\n");
      out.write("                            </a>\n");
      out.write("                            <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                                <a class=\"dropdown-item\" href=\"RegistAccount.jsp\">Add Account</a>\n");
      out.write("                                <a class=\"dropdown-item\" href=\"Login.jsp\">Logout</a>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item dropdown\">\n");
      out.write("                            <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\"\n");
      out.write("                                aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                                <i class=\"fas fa-cog\"></i>\n");
      out.write("                                <span>\n");
      out.write("                                    Settings <i class=\"fas fa-angle-down\"></i>\n");
      out.write("                                </span>\n");
      out.write("                            </a>\n");
      out.write("                            <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                                <a class=\"dropdown-item\" href=\"#\">Profile</a>\n");
      out.write("                                <a class=\"dropdown-item\" href=\"#\">Billing</a>\n");
      out.write("                                <a class=\"dropdown-item\" href=\"#\">Customize</a>\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                    <ul class=\"navbar-nav\">\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link d-block\" href=\"Login.jsp\">\n");
      out.write("                                Admin, <b>Logout</b>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("    </nav>\n");
      out.write("    <div class=\"container mt-5\">\n");
      out.write("      <div class=\"row tm-content-row\">\n");
      out.write("        <div class=\"col-sm-12 \">\n");
      out.write("          <div class=\"tm-bg-primary-dark tm-block tm-block-products\">\n");
      out.write("            <div class=\"tm-product-table-container\">\n");
      out.write("              <table class=\"table table-hover tm-table-small tm-product-table\">\n");
      out.write("                <thead>\n");
      out.write("                  <tr>\n");
      out.write("                 \n");
      out.write("                    <th scope=\"col\">Category ID</th>\n");
      out.write("                    <th scope=\"col\">Category NAME</th>\n");
      out.write("                    <th scope=\"col\">Category IMG</th>\n");
      out.write("                     <th scope=\"col\">Delete</th>\n");
      out.write("                    <th scope=\"col\">Edit</th>\n");
      out.write("                    <th scope=\"col\">Detail</th>\n");
      out.write("                    \n");
      out.write("                  \n");
      out.write("                    \n");
      out.write("                  </tr>\n");
      out.write("                  ");
      model.Dataprocess mrBean = null;
      synchronized (_jspx_page_context) {
        mrBean = (model.Dataprocess) _jspx_page_context.getAttribute("mrBean", PageContext.PAGE_SCOPE);
        if (mrBean == null){
          mrBean = new model.Dataprocess();
          _jspx_page_context.setAttribute("mrBean", mrBean, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("   \n");
      out.write("                </thead>\n");
      out.write("                \n");
      out.write("              </table>\n");
      out.write("            </div>\n");
      out.write("            <!-- table container -->\n");
      out.write("            <a\n");
      out.write("              href=\"add-product.jsp\"\n");
      out.write("              class=\"btn btn-primary btn-block text-uppercase mb-3\">Add new product</a>\n");
      out.write("            <button class=\"btn btn-primary btn-block text-uppercase\">\n");
      out.write("              Delete selected products\n");
      out.write("            </button>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <footer class=\"tm-footer row tm-mt-small\">\n");
      out.write("      <div class=\"col-12 font-weight-light\">\n");
      out.write("        <p class=\"text-center text-white mb-0 px-4 small\">\n");
      out.write("          Copyright &copy; <b>2018</b> All rights reserved. \n");
      out.write("          \n");
      out.write("          Design: <a rel=\"nofollow noopener\" href=\"https://templatemo.com\" class=\"tm-footer-link\">Template Mo</a>\n");
      out.write("        </p>\n");
      out.write("      </div>\n");
      out.write("    </footer>\n");
      out.write("\n");
      out.write("    <script src=\"js/jquery-3.3.1.min.js\"></script>\n");
      out.write("    <!-- https://jquery.com/download/ -->\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <!-- https://getbootstrap.com/ -->\n");
      out.write("    <script>\n");
      out.write("      $(function() {\n");
      out.write("        $(\".tm-product-name\").on(\"click\", function() {\n");
      out.write("          window.location.href = \"edit-product.jsp\";\n");
      out.write("        });\n");
      out.write("      });\n");
      out.write("    </script>\n");
      out.write("  </body>\n");
      out.write("</html>");
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
    _jspx_th_c_forEach_0.setVar("s");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mrBean.category}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                    <tr>\n");
          out.write("                        <td >");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                        <td >");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                        \n");
          out.write("                        <td ><img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.img}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" style=\"width:50px;height:50px\"></td>\n");
          out.write("                        <td><a href=\"ControllerCategory?ac=del&id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">Delete</a></td>\n");
          out.write("                        <td><a href=\"ControllerCategory?ac=edit&id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">Edit</a></td>\n");
          out.write("                       <td><a href=\"ControllerCategory?ac=edit&id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">Detail</a></td>\n");
          out.write("\n");
          out.write("                    </tr>  \n");
          out.write("                ");
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
}
