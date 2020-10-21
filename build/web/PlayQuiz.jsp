<%-- 
Document   : playquiz
Created on : Aug 19, 2018, 10:18:22 PM
Author     : Thaycacac
--%>

<%@page import="java.util.Random"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="ModelDAO.QuestionDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="entities.Answer"%>
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
<link href="myStyle.css" rel="stylesheet">
<title>Play Quiz</title>
</head>
<body>
<div class="container">
    <%@include file="header.jsp"%>
    <div class="content">
        <h2 class="h1-responsive font-weight-bold text-center my-4">Wellcome
                    <!--BUG-->
                    <span class="animated ">${sessionScope.user.getuUsername()}</span>
                </h2>
        <h3 class="time text-left" >Time remaining <span>10:03</span></h3>
        <%!
            String question;
            ArrayList<Answer> listAnswer;
            int countAnswer;
            String username;
        %>
        <%
            QuestionDAO questionDao = new QuestionDAO();
//            username = (String) request.getSession().getAttribute("nameUser");
            countAnswer = questionDao.countQuesion();
            Random ran = new Random();
            int randomQuestion = ran.nextInt(countAnswer)+2;
            question = questionDao.getQuestionById(randomQuestion);
            listAnswer = questionDao.listAnswer(randomQuestion);
        %>
        <h2 class="text-left"><%= question%></h2>
        <form action="CheckResultServlet" method="POST" class="card-body">
            <c:forEach var="Answer" items="<%= listAnswer%>">
                <input type="checkbox" class="form-check form-check-inline h3" name="answer" value="${Answer.answer}">
                <span class="value-check-box">${Answer.answer} </span><br>
            </c:forEach>
<!--                <input type="hidden" name="questionid" value="<%= randomQuestion %>">-->
            <input type="submit" value="Next" class="submit-content">
        </form>
    </div>
</div>
</body>
</html>
