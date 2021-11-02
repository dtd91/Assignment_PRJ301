<%-- 
    Document   : mypost
    Created on : Nov 2, 2021, 9:55:53 AM
    Author     : PC
--%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">

        <!-- jQuery library -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

        <!-- Popper JS -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>

        <!-- Latest compiled JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
        <style>
            .img-responsive{
                width: 80px;
                height: 95px;
            }
        </style>
    </head>
    <body>
        <%@include file="header.jsp" %>

        <div class="d-flex justify-content-center row">
            <div class="col-md-10 table-responsive" >
                <table class="table table-striped text-center" style="border: 1px solid black">
                    <thead>
                        <tr class="">
                            <th scope="col">Image</th>
                            <th scope="col">Title</th>
                            <th scope="col">District</th>
                            <th scope="col">Province</th>
                            <th scope="col">Area</th>
                            <th scope="col">Category</th>
                            <th scope="col">Status</th>
                            <th></th>
                            <th></th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${requestScope.posts}" var="p">
                            <tr>
                                <td><c:set var="count" value="0" scope="page" />
                                    <c:forEach items="${images}" var="i">
                                        <c:if test="${i.id eq p.id && count eq 0}">
                                            <img class="img-responsive" src="${i.url}" />
                                            <c:set var="count" value="1" scope="page" />
                                        </c:if>
                                    </c:forEach>
                                </td>
                                <td class="text-left"><a href="detail?id=${p.id}" style="text-decoration: none;color: black">${p.title}</a></td>
                                <td><c:forEach items="${dists}" var="d">
                                        <c:if test="${d.id eq p.districtId}">${d.name}</c:if>
                                    </c:forEach></td>
                                <td><c:forEach items="${pros}" var="pro">
                                        <c:if test="${pro.id eq p.provinceId}">${pro.name}</c:if>
                                    </c:forEach></td>
                                <td><fmt:formatNumber type="number" maxFractionDigits="6" value="${p.area}"/></td>
                                <td><c:choose>
                                        <c:when test = "${p.categoryId eq 1}">Cho thuê phòng trọ</c:when>
                                        <c:when test = "${p.categoryId eq 2}">Cho thuê căn hộ</c:when>
                                        <c:when test = "${p.categoryId eq 3}">Nhà nguyên căn</c:when>
                                        <c:when test = "${p.categoryId eq 4}">Tìm người ở ghép</c:when>
                                        <c:otherwise></c:otherwise>
                                    </c:choose></td>
                                <td><c:choose>
                                        <c:when test = "${p.status eq true}">Approved <img src="img/approved.jpg" width="20px" alt=""/></c:when>
                                        <c:when test = "${p.status eq false}">Pending...<img src="img/pending.jpg" width="20px" alt=""/> </c:when>

                                        <c:otherwise></c:otherwise>
                                    </c:choose></td>
                                <td class="text-right"><a href="#"><button class="btn btn-sm btn-warning">Sửa tin </button> </a></td>
                                <td class="text-right"><a href="#"><button class="btn btn-sm btn-danger">Xóa tin </button> </a></td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>

        <%@include file="footer.jsp" %>

    </body>
</html>
