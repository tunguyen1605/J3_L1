package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.NumberFormat;
import java.text.DecimalFormat;

public final class result_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"myStyle.css\" rel=\"stylesheet\">\n");
      out.write("        <title>Result</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("<!--        <nav>\n");
      out.write("            <ul class=\"my-nav\">\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"wellcome.jsp\">Home</a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"wellcome.jsp\">\n");
      out.write("                        Take Quiz</a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"wellcome.jsp\">\n");
      out.write("                        Make Quiz</a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"wellcome.jsp\">\n");
      out.write("                        Manage Quiz</a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"\">\n");
      out.write("                        Log out</a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </nav>-->\n");
      out.write("<form action=\"Welcome.jsp\">\n");
      out.write("     \n");
      out.write("            <div class=\"container-md\">\n");
      out.write("                <div class=\"content\">\n");
      out.write("            <p class=\"title-wellcome\">Your score\n");
      out.write("                ");

                    int anwerCorrectCurrent = (int)getServletContext().getAttribute("answerCorrect");
                    int numberQuestion = (int)getServletContext().getAttribute("numberQuestion");
                    double result = (double)anwerCorrectCurrent / numberQuestion * 100;
                      NumberFormat formatter = new DecimalFormat("#0.00"); 
                     getServletContext().setAttribute("result", formatter.format(result));
                
      out.write("\n");
      out.write("                <span class=\"name\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${result/10}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(' ');
      out.write('(');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${result}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("%) - ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${result <= 50.0 ? \"Not Pass\" : \"Passed\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("            </p>\n");
      out.write("            <p class=\"text-content\">Take another test\n");
      out.write("                <a href=\"Welcome.jsp\">\n");
      out.write("                    <input type=\"submit\" value=\"Start\">\n");
      out.write("                </a>\n");
      out.write("            </p>\n");
      out.write("        </div>\n");
      out.write("            </div>\n");
      out.write("</form>\n");
      out.write("    </div>\n");
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
}
