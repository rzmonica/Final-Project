package org.apache.jsp.WEB_002dINF.pages.jsp.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CreateUser_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<title>Users</title>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"font-family: sans-serif;\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<form class=\"col-md-6\" action=\"\">\r\n");
      out.write("\t\t\t\t<h2>Add User</h2>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t<label for=\"username\">Username: </label> <br> <input\r\n");
      out.write("\t\t\t\t\t\tclass=\"form-control\" id=\"username\" type=\"text\"\r\n");
      out.write("\t\t\t\t\t\tplaceholder=\"User Name...\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t<label for=\"name\">Name: </label> <br> <input\r\n");
      out.write("\t\t\t\t\t\tclass=\"form-control\" id=\"name\" type=\"text\" placeholder=\"Name...\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t<label for=\"adress\">Adress: </label> <br> <input\r\n");
      out.write("\t\t\t\t\t\tclass=\"form-control\" id=\"adress\" type=\"text\"\r\n");
      out.write("\t\t\t\t\t\tplaceholder=\"Adress...\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t<label for=\"phone\">Phone: </label> <br> <input\r\n");
      out.write("\t\t\t\t\t\tclass=\"form-control\" id=\"phone\" type=\"text\"\r\n");
      out.write("\t\t\t\t\t\tplaceholder=\"Adress...\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t<label for=\"email\">Email: </label> <br> <input\r\n");
      out.write("\t\t\t\t\t\tclass=\"form-control\" id=\"email\" type=\"text\" placeholder=\"Email...\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t<label for=\"password\">Password: </label> <br> <input\r\n");
      out.write("\t\t\t\t\t\tclass=\"form-control\" id=\"password\" type=\"text\"\r\n");
      out.write("\t\t\t\t\t\tplaceholder=\"Password...\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t<label for=\"status\">Status: </label> <br> <select\r\n");
      out.write("\t\t\t\t\t\tname=\"Status\">\r\n");
      out.write("\t\t\t\t\t\t<option value=\"0\">- Select -</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"1\">Active</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"2\">Inactive</option>\r\n");
      out.write("\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<button class=\"btn btn-primary\">Send</button>\r\n");
      out.write("\t\t\t\t<br> <br>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
