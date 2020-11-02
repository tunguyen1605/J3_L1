
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="bootstrap-4.5.2-dist/css/bootstrap.css" rel="stylesheet" type="text/css">
        <link href="bootstrap-4.5.2-dist/css/bootstrap-grid.min.css" rel="stylesheet" type="text/css">
        <link href="bootstrap-4.5.2-dist/css/bootstrap-reboot.css" rel="stylesheet" type="text/css">
        <link href="bootstrap-4.5.2-dist/css/bootstrap-reboot.min.css" rel="stylesheet" type="text/css">
        <link href="bootstrap-4.5.2-dist/css/bootstrap.min.css" rel="stylesheet" type="text/css">
        <link href="bootstrap-4.5.2-dist/js/bootstrap.js" rel="stylesheet" type="text/javascript">
        <link href="bootstrap-4.5.2-dist/js/bootstrap.bundle.js" rel="stylesheet" type="text/javascript">
        <link href="bootstrap-4.5.2-dist/js/bootstrap.bundle.min.js" rel="stylesheet" type="text/javascript">
        <link href="bootstrap-4.5.2-dist/js/bootstrap.min.js" rel="stylesheet" type="text/javascript">
        <script src="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/js/bootstrap.min.js"></script>
        <script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.2.1.min.js"></script>
        <script src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.9/jquery.validate.min.js" type="text/javascript"></script>
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
        <script src="https://code.jquery.com/ui/1.11.3/jquery-ui.js"></script>
        <script src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.13.1/jquery.validate.min.js"></script>
        
        <title>Login</title>
        <script text="text/javascript">
            // check validation
            $(document).ready(function () {
                $("#form").validate({
                    errorClass: 'error',
                    rules: {
                        //check username input cannot null, min length 8 and max length 30
                        RegisterUsername: {
                            required: true,
                            minlength: 8,
                            maxlength: 30
                        },
                        /**
                         * check password input cannot null, min length 8 and max length 30, 
                         * and check password must have uuppercase letter , has a digit and special characters
                         */
                        RegisterPassword: {
                            required: true,
                            minlength: 8,
                            maxlength: 20,
                            checkpass: true
                        },
                         
                        //check email not null and must valid email
                        RegisterEmail: {
                            required: true,
                            checkemail: true
                        }
                    },
                    messages: {
                        //message warning input username
                        RegisterUsername: {
                            required: "Please enter username",
                            minlength: "Username must be greater than 8 characters",
                            maxlength: "Username must be smailler than 30 characters"
                        },
                        //message warning input password
                        RegisterPassword: {
                            required: "Please enter password",
                            minlength: "Password must be greater than 8 characters",
                            maxlength: "Password must be smaller than 20 characters",
                            checkpass: "Password must be has a uppercase letter , has a digit and special characters !"
                        },
                        //message warning input email
                        RegisterUsername: {
                            required: "Please enter email",
                            checkemail: "Email invalid please enter again "
                        }
                       
                    }
                });
                $.validator.addMethod("checkpass", function (value) {
                    var passReg = /^(?=.*?[A-Z])(?=(.*[a-z]){1,})(?=(.*[\d]){1,})(?=(.*[\W]){1,})(?!.*\s).{8,}$/;// regex check password
                    return passReg.test(value);
                });
                $.validator.addMethod("checkemail", function (value) {
                    var emailReg = /^([\w-\.]+@([\w-]+\.)+[\w-]{2,4})?$/; // regex check email
                    return emailReg.test(value);
                });
              


            });
        </script>
    </head>
    <body>
        <div class="container-md">
            <%@include file="header.jsp"%>
            <!--<div class="card">-->
            <div class="card-header">
                <h3>Register Form</h3>
            </div>
            <div class="card-body">
                <form action="RegisterServlet" method="Register" id="form">
                    <div class="input-group form-group">
                        <div class="input-group-prepend">
                            <span class="input-group-text"><i class="fas fa-user "></i></span>
                        </div>
                        <input  name="RegisterUsername" value="" type="text" class="form-control" placeholder="username">

                    </div>
                  <br>
                  
                    <div class="input-group form-group">
                        <div class="input-group-prepend">
                            <span class="input-group-text"><i class="fas fa-key"></i></span>
                        </div>
                        <input  name="RegisterPassword" value="" type="password" class="form-control" placeholder="password">
                    </div>
                    <br>
                    <div class="input-group form-group">
                        <div class="input-group-prepend">
                            <span class="input-group-text"><i class="fas fa-key"></i></span>
                        </div>
                        <input  name="RegisterEmail" value="" type="email" class="form-control" placeholder="email">

                    </div>
                    <br>
                    <div class="input-group form-group">
                        <div class="input-group-prepend">
                            <span class="input-group-text"><i></i></span>
                        </div>

                        <select class="form-control" id="exampleSelect1" name="RegisterType">
                            <option>Student</option>
                            <option>Teacher</option>
                        </select>
                        <br>
                    </div>
                    <div class="container-md">
                        <div class="text-right">
                             <button type="submit" class="btn btn-primary ">Submit</button>
                        </div>
                    </div>
                        
                </form>

            </div>
        </div>
    </body>
</html>
