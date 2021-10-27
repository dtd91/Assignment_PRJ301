<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script> 
        <style>
            .form-control {
                height: 41px;
                background: #f2f2f2;
                box-shadow: none !important;
                border: none;
            }
            .form-control:focus {
                background: #e2e2e2;
            }
            .form-control, .btn {        
                border-radius: 3px;
            }
            .signup-form {
                width: 600px;
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
            .signup-form h2  {
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
            .form-control, .btn {
                min-height: 38px;
                border-radius: 2px;
            }
            .btn {        
                font-size: 15px;
                font-weight: bold;
            }
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
        </style>
        <script>
            function check(){
                var pass = document.getElementById("password").value;
                var repass = document.getElementById("repassword").value;
                if(!(pass===repass)){
                    alert("Password does not match");
                }
                return pass===repass;
            }
        </script>
    </head>
    <body>
        <%@include file="../post/header.jsp" %>

        <div class="signup-form">
            <form action="signup" method="post" onsubmit="return check()">
                <h2 class="text-center">Đăng ký</h2>    
                <hr>
                <div class="form-group">
                    <input type="username" class="form-control" name="username" placeholder="Username" required="required">
                </div>
                <div class="form-group">
                    <input type="text" class="form-control" name="displayname" placeholder="Display Name" required="required">
                </div>
                <div class="form-group">
                    <input type="password" class="form-control" name="password" id="password" placeholder="Password" required="required">
                </div>
                <div class="form-group">
                    <input type="password" class="form-control" name="repassword" id="repassword" placeholder="Confirm Password" required="required">
                </div>        
                <div class="form-group">
                    <label class="form-check-label"><input type="checkbox" required="required"> I accept the <a href="#">Terms of Use</a> &amp; <a href="#">Privacy Policy</a></label>
                </div>
                <div class="form-group">
                    <input type="submit" class="btn btn-primary btn-block" value="Sign Up">
                </div>
            </form>
            <div class="hint-text">Already have an account? <a href="login">Login here</a></div>
        </div>
        <c:if test="${not empty requestScope.mess}">
            <script> alert("Username already exits!");
            </script>
        </c:if>
        <%@include file="../post/footer.jsp" %>
    </body>
</html>