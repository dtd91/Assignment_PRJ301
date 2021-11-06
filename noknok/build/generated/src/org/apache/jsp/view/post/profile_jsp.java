package org.apache.jsp.view.post;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/view/post/header.jsp");
    _jspx_dependants.add("/view/post/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Bootstrap Example</title>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("        <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <!------ Include the above in your HEAD tag ---------->\n");
      out.write("\n");
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("        <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <!------ Include the above in your HEAD tag ---------->\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <script>\n");
      out.write("        $(document).ready(function () {\n");
      out.write("            var readURL = function (input) {\n");
      out.write("                if (input.files && input.files[0]) {\n");
      out.write("                    var reader = new FileReader();\n");
      out.write("                    reader.onload = function (e) {\n");
      out.write("                        $('.avatar').attr('src', e.target.result);\n");
      out.write("                    }\n");
      out.write("                    reader.readAsDataURL(input.files[0]);\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            $(\".file-upload\").on('change', function () {\n");
      out.write("                readURL(this);\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"../css/content.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\n");
      out.write("        <title>Header</title>\n");
      out.write("        <style>\n");
      out.write("            .bg-black {\n");
      out.write("                background-color: #000\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #logo {\n");
      out.write("                width: 30px;\n");
      out.write("                height: 30px;\n");
      out.write("                border-radius: 4px\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .navbar-brand {\n");
      out.write("                padding: 14px 20px;\n");
      out.write("                font-size: 16px\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .navbar-nav {\n");
      out.write("                width: 100%\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .nav-item {\n");
      out.write("                padding: 6px 8px;\n");
      out.write("                text-align: center\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .nav-link {\n");
      out.write("                padding-bottom: 10px\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .v-line {\n");
      out.write("                background-color: gray;\n");
      out.write("                width: 1px;\n");
      out.write("                height: 20px\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .navbar-collapse.collapse.in {\n");
      out.write("                display: block !important\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            @media (max-width: 576px) {\n");
      out.write("                .nav-item {\n");
      out.write("                    width: 100%;\n");
      out.write("                    text-align: left\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                .v-line {\n");
      out.write("                    display: none\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #login{\n");
      out.write("                margin-left: 5px;\n");
      out.write("                margin-right: 10px;\n");
      out.write("            }\n");
      out.write("            .navbar-nav li:hover{\n");
      out.write("                background-color: #666666;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container-fluid px-0\">\n");
      out.write("            <nav class=\"navbar navbar-expand-sm navbar-dark bg-black py-0 px-0\"> <a class=\"navbar-brand\" href=\"home\"><img id=\"logo\" src=\"https://i.imgur.com/K7Nwq4V.jpg\"> noknok</a> <span class=\"v-line\"></span> \n");
      out.write("                <button class=\"navbar-toggler mr-3\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\"> <span class=\"navbar-toggler-icon\"></span> </button>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n");
      out.write("                    <ul class=\"navbar-nav\">\n");
      out.write("                        <li class=\"nav-item ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\"> <a class=\"nav-link\" href=\"home\">Trang chủ</a> </li>\n");
      out.write("                        <li class=\"nav-item ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write(" \"> <a class=\"nav-link\" href=\"broadinghouse\">Cho thuê phòng trọ</a> </li>\n");
      out.write("                        <li class=\"nav-item ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\"> <a class=\"nav-link\" href=\"apartment\">Cho thuê căn hộ</a> </li>\n");
      out.write("                        <li class=\"nav-item ");
      if (_jspx_meth_c_if_3(_jspx_page_context))
        return;
      out.write("\"> <a class=\"nav-link\" href=\"house\">Nhà nguyên căn</a> </li>\n");
      out.write("                        <li class=\"nav-item ");
      if (_jspx_meth_c_if_4(_jspx_page_context))
        return;
      out.write("\"> <a class=\"nav-link\" href=\"resident\">Tìm người ở ghép</a> </li>\n");
      out.write("                        <li class=\"nav-item ");
      if (_jspx_meth_c_if_5(_jspx_page_context))
        return;
      out.write("\"> <a class=\"nav-link\" href=\"insert\">Đăng Phòng</a> </li>\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("                    ");
      if (_jspx_meth_c_if_6(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                    ");
      if (_jspx_meth_c_if_7(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("<br><br>\n");
      out.write("\n");
      out.write("        <div class=\"d-flex justify-content-center row\">\n");
      out.write("            <div class=\"col-md-10 table-responsive\" >\n");
      out.write("                <div class=\"container bootstrap snippet\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"text-center col-md-3\"><h3>Xin chào, User name</h3></div><br>\n");
      out.write("                        <div class=\"col-md-2\"><a href=\"/users\" class=\"pull-right\"></a></div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-4\"><!--left col-->\n");
      out.write("                            <div class=\"text-center\">\n");
      out.write("                                <img src=\"http://ssl.gstatic.com/accounts/ui/avatar_2x.png\" class=\"avatar img-circle img-thumbnail\" alt=\"avatar\">\n");
      out.write("                                <h6>Upload a different photo...</h6>\n");
      out.write("                                <input type=\"file\" class=\"text-center center-block file-upload\">\n");
      out.write("                            </div></hr><br>\n");
      out.write("\n");
      out.write("                            <ul class=\"list-group\">\n");
      out.write("                                <li class=\"list-group-item text-muted\">Activity <i class=\"fa fa-dashboard fa-1x\"></i></li>\n");
      out.write("                                <li class=\"list-group-item text-right\"><span class=\"pull-left\"><strong>Số tin đã đăng</strong></span> 125</li>\n");
      out.write("                            </ul> \n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div><!--/col-3-->\n");
      out.write("                        <div class=\"col-md-8\">\n");
      out.write("                            <form action=\"##\" method=\"post\" id=\"registrationForm\">\n");
      out.write("\n");
      out.write("                                <div class=\"col-md-12\" style=\"display: flex;\">\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        <label for=\"first_name\"><h4>First name</h4></label>\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" name=\"first_name\" id=\"first_name\" placeholder=\"first name\" title=\"enter your first name if any.\">\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        <label for=\"last_name\"><h4>Last name</h4></label>\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" name=\"last_name\" id=\"last_name\" placeholder=\"last name\" title=\"enter your last name if any.\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div><br>\n");
      out.write("\n");
      out.write("                                <div class=\"col-md-12\" style=\"display: flex;\">\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        <label for=\"mobile\"><h4>Gender</h4></label><br>\n");
      out.write("                                        <input type=\"radio\" name=\"gender\" value=\"male\"> Male         \n");
      out.write("                                        <input type=\"radio\" name=\"gender\" value=\"female\"> Female\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        <label for=\"phone\"><h4>Phone</h4></label>\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" name=\"phone\" id=\"phone\" placeholder=\"enter phone\" title=\"enter your phone number if any.\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div><br>\n");
      out.write("\n");
      out.write("                                <div class=\"col-md-12\" style=\"display: flex;\">\n");
      out.write("\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        <label for=\"email\"><h4>Email</h4></label>\n");
      out.write("                                        <input type=\"email\" class=\"form-control\" name=\"email\" id=\"email\" placeholder=\"you@email.com\" title=\"enter your email.\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"col-md-12 text-center\">\n");
      out.write("                                    <br>\n");
      out.write("                                    <button class=\"btn btn-lg btn-success\" type=\"submit\"><i class=\"glyphicon glyphicon-ok-sign\"></i> Save</button>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div><!--/tab-pane-->\n");
      out.write("\n");
      out.write("                    </div><!--/col-9-->\n");
      out.write("                </div><!--/row-->\n");
      out.write("            </div><!--/row-->\n");
      out.write("        </div><!--/row-->\n");
      out.write("        <br>\n");
      out.write("        <br>    \n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Footer</title>\n");
      out.write("         <!-- Latest compiled and minified CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.7.0/css/all.css\" integrity=\"sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <style>\n");
      out.write("            .site-footer\n");
      out.write("            {\n");
      out.write("                background-color:#000;\n");
      out.write("                padding:45px 0 20px;\n");
      out.write("                font-size:15px;\n");
      out.write("                line-height:24px;\n");
      out.write("                color:#737373;\n");
      out.write("            }\n");
      out.write("            .site-footer hr\n");
      out.write("            {\n");
      out.write("                border-top-color:#bbb;\n");
      out.write("                opacity:0.5\n");
      out.write("            }\n");
      out.write("            .site-footer hr.small\n");
      out.write("            {\n");
      out.write("                margin:20px 0\n");
      out.write("            }\n");
      out.write("            .site-footer h6\n");
      out.write("            {\n");
      out.write("                color:#fff;\n");
      out.write("                font-size:16px;\n");
      out.write("                text-transform:uppercase;\n");
      out.write("                margin-top:5px;\n");
      out.write("                letter-spacing:2px\n");
      out.write("            }\n");
      out.write("            .site-footer a\n");
      out.write("            {\n");
      out.write("                color:gray;\n");
      out.write("            }\n");
      out.write("            .site-footer a:hover\n");
      out.write("            {\n");
      out.write("                color:#3366cc;\n");
      out.write("                text-decoration:none;\n");
      out.write("            }\n");
      out.write("            .footer-links\n");
      out.write("            {\n");
      out.write("                padding-left:0;\n");
      out.write("                list-style:none\n");
      out.write("            }\n");
      out.write("            .footer-links li\n");
      out.write("            {\n");
      out.write("                display:block;\n");
      out.write("            }\n");
      out.write("            .footer-links a\n");
      out.write("            {\n");
      out.write("                text-decoration: none;\n");
      out.write("                color:#737373\n");
      out.write("            }\n");
      out.write("            .footer-links a:active,.footer-links a:focus,.footer-links a:hover\n");
      out.write("            {\n");
      out.write("                color:#3366cc;\n");
      out.write("                text-decoration:none;\n");
      out.write("            }\n");
      out.write("            .footer-links.inline li\n");
      out.write("            {\n");
      out.write("                display:inline-block\n");
      out.write("            }\n");
      out.write("            .site-footer .social-icons\n");
      out.write("            {\n");
      out.write("                text-align:right\n");
      out.write("            }\n");
      out.write("            .site-footer .social-icons a\n");
      out.write("            {\n");
      out.write("                width:40px;\n");
      out.write("                height:40px;\n");
      out.write("                line-height:40px;\n");
      out.write("                margin-left:6px;\n");
      out.write("                margin-right:0;\n");
      out.write("                border-radius:100%;\n");
      out.write("                background-color:#33353d\n");
      out.write("            }\n");
      out.write("            .copyright-text\n");
      out.write("            {\n");
      out.write("                margin:0\n");
      out.write("            }\n");
      out.write("            @media (max-width:991px)\n");
      out.write("            {\n");
      out.write("                .site-footer [class^=col-]\n");
      out.write("                {\n");
      out.write("                    margin-bottom:30px\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            @media (max-width:767px)\n");
      out.write("            {\n");
      out.write("                .site-footer\n");
      out.write("                {\n");
      out.write("                    padding-bottom:0\n");
      out.write("                }\n");
      out.write("                .site-footer .copyright-text,.site-footer .social-icons\n");
      out.write("                {\n");
      out.write("                    text-align:center\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            .social-icons\n");
      out.write("            {\n");
      out.write("                padding-left:0;\n");
      out.write("                margin-bottom:0;\n");
      out.write("                list-style:none\n");
      out.write("            }\n");
      out.write("            .social-icons li\n");
      out.write("            {\n");
      out.write("                display:inline-block;\n");
      out.write("                margin-bottom:4px\n");
      out.write("            }\n");
      out.write("            .social-icons li.title\n");
      out.write("            {\n");
      out.write("                margin-right:15px;\n");
      out.write("                text-transform:uppercase;\n");
      out.write("                color:#96a2b2;\n");
      out.write("                font-weight:700;\n");
      out.write("                font-size:13px\n");
      out.write("            }\n");
      out.write("            .social-icons a{\n");
      out.write("                background-color:#eceeef;\n");
      out.write("                color:#818a91;\n");
      out.write("                font-size:16px;\n");
      out.write("                display:inline-block;\n");
      out.write("                line-height:44px;\n");
      out.write("                width:44px;\n");
      out.write("                height:44px;\n");
      out.write("                text-align:center;\n");
      out.write("                margin-right:8px;\n");
      out.write("                border-radius:100%;\n");
      out.write("                -webkit-transition:all .2s linear;\n");
      out.write("                -o-transition:all .2s linear;\n");
      out.write("                transition:all .2s linear\n");
      out.write("            }\n");
      out.write("            .social-icons a:active,.social-icons a:focus,.social-icons a:hover\n");
      out.write("            {\n");
      out.write("                color:#fff;\n");
      out.write("                background-color:#29aafe\n");
      out.write("            }\n");
      out.write("            .social-icons.size-sm a\n");
      out.write("            {\n");
      out.write("                line-height:34px;\n");
      out.write("                height:34px;\n");
      out.write("                width:34px;\n");
      out.write("                font-size:14px\n");
      out.write("            }\n");
      out.write("            .social-icons a.facebook:hover\n");
      out.write("            {\n");
      out.write("                background-color:#3b5998\n");
      out.write("            }\n");
      out.write("            .social-icons a.twitter:hover\n");
      out.write("            {\n");
      out.write("                background-color:#00aced\n");
      out.write("            }\n");
      out.write("            .social-icons a.linkedin:hover\n");
      out.write("            {\n");
      out.write("                background-color:#007bb6\n");
      out.write("            }\n");
      out.write("            .social-icons a.dribbble:hover\n");
      out.write("            {\n");
      out.write("                background-color:#ea4c89\n");
      out.write("            }\n");
      out.write("            @media (max-width:767px)\n");
      out.write("            {\n");
      out.write("                .social-icons li.title\n");
      out.write("                {\n");
      out.write("                    display:block;\n");
      out.write("                    margin-right:0;\n");
      out.write("                    font-weight:600\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- Site footer -->\n");
      out.write("        <footer class=\"site-footer\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-12 col-md-5\">\n");
      out.write("                        <h6>Công ty TNHH Noknok</h6>\n");
      out.write("                        <p class=\"text-justify\">\n");
      out.write("                            Hotline: 038 3333 672 Email: datdthe151528@gmail.com<br>\n");
      out.write("                            Cs: Số 48 Ngõ 89 Lương Đình Của, Phương Mai, Đống Đa, Hà Nội\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-xs-6 col-md-3\">\n");
      out.write("                        <h6>Hỗ trợ</h6>\n");
      out.write("                        <ul class=\"footer-links\">\n");
      out.write("                            <li><a href=\"#\">Trung tâm trợ giúp</a></li>\n");
      out.write("                            <li><a href=\"#\">Liên hệ hỗ trợ</a></li>\n");
      out.write("                            <li><a href=\"#\">Quy định đăng tin</a></li>\n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-xs-6 col-md-4\">\n");
      out.write("                        <h6>Về chúng tôi</h6>\n");
      out.write("                        <p>Trang web hỗ trợ chia sẻ thông tin miễn phí về phòng trọ, nhà riêng, văn phòng giúp người tìm và người cho thuê tương tác với nhau không qua trung gian môi giới.</p>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <hr>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-12 col-sm-6 col-xs-12\">\n");
      out.write("                        <ul class=\"social-icons\" style=\"float: right\">\n");
      out.write("                            <li><a class=\"facebook\" href=\"https://www.facebook.com/datdat910/\" target=\"_blank\"><i class=\"fab fa-facebook-f\"></i></a></li>\n");
      out.write("                            <li><a class=\"instagram\" href=\"https://www.instagram.com/dtd91___/\" target=\"_blank\"><i class=\"fab fa-instagram\"></i></a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope['javax.servlet.forward.request_uri'] eq '/noknok/home'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" active");
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

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope['javax.servlet.forward.request_uri'] eq '/noknok/broadinghouse'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" active");
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

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope['javax.servlet.forward.request_uri'] eq '/noknok/apartment'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" active");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_if_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent(null);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope['javax.servlet.forward.request_uri'] eq '/noknok/house'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" active");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }

  private boolean _jspx_meth_c_if_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent(null);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope['javax.servlet.forward.request_uri'] eq '/noknok/resident'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" active");
        int evalDoAfterBody = _jspx_th_c_if_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
    return false;
  }

  private boolean _jspx_meth_c_if_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_5.setPageContext(_jspx_page_context);
    _jspx_th_c_if_5.setParent(null);
    _jspx_th_c_if_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope['javax.servlet.forward.request_uri'] eq '/noknok/insert'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
    if (_jspx_eval_c_if_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" active");
        int evalDoAfterBody = _jspx_th_c_if_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
    return false;
  }

  private boolean _jspx_meth_c_if_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_6.setPageContext(_jspx_page_context);
    _jspx_th_c_if_6.setParent(null);
    _jspx_th_c_if_6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account==null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_6 = _jspx_th_c_if_6.doStartTag();
    if (_jspx_eval_c_if_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                        <a class=\"btn btn-primary\" href=\"signup\" role=\"button\">Đăng ký</a>\n");
        out.write("                        <a class=\"btn btn-secondary\" id=\"login\" href=\"login\" role=\"button\">Đăng nhập</a>\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_if_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
    return false;
  }

  private boolean _jspx_meth_c_if_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_7 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_7.setPageContext(_jspx_page_context);
    _jspx_th_c_if_7.setParent(null);
    _jspx_th_c_if_7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_7 = _jspx_th_c_if_7.doStartTag();
    if (_jspx_eval_c_if_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\n");
        out.write("                        <div class=\"\" style=\"margin-right: 5px\">\n");
        out.write("                            <div class=\"btn-group\">\n");
        out.write("                                <button class=\"btn btn-primary dropdown-toggle\" type=\"button\" id=\"dropdownMenuButton\" data-toggle=\"dropdown\">\n");
        out.write("                                    ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\n");
        out.write("                                </button>\n");
        out.write("                                <div class=\"dropdown-menu\">\n");
        out.write("                                    <a class=\"dropdown-item\" href=\"mypost\">Xem tin đã đăng</a>\n");
        out.write("                                    <a class=\"dropdown-item\" href=\"#\">Xem thông tin</a>\n");
        out.write("                                    <div class=\"dropdown-divider\"></div>\n");
        out.write("                                    <a class=\"dropdown-item\" href=\"logout\">Logout</a>\n");
        out.write("                                </div>\n");
        out.write("                            </div>\n");
        out.write("                        </div>\n");
        out.write("\n");
        out.write("                        ");
        if (_jspx_meth_c_if_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_7, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                        <a class=\"btn btn-secondary\" id=\"login\" href=\"logout\" role=\"button\">Log out</a>\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_if_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_7);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_7);
    return false;
  }

  private boolean _jspx_meth_c_if_8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_8 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_8.setPageContext(_jspx_page_context);
    _jspx_th_c_if_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_7);
    _jspx_th_c_if_8.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account!=null && sessionScope.account.role == 'admin'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_8 = _jspx_th_c_if_8.doStartTag();
    if (_jspx_eval_c_if_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            <a class=\"btn btn-warning\" href=\"list\" role=\"button\">Quản lý</a>\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_8);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_8);
    return false;
  }
}
