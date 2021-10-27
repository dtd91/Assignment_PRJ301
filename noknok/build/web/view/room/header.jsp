<%-- 
    Document   : header
    Created on : Jun 8, 2021, 8:24:46 PM
    Author     : laptop
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Header</title>
        <style>


            .bg-black {
                background-color: #000
            }

            #logo {
                width: 30px;
                height: 30px;
                border-radius: 4px
            }

            .navbar-brand {
                padding: 14px 20px;
                font-size: 16px
            }

            .navbar-nav {
                width: 100%
            }

            .nav-item {
                padding: 6px 14px;
                text-align: center
            }

            .nav-link {
                padding-bottom: 10px
            }

            .v-line {
                background-color: gray;
                width: 1px;
                height: 20px
            }

            .navbar-collapse.collapse.in {
                display: block !important
            }

            @media (max-width: 576px) {
                .nav-item {
                    width: 100%;
                    text-align: left
                }

                .v-line {
                    display: none
                }
            }

            #login{
                margin-left: 5px;
                margin-right: 10px;
            }
        </style>
    </head>
    <body>
        <div class="container-fluid px-0">
            <nav class="navbar navbar-expand-sm navbar-dark bg-black py-0 px-0"> <a class="navbar-brand" href="home"><img id="logo" src="https://i.imgur.com/K7Nwq4V.jpg"> noknok</a> <span class="v-line"></span> 
                <button class="navbar-toggler mr-3" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation"> <span class="navbar-toggler-icon"></span> </button>
                <div class="collapse navbar-collapse" id="navbarNav">
                    <ul class="navbar-nav">
                        <li class="nav-item active"> <a class="nav-link" href="home">Trang chủ</a> </li>
                        <li class="nav-item"> <a class="nav-link" href="#">Blog</a> </li>
                        <li class="nav-item"> <a class="nav-link" href="#">Ở ghép</a> </li>
                        <li class="nav-item"> <a class="nav-link" href="#">Đăng Phòng</a> </li>
                    </ul>
                    <c:if test="${sessionScope.account==null}" >
                        <a class="btn btn-primary" href="signup" role="button">Đăng ký</a>
                        <a class="btn btn-secondary" id="login" href="login" role="button">Đăng nhập</a>
                    </c:if>
                    <c:if test="${sessionScope.account!=null}" >
                        <<a class="nav-link" href="#">${sessionScope.account.username}</a>
                        <a class="btn btn-secondary" id="login" href="logout" role="button">Log out</a>
                    </c:if>
                </div>
            </nav>
        </div>
    </body>
</html>
