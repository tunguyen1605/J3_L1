package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Random;
import ModelDAO.QuestionDAO;
import java.util.ArrayList;
import entities.Answer;

public final class PlayQuiz_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


            String question;
            ArrayList<Answer> listAnswer;
            int countAnswer;
            String username;
        
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/header.jsp");
  }

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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<link href=\"bootstrap-4.5.2-dist/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"bootstrap-4.5.2-dist/css/bootstrap-grid.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"bootstrap-4.5.2-dist/css/bootstrap-reboot.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"bootstrap-4.5.2-dist/css/bootstrap-reboot.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"bootstrap-4.5.2-dist/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("<link href=\"myStyle.css\" rel=\"stylesheet\">\n");
      out.write("<title>Play Quiz</title>\n");
      out.write("<script>\n");
      out.write("  \n");
      out.write("   $(\"input:checkbox\").on('click', function() {\n");
      out.write("  // in the handler, 'this' refers to the box clicked on\n");
      out.write("  var $box = $(this);\n");
      out.write("  if ($box.is(\":checked\")) {\n");
      out.write("    // the name of the box is retrieved using the .attr() method\n");
      out.write("    // as it is assumed and expected to be immutable\n");
      out.write("    var group = \"input:checkbox[name='\" + $box.attr(\"name\") + \"']\";\n");
      out.write("    // the checked state of the group/box on the other hand will change\n");
      out.write("    // and the current value is retrieved using .prop() method\n");
      out.write("    $(group).prop(\"checked\", false);\n");
      out.write("    $box.prop(\"checked\", true);\n");
      out.write("  } else {\n");
      out.write("    $box.prop(\"checked\", false);\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("   </script>\n");
      out.write("   <script>\n");
      out.write("           function myFunction() {\n");
      out.write("  document.getElementById(\"myCheck\").required = true;\n");
      out.write("  document.getElementById(\"demo\").innerHTML = \"The required property was set. The checkbox must now be checked before submitting the form.\";\n");
      out.write("}\n");
      out.write("           </script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("<div class=\"container\">\n");
      out.write("    ");
      out.write("<link href=\"bootstrap-4.5.2-dist/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\n");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write('\n');
      out.write("\n");
      out.write("    <div class=\"content\">\n");
      out.write("        <h2 class=\"h1-responsive font-weight-bold text-center my-4\">Wellcome\n");
      out.write("                    <!--BUG-->\n");
      out.write("                    <span class=\"animated \">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user.getuUsername()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("                </h2>\n");
      out.write("        <h3 class=\"time text-left\" >Time remaining <span>10:03</span></h3>\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");

            QuestionDAO questionDao = new QuestionDAO();
//            username = (String) request.getSession().getAttribute("nameUser");
            countAnswer = questionDao.countQuesion();
            Random ran = new Random();
            int randomQuestion = ran.nextInt(countAnswer)+2;
            question = questionDao.getQuestionById(randomQuestion);
            listAnswer = questionDao.listAnswer(randomQuestion);
        
      out.write("\n");
      out.write("        <h2 class=\"text-left\">");
      out.print( question);
      out.write("</h2>\n");
      out.write("        <form action=\"CheckResultServlet\" method=\"POST\" class=\"card-body\">\n");
      out.write("            ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_0.setParent(null);
      _jspx_th_c_forEach_0.setVar("Answer");
      _jspx_th_c_forEach_0.setItems( listAnswer);
      int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("                <input type=\"checkbox\" class=\"form-check form-check-inline h3\" id=\"myCheck\" name=\"answer\" value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Answer.answer}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\">\n");
            out.write("                 \n");
            out.write("                <span class=\"value-check-box\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Answer.answer}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write(" </span><br>\n");
            out.write("            ");
            int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_forEach_0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_forEach_0.doFinally();
        _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
      }
      out.write("\n");
      out.write("                <input type=\"hidden\" name=\"questionid\" value=\"");
      out.print( randomQuestion );
      out.write("\">\n");
      out.write("                <button  onclick=\"myFunction()\"></button>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${!empty user}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("    <nav class=\"navbar navbar-expand-sm bg-dark justify-content-center\">\n");
        out.write("       <!-- Links -->\n");
        out.write("       <ul class=\"navbar-nav\">\n");
        out.write("              <li class=\"nav-item\">\n");
        out.write("                     <a class=\"nav-link\" href=\"Welcome.jsp\">Home</a>\n");
        out.write("                  </li>\n");
        out.write("              <li class=\"nav-item\">\n");
        out.write("                     <a class=\"nav-link\" href=\"Welcome.jsp\">\n");
        out.write("                Take Quiz</a>\n");
        out.write("                  </li>\n");
        out.write("              <li class=\"nav-item\">\n");
        out.write("                     <a class=\"nav-link\" href=\"./ShowQuestion\">\n");
        out.write("                Manager Quiz</a>\n");
        out.write("                  </li>\n");
        out.write("        <li class=\"nav-item\">\n");
        out.write("                     <a class=\"nav-link\" href=\"./Rolemanager\">\n");
        out.write("                Make Quiz</a>\n");
        out.write("                  </li>\n");
        out.write("            ");
        if (_jspx_meth_c_if_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("           </ul>\n");
        out.write("</nav>\n");
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

  private boolean _jspx_meth_c_if_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${!empty user}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("            <li class=\"nav-item\">\n");
        out.write("                     <a class=\"nav-link\" href=\"logout\">\n");
        out.write("                Logout</a>\n");
        out.write("                  </li>\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }
}
