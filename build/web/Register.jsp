
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
<!--        <script src="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/js/bootstrap.min.js"></script>
        <script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.2.1.min.js"></script>
        <script src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.9/jquery.validate.min.js" type="text/javascript"></script>
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
        <script src="https://code.jquery.com/ui/1.11.3/jquery-ui.js"></script>
        <script src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.13.1/jquery.validate.min.js"></script>-->
        
        <title>Login</title>
<!--        <script text="text/javascript">
            // check validation
            $(document).ready(function () {
                $("#form").validate({
                    errorClass: 'error',
                    rules: {
                        //check username input cannot null, min length 8 and max length 30
                        RegisterUsername: {
                            required: true,
              
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
                            required: "<div class='text-danger'>Please enter username</div>",
                      
                            maxlength: "<div class='text-danger'>Username must be smailler than 30 characters</div>",
                 
                        },
                        //message warning input password
                        RegisterPassword: {
                            required: "<div class='text-danger'>Please enter password</div>",
                            minlength: "<div class='text-danger'>Password must be greater than 8 characters</div>",
                            maxlength: "<div class='text-danger'>>Password must be smaller than 20 characters</div>",
                            checkpass: "<div class='text-danger'>Password must be has a uppercase letter , has a digit and special characters !</div>"
                        },
                        //message warning input email
                        RegisterEmail: {
                            required: "<div class='text-danger'>Please enter email</div>",
                            checkemail: "<div class='text-danger'>Email invalid please enter again</div> "
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
        </script>-->
    </head>
    <div class="text-danger"></div>
    <body>
        <div class="container-md">
            <%@include file="header.jsp"%>
            <!--<div class="card">-->
            <div class="card-header">
                <h3>Register Form</h3>
            </div>
            <div class="card-body">
                <form action="RegisterServlet" method="Register" id="form">
<!--                    <div class="input-group form-group">
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
                    </div>-->
<div class="form-group row">
                    <label for="userID" class="col-sm-4 col-form-label">User ID</label>
                    <div class="col-sm-8">
                        <input name="RegisterUsername" type="text" class="form-control" id="userID" required>
                        <span class="text-danger " id="checkUserId"></span>
                    </div>
                </div>
                <div class="form-group row">
                    <label for="email" class="col-sm-4 col-form-label">Email address</label>
                    <div class="col-sm-8">
                        <input name="RegisterEmail" type="" class="form-control" id="email" required>
                        <span class="text-danger " id="checkEmail"></span>
                    </div>
                </div>
               
                
                
                <div class="form-group row">
                    <label for="password" class="col-sm-4 col-form-label">Password</label>
                    <div class="col-sm-8">
                        <input name="RegisterPassword" type="password" class="form-control" id="password" required>
                    </div>
                </div>


                    <select class="form-control" id="exampleSelect1" name="RegisterType">
                            <option>Student</option>
                            <option>Teacher</option>
                        </select>
<br>
<br>
                <button id="add" name="btnCreate" value="add" type="submit" class="btn btn-primary btn-block">Add New User</button>
                        
                </form>

            </div>
        </div>
    </body>
</html>
