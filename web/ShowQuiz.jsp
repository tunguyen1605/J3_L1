

<%@page import="entities.Question"%>
<%@page import="java.util.ArrayList"%>
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
        <%
    if (session.getAttribute("user") != null) {
        
    } else {
        response.sendRedirect("login.jsp");
    }
%>
        <title>List Question</title>
    </head>
    <body>
        
        <div class="container">
            <%@include file="header.jsp" %>
                		<!--<div class="card">-->
			<div class="card-header">
				<h3>Quiz Manager</h3>
			</div>
            <%!
                int countQuestion;
                ArrayList<Question> listQuestion;
                String username;
            %>
            <%
               
                listQuestion = (ArrayList<Question>) request.getSession().getAttribute("listquestion12");
                countQuestion = (int) request.getSession().getAttribute("numberQuestion12");
            %>
            <div class="content">
                <h3 class="title-wellcome">Number of question :
                    <span class="name"><%= countQuestion%></span>
                </h3>
            
                    <table class="table table-striped">
                         <thead>
                                    <tr class="text-center ">
                                        <th scope="col" class="text-left"><i >Question</i></th>
                                        <th scope="col"><i>DateCreated</i></th>

                                    </tr>
                                </thead>
                                <tbody>
                                     <%
                        for (Question question : listQuestion) {
                    %>
                     <tr>
                                       
                         <td class="text-left"><%= question.getQuestion()%></td>
                                        <td class="text-center"><%= question.getCreated()%></td>
                                        
                     </tr>
                   
                
                <%
                    }
                %>
                                </tbody>
                    </table>
<!--                    <div class="table-row">
                        <div class="table-cell table-head">
                            <p>Question</p>
                        </div>
                        <div class="table-cell table-head">
                            <p>DateCreated</p>
                        </div>
                    </div>-->
                
                   
            </div>
        </div>
    </body>
</html>
