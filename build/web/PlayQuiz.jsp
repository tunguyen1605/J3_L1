<%-- 
    Document   : playquiz
    Created on : Aug 19, 2018, 10:18:22 PM
    Author     : Thaycacac
--%>

<%@page import="java.util.Random"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="dal.QuestionDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dataobj.Answer"%>
<%@page import="dataobj.Answer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="myStyle.css" rel="stylesheet">
        <title>Play Quiz</title>
    </head>
    <body>
        <div class="container">
            <%@include file="header.jsp"%>
            <div class="content">
                <p class="title-wellcome">Wellcome
                    <span class="name">${nameUser}</span>
                </p>
                <p class="time">Time remaining: <span>10:03</span></p>
                <%!
                    String question;
                    ArrayList<Answer> listAnswer;
                    int countAnswer;
                    String username;
                %>
                <%
                    QuestionDAO questionDao = new QuestionDAO();
                    username = (String) request.getSession().getAttribute("nameUser");
                    countAnswer = questionDao.countQuesion(username);
                    Random ran = new Random();
                    int randomQuestion = ran.nextInt(2) + 1;
                    question = questionDao.getQuestionById(randomQuestion);
                    listAnswer = questionDao.listAnswer(randomQuestion);
                %>
                <p class="text-content"><%= question%></p>
                <form action="CheckResultServlet" method="POST">
                    <c:forEach var="answer" items="<%= listAnswer%>">
                        <input type="checkbox" class="checkbox-content" name="answer" value="${answer.answer}">
                        <span class="value-check-box">${answer.answer} </span><br>
                    </c:forEach>
                        <input type="hidden" name="questionid" value="<%= randomQuestion %>">
                    <input type="submit" value="Next" class="submit-content">
                </form>
            </div>
        </div>
    </body>
</html>
