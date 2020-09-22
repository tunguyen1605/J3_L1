<link href="bootstrap-4.5.2-dist/css/bootstrap.css" rel="stylesheet" type="text/css">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<nav class="navbar navbar-expand-sm bg-dark justify-content-center">
       <!-- Links -->
       <ul class="navbar-nav">
              <li class="nav-item">
                     <a class="nav-link" href="login.jsp">Home</a>
                  </li>
              <li class="nav-item">
                     <a class="nav-link" href="login.jsp">
                Take Quiz</a>
                  </li>
              <li class="nav-item">
                     <a class="nav-link" href="login.jsp">
                Make Quiz</a>
                  </li>
        <li class="nav-item">
                     <a class="nav-link" href="login.jsp">
                Manage Quiz</a>
                  </li>
            <c:if test="">
            <li class="nav-item">
                         <a  class="nav-link" href="../login.jsp">
                    Logout</a>
                      </li>
            </c:if>
           </ul>
</nav>