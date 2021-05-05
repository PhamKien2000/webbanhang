package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link href=\"//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("<script src=\"//netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"//code.jquery.com/jquery-1.11.1.min.js\"></script>\n");
      out.write("<!------ Include the above in your HEAD tag ---------->\n");
      out.write("\n");
      out.write("<link href=\"//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css\" rel=\"stylesheet\">\n");
      out.write("<title>Login Form</title>\n");
      out.write("<style>\n");
      out.write("    \n");
      out.write("   \n");
      out.write("    @media (min-width: 768px) {\n");
      out.write("    .omb_row-sm-offset-3 div:first-child[class*=\"col-\"] {\n");
      out.write("        margin-left: 25%;\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("\n");
      out.write(".omb_login .omb_authTitle {\n");
      out.write("    text-align: center;\n");
      out.write("\tline-height: 300%;\n");
      out.write("}\n");
      out.write(".btn btn-lg btn-primary btn-block{\n");
      out.write("    padding-top: 220px;\n");
      out.write("}\n");
      out.write("\t\n");
      out.write(".omb_login .omb_socialButtons a {\n");
      out.write("\tcolor: white;  \n");
      out.write("\topacity:0.9;\n");
      out.write("}\n");
      out.write(".omb_login .omb_socialButtons a:hover {\n");
      out.write("    color: white;\n");
      out.write("\topacity:1;    \t\n");
      out.write("}\n");
      out.write(".omb_login .omb_socialButtons .omb_btn-facebook {background: #3b5998;}\n");
      out.write(".omb_login .omb_socialButtons .omb_btn-twitter {background: #00aced;}\n");
      out.write(".omb_login .omb_socialButtons .omb_btn-google {background: #c32f10;}\n");
      out.write("\n");
      out.write("\n");
      out.write(".omb_login .omb_loginOr {\n");
      out.write("\tposition: relative;\n");
      out.write("\tfont-size: 1.5em;\n");
      out.write("\tcolor: #aaa;\n");
      out.write("\tmargin-top: 1em;\n");
      out.write("\tmargin-bottom: 1em;\n");
      out.write("\tpadding-top: 0.5em;\n");
      out.write("\tpadding-bottom: 0.5em;\n");
      out.write("}\n");
      out.write(".omb_login .omb_loginOr .omb_hrOr {\n");
      out.write("\tbackground-color: #cdcdcd;\n");
      out.write("\theight: 1px;\n");
      out.write("\tmargin-top: 0px !important;\n");
      out.write("\tmargin-bottom: 0px !important;\n");
      out.write("}\n");
      out.write(".omb_login .omb_loginOr .omb_spanOr {\n");
      out.write("\tdisplay: block;\n");
      out.write("\tposition: absolute;\n");
      out.write("\tleft: 50%;\n");
      out.write("\ttop: -0.6em;\n");
      out.write("\tmargin-left: -1.5em;\n");
      out.write("\tbackground-color: white;\n");
      out.write("\twidth: 3em;\n");
      out.write("\ttext-align: center;\n");
      out.write("}\t\t\t\n");
      out.write("\n");
      out.write(".omb_login .omb_loginForm .input-group.i {\n");
      out.write("\twidth: 2em;\n");
      out.write("}\n");
      out.write(".omb_login .omb_loginForm  .help-block {\n");
      out.write("    color: red;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\t\n");
      out.write("@media (min-width: 768px) {\n");
      out.write("    .omb_login .omb_forgotPwd {\n");
      out.write("        text-align: right;\n");
      out.write("\t\tmargin-top:10px;\n");
      out.write(" \t}\n");
      out.write("        \n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<FORM method=\"Post\" action=\"Factory\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("    \n");
      out.write("\n");
      out.write("    <div class=\"omb_login\">\n");
      out.write("    \t<h3 class=\"omb_authTitle\">Login or <a href=\"RegistAccount.jsp\">Sign up</a></h3>\n");
      out.write("\t\t<div class=\"row omb_row-sm-offset-3 omb_socialButtons\">\n");
      out.write("    \t    <div class=\"col-xs-4 col-sm-2\">\n");
      out.write("\t\t        <a href=\"#\" class=\"btn btn-lg btn-block omb_btn-facebook\">\n");
      out.write("\t\t\t        <i class=\"fa fa-facebook visible-xs\"></i>\n");
      out.write("\t\t\t        <span class=\"hidden-xs\">Facebook</span>\n");
      out.write("\t\t        </a>\n");
      out.write("\t        </div>\n");
      out.write("        \t<div class=\"col-xs-4 col-sm-2\">\n");
      out.write("\t\t        <a href=\"#\" class=\"btn btn-lg btn-block omb_btn-twitter\">\n");
      out.write("\t\t\t        <i class=\"fa fa-twitter visible-xs\"></i>\n");
      out.write("\t\t\t        <span class=\"hidden-xs\">Twitter</span>\n");
      out.write("\t\t        </a>\n");
      out.write("\t        </div>\t\n");
      out.write("        \t<div class=\"col-xs-4 col-sm-2\">\n");
      out.write("\t\t        <a href=\"#\" class=\"btn btn-lg btn-block omb_btn-google\">\n");
      out.write("\t\t\t        <i class=\"fa fa-google-plus visible-xs\"></i>\n");
      out.write("\t\t\t        <span class=\"hidden-xs\">Google+</span>\n");
      out.write("\t\t        </a>\n");
      out.write("\t        </div>\t\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<div class=\"row omb_row-sm-offset-3 omb_loginOr\">\n");
      out.write("\t\t\t<div class=\"col-xs-12 col-sm-6\">\n");
      out.write("\t\t\t\t<hr class=\"omb_hrOr\">\n");
      out.write("\t\t\t\t<span class=\"omb_spanOr\">or</span>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<div class=\"row omb_row-sm-offset-3\">\n");
      out.write("\t\t\t<div class=\"col-xs-12 col-sm-6\">\t\n");
      out.write("\t\t\t    <form class=\"omb_loginForm\" action=\"\" autocomplete=\"off\" method=\"POST\">\n");
      out.write("\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t<span class=\"input-group-addon\"><i class=\"fa fa-user\"></i></span>\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"txtUsername\" placeholder=\"Username\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<span class=\"help-block\"></span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t\t<span class=\"input-group-addon\"><i class=\"fa fa-lock\"></i></span>\n");
      out.write("\t\t\t\t\t\t<input  type=\"password\" class=\"form-control\" name=\"txtPass\" placeholder=\"Password\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("               \n");
      out.write("\n");
      out.write("\t\t\t\t\t<button class=\"btn btn-lg btn-primary btn-block\" type=\"submit\">Login</button>\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t</div>\n");
      out.write("    \t</div>\n");
      out.write("\t\t<div class=\"row omb_row-sm-offset-3\">\n");
      out.write("\t\t\t<div class=\"col-xs-12 col-sm-3\">\n");
      out.write("\t\t\t\t<label class=\"checkbox\">\n");
      out.write("\t\t\t\t\t<input type=\"checkbox\" value=\"remember-me\">Remember Me\n");
      out.write("\t\t\t\t</label>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-xs-12 col-sm-3\">\n");
      out.write("\t\t\t\t<p class=\"omb_forgotPwd\">\n");
      out.write("\t\t\t\t\t<a href=\"#\">Forgot password?</a>\n");
      out.write("\t\t\t\t</p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\t    \t\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("</FORM>\n");
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
