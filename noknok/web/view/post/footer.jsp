<%-- 
    Document   : footer
    Created on : Jun 8, 2021, 8:21:27 PM
    Author     : laptop
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Footer</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin="anonymous"></script>
        <style>
            .site-footer
            {
                background-color:#000;
                padding:45px 0 20px;
                font-size:15px;
                line-height:24px;
                color:#737373;
            }
            .site-footer hr
            {
                border-top-color:#bbb;
                opacity:0.5
            }
            .site-footer hr.small
            {
                margin:20px 0
            }
            .site-footer h6
            {
                color:#fff;
                font-size:16px;
                text-transform:uppercase;
                margin-top:5px;
                letter-spacing:2px
            }
            .site-footer a
            {
                color:gray;
            }
            .site-footer a:hover
            {
                color:#3366cc;
                text-decoration:none;
            }
            .footer-links
            {
                padding-left:0;
                list-style:none
            }
            .footer-links li
            {
                display:block;
            }
            .footer-links a
            {
                text-decoration: none;
                color:#737373
            }
            .footer-links a:active,.footer-links a:focus,.footer-links a:hover
            {
                color:#3366cc;
                text-decoration:none;
            }
            .footer-links.inline li
            {
                display:inline-block
            }
            .site-footer .social-icons
            {
                text-align:right
            }
            .site-footer .social-icons a
            {
                width:40px;
                height:40px;
                line-height:40px;
                margin-left:6px;
                margin-right:0;
                border-radius:100%;
                background-color:#33353d
            }
            .copyright-text
            {
                margin:0
            }
            @media (max-width:991px)
            {
                .site-footer [class^=col-]
                {
                    margin-bottom:30px
                }
            }
            @media (max-width:767px)
            {
                .site-footer
                {
                    padding-bottom:0
                }
                .site-footer .copyright-text,.site-footer .social-icons
                {
                    text-align:center
                }
            }
            .social-icons
            {
                padding-left:0;
                margin-bottom:0;
                list-style:none
            }
            .social-icons li
            {
                display:inline-block;
                margin-bottom:4px
            }
            .social-icons li.title
            {
                margin-right:15px;
                text-transform:uppercase;
                color:#96a2b2;
                font-weight:700;
                font-size:13px
            }
            .social-icons a{
                background-color:#eceeef;
                color:#818a91;
                font-size:16px;
                display:inline-block;
                line-height:44px;
                width:44px;
                height:44px;
                text-align:center;
                margin-right:8px;
                border-radius:100%;
                -webkit-transition:all .2s linear;
                -o-transition:all .2s linear;
                transition:all .2s linear
            }
            .social-icons a:active,.social-icons a:focus,.social-icons a:hover
            {
                color:#fff;
                background-color:#29aafe
            }
            .social-icons.size-sm a
            {
                line-height:34px;
                height:34px;
                width:34px;
                font-size:14px
            }
            .social-icons a.facebook:hover
            {
                background-color:#3b5998
            }
            .social-icons a.twitter:hover
            {
                background-color:#00aced
            }
            .social-icons a.linkedin:hover
            {
                background-color:#007bb6
            }
            .social-icons a.dribbble:hover
            {
                background-color:#ea4c89
            }
            @media (max-width:767px)
            {
                .social-icons li.title
                {
                    display:block;
                    margin-right:0;
                    font-weight:600
                }
            }
        </style>
    </head>
    <body>
        <!-- Site footer -->
        <footer class="site-footer">
            <div class="container">
                <div class="row">
                    <div class="col-sm-12 col-md-5">
                        <h6>Công ty TNHH Noknok</h6>
                        <p class="text-justify">
                            Hotline: 038 3333 672 Email: datdthe151528@gmail.com<br>
                            Cs: Số 48 Ngõ 89 Lương Đình Của, Phương Mai, Đống Đa, Hà Nội
                        </p>
                    </div>

                    <div class="col-xs-6 col-md-3">
                        <h6>Hỗ trợ</h6>
                        <ul class="footer-links">
                            <li><a href="#">Trung tâm trợ giúp</a></li>
                            <li><a href="#">Liên hệ hỗ trợ</a></li>
                            <li><a href="#">Quy định đăng tin</a></li>

                        </ul>
                    </div>

                    <div class="col-xs-6 col-md-4">
                        <h6>Về chúng tôi</h6>
                        <p>Trang web hỗ trợ chia sẻ thông tin miễn phí về phòng trọ, nhà riêng, văn phòng giúp người tìm và người cho thuê tương tác với nhau không qua trung gian môi giới.</p>
                        
                    </div>
                </div>
                <hr>
            </div>
            <div class="container">
                <div class="row">

                    <div class="col-md-12 col-sm-6 col-xs-12">
                        <ul class="social-icons" style="float: right">
                            <li><a class="facebook" href="https://www.facebook.com/datdat910/" target="_blank"><i class="fab fa-facebook-f"></i></a></li>
                            <li><a class="instagram" href="https://www.instagram.com/dtd91___/" target="_blank"><i class="fab fa-instagram"></i></a></li>
                        </ul>
                    </div>

                </div>
            </div>
        </footer>
    </body>
</html>
