package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Welcome</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"Bootstrap/css/bootstrap.min.css\" type=\"text/css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("        <h1 style=\"margin-left: 700px;\" class=\"text-info\" >Welcome</h1>\n");
      out.write("        <input class=\"glyphicon-search\" type=\"search\">\n");
      out.write("        <img class=\"glyphicon glyphicon-search\" src=\"\">\n");
      out.write("        \n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"col-lg-4\"></div>\n");
      out.write("            <div class=\"col-lg-4\">\n");
      out.write("                <div class=\"jumbotron\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <form action=\"login\" method=\"post\">\n");
      out.write("                            <input type=\"text\" name=\"username\" placeholder=\"Username\" class=\"form-control\">\n");
      out.write("                            <input type=\"password\" name=\"password\" placeholder=\"Password\" class=\"form-control\">\n");
      out.write("                            <br>\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-primary btn-block\">Login</button>\n");
      out.write("                            <br><br><br>\n");
      out.write("                            <table>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>Not a user?</td>\n");
      out.write("                                    <td>  </td>\n");
      out.write("                                    <td><a href=\"reg.jsp\">Register here</a></td>\n");
      out.write("                                </tr>\n");
      out.write("                            </table>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-4\"></div>\n");
      out.write("<button type=\"submit\"><span class=\"glyphicon glyphicon-search\" aria-hidden=\"true\"></span></button>\n");
      out.write("        </div>\n");
      out.write("              \n");
      out.write("        ");

            String s = request.getParameter("msg");
            if(s!=null){
                
            
        
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-6\">\n");
      out.write("                <div>\n");
      out.write("                    <h3 class=\"alert-danger\">");
      out.print( s);
      out.write("</h3>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        ");

            }
        
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
