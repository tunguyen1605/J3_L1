<%-- 
    Document   : managerquestion
    Created on : Aug 19, 2018, 11:03:43 PM
    Author     : Thaycacac
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="myStyle.css" rel="stylesheet">
        <title>Manager Question</title>
    </head>
    <body>
        <div class="container">
        <nav>
            <ul class="my-nav">
                <li>
                    <a href="">Home</a>
                </li>
                <li>
                    <a href="">
                        Take Quiz</a>
                </li>
                <li>
                    <a href="">
                        Make Quiz</a>
                </li>
                <li>
                    <a href="">
                        Manage Quiz</a>
                </li>
                <li>
                    <a href="">
                        Log out</a>
                </li>
            </ul>
        </nav>
        <div class="content">
            <form action="">
                <div class="table">
                    <div class="table-row">
                        <div class="table-cell cell-manager">
                            <p>Question: </p>
                        </div>
                        <div class="table-cell">
                            <textarea name="question" cols="60" rows="7">The name of capital of VietNam after year of 1975</textarea>
                        </div>
                    </div>
                    <div class="table-row">
                        <div class="table-cell cell-manager">
                            <p>Option1: </p>
                        </div>
                        <div class="table-cell">
                            <textarea name="option1" cols="60" rows="3">Sai gon</textarea>
                        </div>
                    </div>
                    <div class="table-row">
                        <div class="table-cell cell-manager">
                            <p>Option2: </p>
                        </div>
                        <div class="table-cell">
                            <textarea name="option2" cols="60" rows="3">Ho Chi Minh
                            </textarea>
                        </div>
                    </div>
                    <div class="table-row">
                        <div class="table-cell cell-manager">
                            <p>Option3: </p>
                        </div>
                        <div class="table-cell">
                            <textarea name="option3" cols="60" rows="3">Ha Noi</textarea>
                        </div>
                    </div>
                    <div class="table-row">
                        <div class="table-cell cell-manager">
                            <p>Option4: </p>
                        </div>
                        <div class="table-cell">
                            <textarea name="option4" class="question" cols="60" rows="3">Ha Tay</textarea>
                        </div>
                    </div>
                    <div class="table-row">
                        <div class="table-cell cell-manager">
                            <p>Answers(s): </p>
                        </div>
                        <div class="table-cell">
                            <input type="checkbox" name="correct">Option1
                            <input type="checkbox" name="correct">Option2
                            <input type="checkbox" name="correct" checked>Option3
                            <input type="checkbox" name="correct">Option4
                        </div>
                    </div>
                    <div class="table-row">
                        <div class="table-cell cell-manager">
                        </div>
                        <div class="table-cell">
                            <input type="submit" value="save">
                        </div>
                    </div>
                </div>
            </form>
        </div>
    </div>
    </body>
</html>
