




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
        <title>JSP Page</title>
        <link href="css/content.css" rel="stylesheet" type="text/css"/>

    </head>
    <body>
        <%@include file="header.jsp" %>

        <div class="container mt-5 mb-5">
            <div class="d-flex justify-content-center row">
                <div class="col-md-8">
                    <c:forEach items="${requestScope.posts}" var="p">
                        <c:if test="${p.categoryId eq 4}">
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
                        </c:if>
                    </c:forEach>
                </div>
            </div> 
        </div> 

        <%@include file="footer.jsp" %>
    </body>
</html>
