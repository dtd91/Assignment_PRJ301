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
        function doDelete(id){
            var c = confirm("Are you sure?");
            if (c){
                window.location.href = "delete?id=" + id;
            }
        }
        function approved(id){
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

<!--        <h1>Danh sách cho thuê nhà</h1>
        <table border = "2">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Title</th>
                    <th>Address</th>
                    <th>Wardname</th>
                    <th>Districtname</th>
                    <th>Provincename</th>
                    <th>Area</th>
                    <th>Price</th>
                    <th>Status</th>
                    <th>Category</th>
                                    <td>ContactName</td>
                                    <td>ContactPhone</td>
                                    <td>ContactEmail</td>
                    <th>Status</th>
                    <th></th>
                </tr>
            </thead>

            <c:forEach items="${requestScope.posts}" var="p">
                <c:if test="${p.status eq t}">
                    <tr>
                        <td>${p.id}</td>    
                        <td>${p.title}</td>
                        <td>${p.address}</td>
                        <td>
                            <c:forEach items="${requestScope.wards}" var="w">
                                <c:if test="${p.wardId eq w.id }">${w.name}</c:if>
                            </c:forEach>
                        </td>
                        <td>
                            <c:forEach items="${requestScope.dists}" var="d">
                                <c:if test="${p.districtId eq d.id }">Quận ${d.name}</c:if>
                            </c:forEach>
                        </td>
                        <td>
                            <c:forEach items="${requestScope.pros}" var="pro">
                                <c:if test="${p.provinceId eq pro.id}">TP. ${pro.name}</c:if>
                            </c:forEach>
                        </td>
                        <td>${p.area}</td>
                        <td>${p.price}</td>
                        <td>${p.status}</td>
                        <td>
                            <c:forEach items="${requestScope.categories}" var="c">
                                <c:if test="${p.categoryId eq c.categoryid }">${c.cname}</c:if>
                            </c:forEach>
                        </td>
                        <td>${p.contactName}</td>
                        <td>${p.contactPhone}</td>
                        <td>${p.contactEmail}</td>
                        <td>
                            <c:if test="${p.status eq false}">
                                Pending
                            </c:if>
                            <c:if test="${p.status eq true}">
                                Approve
                            </c:if>

                        </td>
                        <td>
                            <input type="button" onclick="upLoad(${p.id});" value="Agree"/>
                        </td>
                        <td>
                            <input type="button" onclick="doDelete(${p.id});" value="Delete"/>
                        </td>
                    </tr>
                </c:if>
            </c:forEach>
        </table>-->

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
