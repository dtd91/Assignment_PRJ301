<%-- 
    Document   : list
    Created on : Oct 20, 2021, 5:51:41 PM
    Author     : PC
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <script>
        function upLoad(id)
        {
            window.location.href = "update?id=" + id;
        }
        function doDelete(id)
        {
            var c = confirm("are you sure?");
            if (c)
            {
                window.location.href = "delete?id=" + id;
            }
        }

    </script>
    <body>
        <%@include file="header.jsp" %>

        <div class="main">
            <div class="container-fluid mt-3 mb-5">
                <div class="row">
                    <ul class="nav nav-tabs  justify-content-center">
                        <li class="nav-item" id="cate">
                            <a class="nav-link ${requestScope.t ne true ?"active":""}" href="list">Chờ duyệt</a>
                        </li>
                        <li class="nav-item" id="cate">
                            <a class="nav-link ${requestScope.t eq true ?"active":""}" href="list?t=true">Tất cả</a>
                        </li>
                    </ul>
                </div>
            </div>
        </div>

        <!--<h1>Danh sách cho thuê nhà</h1>-->
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
                    <!--                <td>ContactName</td>
                                    <td>ContactPhone</td>
                                    <td>ContactEmail</td>-->
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
                        <!--<td>${p.contactName}</td>-->
                        <!--<td>${p.contactPhone}</td>-->
                        <!--<td>${p.contactEmail}</td>-->
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
        </table>
        <%@include file="footer.jsp" %>

    </body>
</html>
