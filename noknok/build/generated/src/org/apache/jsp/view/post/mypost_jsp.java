package org.apache.jsp.view.post;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mypost_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"col-12\">\n");
      out.write("            <div class=\"table-responsive\">\n");
      out.write("                <table class=\"table table-striped\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <th scope=\"col\"> </th>\n");
      out.write("                            <th scope=\"col\">Tên sản phẩm</th>\n");
      out.write("                            <th scope=\"col\">Size</th>\n");
      out.write("                            <th scope=\"col\" class=\"text-center\">Số lượng</th>\n");
      out.write("                            <th scope=\"col\" class=\"text-right\">Đơn giá</th>\n");
      out.write("                            <th scope=\"col\" class=\"text-right\">Thành tiền</th>\n");
      out.write("                            <th> </th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                    <c:forEach items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.cartlist}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" var=\"item\">\n");
      out.write("                        <tr>\n");
      out.write("                            <td><img class=\"img-responsive\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.kit.img}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" /> </td>\n");
      out.write("                            <td><a href=\"detail?kit=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.kit.kitID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" style=\"text-decoration: none;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.kit.kitName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a></td>\n");
      out.write("                            <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("                            <td>\n");
      out.write("                                <form action=\"change\">\n");
      out.write("                                    <input size=\"1\" class=\"form-control\" type=\"number\" id=\"quantity\" name=\"quantity\" min=\"1\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" onchange=\"this.form.submit()\"/>\n");
      out.write("                                    <input type=\"text\" name=\"id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.kit.kitID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" style=\"display: none\">\n");
      out.write("                                    <input type=\"text\" name=\"size\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" style=\"display: none\">\n");
      out.write("                                </form>\n");
      out.write("                            </td>\n");
      out.write("                            <td class=\"text-right\"><fmt:formatNumber type=\"number\" maxFractionDigits=\"2\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/></td>\n");
      out.write("                        <td class=\"text-right\"><fmt:formatNumber type=\"number\" maxFractionDigits=\"2\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.price*item.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/></td>\n");
      out.write("                        <td class=\"text-right\"><a href=\"remove?size=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("&id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.kit.kitID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><button class=\"btn btn-sm btn-danger\"><i class=\"fa fa-trash\"></i> </button> </a></td>\n");
      out.write("                        </tr>\n");
      out.write("                    </c:forEach>\n");
      out.write("                    <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td>Sub-Total</td>\n");
      out.write("                        <td class=\"text-right\"><fmt:formatNumber type=\"number\" maxFractionDigits=\"2\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.total}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td>Shipping</td>\n");
      out.write("                        <td class=\"text-right\"><fmt:formatNumber type=\"number\" maxFractionDigits=\"2\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${(sessionScope.total*5)/1000}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td><strong>Total</strong></td>\n");
      out.write("                        <td class=\"text-right\"><strong><fmt:formatNumber type=\"number\" maxFractionDigits=\"2\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${(sessionScope.total*1005)/1000}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/></strong></td>\n");
      out.write("                    </tr>\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
