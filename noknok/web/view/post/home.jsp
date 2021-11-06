<%-- 
    Document   : hoem
    Created on : Oct 20, 2021, 5:58:32 PM
    Author     : PC
--%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page import="java.text.DecimalFormat"%>
<%@page import="java.text.NumberFormat"%>
<%@page import="java.util.Locale"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>NokNok</title>
        <link href="css/content.css" rel="stylesheet" type="text/css"/>
    </head>
    <script>
        function doDetail(id)
        {
            window.location.href = "detail?id=" + id;
        }
    </script>
    <body>
        <%@include file="header.jsp" %>
        
        <div class="container">
            <img style="width: 100%;" src="img/banner3.jpg" alt=""/>
            <div class="center" style="color: white;"><h1>Tìm kiếm nhà trọ có noknok</h1></div>
        </div> 
        <div class="col-md-10 container mt-5 mb-5">
            <div class=" d-flex justify-content-center row">
                <div class="col-md-12">
                    <h1 class="page_title" style="font-size: 30px;">Tìm nhà trọ nhanh chóng và dễ dàng hơn với noknok</h1>
                    <p class="page_description" style="border-bottom: 1px solid #cccccc; margin-bottom: 25px;">Website đăng tin cho thuê phòng trọ, thuê căn hộ, thuê nhà nguyên căn, hiệu quả cao với hơn 3.000.000 lượt truy cập mỗi tháng, cùng tốc độ tải trang cực nhanh.</p>
                    <!--SEARCHING-->
                    <%@include file="searchbar.jsp" %>
                    <br>
                </div>
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
                                <h5><a onclick="doDetail(${p.id});">${p.title}</a> </h5>
                                <div class="d-flex flex-row">
                                    <span><fmt:formatNumber type="number" maxFractionDigits="6" value="${p.area}"/> m2</span>
                                </div>
                                <div class="mt-1 mb-1 spec-1"><span><!----></span><span><br></span></div>
                                <div class="mt-1 mb-1 spec-1" style="color: #888888;">
                                    <span>
                                        <c:forEach items="${requestScope.dists}" var="d">
                                            <c:if test="${p.districtId eq d.id }">Quận <span style="font-weight: bold;">${d.name}</span></c:if>
                                        </c:forEach>
                                        <c:forEach items="${requestScope.pros}" var="pro">
                                            <c:if test="${p.provinceId eq pro.id }">,TP. <span style="font-weight: bold;">${pro.name}</span></c:if>
                                        </c:forEach>
                                    </span>
                                </div>
                                <p class="text-justify text-truncate para mb-0">${p.description}<br><br></p>
                            </div>
                            <div class="align-items-center align-content-center col-md-3 border-left mt-1">
                                <div class="d-flex flex-row align-items-center">
                                    <h4 class="mr-1" style="color: red; font-size: 20px; text-align: center;"><fmt:formatNumber type="number" maxFractionDigits="6" value="${p.price}"/> triệu/Tháng</h4>
                                </div>
                                <div class="d-flex flex-column mt-4"><button class="btn btn-outline-success" type="button" onclick="doDetail(${p.id});">Xem thông tin</button></div>
                            </div>
                        </div>
                    </c:forEach><br>
                    <!--                    PAGING-->
                    <nav aria-label="..." style="float: right;">
                        <ul  class="pagination">
                            <li class="page-item <c:if test="${pageindex eq 1}">disabled</c:if>">
                                <a class="page-link" href="home?page=${pageindex-1}" tabindex="1">Previous</a>
                            </li>
                            <c:forEach var="x" begin="1" end="${totalpage}">
                                <li class="page-item <c:if test="${x eq pageindex}">active</c:if>"><a class="page-link" href="home?page=${x}">${x}</a></li>
                            </c:forEach>

                            <!--<li class="page-item <c:if test="${pageindex eq 2}">active</c:if>"><a class="page-link" href="home?page=2">2</a></li>-->
                            <!--<li class="page-item <c:if test="${pageindex eq 3}">active</c:if>"><a class="page-link" href="home?page=3">3</a></li>-->
                            <li class="page-item <c:if test="${pageindex eq totalpage}">disabled</c:if>">
                                <a class="page-link" href="home?page=${pageindex+1}" tabindex="3">Next</a>
                            </li>
                        </ul>
                    </nav>
                </div>
                <div class="col-md-4">
                    <div class="sidebar-box">
                        <h3 class="sidebarbox-title">
                            <span>Danh mục cho thuê</span>
                        </h3>
                        <div class="sidebarbox-body">
                            <ul class="box-lastnews" style="list-style: none">
                                <li><a title="Cho thuê phòng trọ Hồ Chí Minh" href="/noknok/home">Cho thuê phòng trọ Hồ Chí Minh</a></li>
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
                        <!--<img src="/images/ads/ad-right.jpg?v=20200501" data-src="/images/ads/ad-right.jpg?v=20200501" alt="" class="lazyload">-->
                    </div>

                    <div class="sidebar-box">
                        <h3 class="sidebarbox-title">
                            <span>Tin tức mới</span>
                        </h3>
                        <ul class="list_news_recent" style="list-style: none;">
                            <li class="news_item clearfix">
                                <a href="/tin-tuc/nha-thue-tp.hcm-giam-gia-2-3-trieu-dong-thang-p28131.html" style="text-decoration: none;">
                                    <div class="news_thumb">
                                        <img class="lazyload" src="https://img.thuephongtro.com/images/uploads/20200531080439-2fupv.jpg" data-src="https://img.thuephongtro.com/images/uploads/20200531080439-2fupv.jpg" data-loaded="true">
                                    </div>
                                    <div class="news_info">
                                        <div class="news_item_title" >Nhà thuê TP.HCM giảm giá 2-3 triệu đồng/tháng</div>
                                    </div>
                                </a>
                            </li>
                            <li class="news_item clearfix">
                                <a href="/tin-tuc/top-10-website-dang-tin-cho-thue-phong-tro-nha-tro-hieu-qua-nhat-2020-p28130.html" style="text-decoration: none;">
                                    <div class="news_thumb">
                                        <img class="lazyload" src="https://img.thuephongtro.com/images/uploads/20200309135926-xinj2.jpg" data-src="https://img.thuephongtro.com/images/uploads/20200309135926-xinj2.jpg" data-loaded="true">
                                    </div>
                                    <div class="news_info">
                                        <div class="news_item_title">Top 10 website đăng tin cho thuê phòng trọ, nhà trọ hiệu quả nhất 2020</div>
                                    </div>
                                </a>
                            </li>
                            <li class="news_item clearfix">
                                <a href="/tin-tuc/chu-nha-co-phai-chiu-trach-nhiem-khi-nguoi-thue-phong-tro-su-dung-chat-ma-tuy-khong-p28126.html" style="text-decoration: none;">
                                    <div class="news_thumb">
                                        <img class="lazyload" src="https://img.thuephongtro.com/images/uploads/20200309131415-dvtub.jpg" data-src="https://img.thuephongtro.com/images/uploads/20200309131415-dvtub.jpg" data-loaded="true">
                                    </div>
                                    <div class="news_info">
                                        <div class="news_item_title">Chủ nhà có phải chịu trách nhiệm khi người thuê phòng trọ sử dụng chất ma túy không?</div>
                                    </div>
                                </a>
                            </li>
                            <li class="news_item clearfix">
                                <a href="/tin-tuc/mau-noi-quy-cho-thue-phong-tro-nha-tro-moi-nhat-2020-p28125.html" style="text-decoration: none;">
                                    <div class="news_thumb">
                                        <img class="lazyload" src="https://img.thuephongtro.com/images/uploads/20200309125312-o0ty2.jpg" data-src="https://img.thuephongtro.com/images/uploads/20200309125312-o0ty2.jpg" data-loaded="true">
                                    </div>
                                    <div class="news_info">
                                        <div class="news_item_title">Mẫu nội quy cho thuê phòng trọ, nhà trọ mới nhất 2020</div>
                                    </div>
                                </a>
                            </li>
                            <li class="news_item clearfix">
                                <a href="/tin-tuc/bo-cong-thuong-de-xuat-gia-dien-sinh-hoat-5-bac-p28124.html" style="text-decoration: none;"> 
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
                        <div class="sidebarbox-body" >
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
            </div>
        </div> 


        <style>


            .news_thumb{
                display: flex;
            }
            .news_thumb img{
                width: 150px;
                height: 100px;

            }
            .news_thumb{
                float: left;

            }
            .news_item_title{
                color: black;
                text-decoration: none;
                margin-left: 15px;
            }
            .news_info{
                padding-left: 150px;
            }
            .news_item{
                padding: 10px;
                border-bottom: 1px dashed black;
            }
            .news_item:last-of-type{
                border-bottom: none;
            }
            .box-lastnews li a{
                color: black;
                text-decoration: none;
            }
            .box-lastnews li{
                border-bottom: 1px dashed black; 
                padding: 10px;
            }
            .box-lastnews li:hover{
                text-decoration: underline;
                background-color: whitesmoke;
            }
            .box-lastnews li a:hover{
                color: green;
            }
        </style>
        <!--NEWS-->

        <%@include file="footer.jsp" %>
    </body>
</html>
