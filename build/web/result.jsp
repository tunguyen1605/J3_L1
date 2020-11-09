

<%@page import="java.text.NumberFormat"%>
<%@page import="java.text.DecimalFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="myStyle.css" rel="stylesheet">
          <link href="bootstrap-4.5.2-dist/css/bootstrap-grid.min.css" rel="stylesheet" type="text/css">
        <link href="bootstrap-4.5.2-dist/css/bootstrap-reboot.css" rel="stylesheet" type="text/css">
        <link href="bootstrap-4.5.2-dist/css/bootstrap-reboot.min.css" rel="stylesheet" type="text/css">
        <link href="bootstrap-4.5.2-dist/css/bootstrap.min.css" rel="stylesheet" type="text/css">
        <title>Result</title>
    </head>
    <body>
        <div class="container">
<!--        <nav>
            <ul class="my-nav">
                <li>
                    <a href="wellcome.jsp">Home</a>
                </li>
                <li>
                    <a href="wellcome.jsp">
                        Take Quiz</a>
                </li>
                <li>
                    <a href="wellcome.jsp">
                        Make Quiz</a>
                </li>
                <li>
                    <a href="wellcome.jsp">
                        Manage Quiz</a>
                </li>
                <li>
                    <a href="">
                        Log out</a>
                </li>
            </ul>
        </nav>-->
<form action="Welcome.jsp">
     
       <div class="container-md  ">
                <div class="content">
                    <h1 class="title-wellcome ">Your score:
                
                <span class="name">${result/10} (${result}%)${result <= 50.0 ? "<div class='alert alert-danger'>Not Pass</div>" : "<div class=  'alert alert-success'>Pass</div>"}</span>
            </h1>
            <p class="text-content">Take another test
                <a href="Welcome.jsp">
                    <input class="btn btn-success"type="submit" value="Start">
                </a>
            </p>
        </div>
            </div>
</form>
    </div>
    </body>
</html>
