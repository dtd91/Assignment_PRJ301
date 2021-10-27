package org.apache.jsp.view.post;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/view/post/header.jsp");
    _jspx_dependants.add("/view/post/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_scope_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_scope_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_set_var_value_scope_nobody.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Home</title>\n");
      out.write("    </head>\n");
      out.write("    <link href=\"css/content.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    <script>\n");
      out.write("        function doDetail(id)\n");
      out.write("        {\n");
      out.write("            window.location.href = \"detail?id=\" + id;\n");
      out.write("        }\n");
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
      out.write("        <title>Header</title>\n");
      out.write("        <style>\n");
      out.write("\n");
      out.write("\n");
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
      out.write("                padding: 6px 14px;\n");
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
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container-fluid px-0\">\n");
      out.write("            <nav class=\"navbar navbar-expand-sm navbar-dark bg-black py-0 px-0\"> <a class=\"navbar-brand\" href=\"home\"><img id=\"logo\" src=\"https://i.imgur.com/K7Nwq4V.jpg\"> noknok</a> <span class=\"v-line\"></span> \n");
      out.write("                <button class=\"navbar-toggler mr-3\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\"> <span class=\"navbar-toggler-icon\"></span> </button>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n");
      out.write("                    <ul class=\"navbar-nav\">\n");
      out.write("                        <li class=\"nav-item active\"> <a class=\"nav-link\" href=\"home\">Trang chủ</a> </li>\n");
      out.write("                        <li class=\"nav-item\"> <a class=\"nav-link\" href=\"#\">Blog</a> </li>\n");
      out.write("                        <li class=\"nav-item\"> <a class=\"nav-link\" href=\"resident\">Ở ghép</a> </li>\n");
      out.write("                        <li class=\"nav-item\"> <a class=\"nav-link\" href=\"insert\">Đăng Phòng</a> </li>\n");
      out.write("                            ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                    ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <img style=\"width: 100%\" src=\"img/banner.jpg\" alt=\"\"/>\n");
      out.write("            <div class=\"center\"><h1>Tìm kiếm nhà trọ có noknok</h1></div>\n");
      out.write("        </div>  \n");
      out.write("        <div class=\"container mt-5 mb-5\">\n");
      out.write("            <div class=\"d-flex justify-content-center row\">\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                    <!--SEARCHING-->\n");
      out.write("                    <form action=\"#\" method=\"POST\">\n");
      out.write("                        <div style=\"background-color: #333333;\"  class=\"box-search\">\n");
      out.write("                            <h3 class=\"text-center\" style=\"color: white\">Tìm kiếm nhanh</h3>\n");
      out.write("                            <div class=\"bs-content\">\n");
      out.write("                                <div class=\"d-flex justify-content-center row\">\n");
      out.write("                                    <div class=\"col-xs-12 col-sm-6 col-md-2\" name=\"searchbox\">\n");
      out.write("                                        <select id=\"ddlPostCate\" name=\"CategoryId\" class=\"form-control select2-hidden-accessible\" tabindex=\"-1\" aria-hidden=\"true\">\n");
      out.write("                                            <option value=\"0\">Loại tin</option>\n");
      out.write("                                            <option value=\"1\">Cho thuê phòng trọ</option><option value=\"2\">Cho thuê căn hộ</option><option value=\"3\">Cho thuê nhà nguyên căn</option><option value=\"4\">Tìm người ở ghép</option></select>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-xs-12 col-sm-6 col-md-2\" id=\"searchbox\">\n");
      out.write("                                        <select id=\"ddlProvince\" name=\"ProvinceId\" class=\"form-control select2-hidden-accessible\" tabindex=\"-1\" aria-hidden=\"true\">\n");
      out.write("                                            <option value=\"\">Tỉnh thành</option>\n");
      out.write("                                            <!--<option value=\"SG\">Hồ Chí Minh</option><option value=\"HN\">Hà Nội</option><option value=\"DDN\">Đà Nẵng</option><option value=\"BD\">Bình Dương</option><option value=\"DNA\">Đồng Nai</option><option value=\"KH\">Khánh Hòa</option><option value=\"HP\">Hải Phòng</option><option value=\"LA\">Long An</option><option value=\"QNA\">Quảng Nam</option><option value=\"VT\">Bà Rịa Vũng Tàu</option><option value=\"DDL\">Đắk Lắk</option><option value=\"CT\">Cần Thơ</option><option value=\"BTH\">Bình Thuận  </option><option value=\"LDD\">Lâm Đồng</option><option value=\"TTH\">Thừa Thiên Huế</option><option value=\"KG\">Kiên Giang</option><option value=\"BN\">Bắc Ninh</option><option value=\"QNI\">Quảng Ninh</option><option value=\"TH\">Thanh Hóa</option><option value=\"NA\">Nghệ An</option><option value=\"HD\">Hải Dương</option><option value=\"GL\">Gia Lai</option><option value=\"BP\">Bình Phước</option><option value=\"HY\">Hưng Yên</option><option value=\"BDD\">Bình Định</option><option value=\"TG\">Tiền Giang</option><option value=\"TB\">Thái Bình</option><option value=\"BG\">Bắc Giang</option><option value=\"HB\">Hòa Bình</option><option value=\"AG\">An Giang</option><option value=\"VP\">Vĩnh Phúc</option><option value=\"TNI\">Tây Ninh</option><option value=\"TN\">Thái Nguyên</option><option value=\"LCA\">Lào Cai</option><option value=\"NDD\">Nam Định</option><option value=\"QNG\">Quảng Ngãi</option><option value=\"BTR\">Bến Tre</option><option value=\"DNO\">Đắk Nông</option><option value=\"CM\">Cà Mau</option><option value=\"VL\">Vĩnh Long</option><option value=\"NB\">Ninh Bình</option><option value=\"PT\">Phú Thọ</option><option value=\"NT\">Ninh Thuận</option><option value=\"PY\">Phú Yên</option><option value=\"HNA\">Hà Nam</option><option value=\"HT\">Hà Tĩnh</option><option value=\"DDT\">Đồng Tháp</option><option value=\"ST\">Sóc Trăng</option><option value=\"KT\">Kon Tum</option><option value=\"QB\">Quảng Bình</option><option value=\"QT\">Quảng Trị</option><option value=\"TV\">Trà Vinh</option><option value=\"HGI\">Hậu Giang</option><option value=\"SL\">Sơn La</option><option value=\"BL\">Bạc Liêu</option><option value=\"YB\">Yên Bái</option><option value=\"TQ\">Tuyên Quang</option><option value=\"DDB\">Điện Biên</option><option value=\"LCH\">Lai Châu</option><option value=\"LS\">Lạng Sơn</option><option value=\"HG\">Hà Giang</option><option value=\"BK\">Bắc Kạn</option><option value=\"CB\">Cao Bằng</option></select>-->\n");
      out.write("                                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                        </select>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-xs-12 col-sm-6 col-md-2\" id=\"searchbox\">\n");
      out.write("                                        <select id=\"ddlDistrict\" name=\"DistrictId\" class=\"form-control select2-hidden-accessible\" tabindex=\"-1\" aria-hidden=\"true\">\n");
      out.write("                                            <option value=\"0\">Quận huyện</option>\n");
      out.write("                                            ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("    \n");
      out.write("                                        </select>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-xs-12 col-sm-6 col-md-2\" id=\"searchbox\">\n");
      out.write("                                        <select id=\"ddlPrice\" name=\"PriceId\" style=\"width:100%\" class=\"form-control\">\n");
      out.write("                                            <option value=\"-1\">Mức giá</option>\n");
      out.write("                                            <option value=\"0\">Thỏa thuận</option>\n");
      out.write("                                            <option value=\"1\">Dưới 1 triệu</option>\n");
      out.write("                                            <option value=\"2\">1 triệu - 2 triệu</option>\n");
      out.write("                                            <option value=\"3\">2 triệu - 3 triệu</option>\n");
      out.write("                                            <option value=\"4\">3 triệu - 5 triệu</option>\n");
      out.write("                                            <option value=\"5\">5 triệu - 7 triệu</option>\n");
      out.write("                                            <option value=\"6\">7 triệu - 10 triệu</option>\n");
      out.write("                                            <option value=\"7\">10 triệu - 15 triệu</option>\n");
      out.write("                                            <option value=\"8\">15 triệu - 20 triệu</option>\n");
      out.write("                                            <option value=\"9\">Trên 20 triệu</option>\n");
      out.write("                                        </select>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-xs-12 col-sm-6 col-md-2\">\n");
      out.write("                                        <select id=\"ddlArea\" name=\"AreaId\" style=\"width:100%\" class=\"form-control\">\n");
      out.write("                                            <option value=\"-1\">Diện tích</option>\n");
      out.write("                                            <option value=\"0\">Chưa xác định</option>\n");
      out.write("                                            <option value=\"1\">Dưới 20 m2</option>\n");
      out.write("                                            <option value=\"2\">20 - 30 m2</option>\n");
      out.write("                                            <option value=\"3\">30 - 50 m2</option>\n");
      out.write("                                            <option value=\"4\">50 - 60 m2</option>\n");
      out.write("                                            <option value=\"5\">60 - 70 m2</option>\n");
      out.write("                                            <option value=\"6\">70 - 80 m2</option>\n");
      out.write("                                            <option value=\"7\">80 - 90 m2</option>\n");
      out.write("                                            <option value=\"8\">90 - 100 m2</option>\n");
      out.write("                                            <option value=\"9\">Trên 100 m2</option>\n");
      out.write("                                        </select>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <br>\n");
      out.write("                            <div class=\"d-flex justify-content-center row\">\n");
      out.write("                                <div class=\"col-md-2\"><input style=\"border-radius: 20px; padding: 10px\" type=\"submit\"class=\"btn btn-warning btn-block\" name=\"btnSearch\" value=\"Tìm Kiếm\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <br>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                    <br>\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-8\">\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div> \n");
      out.write("        </div> \n");
      out.write("        \n");
      out.write("        <!--NEWS-->\n");
      out.write("        <div class=\"col-xs-12 col-md-4\">\n");
      out.write("        <div class=\"sidebar-box\">\n");
      out.write("            <h3 class=\"sidebarbox-title\">\n");
      out.write("                <span>Danh mục cho thuê</span>\n");
      out.write("            </h3>\n");
      out.write("            <div class=\"sidebarbox-body\">\n");
      out.write("                <ul class=\"box-lastnews\">\n");
      out.write("                    <li><a title=\"Cho thuê phòng trọ Hồ Chí Minh\" href=\"/cho-thue-phong-tro-ho-chi-minh\">Cho thuê phòng trọ Hồ Chí Minh</a></li>\n");
      out.write("                    <li><a title=\"Cho thuê phòng trọ Hà Nội\" href=\"/cho-thue-phong-tro-ha-noi\">Cho thuê phòng trọ Hà Nội</a></li>\n");
      out.write("                    <li><a title=\"Cho thuê phòng trọ Đà Nẵng\" href=\"/cho-thue-phong-tro-da-nang\">Cho thuê phòng trọ Đà Nẵng</a></li>\n");
      out.write("                    <li><a title=\"Cho thuê phòng trọ Đồng Nai\" href=\"/cho-thue-phong-tro-dong-nai\">Cho thuê phòng trọ Đồng Nai</a></li>\n");
      out.write("                    <li><a title=\"Cho thuê phòng trọ Bình Dương\" href=\"/cho-thue-phong-tro-binh-duong\">Cho thuê phòng trọ Bình Dương</a></li>\n");
      out.write("                    <li><a title=\"Cho thuê phòng trọ Bà Rịa Vũng Tàu\" href=\"/cho-thue-phong-tro-ba-ria-vung-tau\">Cho thuê phòng trọ Bà Rịa Vũng Tàu</a></li>\n");
      out.write("                    <li><a title=\"Cho thuê phòng trọ Cần Thơ\" href=\"/cho-thue-phong-tro-can-tho\">Cho thuê phòng trọ Cần Thơ</a></li>\n");
      out.write("                    <li><a title=\"Cho thuê phòng trọ Hải Phòng\" href=\"/cho-thue-phong-tro-hai-phong\">Cho thuê phòng trọ Hải Phòng</a></li>\n");
      out.write("                    <li><a title=\"Cho thuê phòng trọ Thừa Thiên Huế\" href=\"/cho-thue-phong-tro-thua-thien-hue\">Cho thuê phòng trọ Thừa Thiên Huế</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"mgb-15\">\n");
      out.write("            <img src=\"/images/ads/ad-right.jpg?v=20200501\" data-src=\"/images/ads/ad-right.jpg?v=20200501\" alt=\"\" class=\"lazyload\">\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"sidebar-box\">\n");
      out.write("            <h3 class=\"sidebarbox-title\">\n");
      out.write("                <span>Tin tức mới</span>\n");
      out.write("            </h3>\n");
      out.write("            <ul class=\"list_news_recent\">\n");
      out.write("                <li class=\"news_item clearfix\">\n");
      out.write("                    <a href=\"/tin-tuc/nha-thue-tp.hcm-giam-gia-2-3-trieu-dong-thang-p28131.html\">\n");
      out.write("                        <div class=\"news_thumb\">\n");
      out.write("                            <img class=\"lazyload\" src=\"https://img.thuephongtro.com/images/uploads/20200531080439-2fupv.jpg\" data-src=\"https://img.thuephongtro.com/images/uploads/20200531080439-2fupv.jpg\" data-loaded=\"true\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"news_info\">\n");
      out.write("                            <div class=\"news_item_title\">Nhà thuê TP.HCM giảm giá 2-3 triệu đồng/tháng</div>\n");
      out.write("                        </div>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"news_item clearfix\">\n");
      out.write("                    <a href=\"/tin-tuc/top-10-website-dang-tin-cho-thue-phong-tro-nha-tro-hieu-qua-nhat-2020-p28130.html\">\n");
      out.write("                        <div class=\"news_thumb\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"news_info\">\n");
      out.write("                            <div class=\"news_item_title\">Top 10 website đăng tin cho thuê phòng trọ, nhà trọ hiệu quả nhất 2020</div>\n");
      out.write("                        </div>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"news_item clearfix\">\n");
      out.write("                    <a href=\"/tin-tuc/chu-nha-co-phai-chiu-trach-nhiem-khi-nguoi-thue-phong-tro-su-dung-chat-ma-tuy-khong-p28126.html\">\n");
      out.write("                        <div class=\"news_thumb\">\n");
      out.write("                            <img class=\"lazyload\" src=\"https://img.thuephongtro.com/images/uploads/20200309131415-dvtub.jpg\" data-src=\"https://img.thuephongtro.com/images/uploads/20200309131415-dvtub.jpg\" data-loaded=\"true\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"news_info\">\n");
      out.write("                            <div class=\"news_item_title\">Chủ nhà có phải chịu trách nhiệm khi người thuê phòng trọ sử dụng chất ma túy không?</div>\n");
      out.write("                        </div>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"news_item clearfix\">\n");
      out.write("                    <a href=\"/tin-tuc/mau-noi-quy-cho-thue-phong-tro-nha-tro-moi-nhat-2020-p28125.html\">\n");
      out.write("                        <div class=\"news_thumb\">\n");
      out.write("                            <img class=\"lazyload\" src=\"https://img.thuephongtro.com/images/uploads/20200309125312-o0ty2.jpg\" data-src=\"https://img.thuephongtro.com/images/uploads/20200309125312-o0ty2.jpg\" data-loaded=\"true\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"news_info\">\n");
      out.write("                            <div class=\"news_item_title\">Mẫu nội quy cho thuê phòng trọ, nhà trọ mới nhất 2020</div>\n");
      out.write("                        </div>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"news_item clearfix\">\n");
      out.write("                    <a href=\"/tin-tuc/bo-cong-thuong-de-xuat-gia-dien-sinh-hoat-5-bac-p28124.html\">\n");
      out.write("                        <div class=\"news_thumb\">\n");
      out.write("                            <img class=\"lazyload\" src=\"https://img.thuephongtro.com/images/uploads/20200309121311-d4ek3.jpg\" data-src=\"https://img.thuephongtro.com/images/uploads/20200309121311-d4ek3.jpg\" data-loaded=\"true\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"news_info\">\n");
      out.write("                            <div class=\"news_item_title\">Bộ Công thương đề xuất giá điện sinh hoạt 5 bậc</div>\n");
      out.write("                        </div>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"sidebar-box\">\n");
      out.write("            <h3 class=\"sidebarbox-title\">\n");
      out.write("                <span>Có thể bạn quan tâm</span>\n");
      out.write("            </h3>\n");
      out.write("            <div class=\"sidebarbox-body\">\n");
      out.write("                <ul class=\"box-lastnews\">\n");
      out.write("                    <li><a href=\"/kinh-nghiem/kinh-doanh-cho-thue-phong-tro-co-phai-dong-thue-gi-hay-khong-p28129.html\" title=\"{Chia sẻ} Kinh doanh cho thuê phòng trọ có phải đóng thuế gì hay không?\">{Chia sẻ} Kinh doanh cho thuê phòng trọ có phải đóng thuế gì hay không?</a></li>\n");
      out.write("                    <li><a href=\"/kinh-nghiem/nhung-dieu-can-luu-y-trong-viec-quan-ly-nha-tro-p28127.html\" title=\"Những điều cần lưu ý trong việc quản lý nhà trọ\">Những điều cần lưu ý trong việc quản lý nhà trọ</a></li>\n");
      out.write("                    <li><a href=\"/kinh-nghiem/can-than-khi-di-tim-thue-phong-tro-nha-tro-voi-sinh-vien-moi-p28123.html\" title=\"Cẩn thận khi đi tìm thuê phòng trọ, nhà trọ với sinh viên mới\">Cẩn thận khi đi tìm thuê phòng trọ, nhà trọ với sinh viên mới</a></li>\n");
      out.write("                    <li><a href=\"/kinh-nghiem/nhung-dieu-ban-nen-biet-de-bao-dam-quyen-loi-khi-di-thue-phong-tro-p28122.html\" title=\"Những điều bạn nên biết để bảo đảm quyền lợi khi đi thuê phòng trọ\">Những điều bạn nên biết để bảo đảm quyền lợi khi đi thuê phòng trọ</a></li>\n");
      out.write("                    <li><a href=\"/kinh-nghiem/luu-y-3-chieu-tro-lua-dao-cho-thue-phong-tro-nha-tro-gia-re-p28121.html\" title=\"Lưu ý 3 chiêu trò lừa đảo cho thuê phòng trọ, nhà trọ giá rẻ\">Lưu ý 3 chiêu trò lừa đảo cho thuê phòng trọ, nhà trọ giá rẻ</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Footer</title>\n");
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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account!=null && sessionScope.account.role == 'admin'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            <li class=\"nav-item\"> <a class=\"nav-link\" href=\"list\">Danh Sách</a> </li>\n");
        out.write("                            ");
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
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account==null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                        <a class=\"btn btn-primary\" href=\"signup\" role=\"button\">Đăng ký</a>\n");
        out.write("                        <a class=\"btn btn-secondary\" id=\"login\" href=\"login\" role=\"button\">Đăng nhập</a>\n");
        out.write("                    ");
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
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                        <a class=\"nav-link\" href=\"#\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write('(');
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.role}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(")</a>\n");
        out.write("                        <a class=\"btn btn-secondary\" id=\"login\" href=\"logout\" role=\"button\">Log out</a>\n");
        out.write("                    ");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.pros}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("pro");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pro.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pro.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.dists}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("d");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${d.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${d.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.posts}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_2.setVar("p");
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                            <div class=\"row p-2 bg-white border rounded\">\n");
          out.write("                                ");
          if (_jspx_meth_c_set_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
            return true;
          out.write("\n");
          out.write("                                ");
          if (_jspx_meth_c_forEach_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
            return true;
          out.write("\n");
          out.write("\n");
          out.write("                                ");
          if (_jspx_meth_c_if_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
            return true;
          out.write("\n");
          out.write("\n");
          out.write("                                <div class=\"col-md-6 mt-1\">\n");
          out.write("                                    <h5>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h5>\n");
          out.write("                                    <div class=\"d-flex flex-row\">\n");
          out.write("                                        <span>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.area}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" m2</span>\n");
          out.write("                                    </div>\n");
          out.write("                                    <div class=\"mt-1 mb-1 spec-1\"><span><!----></span><span><br></span></div>\n");
          out.write("                                    <div class=\"mt-1 mb-1 spec-1\">\n");
          out.write("                                        <span>\n");
          out.write("                                            ");
          if (_jspx_meth_c_forEach_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
            return true;
          out.write("\n");
          out.write("                                            ");
          if (_jspx_meth_c_forEach_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
            return true;
          out.write("\n");
          out.write("                                        </span>\n");
          out.write("                                    </div>\n");
          out.write("                                    <p class=\"text-justify text-truncate para mb-0\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("<br><br></p>\n");
          out.write("                                </div>\n");
          out.write("                                <div class=\"align-items-center align-content-center col-md-3 border-left mt-1\">\n");
          out.write("                                    <div class=\"d-flex flex-row align-items-center\">\n");
          out.write("                                        <h4 class=\"mr-1\" style=\"color: orangered;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" triệu/Tháng</h4>\n");
          out.write("                                    </div>\n");
          out.write("                                    <div class=\"d-flex flex-column mt-4\"><button class=\"btn btn-outline-success\" type=\"button\" onclick=\"doDetail(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(");\">Xem thông tin</button></div>\n");
          out.write("                                </div>\n");
          out.write("                            </div>\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_set_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_scope_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_2);
    _jspx_th_c_set_0.setVar("count");
    _jspx_th_c_set_0.setValue(new String("0"));
    _jspx_th_c_set_0.setScope("page");
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_3.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_2);
    _jspx_th_c_forEach_3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.images}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_3.setVar("i");
    int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
      if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    ");
          if (_jspx_meth_c_if_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_3, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
            return true;
          out.write("\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_3.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_3);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_3);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.id eq i.id && count<1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        <div class=\"col-md-3 mt-1\" id=\"image\">\n");
        out.write("                                            <img src=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" alt=\"\"/>\n");
        out.write("                                        </div>\n");
        out.write("                                        ");
        if (_jspx_meth_c_set_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_3, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
          return true;
        out.write("\n");
        out.write("                                    ");
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

  private boolean _jspx_meth_c_set_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_scope_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_1.setPageContext(_jspx_page_context);
    _jspx_th_c_set_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_3);
    _jspx_th_c_set_1.setVar("count");
    _jspx_th_c_set_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${count + 1}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_set_1.setScope("page");
    int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
    if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_1);
      return true;
    }
    _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_1);
    return false;
  }

  private boolean _jspx_meth_c_if_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_2);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${count==0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                    <div class=\"col-md-3 mt-1\" id=\"image\">\n");
        out.write("                                        <img src=\"img/0.jpg\" alt=\"\"/>\n");
        out.write("                                    </div>\n");
        out.write("                                ");
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

  private boolean _jspx_meth_c_forEach_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_4 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_4.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_2);
    _jspx_th_c_forEach_4.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.dists}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_4.setVar("d");
    int[] _jspx_push_body_count_c_forEach_4 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_4 = _jspx_th_c_forEach_4.doStartTag();
      if (_jspx_eval_c_forEach_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                ");
          if (_jspx_meth_c_if_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_4, _jspx_page_context, _jspx_push_body_count_c_forEach_4))
            return true;
          out.write("\n");
          out.write("                                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_4.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_4);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_5.setPageContext(_jspx_page_context);
    _jspx_th_c_if_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_4);
    _jspx_th_c_if_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.districtId eq d.id }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
    if (_jspx_eval_c_if_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("Quận ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${d.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
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

  private boolean _jspx_meth_c_forEach_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_5 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_5.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_2);
    _jspx_th_c_forEach_5.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.pros}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_5.setVar("pro");
    int[] _jspx_push_body_count_c_forEach_5 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_5 = _jspx_th_c_forEach_5.doStartTag();
      if (_jspx_eval_c_forEach_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                ");
          if (_jspx_meth_c_if_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_5, _jspx_page_context, _jspx_push_body_count_c_forEach_5))
            return true;
          out.write("\n");
          out.write("                                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_5.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_5[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_5.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_5.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_5);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_6.setPageContext(_jspx_page_context);
    _jspx_th_c_if_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_5);
    _jspx_th_c_if_6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.provinceId eq pro.id }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_6 = _jspx_th_c_if_6.doStartTag();
    if (_jspx_eval_c_if_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(",TP. ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pro.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
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
}
