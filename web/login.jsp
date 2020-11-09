

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
        <title>Login</title>
    </head>
    <body>
            <div class="container-md">
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
					<div class="form-group ">
						<input type="submit" value="Login" class="btn float-right login_btn btn-dark">
					</div>
				</form>
                            <form action="Register.jsp" method="Register">
                                      <div class="form-group">
						<input type="submit" value="Register" class="btn float-right login_btn btn-dark">
					</div>
                            </form>
			</div>
		</div>
       

    </body>
</html>
