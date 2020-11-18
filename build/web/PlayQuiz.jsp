

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
        <h2 class="h1-responsive font-weight-bold text-center my-4">Welcome
                    <!--BUG-->
                    <span class="animated ">${sessionScope.user.getuUsername()}</span>
                </h2>
<!--        <h3 class="time text-left" >Time remaining <span>10:03</span></h3>-->
        <%!
            ArrayList<String> question;
            ArrayList<Answer> listAnswer;
            int countAnswer;
            String username;
        %>
        <%
            QuestionDAO questionDao = new QuestionDAO();
//            username = (String) request.getSession().getAttribute("nameUser");
            countAnswer = questionDao.countQuesion();
            Random ran = new Random();
            if (session.getAttribute("listquestion") == null) {
                     question = questionDao.getQuestionById();
                     session.setAttribute("listquestion", question);
                }
            else{
                question = (ArrayList<String>)session.getAttribute("listquestion");
            }
//             for (int i = 0; i < question.size(); i++) {
             int randomIndex = ran.nextInt(question.size());
                 String randomElement = question.get(randomIndex);
                 question.remove(randomIndex);
                  int id = questionDao.getIdByQuestion(randomElement);
        %>
                  <h2 class="text-left"><%= randomElement%></h2>
                    <input type="hidden" name="randomques" value="<%= randomElement%>">
                 <%
        
//             }
            listAnswer = questionDao.listAnswer(randomElement);
        %>
       
        <form action="CheckResultServlet" method="POST" class="card-body">
            <c:forEach var="Answer" items="<%= listAnswer%>">
                <input type="checkbox" class="form-check form-check-inline h3" id="myCheck" name="answer" value="${Answer.answer}">
                <span class="value-check-box">${Answer.answer} </span><br>
            </c:forEach>
                <input type="hidden" name="questionid" value="<%= id%>">
                <button   class="btn btn-success" onclick="myFunction()">Next</button>
        </form>
    </div>
                <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script>
    // the selector will match all input controls of type :checkbox
// and attach a click event handler 
$("input:checkbox").on('click', function() {
  // in the handler, 'this' refers to the box clicked on
  var $box = $(this);
  if ($box.is(":checked")) {
    // the name of the box is retrieved using the .attr() method
    // as it is assumed and expected to be immutable
    var group = "input:checkbox[name='" + $box.attr("name") + "']";
    // the checked state of the group/box on the other hand will change
    // and the current value is retrieved using .prop() method
    $(group).prop("checked", false);
    $box.prop("checked", true);
  } else {
    $box.prop("checked", false);
  }
});
</script>
</div>
</body>
</html>
