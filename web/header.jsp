<link href="bootstrap-4.5.2-dist/css/bootstrap.css" rel="stylesheet" type="text/css">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:if test="${!empty user}">
    <nav class="navbar navbar-expand-sm bg-dark justify-content-center">
       <!-- Links -->
       <ul class="navbar-nav">
              <li class="nav-item">
                     <a class="nav-link" href="Welcome.jsp">Home</a>
                  </li>
              <li class="nav-item">
                     <a class="nav-link" href="Welcome.jsp">
                Take Quiz</a>
                  </li>
              <li class="nav-item">
                     <a class="nav-link" href="./ShowQuestion">
                Manager Quiz</a>
                  </li>
        <li class="nav-item">
                     <a class="nav-link" href="./Rolemanager">
                Make Quiz</a>
                  </li>
            <c:if test="${!empty user}">
            <li class="nav-item">
                     <a class="nav-link" href="logout">
                Logout</a>
                  </li>
            </c:if>
           </ul>
</nav>
</c:if>
