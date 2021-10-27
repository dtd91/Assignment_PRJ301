<%-- 
    Document   : hoem
    Created on : Oct 20, 2021, 5:58:32 PM
    Author     : PC
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <style>
        .content{
            width: 80%;
            border-radius: 10px;
            background-color: yellow;
        }
        .banner img{
            width: 100%;
            height: 350px;
        }
        .banner img {
            object-fit: cover;         
            object-position: 100% 0; 
            object-position: 0 100%; 
        }

        #image img{
            width: 100%;
            height: 100%;
            object-fit: cover;         
            object-position: 100% 0; 
            object-position: 0 100%; 
        }

        body {
            background: #eee
        }

        .ratings i {
            font-size: 16px;
            color: red
        }

        .strike-text {
            color: red;
            text-decoration: line-through
        }

        .product-image {
            width: 100%
        }

        .dot {
            height: 7px;
            width: 7px;
            margin-left: 6px;
            margin-right: 6px;
            margin-top: 3px;
            background-color: blue;
            border-radius: 50%;
            display: inline-block
        }

        .spec-1 {
            color: #938787;
            font-size: 15px
        }

        h5 {
            font-weight: 400
        }

        .para {
            font-size: 16px
        }
    </style>
    <body>
        <%@include file="header.jsp" %>
        <!--        Banner
                <div class="banner" >
                    <img src="../../img/banner.jpg" alt=""/>
                </div>
                
                <div class="search">
                Tìm kiếm phòng dựa vào quận
                <h3>Đề xuất tìm kiếm</h3>
                </div>
                
                <div>
                    Hiện thông tin các phòng
                    <h3>Phòng mới đăng</h3><div class>
        <c:forEach items="${requestScope.rooms}" var="r">
            <div class="content col-md-10">
                <img>
                <h4>${r.address}</h4>
            ${r.from}<br>
            ${r.to}<br>
            ${r.numberOfTenant}<br>
            ${r.area}<br>
            ${r.address}<br>

        </div>
        </c:forEach>
    </div>-->

        <div class="container mt-5 mb-5">
            <div class="d-flex justify-content-center row">
                <div class="col-md-8">
                    <div class="row p-2 bg-white border rounded">
                        <div class="col-md-3 mt-1" id="image">  
                            <img src="../../img/mo-hinh-can-ho-cao-cap-khuay-dong-thi-truong-bds-lang-son-1.jpg" alt=""/>
                        </div>
                        <div class="col-md-6 mt-1">
                            <h5>Quant olap shirts</h5>
                            <div class="d-flex flex-row">
                                <div class="ratings mr-2"><i class="fa fa-star"></i><i class="fa fa-star"></i><i class="fa fa-star"></i><i class="fa fa-star"></i></div><span>310</span>
                            </div>
                            <div class="mt-1 mb-1 spec-1"><span>100% cotton</span><span class="dot"></span><span>Light weight</span><span class="dot"></span><span>Best finish<br></span></div>
                            <div class="mt-1 mb-1 spec-1"><span>Unique design</span><span class="dot"></span><span>For men</span><span class="dot"></span><span>Casual<br></span></div>
                            <p class="text-justify text-truncate para mb-0">There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even slightly believable.<br><br></p>
                        </div>
                        <div class="align-items-center align-content-center col-md-3 border-left mt-1">
                            <div class="d-flex flex-row align-items-center">
                                <h4 class="mr-1">$13.99</h4>
                            </div>
                            <div class="d-flex flex-column mt-4"><button class="btn btn-primary btn-sm" type="button">Details</button></div>
                        </div>
                    </div>
                    <div class="row p-2 bg-white border rounded mt-2">
                        <div class="col-md-3 mt-1" id="image">
                            <img src="../../img/phong-tro-gia-re-tphcm_1623484658.jpg" alt=""/>
                        </div>
                        <div class="col-md-6 mt-1">
                            <h5>Quant trident shirts</h5>
                            <div class="d-flex flex-row">
                                <div class="ratings mr-2"><i class="fa fa-star"></i><i class="fa fa-star"></i><i class="fa fa-star"></i><i class="fa fa-star"></i></div><span>310</span>
                            </div>
                            <div class="mt-1 mb-1 spec-1"><span>100% cotton</span><span class="dot"></span><span>Light weight</span><span class="dot"></span><span>Best finish<br></span></div>
                            <div class="mt-1 mb-1 spec-1"><span>Unique design</span><span class="dot"></span><span>For men</span><span class="dot"></span><span>Casual<br></span></div>
                            <p class="text-justify text-truncate para mb-0">There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even slightly believable.<br><br></p>
                        </div>
                        <div class="align-items-center align-content-center col-md-3 border-left mt-1">
                            <div class="d-flex flex-row align-items-center">
                                <h4 class="mr-1">$14.99</h4>
                            </div>
                            <div class="d-flex flex-column mt-4"><button class="btn btn-primary btn-sm" type="button">Details</button></div>
                        </div>
                    </div>
                    
                    <c:forEach items="${requestScope.rooms}" var="r">
                        <div class="row p-2 bg-white border rounded">
                            <div class="col-md-3 mt-1" id="image">  
                                <img src="../../img/mo-hinh-can-ho-cao-cap-khuay-dong-thi-truong-bds-lang-son-1.jpg" alt=""/>
                            </div>
                            <div class="col-md-6 mt-1">
                                <h5>${r.type_id} ${r.address}</h5>
                                <div class="d-flex flex-row">
                                    <div class="ratings mr-2"><i class="fa fa-star"></i><i class="fa fa-star"></i><i class="fa fa-star"></i><i class="fa fa-star"></i></div><span>310</span>
                                </div>
                                <div class="mt-1 mb-1 spec-1"><span>${r.from}</span><span class="dot"></span><span>${r.to}</span><span class="dot"></span><span>${r.numberOfTenant}<br></span></div>
                                <div class="mt-1 mb-1 spec-1"><span>Unique design</span><span class="dot"></span><span>${r.area}</span><span class="dot"></span><span>${r.deposit}<br></span></div>
                                <p class="text-justify text-truncate para mb-0">${r.address}<br><br></p>
                            </div>
                            <div class="align-items-center align-content-center col-md-3 border-left mt-1">
                                <div class="d-flex flex-row align-items-center">
                                    <h4 class="mr-1">${r.price}</h4>
                                </div>
                                <div class="d-flex flex-column mt-4"><button class="btn btn-primary btn-sm" type="button">Details</button></div>
                            </div>
                        </div>
                    </c:forEach>

                </div>
            </div>
        </div>


        <%@include file="footer.jsp" %>
    </body>
</html>
