<%-- 
    Document   : hoem
    Created on : Oct 20, 2021, 5:58:32 PM
    Author     : PC
--%>

<%@page import="java.text.DecimalFormat"%>
<%@page import="java.text.NumberFormat"%>
<%@page import="java.util.Locale"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <link href="css/content.css" rel="stylesheet" type="text/css"/>
    <script>
        function doDetail(id)
        {
            window.location.href = "detail?id=" + id;
        }
    </script>
    <body>
        <%@include file="header.jsp" %>
        <div class="container">
            <img style="width: 100%" src="img/banner.jpg" alt=""/>
            <div class="center"><h1>Tìm kiếm nhà trọ có noknok</h1></div>
        </div>  
        <div class="container mt-5 mb-5">
            <div class="d-flex justify-content-center row">
                <div class="col-md-12">
                    <!--SEARCHING-->
                    <form action="#" method="POST">
                        <div style="background-color: #333333;"  class="box-search">
                            <h3 class="text-center" style="color: white">Tìm kiếm nhanh</h3>
                            <div class="bs-content">
                                <div class="d-flex justify-content-center row">
                                    <div class="col-xs-12 col-sm-6 col-md-2" name="searchbox">
                                        <select id="ddlPostCate" name="CategoryId" class="form-control select2-hidden-accessible" tabindex="-1" aria-hidden="true">
                                            <option value="0">Loại tin</option>
                                            <option value="1">Cho thuê phòng trọ</option><option value="2">Cho thuê căn hộ</option><option value="3">Cho thuê nhà nguyên căn</option><option value="4">Tìm người ở ghép</option></select>
                                    </div>
                                    <div class="col-xs-12 col-sm-6 col-md-2" id="searchbox">
                                        <select id="ddlProvince" name="ProvinceId" class="form-control select2-hidden-accessible" tabindex="-1" aria-hidden="true">
                                            <option value="">Tỉnh thành</option>
                                            <!--<option value="SG">Hồ Chí Minh</option><option value="HN">Hà Nội</option><option value="DDN">Đà Nẵng</option><option value="BD">Bình Dương</option><option value="DNA">Đồng Nai</option><option value="KH">Khánh Hòa</option><option value="HP">Hải Phòng</option><option value="LA">Long An</option><option value="QNA">Quảng Nam</option><option value="VT">Bà Rịa Vũng Tàu</option><option value="DDL">Đắk Lắk</option><option value="CT">Cần Thơ</option><option value="BTH">Bình Thuận  </option><option value="LDD">Lâm Đồng</option><option value="TTH">Thừa Thiên Huế</option><option value="KG">Kiên Giang</option><option value="BN">Bắc Ninh</option><option value="QNI">Quảng Ninh</option><option value="TH">Thanh Hóa</option><option value="NA">Nghệ An</option><option value="HD">Hải Dương</option><option value="GL">Gia Lai</option><option value="BP">Bình Phước</option><option value="HY">Hưng Yên</option><option value="BDD">Bình Định</option><option value="TG">Tiền Giang</option><option value="TB">Thái Bình</option><option value="BG">Bắc Giang</option><option value="HB">Hòa Bình</option><option value="AG">An Giang</option><option value="VP">Vĩnh Phúc</option><option value="TNI">Tây Ninh</option><option value="TN">Thái Nguyên</option><option value="LCA">Lào Cai</option><option value="NDD">Nam Định</option><option value="QNG">Quảng Ngãi</option><option value="BTR">Bến Tre</option><option value="DNO">Đắk Nông</option><option value="CM">Cà Mau</option><option value="VL">Vĩnh Long</option><option value="NB">Ninh Bình</option><option value="PT">Phú Thọ</option><option value="NT">Ninh Thuận</option><option value="PY">Phú Yên</option><option value="HNA">Hà Nam</option><option value="HT">Hà Tĩnh</option><option value="DDT">Đồng Tháp</option><option value="ST">Sóc Trăng</option><option value="KT">Kon Tum</option><option value="QB">Quảng Bình</option><option value="QT">Quảng Trị</option><option value="TV">Trà Vinh</option><option value="HGI">Hậu Giang</option><option value="SL">Sơn La</option><option value="BL">Bạc Liêu</option><option value="YB">Yên Bái</option><option value="TQ">Tuyên Quang</option><option value="DDB">Điện Biên</option><option value="LCH">Lai Châu</option><option value="LS">Lạng Sơn</option><option value="HG">Hà Giang</option><option value="BK">Bắc Kạn</option><option value="CB">Cao Bằng</option></select>-->
                                            <c:forEach items="${requestScope.pros}" var="pro">
                                                <option value="${pro.id}">${pro.name}</option>
                                            </c:forEach>
                                        </select>
                                    </div>
                                    <div class="col-xs-12 col-sm-6 col-md-2" id="searchbox">
                                        <select id="ddlDistrict" name="DistrictId" class="form-control select2-hidden-accessible" tabindex="-1" aria-hidden="true">
                                            <option value="0">Quận huyện</option>
                                            <c:forEach items="${requestScope.dists}" var="d">
                                                <option value="${d.id}">${d.name}</option>
                                            </c:forEach>    
                                        </select>
                                    </div>
                                    <div class="col-xs-12 col-sm-6 col-md-2" id="searchbox">
                                        <select id="ddlPrice" name="PriceId" style="width:100%" class="form-control">
                                            <option value="-1">Mức giá</option>
                                            <option value="0">Thỏa thuận</option>
                                            <option value="1">Dưới 1 triệu</option>
                                            <option value="2">1 triệu - 2 triệu</option>
                                            <option value="3">2 triệu - 3 triệu</option>
                                            <option value="4">3 triệu - 5 triệu</option>
                                            <option value="5">5 triệu - 7 triệu</option>
                                            <option value="6">7 triệu - 10 triệu</option>
                                            <option value="7">10 triệu - 15 triệu</option>
                                            <option value="8">15 triệu - 20 triệu</option>
                                            <option value="9">Trên 20 triệu</option>
                                        </select>
                                    </div>
                                    <div class="col-xs-12 col-sm-6 col-md-2">
                                        <select id="ddlArea" name="AreaId" style="width:100%" class="form-control">
                                            <option value="-1">Diện tích</option>
                                            <option value="0">Chưa xác định</option>
                                            <option value="1">Dưới 20 m2</option>
                                            <option value="2">20 - 30 m2</option>
                                            <option value="3">30 - 50 m2</option>
                                            <option value="4">50 - 60 m2</option>
                                            <option value="5">60 - 70 m2</option>
                                            <option value="6">70 - 80 m2</option>
                                            <option value="7">80 - 90 m2</option>
                                            <option value="8">90 - 100 m2</option>
                                            <option value="9">Trên 100 m2</option>
                                        </select>
                                    </div>
                                </div>
                            </div>
                            <br>
                            <div class="d-flex justify-content-center row">
                                <div class="col-md-2"><input style="border-radius: 20px; padding: 10px" type="submit"class="btn btn-warning btn-block" name="btnSearch" value="Tìm Kiếm">
                                </div>
                            </div>
                            <br>
                        </div>
                    </form>
                    <br>

                    <div class="col-md-8">
                        <c:forEach items="${requestScope.posts}" var="p">
                            <div class="row p-2 bg-white border rounded">
                                <c:set var="count" value="0" scope="page" />
                                <c:forEach items="${requestScope.images}" var="i">
                                    <c:if test="${p.id eq i.id && count<1}">
                                        <div class="col-md-3 mt-1" id="image">
                                            <img src="${i.url}" alt=""/>
                                        </div>
                                        <c:set var="count" value="${count + 1}" scope="page" />
                                    </c:if>
                                </c:forEach>

                                <c:if test="${count==0}">
                                    <div class="col-md-3 mt-1" id="image">
                                        <img src="img/0.jpg" alt=""/>
                                    </div>
                                </c:if>

                                <div class="col-md-6 mt-1">
                                    <h5>${p.title}</h5>
                                    <div class="d-flex flex-row">
                                        <span>${p.area} m2</span>
                                    </div>
                                    <div class="mt-1 mb-1 spec-1"><span><!----></span><span><br></span></div>
                                    <div class="mt-1 mb-1 spec-1">
                                        <span>
                                            <c:forEach items="${requestScope.dists}" var="d">
                                                <c:if test="${p.districtId eq d.id }">Quận ${d.name}</c:if>
                                            </c:forEach>
                                            <c:forEach items="${requestScope.pros}" var="pro">
                                                <c:if test="${p.provinceId eq pro.id }">,TP. ${pro.name}</c:if>
                                            </c:forEach>
                                        </span>
                                    </div>
                                    <p class="text-justify text-truncate para mb-0">${p.description}<br><br></p>
                                </div>
                                <div class="align-items-center align-content-center col-md-3 border-left mt-1">
                                    <div class="d-flex flex-row align-items-center">
                                        <h4 class="mr-1" style="color: orangered;">${p.price} triệu/Tháng</h4>
                                    </div>
                                    <div class="d-flex flex-column mt-4"><button class="btn btn-outline-success" type="button" onclick="doDetail(${p.id});">Xem thông tin</button></div>
                                </div>
                            </div>
                        </c:forEach>
                    </div>
                </div>
            </div> 
        </div> 
        
        <!--NEWS-->
        <div class="col-xs-12 col-md-4">
        <div class="sidebar-box">
            <h3 class="sidebarbox-title">
                <span>Danh mục cho thuê</span>
            </h3>
            <div class="sidebarbox-body">
                <ul class="box-lastnews">
                    <li><a title="Cho thuê phòng trọ Hồ Chí Minh" href="/cho-thue-phong-tro-ho-chi-minh">Cho thuê phòng trọ Hồ Chí Minh</a></li>
                    <li><a title="Cho thuê phòng trọ Hà Nội" href="/cho-thue-phong-tro-ha-noi">Cho thuê phòng trọ Hà Nội</a></li>
                    <li><a title="Cho thuê phòng trọ Đà Nẵng" href="/cho-thue-phong-tro-da-nang">Cho thuê phòng trọ Đà Nẵng</a></li>
                    <li><a title="Cho thuê phòng trọ Đồng Nai" href="/cho-thue-phong-tro-dong-nai">Cho thuê phòng trọ Đồng Nai</a></li>
                    <li><a title="Cho thuê phòng trọ Bình Dương" href="/cho-thue-phong-tro-binh-duong">Cho thuê phòng trọ Bình Dương</a></li>
                    <li><a title="Cho thuê phòng trọ Bà Rịa Vũng Tàu" href="/cho-thue-phong-tro-ba-ria-vung-tau">Cho thuê phòng trọ Bà Rịa Vũng Tàu</a></li>
                    <li><a title="Cho thuê phòng trọ Cần Thơ" href="/cho-thue-phong-tro-can-tho">Cho thuê phòng trọ Cần Thơ</a></li>
                    <li><a title="Cho thuê phòng trọ Hải Phòng" href="/cho-thue-phong-tro-hai-phong">Cho thuê phòng trọ Hải Phòng</a></li>
                    <li><a title="Cho thuê phòng trọ Thừa Thiên Huế" href="/cho-thue-phong-tro-thua-thien-hue">Cho thuê phòng trọ Thừa Thiên Huế</a></li>
                </ul>
            </div>
        </div>
        <div class="mgb-15">
            <img src="/images/ads/ad-right.jpg?v=20200501" data-src="/images/ads/ad-right.jpg?v=20200501" alt="" class="lazyload">
        </div>

        <div class="sidebar-box">
            <h3 class="sidebarbox-title">
                <span>Tin tức mới</span>
            </h3>
            <ul class="list_news_recent">
                <li class="news_item clearfix">
                    <a href="/tin-tuc/nha-thue-tp.hcm-giam-gia-2-3-trieu-dong-thang-p28131.html">
                        <div class="news_thumb">
                            <img class="lazyload" src="https://img.thuephongtro.com/images/uploads/20200531080439-2fupv.jpg" data-src="https://img.thuephongtro.com/images/uploads/20200531080439-2fupv.jpg" data-loaded="true">
                        </div>
                        <div class="news_info">
                            <div class="news_item_title">Nhà thuê TP.HCM giảm giá 2-3 triệu đồng/tháng</div>
                        </div>
                    </a>
                </li>
                <li class="news_item clearfix">
                    <a href="/tin-tuc/top-10-website-dang-tin-cho-thue-phong-tro-nha-tro-hieu-qua-nhat-2020-p28130.html">
                        <div class="news_thumb">
                        </div>
                        <div class="news_info">
                            <div class="news_item_title">Top 10 website đăng tin cho thuê phòng trọ, nhà trọ hiệu quả nhất 2020</div>
                        </div>
                    </a>
                </li>
                <li class="news_item clearfix">
                    <a href="/tin-tuc/chu-nha-co-phai-chiu-trach-nhiem-khi-nguoi-thue-phong-tro-su-dung-chat-ma-tuy-khong-p28126.html">
                        <div class="news_thumb">
                            <img class="lazyload" src="https://img.thuephongtro.com/images/uploads/20200309131415-dvtub.jpg" data-src="https://img.thuephongtro.com/images/uploads/20200309131415-dvtub.jpg" data-loaded="true">
                        </div>
                        <div class="news_info">
                            <div class="news_item_title">Chủ nhà có phải chịu trách nhiệm khi người thuê phòng trọ sử dụng chất ma túy không?</div>
                        </div>
                    </a>
                </li>
                <li class="news_item clearfix">
                    <a href="/tin-tuc/mau-noi-quy-cho-thue-phong-tro-nha-tro-moi-nhat-2020-p28125.html">
                        <div class="news_thumb">
                            <img class="lazyload" src="https://img.thuephongtro.com/images/uploads/20200309125312-o0ty2.jpg" data-src="https://img.thuephongtro.com/images/uploads/20200309125312-o0ty2.jpg" data-loaded="true">
                        </div>
                        <div class="news_info">
                            <div class="news_item_title">Mẫu nội quy cho thuê phòng trọ, nhà trọ mới nhất 2020</div>
                        </div>
                    </a>
                </li>
                <li class="news_item clearfix">
                    <a href="/tin-tuc/bo-cong-thuong-de-xuat-gia-dien-sinh-hoat-5-bac-p28124.html">
                        <div class="news_thumb">
                            <img class="lazyload" src="https://img.thuephongtro.com/images/uploads/20200309121311-d4ek3.jpg" data-src="https://img.thuephongtro.com/images/uploads/20200309121311-d4ek3.jpg" data-loaded="true">
                        </div>
                        <div class="news_info">
                            <div class="news_item_title">Bộ Công thương đề xuất giá điện sinh hoạt 5 bậc</div>
                        </div>
                    </a>
                </li>
            </ul>
        </div>

        <div class="sidebar-box">
            <h3 class="sidebarbox-title">
                <span>Có thể bạn quan tâm</span>
            </h3>
            <div class="sidebarbox-body">
                <ul class="box-lastnews">
                    <li><a href="/kinh-nghiem/kinh-doanh-cho-thue-phong-tro-co-phai-dong-thue-gi-hay-khong-p28129.html" title="{Chia sẻ} Kinh doanh cho thuê phòng trọ có phải đóng thuế gì hay không?">{Chia sẻ} Kinh doanh cho thuê phòng trọ có phải đóng thuế gì hay không?</a></li>
                    <li><a href="/kinh-nghiem/nhung-dieu-can-luu-y-trong-viec-quan-ly-nha-tro-p28127.html" title="Những điều cần lưu ý trong việc quản lý nhà trọ">Những điều cần lưu ý trong việc quản lý nhà trọ</a></li>
                    <li><a href="/kinh-nghiem/can-than-khi-di-tim-thue-phong-tro-nha-tro-voi-sinh-vien-moi-p28123.html" title="Cẩn thận khi đi tìm thuê phòng trọ, nhà trọ với sinh viên mới">Cẩn thận khi đi tìm thuê phòng trọ, nhà trọ với sinh viên mới</a></li>
                    <li><a href="/kinh-nghiem/nhung-dieu-ban-nen-biet-de-bao-dam-quyen-loi-khi-di-thue-phong-tro-p28122.html" title="Những điều bạn nên biết để bảo đảm quyền lợi khi đi thuê phòng trọ">Những điều bạn nên biết để bảo đảm quyền lợi khi đi thuê phòng trọ</a></li>
                    <li><a href="/kinh-nghiem/luu-y-3-chieu-tro-lua-dao-cho-thue-phong-tro-nha-tro-gia-re-p28121.html" title="Lưu ý 3 chiêu trò lừa đảo cho thuê phòng trọ, nhà trọ giá rẻ">Lưu ý 3 chiêu trò lừa đảo cho thuê phòng trọ, nhà trọ giá rẻ</a></li>
                </ul>
            </div>
        </div>
    </div>

        <%@include file="footer.jsp" %>
    </body>
</html>
