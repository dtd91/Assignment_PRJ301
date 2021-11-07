<%-- 
    Document   : list
    Created on : Oct 20, 2021, 5:51:41 PM
    Author     : PC
--%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <style>
        .img-responsive{
            width: 80px;
            height: 95px;
        }
    </style>
    <script>
        function doDelete(id) {
            var c = confirm("Are you sure?");
            if (c) {
                window.location.href = "delete?id=" + id + "&address=list";
            }
        }
        function approved(id) {
            alert("Approved successfully!");
            window.location.href = "approve?id=" + id;
        }

    </script>
    <body>
        <%@include file="header.jsp" %>

        <div class="main">
            <div class="container-fluid mt-3 mb-5">
                <div class="row">
                    <ul class="nav nav-tabs  justify-content-center">
                        <li class="nav-item" id="cate">
                            <a class="nav-link ${requestScope.t ne true ?"active":""}" style="color: black;font-weight: bold;" href="list">Chờ duyệt</a>
                        </li>
                        <li class="nav-item" id="cate">
                            <a class="nav-link ${requestScope.t eq true ?"active":""}" style="color: black;font-weight: bold;" href="list?t=true">Đã duyệt</a>
                        </li>
                    </ul>
                </div>
            </div>
        </div>

        <!--//////////////////////////////////-->
        <div class="d-flex justify-content-center row">
            <div class="col-md-10 table-responsive" >
                <table class="table table-striped text-center" style="border: 1px solid black">
                    <thead>
                        <tr class="">
                            <th scope="col">ID</th>
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
                            <c:if test="${p.status eq t}">
                                <tr>
                                    <td>${p.id}</td>
                                    <td>
                                        <c:choose>
                                            <c:when test = "${p.image[0].url ne null}">
                                                <img class="img-responsive" src="${p.image[0].url}" />
                                            </c:when>
                                            <c:when test = "${p.image[0].url eq null}">
                                                <img class="img-responsive" src="img/0.jpg" />
                                            </c:when>
                                        </c:choose>
                                    </td>
                                    <td class="text-left" ><a href="detail?id=${p.id}" style="text-decoration: none;color: black"><span style="font-weight: 500">${p.title}</span></a></td>
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

                                    <td class="text-right"><a href="#"><c:if test="${p.status eq false}"><button class="btn btn-sm btn-success" onclick="approved(${p.id})">Approved </button> </c:if></a></td>

                                        <td class="text-right"><a href="#"><button class="btn btn-sm btn-danger" onclick="doDelete(${p.id})">Xóa tin </button> </a></td>
                                </tr>
                            </c:if>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>


        <%@include file="footer.jsp" %>

    </body>
</html>
