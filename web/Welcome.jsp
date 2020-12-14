

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
        <%
            if (session.getAttribute("user") != null) {

            } else {
                response.sendRedirect("login.jsp");
            }
        %>
        <title>Welcome</title>
    </head>
    <body>
        <div class="container">
        </div>
        <div class="container">
            <%@include file="header.jsp"%>
            <div class="content ">
                <h2 class="h1-responsive font-weight-bold text-center my-4">Wellcome
                    <!--BUG-->
                    <span class="animated ">${sessionScope.user.getuUsername()}</span>
                </h2>
                <form action="TakeQuizServlet" method="POST">
                    <div class="form-group">
                        <label for="exampleSelect1" class="bmd-label-floating">Choose number of question</label>
                        <div class="form-group">
                            <input type="text" class="form-control form-control-sm" placeholder="Enter Number Question" name="numberQuestion">
                        </div>

                    </div>
                    <br>
                    <button type="submit" class="btn btn-success">Start</button>
                </form>
            </div>
        </div>
    </body>
</html>
