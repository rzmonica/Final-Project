package org.apache.jsp.WEB_002dINF.pages.jsp.Book;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CreateBook_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body data-ng-app=\"bookApp\">\r\n");
      out.write("\t<div class=\"container\" >\r\n");
      out.write("\t\t<form class=\"col-md-6\" action=\"\" data-ng-controller=\"bookController\">\r\n");
      out.write("\t\t\t<h2>Add Book</h2>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<label for=\"code\">Code: </label> <br> <input\r\n");
      out.write("\t\t\t\t\tclass=\"form-control\" id=\"code\" type=\"text\" placeholder=\"Code...\"\r\n");
      out.write("\t\t\t\t\tdata-ng-model=book.bookDetails.code>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<label for=\"name\">Name: </label> <br> <input\r\n");
      out.write("\t\t\t\t\tclass=\"form-control\" id=\"name\" type=\"text\" placeholder=\"Name...\"\r\n");
      out.write("\t\t\t\t\tdata-ng-model=book.bookDetails.name>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<label for=\"author\">Author: </label> <br> <input\r\n");
      out.write("\t\t\t\t\tclass=\"form-control\" id=\"author\" type=\"text\"\r\n");
      out.write("\t\t\t\t\tplaceholder=\"Author...\" data-ng-model=book.bookDetails.author>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<label for=\"editorial\">Editorial: </label> <br> <input\r\n");
      out.write("\t\t\t\t\tclass=\"form-control\" id=\"editorial\" type=\"text\"\r\n");
      out.write("\t\t\t\t\tplaceholder=\"Editorial...\" data-ng-model=book.bookDetails.editorial>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<label for=\"gender\">Gender: </label> <br> <input\r\n");
      out.write("\t\t\t\t\tclass=\"form-control\" id=\"gender\" type=\"text\"\r\n");
      out.write("\t\t\t\t\tplaceholder=\"Gender...\" data-ng-model=book.bookDetails.gender>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<label for=\"year\">Year: </label> <br> <input\r\n");
      out.write("\t\t\t\t\tclass=\"form-control\" id=\"year\" type=\"number\" placeholder=\"Year...\"\r\n");
      out.write("\t\t\t\t\tdata-ng-model=book.bookDetails.year>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("<!-- \t\t\t<div class=\"form-group\"> -->\r\n");
      out.write("<!-- \t\t\t\t<label for=\"status\" >Status: -->\r\n");
      out.write("<!-- \t\t\t\t</label> <br> <select name=\"Status\" data-ng-model=book.bookDetails.status> -->\r\n");
      out.write("<!-- \t\t\t\t\t<option value=\"0\">Select</option> -->\r\n");
      out.write("<!-- \t\t\t\t\t<option value=\"1\">Available</option> -->\r\n");
      out.write("<!-- \t\t\t\t</select> -->\r\n");
      out.write("<!-- \t\t\t</div> -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<button class=\"btn btn-primary\" data-ng-click=\"addBook(book)\">Add\r\n");
      out.write("\t\t\t\t\tBook</button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t{{book}}\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
