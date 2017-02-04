package org.apache.jsp.WEB_002dINF.layout;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<div class=\"col-md-12\">\r\n");
      out.write("\t<div id=\"carousel-1\" class=\"carousel slide\" data-ride=\"carousel\">\r\n");
      out.write("\t\t<!--Indicadores-->\r\n");
      out.write("\t\t<ol class=\"carousel-indicators\">\r\n");
      out.write("\t\t\t<li data-target=\"#carousel-1\" data-slide-to=\"0\" class=\"active\"></li>\r\n");
      out.write("\t\t\t<li data-target=\"#carousel-1\" data-slide-to=\"1\"></li>\r\n");
      out.write("\t\t\t<li data-target=\"#carousel-1\" data-slide-to=\"2\"></li>\r\n");
      out.write("\t\t</ol>\r\n");
      out.write("\r\n");
      out.write("\t\t<!--Contenedor-->\r\n");
      out.write("\t\t<div class=\"carousel-inner\" role=\"listbox\">\r\n");
      out.write("\t\t\t<div class=\"item active\">\r\n");
      out.write("\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/img/img1.jpg\"  alt=\"\" class=\"img-responsive\">\r\n");
      out.write("\t\t\t\t<div class=\"carousel-caption hidden-xs hidden-sm\">\r\n");
      out.write("\t\t\t\t\t<h3>Welcome</h3>\r\n");
      out.write("\t\t\t\t\t<p>Find the book that you are looking for!</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"item\">\r\n");
      out.write("\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/img/img2.jpg\" alt=\"\" class=\"img-responsive\">\r\n");
      out.write("\t\t\t\t<div class=\"carousel-caption hidden-xs hidden-sm\">\r\n");
      out.write("\t\t\t\t\t<h3>Welcome</h3>\r\n");
      out.write("\t\t\t\t\t<p>Thousands of options</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"item\">\r\n");
      out.write("\t\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/resources/img/img3.jpg\" alt=\"\" class=\"img-responsive\">\r\n");
      out.write("\t\t\t\t<div class=\"carousel-caption hidden-xs hidden-sm\">\r\n");
      out.write("\t\t\t\t\t<h3>Welcome</h3>\r\n");
      out.write("\t\t\t\t\t<p>Order Now!</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<!--Controles-->\r\n");
      out.write("\t\t<a href=\"#carousel-1\" class=\"left carousel-control\" rol=\"button\"\r\n");
      out.write("\t\t\tdata-slide=\"prev\"> <span class=\"glyphicon glyphicon-chevron-left\"\r\n");
      out.write("\t\t\taria-hidden=\"true\"></span> <span class=\"sr-only\">Previous</span>\r\n");
      out.write("\t\t</a> <a href=\"#carousel-1\" class=\"right carousel-control\" rol=\"button\"\r\n");
      out.write("\t\t\tdata-slide=\"next\"> <span\r\n");
      out.write("\t\t\tclass=\"glyphicon glyphicon-chevron-right\" aria-hidden=\"true\"></span>\r\n");
      out.write("\t\t\t<span class=\"sr-only\">Next</span>\r\n");
      out.write("\t\t</a>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>");
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
