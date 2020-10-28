

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
        <div class="content">
            <p class="title-wellcome">Your score
                <span class="name">${result/10} (${result}%) - ${result <= 50.0 ? "Not Pass" : "Passed"}</span>
            </p>
            <p class="text-content">Take another test
                <a href="PlayQuiz.jsp">
                    <input type="submit" value="Start">
                </a>
            </p>
        </div>
    </div>
    </body>
</html>
