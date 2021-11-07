<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>${post.title}</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
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
                <div class="text-center" style="width: 1100px;background-color: #999999;">
                    <c:if test="${post.image[0].url eq null }">
                        <img src="img/0.jpg" width="500px" alt=""/>
                    </c:if>
                    <img src="${post.image[0].url}" width="800px" alt=""/>
                </div>
                <br>
                <div class="col-md-9"><br>
                    <h3 class="post-title-lg title-lg-vip5">
                        ${fn:toUpperCase(requestScope.post.title)}
                    </h3>


                    <div id="DIV_1">
                        <div id="DIV_2">
                            <div id="DIV_3">
                                <div id="DIV_8">
                                    Địa chỉ:
                                </div>
                                <div id="DIV_5">
                                    ${requestScope.post.address}
                                </div>
                            </div>
                        </div>
                        <div id="DIV_6">
                            <div id="DIV_7">
                                <div id="DIV_8">
                                    Chuyên mục:
                                </div>
                                <div id="DIV_9">
                                    <a 
                                       <c:choose>
                                           <c:when test = "${post.categoryId eq 1}">
                                               href="broadinghouse"
                                           </c:when>
                                           <c:when test = "${post.categoryId eq 2}">
                                               href="apartment"
                                           </c:when>
                                           <c:when test = "${post.categoryId eq 3}">
                                               href="house"
                                           </c:when>
                                           <c:when test = "${post.categoryId eq 4}">
                                               href="resident"
                                           </c:when>
                                       </c:choose>

                                       style="font: bold; text-decoration: none;">
                                        <c:forEach items="${category}" var="c">
                                            <c:if test="${post.categoryId eq c.categoryid}">
                                                ${c.cname}
                                            </c:if>
                                        </c:forEach>
                                    </a>
                                </div>
                            </div>
                            <div id="DIV_7">
                                <div id="DIV_8">
                                    Mã tin:
                                </div>
                                <div id="DIV_9">
                                    ${post.id}
                                </div>
                            </div>
                        </div>
                        <div id="DIV_6">
                            <div id="DIV_7">
                                <div id="DIV_8">
                                    Giá cho thuê:
                                </div>
                                <div id="DIV_9">
                                    <span style="font-weight: bold;color: #f3051b;"> ${post.price} Triệu/tháng </span>
                                </div>
                            </div>
                            <div id="DIV_7">
                                <div id="DIV_8">
                                    Diện tích:
                                </div>
                                <div id="DIV_9">
                                    <span style="font-weight: bold;color: #f3051b;"> ${post.area} m²</span>
                                </div>
                            </div>
                        </div>
                        <div id="DIV_6">
                            <div id="DIV_7">
                                <div id="DIV_8">
                                    Liên hệ:
                                </div>
                                <div id="DIV_9">
                                    ${post.contactName}
                                </div>
                            </div>
                            <div id="DIV_7">
                                <div id="DIV_8">
                                    Điện thoại:
                                </div>
                                <div id="DIV_9">
                                    <span style="font-weight: bold;color: #4cae4c;"> 0${post.contactPhone}</span>
                                </div>
                            </div>
                        </div>
                    </div>

                    <h4 style="color: #555;">Thông tin chi tiết</h4><hr>
                    ${requestScope.post.description}<br>
                    <br>
                    <div class="col-md-6">
                        ${map.map}
                    </div>
                    <hr>
                    <a class="btn btn-primary" id="login" href="home" role="button">Back</a>

                </div>
            </div>

        </div>
        <%@include file="footer.jsp" %>
        <style>
            #DIV_1 {
                block-size: 300px;
                box-sizing: border-box;
                height: 204px;
                perspective-origin: 381.5px 102px;
                transform-origin: 381.5px 102px;
                width: 100% ;

            }/*#DIV_1*/

            #DIV_2, #DIV_6{
                block-size: 41px;
                box-sizing: border-box;
                height: 41px;
                transform-origin: 381.5px 20.5px;
                width: 763px;
                border-bottom: 1px solid rgb(232, 232, 232);

            }/*#DIV_2, #DIV_6, #DIV_15, #DIV_22*/

            #DIV_2:after, #DIV_6:after{
                block-size: 0px;
                box-sizing: border-box;
                clear: both;

                display: table;
                height: 0px;
                perspective-origin: 0px 0px;
                transform-origin: 0px 0px;
                width: 0px;

            }

            #DIV_2:before, #DIV_6:before{
                block-size: 0px;
                box-sizing: border-box;

                display: table;
                height: 0px;
                perspective-origin: 0px 0px;
                transform-origin: 0px 0px;
                width: 0px;

            }/*#DIV_2:before, #DIV_6:before, #DIV_15:before, #DIV_22:before*/

            #DIV_3 {
                block-size: 40px;
                box-sizing: border-box;
                float: left;
                height: 40px;
                perspective-origin: 381.5px 20px;
                transform-origin: 381.5px 20px;
                width: 763px;
                background: rgb(249, 249, 249) none repeat scroll 0% 0% / auto padding-box border-box;
            }/*#DIV_3*/

            #DIV_4, #DIV_8{
                block-size: 40px;
                box-sizing: border-box;
                float: left;
                height: 40px;
                perspective-origin: 65px 20px;
                transform-origin: 65px 20px;
                width: 130px;
                background: rgb(249, 249, 249) none repeat scroll 0% 0% / auto padding-box border-box;
                padding: 10px;
            }/*#DIV_4, #DIV_8, #DIV_13, #DIV_17, #DIV_20, #DIV_24, #DIV_27, #DIV_31, #DIV_37*/

            #DIV_5 {
                block-size: 40px;
                box-sizing: border-box;
                height: 40px;
                min-height: 40px;
                text-overflow: ellipsis;
                transform-origin: 316.5px 20px;
                white-space: nowrap;
                width: 633px;
                background: rgb(255, 255, 255) none repeat scroll 0% 0% / auto padding-box border-box;
                margin: 0px 0px 0px 130px;
                overflow: hidden;
                padding: 10px;
            }/*#DIV_5*/
            #DIV_7{
                block-size: 40px;
                box-sizing: border-box;
                float: left;
                height: 40px;
                perspective-origin: 190.75px 20px;
                transform-origin: 190.75px 20px;
                width: 381.5px;
                background: rgb(249, 249, 249) none repeat scroll 0% 0% / auto padding-box border-box;
            }

            #DIV_9{
                block-size: 40px;
                box-sizing: border-box;
                height: 40px;
                min-height: 40px;

                perspective-origin: 125.75px 20px;
                text-overflow: ellipsis;

                transform-origin: 125.75px 20px;
                white-space: nowrap;
                width: 251.5px;
                background: rgb(255, 255, 255) none repeat scroll 0% 0% / auto padding-box border-box;
                margin: 0px 0px 0px 130px;
                overflow: hidden;
                padding: 10px;
            }
            #DIV_8{
                font-weight: bold;
            }

            #H2_10 {
                block-size: 18.4px;
                box-sizing: border-box;
                height: 18.4px;



                perspective-origin: 115.75px 9.2px;

                transform-origin: 115.75px 9.2px;
                white-space: nowrap;
                width: 231.5px;
                margin: 0px;
            }

        </style>
    </body>
</html>
