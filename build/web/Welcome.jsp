<%-- 
    Document   : wellcome
    Created on : Aug 19, 2018, 9:51:02 PM
    Author     : Thaycacac
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="myStyle.css" rel="stylesheet">
        <title>Wellcome</title>
    </head>
    <body>
        <div class="container">


        </div>
        <div class="container">
            <%@include file="header.jsp"%>
            <div class="content ">
                <h2 class="h1-responsive font-weight-bold text-center my-4">Wellcome
                    <!--BUG-->
                    <span class="animated ">${sessionScope.user}</span>
                </h2>
                <form action="TakeQuizServlet" method="POST">

                    <div class="form-group">
                        <label for="exampleSelect1" class="bmd-label-floating">Choose number of question</label>
                        <select class="form-control" id="exampleSelect1">
                            <option>5</option>
                            <option>10</option>
                            <option>15</option>
                            <option>20</option>
                        </select>
                    </div>
                    <br>
                    <button type="submit" class="btn btn-success">Start</button>
                </form>
            </div>
        </div>
    </body>
</html>
