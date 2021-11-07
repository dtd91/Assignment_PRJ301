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

        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
        <style>
            .img-responsive{
                width: 80px;
                height: 95px;
            }
        </style>
    </head>
    <body>
        <%@include file="header.jsp" %>
        <br><br>
        <div class="d-flex justify-content-center row">
            <div class="col-md-10 table-responsive" >
                <!--KIEM TRA DA CO TIN DANG CHUA-->
                <c:if test="${posts[0].id eq null}">
                    <h1>Bạn chưa có tin đăng trên noknok</h1>
                </c:if>


                <!--NEU CO THI HIEN BANG-->
                <c:if test="${requestScope.posts[0].id ne null}">
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
                                    <td><c:choose>
                                            <c:when test = "${p.image[0].url ne null}">
                                                <img class="img-responsive" src="${p.image[0].url}" />
                                            </c:when>
                                            <c:when test = "${p.image[0].url eq null}">
                                                <img class="img-responsive" src="img/0.jpg" />
                                            </c:when>
                                        </c:choose>
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
                                    <td>
                                        <a href="#editPost" class="edit" data-toggle="modal" 
                                           data-id="${p.id}" 
                                           data-title="${p.title}"
                                           data-categoryId="${p.categoryId}"
                                           data-area="${p.area}"
                                           data-price="${p.price}"
                                           data-wardId="${p.wardId}"
                                           data-districtId="${p.districtId}"
                                           data-provinceId="${p.provinceId}"
                                           data-address="${p.address}"
                                           data-description="${p.description}"
                                           data-contactname="${p.contactName}"
                                           data-contactphone="0${p.contactPhone}"
                                           data-contactemail="${p.contactEmail}"
                                           data-contactaddress="${p.contactAddress}"
                                           data-image="${p.image}">
                                            <button class="btn btn-sm btn-warning">Sửa tin </button></a>
                                    </td>
                                    <td class="text-right"><a href="#"><button class="btn btn-sm btn-danger" onclick="doDelete(${p.id})">Xóa tin </button> </a></td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </c:if>
            </div>
        </div>
        <br><br>

        <div id="editPost" class="modal fade">
            <div class="modal-dialog modal-lg">
                <div class="modal-content">
                    <form action="update" method="post" style="padding: 40px">
                        <div class="modal-header">						
                            <h3 class="modal_title">Thông tin cơ bản</h3>
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        </div>
                        <div class="modal-body">
                            <div class="form-group">
                                <label>ID</label>
                                <input name="id" id="id" type="text" class="form-control" readonly>
                            </div>
                            <div class="form-group">
                                <label>Tiêu đề tin</label>
                                <input name="title"  id="title" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Chuyên mục</label>
                                <select class="form-control" id="CategoryId" name="CategoryId" data-val="true" data-val-required="Vui lòng chọn chuyên mục"><option value="1">Cho thuê phòng trọ</option><option value="2">Cho thuê căn hộ</option><option value="3">Cho thuê nhà nguyên căn</option><option value="4">Tìm người ở ghép</option></select>
                            </div>
                            <div class="form-group">
                                <label>Diện tích</label>
                                <input name="area" id="area" type="text" class="form-control" required>
                            </div>	
                            <div class="form-group">
                                <label>Giá cho thuê</label>
                                <input name="price" id="price" type="text" class="form-control" required>
                            </div>
                            <div class="form-group">
                                <label>Tỉnh/Thành</label>
                                <select id="ProvinceId" name="ProvinceId" required="required" class="select2 select2-hidden-accessible" style="width:100%" data-val="true" data-val-required="Vui lòng chọn tỉnh thành" tabindex="-1" aria-hidden="true">
                                    <option value="">-- Tỉnh/thành --</option>
                                    <c:forEach items="${requestScope.pros}" var="pro">
                                        <option  value="${pro.id}">${pro.name}</option>
                                    </c:forEach>
                                    <span class="field-validation-valid text-danger" data-valmsg-for="ProvinceId" data-valmsg-replace="true"></span>
                                </select>
                            </div>
                            <div class="form-group">
                                <label>Quận/Huyện</label>
                                <select id="DistrictId" name="DistrictId" required="required" class="select2 select2-hidden-accessible" style="width:100%" data-val="true" data-val-required="Vui lòng chọn quận huyện" tabindex="-1" aria-hidden="true">
                                    <option value="">-- Quận/huyện --</option>
                                    <c:forEach items="${requestScope.dists}" var="d">
                                        <option value="${d.id}">${d.name}</option>
                                    </c:forEach>
                                </select>
                            </div>
                            <div class="form-group">
                                <label>Phường/Xã</label>
                                <select id="WardId" name="WardId" required="required" style="width:100%" class="select2 select2-hidden-accessible" tabindex="-1" aria-hidden="true">
                                    <option value="">-- Phường/xã --</option>
                                    <c:forEach items="${requestScope.wards}" var="w">
                                        <option value="${w.id}" >${w.name}</option>
                                    </c:forEach>
                                </select>
                            </div>
                            <div class="form-group">
                                <label>Địa chỉ</label>
                                <input name="address" id="address" type="text" class="form-control" required>
                            </div>
                            <h3 class="form_title">Thông tin mô tả</h3>
                            <div class="form-group">
                                <label>Nội dung</label>
                                <textarea class="form-control edtior-noidung" cols="20" class="form-control" data-val="true" data-val-required="Vui lòng nhập nội dung" required="required" id="description" name="description" rows="8"></textarea>
                            </div>					
                            <div class="form-group">
                                <label>Tên liên hệ</label>
                                <input name="contactname" id="contactname" type="text" class="form-control" required>
                            </div>					
                            <div class="form-group">
                                <label>Điện thoại</label>
                                <input name="contactphone" id="contactphone" type="text" class="form-control" required>
                            </div>					
                            <div class="form-group">
                                <label>Email</label>
                                <input name="contactemail" id="contactemail" type="text" class="form-control" required>
                            </div>					
                            <div class="form-group">
                                <label>Địa chỉ liên hệ</label>
                                <input name="contactaddress" id="contactaddress" type="text" class="form-control" required>
                            </div>					
                            <div class="form-group">
                                <label for="img">Select image:</label><br>
                                <input type="file" id="img-up" name="img" accept="image/*">
                            </div>
                        </div>

                        <div class="modal-footer">
                            <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
                            <input type="submit" class="btn btn-info" value="Save">
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <%@include file="footer.jsp" %>
        <script>
            $(document).on("click", ".edit", function () {
                $(".modal-body #id").val($(this).data('id'));
                $(".modal-body #title").val($(this).data('title'));
                $(".modal-body #categoryId").val($(this).data('categoryId'));
                $(".modal-body #area").val($(this).data('area'));
                $(".modal-body #price").val($(this).data('price'));
                $(".modal-body #provinceId").val($(this).data('provinceId'));
                $(".modal-body #districtId").val($(this).data('districtId'));
                $(".modal-body #wardId").val($(this).data('wardId'));
                $(".modal-body #address").val($(this).data('address'));
                $(".modal-body #description").val($(this).data('description'));
                $(".modal-body #contactname").val($(this).data('contactname'));
                $(".modal-body #contactphone").val($(this).data('contactphone'));
                $(".modal-body #contactemail").val($(this).data('contactemail'));
                $(".modal-body #contactaddress").val($(this).data('contactaddress'));
                $(".modal-body #image").val($(this).data('image'));

            });


            function doDelete(id)
            {
                var c = confirm("Are you sure?");
                if (c)
                {
                    window.location.href = "delete?id=" + id + "&address=mypost";
                }
            }
        </script>
    </body>
</html>
