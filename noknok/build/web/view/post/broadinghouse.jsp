




<%-- 
    Document   : réident
    Created on : Oct 25, 2021, 7:41:27 PM
    Author     : PC
--%>
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

        <div class="col-md-10 container mt-5 mb-5">
            <div class=" d-flex justify-content-center row">
                <h3 class="page_title">Cho thuê phòng trọ trọ giá rẻ mới nhất 2021</h3>
                <p class="page_description" style="border-bottom: 1px solid #cccccc ;padding-bottom: 10px;">Cho thuê phòng trọ, tìm nhà trọ giá rẻ, không chung chủ, an ninh và nhiều tiện nghi mới nhất tại Việt Nam. Đăng tin cho thuê phòng trọ nhanh chóng và hiệu quả cao.</p>
                <div class="col-md-12" style="display: flex;">
                    <div class="col-md-8">
                        <c:forEach items="${requestScope.posts}" var="p">
                            <c:if test="${p.categoryId eq 1}">
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
                                            <h4 class="mr-1" style="color: red; font-size: 20px; text-align: center;">${p.price} triệu/Tháng</h4>
                                        </div>
                                        <div class="d-flex flex-column mt-4"><button class="btn btn-outline-success" type="button" onclick="doDetail(${p.id});">Xem thông tin</button></div>
                                    </div>
                                </div>
                            </c:if>
                        </c:forEach>
                    </div>
                    <div class="col-md-4">
                        <form action="search">
                            <input type="hidden" name="pageName" value="1">
                        <div style="background-color: #333333;"  class="box-search">
                            <h3 class="text-center" style="color: white">Tìm kiếm nhanh</h3>
                            <div class="bs-content">
                                <div class="d-flex justify-content-center row">
                                    <div class="col-xs-12 col-sm-6 col-md-11" id="searchbox">
                                        <select id="ddlPostCate" name="CategoryId" class="form-control select2-hidden-accessible" tabindex="-1" aria-hidden="true">
                                            <option value="1" selected="selected">--Cho thuê phòng trọ--</option>
                                        </select>
                                    </div>
                                    <div class="col-xs-12 col-sm-6 col-md-11" id="searchbox">
                                        <select id="ddlProvince" name="ProvinceId" class="form-control select2-hidden-accessible" tabindex="-1" aria-hidden="true">
                                            <option value="0">Tỉnh thành</option>
                                            <!--<option value="SG">Hồ Chí Minh</option><option value="HN">Hà Nội</option><option value="DDN">Đà Nẵng</option><option value="BD">Bình Dương</option><option value="DNA">Đồng Nai</option><option value="KH">Khánh Hòa</option><option value="HP">Hải Phòng</option><option value="LA">Long An</option><option value="QNA">Quảng Nam</option><option value="VT">Bà Rịa Vũng Tàu</option><option value="DDL">Đắk Lắk</option><option value="CT">Cần Thơ</option><option value="BTH">Bình Thuận  </option><option value="LDD">Lâm Đồng</option><option value="TTH">Thừa Thiên Huế</option><option value="KG">Kiên Giang</option><option value="BN">Bắc Ninh</option><option value="QNI">Quảng Ninh</option><option value="TH">Thanh Hóa</option><option value="NA">Nghệ An</option><option value="HD">Hải Dương</option><option value="GL">Gia Lai</option><option value="BP">Bình Phước</option><option value="HY">Hưng Yên</option><option value="BDD">Bình Định</option><option value="TG">Tiền Giang</option><option value="TB">Thái Bình</option><option value="BG">Bắc Giang</option><option value="HB">Hòa Bình</option><option value="AG">An Giang</option><option value="VP">Vĩnh Phúc</option><option value="TNI">Tây Ninh</option><option value="TN">Thái Nguyên</option><option value="LCA">Lào Cai</option><option value="NDD">Nam Định</option><option value="QNG">Quảng Ngãi</option><option value="BTR">Bến Tre</option><option value="DNO">Đắk Nông</option><option value="CM">Cà Mau</option><option value="VL">Vĩnh Long</option><option value="NB">Ninh Bình</option><option value="PT">Phú Thọ</option><option value="NT">Ninh Thuận</option><option value="PY">Phú Yên</option><option value="HNA">Hà Nam</option><option value="HT">Hà Tĩnh</option><option value="DDT">Đồng Tháp</option><option value="ST">Sóc Trăng</option><option value="KT">Kon Tum</option><option value="QB">Quảng Bình</option><option value="QT">Quảng Trị</option><option value="TV">Trà Vinh</option><option value="HGI">Hậu Giang</option><option value="SL">Sơn La</option><option value="BL">Bạc Liêu</option><option value="YB">Yên Bái</option><option value="TQ">Tuyên Quang</option><option value="DDB">Điện Biên</option><option value="LCH">Lai Châu</option><option value="LS">Lạng Sơn</option><option value="HG">Hà Giang</option><option value="BK">Bắc Kạn</option><option value="CB">Cao Bằng</option></select>-->
                                            <c:forEach items="${requestScope.pros}" var="pro">
                                                <option 
                                                    <c:if test="${requestScope.provinceId eq pro.id}">
                                                        selected="selected"
                                                    </c:if>
                                                    value="${pro.id}">${pro.name}</option>
                                            </c:forEach>
                                        </select>
                                    </div>
                                    <div class="col-xs-12 col-sm-6 col-md-11" id="searchbox">
                                        <select id="ddlDistrict" name="DistrictId" class="form-control select2-hidden-accessible" tabindex="-1" aria-hidden="true">
                                            <option value="0">Quận huyện</option>
                                            <c:forEach items="${requestScope.dists}" var="d">
                                                <option 
                                                    <c:if test="${requestScope.districtId eq d.id}">
                                                        selected="selected"
                                                    </c:if>
                                                    value="${d.id}">${d.name}</option>
                                            </c:forEach>    
                                        </select>
                                    </div>
                                    <div class="col-xs-12 col-sm-6 col-md-11" id="searchbox">
                                        <select id="ddlPrice" name="PriceId" style="width:100%" class="form-control">
                                            <option value="-1">Mức giá</option>
                                            <option value="0">Thỏa thuận</option>
                                            <option <c:if test="${requestScope.priceId eq '1'}">selected="selected"</c:if> value="1">Dưới 1 triệu</option>
                                            <option <c:if test="${requestScope.priceId eq '2'}">selected="selected"</c:if> value="2">1 triệu - 2 triệu</option>
                                            <option <c:if test="${requestScope.priceId eq '3'}">selected="selected"</c:if> value="3">2 triệu - 3 triệu</option>
                                            <option <c:if test="${requestScope.priceId eq '4'}">selected="selected"</c:if> value="4">3 triệu - 5 triệu</option>
                                            <option <c:if test="${requestScope.priceId eq '5'}">selected="selected"</c:if> value="5">5 triệu - 7 triệu</option>
                                            <option <c:if test="${requestScope.priceId eq '6'}">selected="selected"</c:if> value="6">7 triệu - 10 triệu</option>
                                            <option <c:if test="${requestScope.priceId eq '7'}">selected="selected"</c:if> value="7">10 triệu - 15 triệu</option>
                                            <option <c:if test="${requestScope.priceId eq '8'}">selected="selected"</c:if> value="8">15 triệu - 20 triệu</option>
                                            <option <c:if test="${requestScope.priceId eq '9'}">selected="selected"</c:if> value="9">Trên 20 triệu</option>
                                            </select>
                                        </div>
                                        <div class="col-xs-12 col-sm-6 col-md-11">
                                            <select id="ddlArea" name="AreaId" style="width:100%" class="form-control">
                                                <option  value="-1">Diện tích</option>
                                                <option value="0">Chưa xác định</option>
                                                <option <c:if test="${requestScope.areaId eq '1'}">selected="selected"</c:if> value="1">Dưới 20 m2</option>
                                            <option <c:if test="${requestScope.areaId eq '2'}">selected="selected"</c:if> value="2">20 - 30 m2</option>
                                            <option <c:if test="${requestScope.areaId eq '3'}">selected="selected"</c:if> value="3">30 - 50 m2</option>
                                            <option <c:if test="${requestScope.areaId eq '4'}">selected="selected"</c:if> value="4">50 - 60 m2</option>
                                            <option <c:if test="${requestScope.areaId eq '5'}">selected="selected"</c:if> value="5">60 - 70 m2</option>
                                            <option <c:if test="${requestScope.areaId eq '6'}">selected="selected"</c:if> value="6">70 - 80 m2</option>
                                            <option <c:if test="${requestScope.areaId eq '7'}">selected="selected"</c:if> value="7">80 - 90 m2</option>
                                            <option <c:if test="${requestScope.areaId eq '8'}">selected="selected"</c:if> value="8">90 - 100 m2</option>
                                            <option <c:if test="${requestScope.areaId eq '9'}">selected="selected"</c:if> value="9">Trên 100 m2</option>
                                            </select>
                                        </div>
                                    </div>
                                </div>
                                <br>
                                <div class="d-flex justify-content-center row">
                                    <div class="col-md-4"><input style="border-radius: 20px; padding: 10px" type="submit"class="btn btn-warning btn-block" name="btnSearch" value="Tìm Kiếm">
                                    </div>
                                </div>
                                <br>
                            </div>
                            <br>
                            <div class="panel-body">
                                <h2 class="title">Cho thuê phòng trọ</h2>
                                <ul>
                                    <li><a title="Cho thuê phòng trọ Hồ Chí Minh" href="search?method=post&provinceid=79" >Cho thuê phòng trọ Hồ Chí Minh</a></li>
                                    <li><a title="Cho thuê phòng trọ Hà Nội" href="/cho-thue-phong-tro-ha-noi">Cho thuê phòng trọ Hà Nội</a></li>
                                    <li><a title="Cho thuê phòng trọ Đà Nẵng" href="/cho-thue-phong-tro-da-nang">Cho thuê phòng trọ Đà Nẵng</a></li>
                                    <li><a title="Cho thuê phòng trọ Đồng Nai" href="/cho-thue-phong-tro-dong-nai">Cho thuê phòng trọ Đồng Nai</a></li>
                                    <li><a title="Cho thuê phòng trọ Bình Dương" href="/cho-thue-phong-tro-binh-duong">Cho thuê phòng trọ Bình Dương</a></li>
                                    <li><a title="Cho thuê phòng trọ Bà Rịa Vũng Tàu" href="/cho-thue-phong-tro-ba-ria-vung-tau">Cho thuê phòng trọ Bà Rịa Vũng Tàu</a></li>
                                    <li><a title="Cho thuê phòng trọ Cần Thơ" href="/cho-thue-phong-tro-can-tho">Cho thuê phòng trọ Cần Thơ</a></li>
                                    <li><a title="Cho thuê phòng trọ Hải Phòng" href="/cho-thue-phong-tro-hai-phong">Cho thuê phòng trọ Hải Phòng</a></li>
                                    <li><a title="Cho thuê phòng trọ Thừa Thiên Huế" href="/cho-thue-phong-tro-thua-thien-hue">Cho thuê phòng trọ Thừa Thiên Huế</a></li>
                                </ul>
                            </div></form>
                        </div>
                    </div>
                </div>
            </div>

        <%@include file="footer.jsp" %>

        <style>
            #searchbox{
                padding-bottom: 10px;
            }
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
            .panel-body li a{
                color: black;
                text-decoration: none;
                font-size: large;
            }
            .panel-body li a:hover{
                color: green;
            }
            .panel-body li:hover{
                text-decoration: underline;
                background-color: whitesmoke;
            }
            .panel-body li{
                border-bottom: 1px dashed black; 
                padding: 10px;
                list-style: none;
            }
            .panel-body h2{
                font-size: 30px;
            }
        </style>
    </body>
</html>

