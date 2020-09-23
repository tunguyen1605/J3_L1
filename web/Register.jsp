
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

        <title>Login</title>
    </head>
    <body>
        <div class="container-md">
            <%@include file="header.jsp"%>
            <!--<div class="card">-->
            <div class="card-header">
                <h3>Register Form</h3>
            </div>
            <div class="card-body">
                <form action="RegisterServlet" method="Register">
                    <div class="input-group ">
                        <div class="input-group-prepend">
                            <span class="input-group-text"><i class="fas fa-user "></i></span>
                        </div>
                        <input  name="username" value="" type="text" class="form-control" placeholder="username">

                    </div>
                  <br>
                  
                    <div class="input-group form-group">
                        <div class="input-group-prepend">
                            <span class="input-group-text"><i class="fas fa-key"></i></span>
                        </div>
                        <input  name="password" value="" type="password" class="form-control" placeholder="password">

                    </div>
                    <br>
                    <div class="input-group form-group">
                        <div class="input-group-prepend">
                            <span class="input-group-text"><i class="fas fa-key"></i></span>
                        </div>
                        <input  name="email" value="" type="email" class="form-control" placeholder="email">

                    </div>
                    <br>
                    <div class="input-group form-group">
                        <div class="input-group-prepend">
                            <span class="input-group-text"><i></i></span>
                        </div>

                        <select class="form-control" id="exampleSelect1" name="type">
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
