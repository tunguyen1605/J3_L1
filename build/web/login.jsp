<%-- 
    Document   : login
    Created on : Aug 19, 2018, 9:24:30 PM
    Author     : Thaycacac
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="bootstrap-4.5.2-dist/css/bootstrap.css" rel="stylesheet" type="text/css">
        <title>Login</title>
    </head>
    <body>
            <div class="container-md">
                <%@include file="header.jsp"%>
                		<div class="card">
			<div class="card-header">
				<h3>Login Form</h3>
			</div>
			<div class="card-body">
                            <form action="LoginServlet" method="login">
					<div class="input-group form-group">
						<div class="input-group-prepend">
							<span class="input-group-text"><i class="fas fa-user"></i></span>
						</div>
                                            <input  name="username" value="" type="text" class="form-control" placeholder="username">
						
					</div>
					<div class="input-group form-group">
						<div class="input-group-prepend">
							<span class="input-group-text"><i class="fas fa-key"></i></span>
						</div>
                                            <input  name="password" value="" type="password" class="form-control" placeholder="password">
                                                
					</div>
					<div class="form-group">
						<input type="submit" value="Login" class="btn float-right login_btn">
					</div>
				</form>
                            <form action="" method="Register">
                                <div class="form-group">
						<input type="submit" value="Register" class="btn float-right login_btn">
					</div>
                            </form>
			</div>
		</div>
            </div>
            
        
           
           
<!--            <div class="content">
                <p class="title-regist">Login Form</p>
                <form action="LoginServlet" method="POST">
                    <div class="table">
                        <div class="table-row">
                            <div class="table-cell">
                                <p class="cell-attribute">User Name:</p>
                            </div>
                            <div class="table-cell">
                                <input type="text" class="input" name="username" value="${username}">
                            </div>
                        </div>
                        <div class="table-row">
                            <div class="table-cell">
                                <p class="cell-attribute">Password:</p>
                            </div>
                            <div class="table-cell">
                                <input type="password" class="input" name="password">
                            </div>
                        </div>
                        <div class="table-row">
                            <div class="table-cell">
                            </div>
                            <div class="table-cell">
                                <input type="submit" value="Sign in">
                                <a href="register.jsp" class="link-register">Register</a>
                            </div>
                        </div>
                    </div>
                </form>
            </div>-->
    </body>
</html>
