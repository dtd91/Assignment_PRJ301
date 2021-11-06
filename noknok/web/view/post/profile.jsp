<%-- 
    Document   : profile
    Created on : Nov 4, 2021, 10:25:37 PM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Bootstrap Example</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <!------ Include the above in your HEAD tag ---------->

        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <!------ Include the above in your HEAD tag ---------->

    </head>
    <script>
        $(document).ready(function () {
            var readURL = function (input) {
                if (input.files && input.files[0]) {
                    var reader = new FileReader();
                    reader.onload = function (e) {
                        $('.avatar').attr('src', e.target.result);
                    }
                    reader.readAsDataURL(input.files[0]);
                }
            }
            $(".file-upload").on('change', function () {
                readURL(this);
            });
        });
    </script>
    <body>
        <%@include file="header.jsp" %><br><br>

        <div class="d-flex justify-content-center row">
            <div class="col-md-8 table-responsive" >
                <div class="container bootstrap snippet">
                    <div class="row">
                        
                        <div class="col-md-2"><a href="/users" class="pull-right"></a></div>
                    </div>
                    <div class="row">
                        <div class="col-md-4"><!--left col-->
                            <div class="text-center">
                                <img src="http://ssl.gstatic.com/accounts/ui/avatar_2x.png" class="avatar img-circle img-thumbnail" alt="avatar">
                                <h6>Upload a different photo...</h6>
                                <input type="file" class="text-center center-block file-upload">
                            </div></hr><br>

                            <ul class="list-group">
                                <li class="list-group-item text-muted">Activity <i class="fa fa-dashboard fa-1x"></i></li>
                                <li class="list-group-item text-right"><span class="pull-left"><strong>Số tin đã đăng</strong></span> 125</li>
                            </ul> 


                        </div><!--/col-3-->
                        <div class="col-md-8">
                            <form action="##" method="post" id="registrationForm">

                                    <div class="col-md-6">
                                        <h4>First name</h4>
                                        <input type="text" class="form-control" name="first_name" id="first_name" placeholder="first name" title="enter your first name if any.">
                                    </div>

                                    <div class="col-md-6">
                                        <h4>Last name</h4>
                                        <input type="text" class="form-control" name="last_name" id="last_name" placeholder="last name" title="enter your last name if any.">
                                    </div>

                                    <div class="col-md-6">
                                       <h4>Gender</h4><br>
                                        <select class="form-select" aria-label="Default select example">
                                            <option>Male</option>
                                            <option>Female</option>
                                        </select>
                                    </div>
                                    <div class="col-md-6">
                                        <h4>Phone</h4>
                                        <input type="text" class="form-control" name="phone" id="phone" placeholder="enter phone" title="enter your phone number if any.">
                                    </div>


                                    <div class="col-md-6">
                                        <h4>Email</h4>
                                        <input type="email" class="form-control" name="email" id="email" placeholder="you@email.com" title="enter your email.">
                                    </div>

                                <div class="col-md-12 text-center">
                                    <br>
                                    <button class="btn btn-lg btn-success" type="submit"><i class="glyphicon glyphicon-ok-sign"></i>Cập nhật</button>
                                </div>
                            </form>
                        </div><!--/tab-pane-->

                    </div><!--/col-9-->
                </div><!--/row-->
            </div><!--/row-->
        </div><!--/row-->
        <br>
        <br>    
        <%@include file="footer.jsp" %>

    </body>
</html>
