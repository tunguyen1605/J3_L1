

<%@page import="java.text.NumberFormat"%>
<%@page import="java.text.DecimalFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="myStyle.css" rel="stylesheet">
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
     <div class="content">
            <p class="title-wellcome">Your score
                <%
                    int anwerCorrectCurrent = (int)getServletContext().getAttribute("answerCorrect");
                    int numberQuestion = (int)getServletContext().getAttribute("numberQuestion");
                    double result = (double)anwerCorrectCurrent / numberQuestion * 100;
                      NumberFormat formatter = new DecimalFormat("#0.00"); 
                     getServletContext().setAttribute("result", formatter.format(result));
                %>
                <span class="name">${result/10} (${result}%) - ${result <= 50.0 ? "Not Pass" : "Passed"}</span>
            </p>
            <p class="text-content">Take another test
                <a href="PlayQuiz.jsp">
                    <input type="submit" value="Start">
                </a>
            </p>
        </div>
</form>
    </div>
    </body>
</html>
