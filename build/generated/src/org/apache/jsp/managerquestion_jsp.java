package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class managerquestion_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link href=\"myStyle.css\" rel=\"stylesheet\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js\"></script>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("        <script src=\"//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.2.1.min.js\"></script>\n");
      out.write("        <script src=\"http://ajax.aspnetcdn.com/ajax/jquery.validate/1.9/jquery.validate.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"//code.jquery.com/jquery-1.11.1.min.js\"></script>\n");
      out.write("        <script src=\"https://code.jquery.com/ui/1.11.3/jquery-ui.js\"></script>\n");
      out.write("        <script src=\"http://ajax.aspnetcdn.com/ajax/jquery.validate/1.13.1/jquery.validate.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">  \n");
      out.write("function ValidatePetSelection()  \n");
      out.write("{  \n");
      out.write("    var checkboxes = document.getElementsByName(\"correct\");  \n");
      out.write("    var numberOfCheckedItems = 0;  \n");
      out.write("    for(var i = 0; i < checkboxes.length; i++)  \n");
      out.write("    {  \n");
      out.write("        if(checkboxes[i].checked)  \n");
      out.write("            numberOfCheckedItems++;  \n");
      out.write("    }  \n");
      out.write("    if(numberOfCheckedItems > 1)  \n");
      out.write("    {  \n");
      out.write("        alert(\"You can't select more than one option!\");  \n");
      out.write("        return false;  \n");
      out.write("    }  \n");
      out.write("}  \n");
      out.write("</script>\n");
      out.write("<!--<form method=\"post\" action=\"/Tests/Post\">  \n");
      out.write("    <fieldset>  \n");
      out.write("    <legend>What is Your Favorite Pet?</legend>  \n");
      out.write("    <input type=\"checkbox\" name=\"favorite_pet\" value=\"Cats\" onclick=\"return ValidatePetSelection();\">Cats<br>  \n");
      out.write("    <input type=\"checkbox\" name=\"favorite_pet\" value=\"Dogs\" onclick=\"return ValidatePetSelection();\">Dogs<br>  \n");
      out.write("    <input type=\"checkbox\" name=\"favorite_pet\" value=\"Birds\" onclick=\"return ValidatePetSelection();\">Birds<br>  \n");
      out.write("        <br>  \n");
      out.write("    <input type=\"submit\" value=\"Submit now\">  \n");
      out.write("    </fieldset>  \n");
      out.write("</form>  -->\n");
      out.write("        <title>Manager Question</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("        <nav>\n");
      out.write("            <ul class=\"my-nav\">\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"\">Home</a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"\">\n");
      out.write("                        Take Quiz</a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"\">\n");
      out.write("                        Make Quiz</a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"\">\n");
      out.write("                        Manage Quiz</a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"\">\n");
      out.write("                        Log out</a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("        <div class=\"content\">\n");
      out.write("            <form action=\"ManagerQuestionServlet\">\n");
      out.write("                <div class=\"table\">\n");
      out.write("                    <div class=\"table-row\">\n");
      out.write("                        <div class=\"table-cell cell-manager\">\n");
      out.write("                            <p>Question:</p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"table-cell\">\n");
      out.write("                            <textarea name=\"question\" cols=\"60\" rows=\"7\" placeholder=\"Please Enter Your Question\"></textarea>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"table-row\">\n");
      out.write("                        <div class=\"table-cell cell-manager\">\n");
      out.write("                            <p>Option1: </p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"table-cell\">\n");
      out.write("                            <textarea name=\"option1\" cols=\"60\" rows=\"3\" placeholder=\"Answer\"></textarea>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"table-row\">\n");
      out.write("                        <div class=\"table-cell cell-manager\">\n");
      out.write("                            <p>Option2: </p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"table-cell\">\n");
      out.write("                            <textarea name=\"option2\" cols=\"60\" rows=\"3\" placeholder=\"Answer\"></textarea>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"table-row\">\n");
      out.write("                        <div class=\"table-cell cell-manager\">\n");
      out.write("                            <p>Option3: </p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"table-cell\">\n");
      out.write("                            <textarea name=\"option3\" cols=\"60\" rows=\"3\" placeholder=\"Answer\" ></textarea>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"table-row\">\n");
      out.write("                        <div class=\"table-cell cell-manager\">\n");
      out.write("                            <p>Option4: </p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"table-cell\">\n");
      out.write("                            <textarea name=\"option4\" class=\"question\" cols=\"60\" rows=\"3\" placeholder=\"Answer\"></textarea>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"table-row\">\n");
      out.write("                        <div class=\"table-cell cell-manager\">\n");
      out.write("                            <p>Answers(s): </p>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div class=\"table-row\">\n");
      out.write("                            <input type=\"checkbox\" name=\"correct\" onclick=\"return ValidatePetSelection();\" value=\"1\">Option1\n");
      out.write("                            <input type=\"checkbox\" name=\"correct\" onclick=\"return ValidatePetSelection();\" value=\"2\">Option2\n");
      out.write("                            <input type=\"checkbox\" name=\"correct\" onclick=\"return ValidatePetSelection();\" value=\"3\">Option3\n");
      out.write("                            <input type=\"checkbox\" name=\"correct\" onclick=\"return ValidatePetSelection();\" value=\"4\">Option4\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"table-row\">\n");
      out.write("                        <div class=\"table-cell cell-manager\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"table-cell\">\n");
      out.write("                            <input type=\"submit\" value=\"save\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
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
