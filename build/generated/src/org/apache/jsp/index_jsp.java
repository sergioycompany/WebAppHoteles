package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import exception.UsuPass;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\n");
      out.write("        <title>Hoteles</title>\n");
      out.write("        <script language=\"JavaScript\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            function saludar() {\n");
      out.write("                var nombre = inicio.usu.value;\n");
      out.write("                var pass = String.valueOf(inicio.pass.value);\n");
      out.write("                if (nombre.length == 0 || pass.length == 0)\n");
      out.write("                    alert(\"compruebe que ha escrito un usuario y contraseña\");\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body  >\n");
      out.write("\n");
      out.write("        <form name=\"inicio\" action=\"/WebAppHoteles/Home\" method=\"post\">\n");
      out.write("            <div align=\"center\">\n");
      out.write("                <div class=\"card\" style=\"width:400px\">\n");
      out.write("                    \n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-12\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label> usuario</label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" placeholder=\"usuario\" name=\"usu\">\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"form-group\" >\n");
      out.write("                                    <label >contraseña</label>\n");
      out.write("                                    <input type=\"password\" class=\"form-control\"  placeholder=\"contraseña\" name=\"pass\">\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"form-group\" >\n");
      out.write("                                    <button type=\"submit\" class=\"btn btn-primary\" name=\"ini\" onclick=\"saludar()\">iniciar</button>\n");
      out.write("                                    </form>\n");
      out.write("\n");
      out.write("                                    <form name=\"reg\" action=\"/WebAppHoteles/reg\" method=\"post\">\n");
      out.write("                                        <button type=\"submit\" class=\"btn btn-primary\" name=\"reg\">registrarse</button>\n");
      out.write("                                    </form>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
