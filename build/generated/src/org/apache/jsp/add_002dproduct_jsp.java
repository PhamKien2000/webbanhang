package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add_002dproduct_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_if_test.release();
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"UTF-8\" />\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\" />\r\n");
      out.write("    \r\n");
      out.write("    <title>Add Product - Dashboard HTML Template</title>\r\n");
      out.write("    <link\r\n");
      out.write("      rel=\"stylesheet\"\r\n");
      out.write("      href=\"https://fonts.googleapis.com/css?family=Roboto:400,700\"\r\n");
      out.write("    />\r\n");
      out.write("    <!-- https://fonts.google.com/specimen/Roboto -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/fontawesome.min.css\" />\r\n");
      out.write("    <!-- https://fontawesome.com/ -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"jquery-ui-datepicker/jquery-ui.min.css\" type=\"text/css\" />\r\n");
      out.write("    <!-- http://api.jqueryui.com/datepicker/ -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" />\r\n");
      out.write("    <!-- https://getbootstrap.com/ -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/templatemo-style.css\">\r\n");
      out.write("    <!--\r\n");
      out.write("\tProduct Admin CSS Template\r\n");
      out.write("\thttps://templatemo.com/tm-524-product-admin\r\n");
      out.write("\t-->\r\n");
      out.write("  </head>\r\n");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("  <body>\r\n");
      out.write("    <nav class=\"navbar navbar-expand-xl\">\r\n");
      out.write("      <div class=\"container h-100\">\r\n");
      out.write("        <a class=\"navbar-brand\" href=\"index.html\">\r\n");
      out.write("          <h1 class=\"tm-site-title mb-0\">Product Admin</h1>\r\n");
      out.write("        </a>\r\n");
      out.write("        <button\r\n");
      out.write("          class=\"navbar-toggler ml-auto mr-0\"\r\n");
      out.write("          type=\"button\"\r\n");
      out.write("          data-toggle=\"collapse\"\r\n");
      out.write("          data-target=\"#navbarSupportedContent\"\r\n");
      out.write("          aria-controls=\"navbarSupportedContent\"\r\n");
      out.write("          aria-expanded=\"false\"\r\n");
      out.write("          aria-label=\"Toggle navigation\"\r\n");
      out.write("        >\r\n");
      out.write("          <i class=\"fas fa-bars tm-nav-icon\"></i>\r\n");
      out.write("        </button>\r\n");
      out.write("\r\n");
      out.write("              <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("                    <ul class=\"navbar-nav mx-auto h-100\">\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a class=\"nav-link active\" href=\"#\">\r\n");
      out.write("                                <i class=\"fas fa-tachometer-alt\"></i>\r\n");
      out.write("                                Dashboard\r\n");
      out.write("                                <span class=\"sr-only\">(current)</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"nav-item dropdown\">\r\n");
      out.write("\r\n");
      out.write("                            <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\"\r\n");
      out.write("                                aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("                                <i class=\"far fa-file-alt\"></i>\r\n");
      out.write("                                <span>\r\n");
      out.write("                                    Category  <i class=\"fas fa-angle-down\"></i>\r\n");
      out.write("                                </span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("                                <a class=\"dropdown-item\" href=\"addCategory.jsp\">Add Category</a>\r\n");
      out.write("                                <a class=\"dropdown-item\" href=\"ViewCategory.jsp\">View,Edit,Delete</a>\r\n");
      out.write("                               \r\n");
      out.write("                            </div>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"nav-item dropdown\">\r\n");
      out.write("\r\n");
      out.write("                            <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\"\r\n");
      out.write("                                aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("                                <i class=\"fas fa-shopping-cart\"></i>\r\n");
      out.write("                                <span>\r\n");
      out.write("                                    Product <i class=\"fas fa-angle-down\"></i>\r\n");
      out.write("                                </span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("                                <a class=\"dropdown-item\" href=\"add-product.jsp\">Add product</a>\r\n");
      out.write("                                <a class=\"dropdown-item\" href=\"ControllerView\">View</a>\r\n");
      out.write("                              \r\n");
      out.write("                            </div>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"nav-item dropdown\">\r\n");
      out.write("\r\n");
      out.write("                            <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\"\r\n");
      out.write("                                aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("                                <i class=\"fas fa-image\"></i>\r\n");
      out.write("                                <span>\r\n");
      out.write("                                    Home Shopping<i class=\"fas fa-angle-down\"></i>\r\n");
      out.write("                                </span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("                                <a class=\"dropdown-item\" href=\"HomeController\">Home</a>\r\n");
      out.write("                               <a class=\"dropdown-item\" href=\"ViewCart.jsp\">View Cart</a>\r\n");
      out.write("                              \r\n");
      out.write("                            </div>\r\n");
      out.write("                        </li>\r\n");
      out.write("\r\n");
      out.write("                        <li class=\"nav-item dropdown\">\r\n");
      out.write("\r\n");
      out.write("                            <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\"\r\n");
      out.write("                               aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("                                <i class=\"fas fa-user\"></i>\r\n");
      out.write("                                <span>\r\n");
      out.write("                                    Account <i class=\"fas fa-angle-down\"></i>\r\n");
      out.write("                                </span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("                                  <a class=\"dropdown-item\" href=\"RegistAccount.jsp\">Add Account</a>\r\n");
      out.write("                                <a class=\"dropdown-item\" href=\"Login.jsp\">Logout</a>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"nav-item dropdown\">\r\n");
      out.write("                            <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\"\r\n");
      out.write("                                aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("                                <i class=\"fas fa-cog\"></i>\r\n");
      out.write("                                <span>\r\n");
      out.write("                                    Settings <i class=\"fas fa-angle-down\"></i>\r\n");
      out.write("                                </span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("                                <a class=\"dropdown-item\" href=\"#\">Profile</a>\r\n");
      out.write("                                <a class=\"dropdown-item\" href=\"#\">Billing</a>\r\n");
      out.write("                                <a class=\"dropdown-item\" href=\"#\">Customize</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    <ul class=\"navbar-nav\">\r\n");
      out.write("                        <li class=\"nav-item\">\r\n");
      out.write("                            <a class=\"nav-link d-block\" href=\"Login.jsp\">\r\n");
      out.write("                                Admin, <b>Logout</b>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("    <div class=\"container tm-mt-big tm-mb-big\">\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("        <div class=\"col-xl-9 col-lg-10 col-md-12 col-sm-12 mx-auto\">\r\n");
      out.write("          <div class=\"tm-bg-primary-dark tm-block tm-block-h-auto\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("              <div class=\"col-12\">\r\n");
      out.write("                <h2 class=\"tm-block-title d-inline-block\">Add Product</h2>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"row tm-edit-product-row\">\r\n");
      out.write("              <div class=\"col-xl-6 col-lg-6 col-md-12\">\r\n");
      out.write("                <form method=\"post\" action=\"ControllerProduct?ac=add\"  class=\"tm-edit-product-form\">\r\n");
      out.write("                   <div class=\"form-group mb-3\">\r\n");
      out.write("                    <label\r\n");
      out.write("                      for=\"id\"\r\n");
      out.write("                      >Product ID\r\n");
      out.write("                    </label>\r\n");
      out.write("                    <input\r\n");
      out.write("                      id=\"name\"\r\n");
      out.write("                      name=\"txtID\"\r\n");
      out.write("                      type=\"text\"\r\n");
      out.write("                      class=\"form-control validate\"\r\n");
      out.write("                      required\r\n");
      out.write("                    />\r\n");
      out.write("                  </div>\r\n");
      out.write("\r\n");
      out.write("                  <div class=\"form-group mb-3\">\r\n");
      out.write("                    <label\r\n");
      out.write("                      for=\"name\"\r\n");
      out.write("                      >Product Name\r\n");
      out.write("                    </label>\r\n");
      out.write("                    <input\r\n");
      out.write("                      id=\"name\"\r\n");
      out.write("                      name=\"txtName\"\r\n");
      out.write("                      type=\"text\"\r\n");
      out.write("                      class=\"form-control validate\"\r\n");
      out.write("                      required\r\n");
      out.write("                    />\r\n");
      out.write("                  </div>\r\n");
      out.write("                    <div class=\"form-group mb-3\">\r\n");
      out.write("                    <label\r\n");
      out.write("                      for=\"name\"\r\n");
      out.write("                      >Product Price\r\n");
      out.write("                    </label>\r\n");
      out.write("                    <input\r\n");
      out.write("                      id=\"name\"\r\n");
      out.write("                      name=\"txtPrice\"\r\n");
      out.write("                      type=\"text\"\r\n");
      out.write("                      class=\"form-control validate\"\r\n");
      out.write("                      required\r\n");
      out.write("                    />\r\n");
      out.write("                  </div>\r\n");
      out.write("                     <div class=\"form-group mb-3\">\r\n");
      out.write("                    <label\r\n");
      out.write("                      for=\"name\"\r\n");
      out.write("                      >Amount\r\n");
      out.write("                    </label>\r\n");
      out.write("                    <input\r\n");
      out.write("                      id=\"name\"\r\n");
      out.write("                      name=\"txtAmount\"\r\n");
      out.write("                      type=\"text\"\r\n");
      out.write("                      class=\"form-control validate\"\r\n");
      out.write("                      required\r\n");
      out.write("                    />\r\n");
      out.write("                  </div>\r\n");
      out.write("                      <div class=\"form-group mb-3\">\r\n");
      out.write("                    <label\r\n");
      out.write("                      for=\"category\"\r\n");
      out.write("                      >Category</label\r\n");
      out.write("                    >\r\n");
      out.write("                   ");
      model.Dataprocess mrBean = null;
      synchronized (session) {
        mrBean = (model.Dataprocess) _jspx_page_context.getAttribute("mrBean", PageContext.SESSION_SCOPE);
        if (mrBean == null){
          mrBean = new model.Dataprocess();
          _jspx_page_context.setAttribute("mrBean", mrBean, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("                   \r\n");
      out.write("                   <select name=\"cbCategory\"  class=\"custom-select tm-select-accounts\"\r\n");
      out.write("                      id=\"category\">\r\n");
      out.write("         \r\n");
      out.write("                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    </select>\r\n");
      out.write("                  </div>\r\n");
      out.write("\r\n");
      out.write("                 \r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("                  \r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"col-xl-6 col-lg-6 col-md-12 mx-auto mb-4\">\r\n");
      out.write("               \r\n");
      out.write("                \r\n");
      out.write("                  <div class=\"form-group mb-3\">\r\n");
      out.write("                    <label\r\n");
      out.write("                      for=\"name\"\r\n");
      out.write("                      >Upload Image\r\n");
      out.write("                    </label>\r\n");
      out.write("                    <input\r\n");
      out.write("                      id=\"name\"\r\n");
      out.write("                      name=\"img\"\r\n");
      out.write("                      type=\"text\"\r\n");
      out.write("                      class=\"form-control validate\"\r\n");
      out.write("                      required\r\n");
      out.write("                    />\r\n");
      out.write("                  </div>\r\n");
      out.write("                   <div class=\"form-group mb-3\">\r\n");
      out.write("                    <label\r\n");
      out.write("                      for=\"description\"\r\n");
      out.write("                      >Description</label\r\n");
      out.write("                    >\r\n");
      out.write("                    <textarea\r\n");
      out.write("                      placeholder=\"Input information\r\n");
      out.write("                      Product\"\r\n");
      out.write("                      class=\"form-control validate\"\r\n");
      out.write("                      rows=\"15\"\r\n");
      out.write("                      required\r\n");
      out.write("                      name=\"txtdes\"\r\n");
      out.write("                    ></textarea>\r\n");
      out.write("                  </div>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"col-12\">\r\n");
      out.write("                <button type=\"submit\" class=\"btn btn-primary btn-block text-uppercase\">Add Product Now</button>\r\n");
      out.write("              </div>\r\n");
      out.write("            </form>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <footer class=\"tm-footer row tm-mt-small\">\r\n");
      out.write("        <div class=\"col-12 font-weight-light\">\r\n");
      out.write("          <p class=\"text-center text-white mb-0 px-4 small\">\r\n");
      out.write("            Copyright &copy; <b>2018</b> All rights reserved. \r\n");
      out.write("            \r\n");
      out.write("            Design: <a rel=\"nofollow noopener\" href=\"https://templatemo.com\" class=\"tm-footer-link\">Template Mo</a>\r\n");
      out.write("        </p>\r\n");
      out.write("        </div>\r\n");
      out.write("    </footer> \r\n");
      out.write("\r\n");
      out.write("    <script src=\"js/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("    <!-- https://jquery.com/download/ -->\r\n");
      out.write("    <script src=\"jquery-ui-datepicker/jquery-ui.min.js\"></script>\r\n");
      out.write("    <!-- https://jqueryui.com/download/ -->\r\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("    <!-- https://getbootstrap.com/ -->\r\n");
      out.write("    <script>\r\n");
      out.write("      $(function() {\r\n");
      out.write("        $(\"#expire_date\").datepicker();\r\n");
      out.write("      });\r\n");
      out.write("    </script>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty sessionScope['user']}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("            ");
        if (true) {
          _jspx_page_context.forward("Login.jsp");
          return true;
        }
        out.write("\r\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("t");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mrBean.category}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                    <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${t.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("                        ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${t.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\r\n");
          out.write("                    </option>\r\n");
          out.write("\r\n");
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
