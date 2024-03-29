<%-- 
    Document   : test
    Created on : Oct 21, 2021, 10:38:01 PM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Đăng Phòng</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    </head>
    <style>
        .signup-form a {
            color: black;
            text-decoration: underline;
        }
        .signup-form a:hover {
            text-decoration: none;
        }
        .signup-form form a {
            color: #3598dc;
            text-decoration: none;
        }	
        .signup-form form a:hover {
            text-decoration: underline;
        }
        .signup-form .hint-text  {
            padding-bottom: 15px;
            text-align: center;
        }
        .signup-form {
            padding-top: 20px;
            width: 100%;
            margin: 50px auto;
            font-size: 15px;
        }
        .signup-form form {
            color: #999;
            border-radius: 3px;
            margin-bottom: 15px;
            background: #f7f7f7;
            box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
            padding: 30px;
        }
        .signup-form h3  {
            color: black;
        }
        .signup-form hr  {
            margin: 0 -30px 20px;
        }    
        .signup-form .form-group {
            margin-bottom: 20px;
        }
        .signup-form input[type="checkbox"] {
            margin-top: 3px;
        }
        .signup-form .row div:first-child {
            padding-right: 10px;
        }
        .signup-form .row div:last-child {
            padding-left: 10px;
        }
        .signup-form label{
            color: black;
        }
    </style>

    <body>
        <%@include file="header.jsp" %>

        <div class="signup-form d-flex justify-content-center row">
            <div class="col-xs-12 col-md-8">
                <form action="#" class="form frm-dangtin"  method="post">
                    <div class="group_fields">
                        <h3 class="form_title">Thông tin cơ bản</h3>
                        <div class="group_fields_body">
                            <div class="form-group">
                                <div class="row">
                                    <div class="col-sm-12">
                                        <label class="control-label">Tiêu đề tin <span class="red_require"></span></label>
                                        <input class="form-control text-box single-line" data-val="true" data-val-maxlength="Tiêu đề tin tối đa là 100 ký tự" data-val-maxlength-max="100" data-val-minlength="Tiêu đề tin tối thiểu là 30 ký tự" data-val-minlength-min="30" data-val-required="Vui lòng nhập tiêu đề tin" id="Title" name="Title" type="text" value="" required="required">
                                        <span class="field-validation-valid text-danger" data-valmsg-for="Title" data-valmsg-replace="true"></span>
                                    </div>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="row">
                                    <div class="col-sm-6 col-xs-12">
                                        <label class="control-label">Chuyên mục <span class="red_require"></span></label>
                                        <select class="form-control" id="CategoryId" name="CategoryId" data-val="true" data-val-required="Vui lòng chọn chuyên mục"><option value="1">Cho thuê phòng trọ</option><option value="2">Cho thuê căn hộ</option><option value="3">Cho thuê nhà nguyên căn</option><option value="4">Tìm người ở ghép</option></select>
                                        <span class="field-validation-valid text-danger" data-valmsg-for="CategoryId" data-valmsg-replace="true"></span>
                                    </div>
                                    <div class="col-sm-6 col-xs-12">
                                        <label class="control-label">Diện tích <span class="red_require"></span></label>
                                        <div class="input-group">
                                            <input class="form-control text-box single-line" data-val="true" required="required" data-val-number="Diện tích nhập không đúng" data-val-required="Vui lòng nhập diện tích" decimal="true" id="Area" maxlength="6" name="Area" numbersonly="true" type="text" value="">
                                            <span class="input-group-addon" id="basic-addon2">m²</span>
                                        </div>
                                        <span class="field-validation-valid text-danger" data-valmsg-for="Area" data-valmsg-replace="true"></span>
                                    </div>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="row">
                                    <div class="col-sm-6">
                                        <div class="clearfix">
                                            <div class="pull-left"><label class="control-label">Giá cho thuê <span class="red_require"></span></label></div>
                                            <div class="pull-right"><span id="lblPrice" style="font-size:13px;color:#f3051b"></span></div>
                                        </div>
                                        <input class="form-control text-box single-line" data-val="true" data-val-number="Giá nhập không đúng" data-val-required="Vui lòng nhập giá" decimal="true" id="Price" maxlength="100" name="Price" numbersonly="true" placeholder="VD: 2 triệu 500 nghìn thì nhập 2.5" type="text" value="">
                                        <span class="field-validation-valid text-danger" data-valmsg-for="Price" data-valmsg-replace="true"></span>
                                    </div>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="row">
                                    <div class="col-sm-6 col-xs-12">
                                        <label class="control-label">Tỉnh/Thành <span class="red_require"></span></label>
                                        <select id="ProvinceId" name="ProvinceId" required="required" class="select2 select2-hidden-accessible" style="width:100%" data-val="true" data-val-required="Vui lòng chọn tỉnh thành" tabindex="-1" aria-hidden="true">
                                            <option value="">-- Tỉnh/thành --</option>
                                            <c:forEach items="${requestScope.pros}" var="p">
                                                <option value="${p.id}">${p.name}</option>
                                            </c:forEach>
                                            <span class="field-validation-valid text-danger" data-valmsg-for="ProvinceId" data-valmsg-replace="true"></span>
                                        </select>
                                    </div>
                                    <div class="col-sm-6 col-xs-12">
                                        <label class="control-label">Quận/Huyện <span class="red_require"></span></label>
                                        <select id="DistrictId" name="DistrictId" required="required" class="select2 select2-hidden-accessible" style="width:100%" data-val="true" data-val-required="Vui lòng chọn quận huyện" tabindex="-1" aria-hidden="true">
                                            <option value="">-- Quận/huyện --</option>

                                            <c:forEach items="${requestScope.dicts}" var="d">
                                                <option value="${d.id}">${d.name}</option>
                                            </c:forEach>
                                        </select>
                                        <span class="field-validation-valid text-danger" data-valmsg-for="DistrictId" data-valmsg-replace="true"></span>
                                    </div>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="row">
                                    <div class="col-sm-6 col-xs-12">
                                        <label class="control-label">Phường/Xã</label>
                                        <select id="ddlWard" name="WardId" required="required" style="width:100%" class="select2 select2-hidden-accessible" tabindex="-1" aria-hidden="true">
                                            <option value="">-- Phường/xã --</option>
                                            <c:forEach items="${requestScope.wards}" var="w">
                                                <option value="${w.id}">${w.name}</option>
                                            </c:forEach>
                                        </select>
                                    </div>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label">Địa chỉ <span class="red_require"></span></label>
                                <input class="form-control text-box single-line" data-val="true" data-val-maxlength="The field Address must be a string or array type with a maximum length of '200'." required="required" data-val-maxlength-max="200" data-val-required="Vui lòng nhập địa chỉ" id="txtAddress" name="Address" type="text" value="">
                                <span class="field-validation-valid text-danger" data-valmsg-for="Address" data-valmsg-replace="true"></span>
                            </div>
                        </div>

                        <h3 class="form_title">Thông tin mô tả</h3>
                        <div class="group_fields_body">

                            <div class="form-group">
                                <div class="row">
                                    <div class="col-sm-12">
                                        <label class="control-label">Nội dung <span class="red_require"></span></label>
                                        <textarea class="form-control edtior-noidung" cols="20" data-val="true" data-val-required="Vui lòng nhập nội dung" required="required" id="Detail" name="Detail" rows="8"></textarea>
                                        <span class="field-validation-valid text-danger" data-valmsg-for="Detail" data-valmsg-replace="true"></span>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <h3 class="form_title">Thông tin liên hệ</h3>
                        <div class="group_fields_body">
                            <div class="form-group">
                                <div class="row">
                                    <div class="col-sm-6 col-xs-12">
                                        <label class="control-label">Tên liên hệ <span class="red_require"></span></label>
                                        <input value="" class="form-control text-box single-line" data-val="true" required="required" data-val-required="Vui lòng nhập tên liên hệ" id="ContactName" name="ContactName" type="text">
                                        <span class="field-validation-valid text-danger" data-valmsg-for="ContactName" data-valmsg-replace="true"></span>
                                    </div>
                                    <div class="col-sm-6 col-xs-12">
                                        <label class="control-label">Điện thoại <span class="red_require"></span></label>
                                        <input value="" class="form-control text-box single-line" required="required" data-val="true" data-val-required="Vui lòng nhập số điện thoại" id="ContactMobile" maxlength="10" name="ContactMobile" numbersonly="true"  type="text">                                            
                                    </div>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label">Email</label>
                                <input value="" class="form-control text-box single-line" data-val="true" required="required" data-val-email="Địa chỉ email không hợp lệ" id="ContactEmail" maxlength="100" name="ContactEmail" type="email">
                                <span class="field-validation-valid text-danger" data-valmsg-for="ContactEmail" data-valmsg-replace="true"></span>
                            </div>
                            <div class="form-group">
                                <label class="control-label">Địa chỉ</label>
                                <input value="" class="form-control text-box single-line" id="ContactAddress" required="required" maxlength="200" name="ContactAddress" type="text">
                                <span class="field-validation-valid text-danger" data-valmsg-for="ContactAddress" data-valmsg-replace="true"></span>
                            </div>
                        </div>

                        <h3 class="form_title">Hình ảnh</h3>
                        <div class="group_fields_body" style="padding-top:0">
                            <div class="form-group">
                                <div class="row">
                                    <div class="col-sm-12">
                                        <div id="fileupload">
                                            <input type="file" id="img" name="img" accept="image/*">
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="col-sm-12 text-center">
                        <input type="submit" class="btn btn-primary" onclick="check()" value="ĐĂNG TIN">
                    </div>
                </form>            
            </div>
        </div>
        <%@include file="footer.jsp" %>
        <script>
            function check() {
                alert("Add Successfully!");
            }
        </script>
    </body>
</html>
