package org.apache.jsp.WEB_002dINF.pages.jsp.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class UserList_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<title>Users</title>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("</head>\r\n");
      out.write("<body data-ng-app=\"userApp\" style=\"font-family: sans-serif;\">\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div data-ng-controller=\"userController\">\r\n");
      out.write("\t\t\t<h3 style=\"color: blue; font-family: sans-serif;\">Users:</h3>\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"search\" id=\"searchText\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"form-control input-sm\" maxlength=\"64\"\r\n");
      out.write("\t\t\t\t\t\t\tdata-ng-model=\"globalSearch\" placeholder=\"Search\" />\r\n");
      out.write("\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-primary btn-sm\">Search</button>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t<table  class=\"table table-striped\" border=\"1\" style=\"width: 100%;\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th width=\"10%\">Username</th>\r\n");
      out.write("\t\t\t\t\t<th width=\"15%\">Name</th>\r\n");
      out.write("\t\t\t\t\t<th width=\"15%\">Address</th>\r\n");
      out.write("\t\t\t\t\t<th width=\"15%\">Phone</th>\r\n");
      out.write("\t\t\t\t\t<th width=\"15%\">Email</th>\r\n");
      out.write("\t\t\t\t\t<th width=\"10%\">Status</th>\r\n");
      out.write("<!-- \t\t\t\t\t<th width=\"10%\">Create Date</th> -->\r\n");
      out.write("<!-- \t\t\t\t\t<th width=\"10%\">Update Date</th> -->\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr data-ng-repeat=\"dt in data | filter:globalSearch\">\r\n");
      out.write("\t\t\t\t\t<td>{{dt.username}}</td>\r\n");
      out.write("\t\t\t\t\t<td>{{dt.name}}</td>\r\n");
      out.write("\t\t\t\t\t<td>{{dt.address}}</td>\r\n");
      out.write("\t\t\t\t\t<td>{{dt.phone}}</td>\r\n");
      out.write("\t\t\t\t\t<td>{{dt.email}}</td>\r\n");
      out.write("\t\t\t\t\t<td>{{dt.status}}</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
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
