package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/header.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
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
      out.write("        <link href=\"bootstrap-4.5.2-dist/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <title>Login</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("            <div class=\"container-md\">\n");
      out.write("                ");
      out.write("<link href=\"bootstrap-4.5.2-dist/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-expand-sm bg-dark justify-content-center\">\n");
      out.write("       <!-- Links -->\n");
      out.write("       <ul class=\"navbar-nav\">\n");
      out.write("              <li class=\"nav-item\">\n");
      out.write("                     <a class=\"nav-link\" href=\"login.jsp\">Home</a>\n");
      out.write("                  </li>\n");
      out.write("              <li class=\"nav-item\">\n");
      out.write("                     <a class=\"nav-link\" href=\"login.jsp\">\n");
      out.write("                Take Quiz</a>\n");
      out.write("                  </li>\n");
      out.write("              <li class=\"nav-item\">\n");
      out.write("                     <a class=\"nav-link\" href=\"login.jsp\">\n");
      out.write("                Make Quiz</a>\n");
      out.write("                  </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("                     <a class=\"nav-link\" href=\"login.jsp\">\n");
      out.write("                Manage Quiz</a>\n");
      out.write("                  </li>\n");
      out.write("            ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("           </ul>\n");
      out.write("</nav>");
      out.write("\n");
      out.write("                \t\t<div class=\"card\">\n");
      out.write("\t\t\t<div class=\"card-header\">\n");
      out.write("\t\t\t\t<h3>Login Form</h3>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"card-body\">\n");
      out.write("                            <form action=\"LoginServlet\" method=\"login\">\n");
      out.write("\t\t\t\t\t<div class=\"input-group form-group\">\n");
      out.write("\t\t\t\t\t\t<div class=\"input-group-prepend\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"input-group-text\"><i class=\"fas fa-user\"></i></span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("                                            <input  name=\"username\" value=\"\" type=\"text\" class=\"form-control\" placeholder=\"username\">\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"input-group form-group\">\n");
      out.write("\t\t\t\t\t\t<div class=\"input-group-prepend\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"input-group-text\"><i class=\"fas fa-key\"></i></span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("                                            <input  name=\"password\" value=\"\" type=\"password\" class=\"form-control\" placeholder=\"password\">\n");
      out.write("                                                \n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" value=\"Login\" class=\"btn float-right login_btn\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</form>\n");
      out.write("                            <form action=\"\" method=\"Register\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" value=\"Register\" class=\"btn float-right login_btn\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("                            </form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        \n");
      out.write("           \n");
      out.write("           \n");
      out.write("<!--            <div class=\"content\">\n");
      out.write("                <p class=\"title-regist\">Login Form</p>\n");
      out.write("                <form action=\"LoginServlet\" method=\"POST\">\n");
      out.write("                    <div class=\"table\">\n");
      out.write("                        <div class=\"table-row\">\n");
      out.write("                            <div class=\"table-cell\">\n");
      out.write("                                <p class=\"cell-attribute\">User Name:</p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"table-cell\">\n");
      out.write("                                <input type=\"text\" class=\"input\" name=\"username\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"table-row\">\n");
      out.write("                            <div class=\"table-cell\">\n");
      out.write("                                <p class=\"cell-attribute\">Password:</p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"table-cell\">\n");
      out.write("                                <input type=\"password\" class=\"input\" name=\"password\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"table-row\">\n");
      out.write("                            <div class=\"table-cell\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"table-cell\">\n");
      out.write("                                <input type=\"submit\" value=\"Sign in\">\n");
      out.write("                                <a href=\"register.jsp\" class=\"link-register\">Register</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>-->\n");
      out.write("    </body>\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(false);
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("            <li class=\"nav-item\">\n");
        out.write("                         <a  class=\"nav-link\" href=\"../login.jsp\">\n");
        out.write("                    Logout</a>\n");
        out.write("                      </li>\n");
        out.write("            ");
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
}
