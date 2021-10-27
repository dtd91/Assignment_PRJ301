<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Detail</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    </head>
    <style>
        #login{
            margin-left: 5px;
            margin-right: 10px;
        }
    </style>
    <body>
        <%@include file="header.jsp" %>

        <div class="container mt-5 mb-5">
            <div class="d-flex justify-content-center row">
                <div class="col-md-10">
                    <img src="img/2.jpg" alt=""/>
                    <h1 class="post-title-lg title-lg-vip5">
                        ${requestScope.post.title}
                    </h1>
                    <span style="font-weight:bold;">Địa chỉ: </span>${requestScope.post.address}<br>
                    <span style="font-weight:bold;">Chi tiết: </span>${requestScope.post.description}<br>
                    <span style="font-weight:bold;">Diện tích: </span>${requestScope.post.area}<br>
                    <span style="font-weight:bold;">Giá cả: </span>${requestScope.post.price}<br>
                    <span style="font-weight:bold;">Liên hệ: </span>${requestScope.post.contactName} - 0${requestScope.post.contactPhone} - ${requestScope.post.contactEmail} - ${requestScope.post.contactAddress}<br>
                    <a class="btn btn-primary" id="login" href="home" role="button">Back</a>
                </div>
            </div>

        </div>
        <%@include file="footer.jsp" %>

    </body>
</html>
