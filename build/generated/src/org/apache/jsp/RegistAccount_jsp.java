package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class RegistAccount_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Dang ky</title>\n");
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("        <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <!------ Include the above in your HEAD tag ---------->\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.0.8/css/all.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <style>\n");
      out.write("            .divider-text {\n");
      out.write("    position: relative;\n");
      out.write("    text-align: center;\n");
      out.write("    margin-top: 15px;\n");
      out.write("    margin-bottom: 15px;\n");
      out.write("}\n");
      out.write(".divider-text span {\n");
      out.write("    padding: 7px;\n");
      out.write("    font-size: 12px;\n");
      out.write("    position: relative;   \n");
      out.write("    z-index: 2;\n");
      out.write("}\n");
      out.write(".divider-text:after {\n");
      out.write("    content: \"\";\n");
      out.write("    position: absolute;\n");
      out.write("    width: 100%;\n");
      out.write("    border-bottom: 1px solid #ddd;\n");
      out.write("    top: 55%;\n");
      out.write("    left: 0;\n");
      out.write("    z-index: 1;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btn-facebook {\n");
      out.write("    background-color: #405D9D;\n");
      out.write("    color: #fff;\n");
      out.write("}\n");
      out.write(".btn-twitter {\n");
      out.write("    background-color: #42AEEC;\n");
      out.write("    color: #fff;\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <form method=\"POST\" action=\"ControllerAccount?ac=add\"> \n");
      out.write("            <div class=\"card bg-light\">\n");
      out.write("<article class=\"card-body mx-auto\" style=\"max-width: 400px;\">\n");
      out.write("\t<h4 class=\"card-title mt-3 text-center\">Create Account</h4>\n");
      out.write("\t<p class=\"text-center\">Get started with your free account</p>\n");
      out.write("\t<p>\n");
      out.write("\t\t<a href=\"\" class=\"btn btn-block btn-twitter\"> <i class=\"fab fa-twitter\"></i>   Login via Twitter</a>\n");
      out.write("\t\t<a href=\"\" class=\"btn btn-block btn-facebook\"> <i class=\"fab fa-facebook-f\"></i>   Login via facebook</a>\n");
      out.write("\t</p>\n");
      out.write("\t<p class=\"divider-text\">\n");
      out.write("        <span class=\"bg-light\">OR</span>\n");
      out.write("    </p>\n");
      out.write("\t<form>\n");
      out.write("\t<div class=\"form-group input-group\">\n");
      out.write("\t\t<div class=\"input-group-prepend\">\n");
      out.write("\t\t    <span class=\"input-group-text\"> <i class=\"fa fa-id-card\"></i> </span>\n");
      out.write("\t\t </div>\n");
      out.write("            <input name=\"txtID\" class=\"form-control\" placeholder=\"ID Admin\" type=\"text\">\n");
      out.write("        \n");
      out.write("    </div> <!-- form-group// -->\n");
      out.write("    <div class=\"form-group input-group\">\n");
      out.write("\t\t<div class=\"input-group-prepend\">\n");
      out.write("\t\t    <span class=\"input-group-text\"> <i class=\"fa fa-user\"></i> </span>\n");
      out.write("\t\t </div>\n");
      out.write("            <input name=\"txtFullName\" class=\"form-control\" placeholder=\"Full Name\" type=\"text\">\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("        <div class=\"form-group input-group\">\n");
      out.write("    \t<div class=\"input-group-prepend\">\n");
      out.write("\t\t    <span class=\"input-group-text\"> <i class=\"fa fa-lock\"></i> </span>\n");
      out.write("\t\t</div>\n");
      out.write("            <input class=\"form-control\" name=\"txtPass\" placeholder=\"Create password\" type=\"password\">\n");
      out.write("    </div>\n");
      out.write("     <!-- form-group// -->\n");
      out.write("         <div class=\"form-group input-group\">\n");
      out.write("    \t<div class=\"input-group-prepend\">\n");
      out.write("\t\t    <span class=\"input-group-text\"> <i class=\"fa fa-birthday-cake\"></i> </span>\n");
      out.write("\t\t</div>\n");
      out.write("             <input class=\"form-control\" name=\"txtBirthday\" placeholder=\"Date of birth\" type=\"date\">\n");
      out.write("    </div> <!-- form-group// -->  \n");
      out.write("\n");
      out.write("    <div class=\"form-group input-group\">\n");
      out.write("    \t<div class=\"input-group-prepend\">\n");
      out.write("\t\t    <span class=\"input-group-text\"> <i class=\"fa fa-address-card\"></i> </span>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("    \t<input name=\"txtAddress\" class=\"form-control\" placeholder=\"Address\" type=\"text\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group input-group\">\n");
      out.write("    \t<div class=\"input-group-prepend\">\n");
      out.write("\t\t    <span class=\"input-group-text\"> <i class=\"fa fa-phone\"></i> </span>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("    \t<input name=\"txtPhone\" class=\"form-control\" placeholder=\"Phone number\" type=\"text\">\n");
      out.write("    </div> <!-- form-group// -->\n");
      out.write("<!--    <div class=\"form-group input-group\">\n");
      out.write("    \t<div class=\"input-group-prepend\">\n");
      out.write("\t\t    <span class=\"input-group-text\"> <i class=\"fa fa-building\"></i> </span>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<select class=\"form-control\">\n");
      out.write("\t\t\t<option selected=\"\"> Select job type</option>\n");
      out.write("\t\t\t<option>Designer</option>\n");
      out.write("\t\t\t<option>Manager</option>\n");
      out.write("\t\t\t<option>Accaunting</option>\n");
      out.write("\t\t</select>\n");
      out.write("\t</div>  form-group end.// -->\n");
      out.write(" <!-- form-group// -->\n");
      out.write("                                    \n");
      out.write("    <div class=\"form-group\">\n");
      out.write("        <button type=\"submit\" class=\"btn btn-primary btn-block\"> Create Account  </button>\n");
      out.write("              \t\n");
      out.write("    </div> <!-- form-group// -->      \n");
      out.write("    <p class=\"text-center\">Have an account? <a href=\"Login.jsp\">Log In</a> </p>                                                                 \n");
      out.write("</form>\n");
      out.write("</article>\n");
      out.write("</div> <!-- card.// -->\n");
      out.write("\n");
      out.write("</div> \n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
}
