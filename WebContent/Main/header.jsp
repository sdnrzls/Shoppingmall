<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
   <script src="/shoppingProject/js/Main.js"></script>
     
     
     <!-- Navigation -->
  <nav class="navbar navbar-expand-lg navbar-white bg-white fixed-top">
      <a class="navbar-brand" href="/shoppingProject/Main/main.jsp"><img src="/shoppingProject/image/title.png"></a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarResponsive">
       <ul class="navbar-nav ml-auto">
    
      <c:choose>
  <c:when test="${empty sessionScope.user}">
  			<li class="nav-item active">
            <a class="nav-link" href="/shoppingProject/Main/login.jsp">Login
              <span class="sr-only">(current)</span>
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="/shoppingProject/Main/join.jsp">Join</a>
          </li>

  
</c:when>
<c:when test="${not empty sessionScope.user}">
			<li class="nav-item">
          ${sessionScope.user.userid}님 반갑습니다
          </li>
			<li class="nav-item active">
            <a class="nav-link" href="/shoppingProject/Main/logout">Logout
              <span class="sr-only">(current)</span>
            </a>
            <c:if test="${sessionScope.user.usertype==1}">
		          <li class="nav-item">
		            <a class="nav-link" href="/shoppingProject/product/list">product list</a>
		          </li>
		          <li class="nav-item">
		            <a class="nav-link" href="/shoppingProject/product/register.jsp">product register</a>
		          </li>
		          <li class="nav-item">
		            <a class="nav-link" href="/shoppingProject/Main/customerlist">Customer List</a>
		          </li>
         </c:if>
         <li class="nav-item">
            <a class="nav-link" href="/shoppingProject/Main/updateview.jsp?userid=${session.userid}">update</a>
          </li>
         <li class="nav-item">
            <a class="nav-link" href="/shoppingProject/basket/basketlist">Cart</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">Order</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">My shopping</a>
          </li>
</c:when>
</c:choose>
      </ul>
      </div>
  </nav>
  