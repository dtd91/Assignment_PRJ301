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
        function doUpdate(id)
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

        <h1>Danh sách cho thuê nhà</h1>
        <table border = "1px">
            <tr>
                <td>ID</td>
                <td>Title</td>
                <td>Description</td>
                <td>Address</td>
                <td>Wardname</td>
                <td>Districtname</td>
                <td>Provincename</td>
                <td>Area</td>
                <td>Price</td>
                <td>Status</td>
                <td>Category</td>
                <td>ContactName</td>
                <td>ContactPhone</td>
                <td>ContactEmail</td>
                <td>ContactAddress</td>
                <td></td>
                <td></td>
            </tr>
            <c:forEach items="${requestScope.posts}" var="p">
                <tr>
                    <td>${p.id}</td>
                    <td>${p.title}</td>
                    <td>${p.description}</td>
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
                    <td>${p.contactAddress}</td>
                    <td>
                        <input type="button" onclick="doUpdate(${p.id});" value="Update"/>
                    </td>
                    <td>
                        <input type="button" onclick="doDelete(${p.id});" value="Delete"/>
                    </td>
                </tr>
            </c:forEach>
        </table>
        <%@include file="footer.jsp" %>

    </body>
</html>
