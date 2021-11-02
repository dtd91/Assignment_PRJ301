<%-- 
    Document   : searchbar
    Created on : Oct 27, 2021, 10:37:21 PM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="search">
            <input type="hidden" name="pageName" value="0">
            <div class="col-md-12">
                <div class="searchbox" style="background-color: #333333;"  class="box-search">
                    <h3 class="text-center" style="color: white">Tìm kiếm nhanh</h3>
                    <div class="bs-content">
                        <div class="d-flex justify-content-center row">
                            <div class="col-xs-12 col-sm-6 col-md-2" name="searchbox">
                                <select id="ddlPostCate" name="CategoryId" class="form-control select2-hidden-accessible" tabindex="-1" aria-hidden="true">
                                    <option value="0">--Loại tin--</option>
                                    <option value="1">Cho thuê phòng trọ</option><option value="2">Cho thuê căn hộ</option><option value="3">Cho thuê nhà nguyên căn</option><option value="4">Tìm người ở ghép</option></select>
                            </div>
                            <div class="col-xs-12 col-sm-6 col-md-2" id="searchbox">
                                <select id="ddlProvince" name="ProvinceId" class="form-control select2-hidden-accessible" tabindex="-1" aria-hidden="true">
                                    <option value="0">--Tỉnh thành--</option>
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
                        <div class="col-xs-12 col-sm-6 col-md-2" id="searchbox">
                            <select id="ddlDistrict" name="DistrictId" class="form-control select2-hidden-accessible" tabindex="-1" aria-hidden="true">
                                <option value="0">--Quận huyện--</option>
                                <c:forEach items="${requestScope.dists}" var="d">
                                    <option 
                                <c:if test="${requestScope.districtId eq d.id}">
                                    selected="selected"
                                </c:if>
                                value="${d.id}">${d.name}</option>
                            </c:forEach>    
                        </select>
                    </div>
                    <div class="col-xs-12 col-sm-6 col-md-2" id="searchbox">
                        <select id="ddlPrice" name="PriceId" style="width:100%" class="form-control">
                            <option value="-1">--Mức giá--</option>
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
                    <div class="col-xs-12 col-sm-6 col-md-2">
                        <select id="ddlArea" name="AreaId" style="width:100%" class="form-control">
                            <option  value="-1">--Diện tích--</option>
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
                <div class="col-md-2"><input style="border-radius: 50px; padding: 5px" type="submit"class="btn btn-warning btn-block" name="btnSearch" value="Tìm Kiếm">
                </div>
            </div>
            <br>
        </div>
    </div>
    <style>
        .searchbox{
            padding-top: 20px;
            border-radius: 20px; 
        }
    </style>
</form>
</body>
</html>
