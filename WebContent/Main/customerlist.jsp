<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
   <%@include file="../Main/header.jsp" %>
   <%@ include file="../Main/side.jsp" %>
<script src="/shoppingProject/js/Main.js"></script>
 
 <div class="col-lg-9">
    <br>
 	<h3>CustomerList</h3><br>
 	<table class="table table-white table-hover">
    <thead>
      <tr>
        <th>Userid</th>
        <th>UserName</th>
        <th>gender</th>
        <th>Birthdate</th>
        <th>Phone</th>
        <th>Email</th>
        <th>Address</th>
        <th>type</th>
        <th></th>
      </tr>
    </thead>
    <tbody>
    
    <c:forEach items="${arr}" var="cm"> <!---->
    	<tr>
    		<td>${cm.userid}</td>
    		<td>${cm.username}</td>
    		<td>${cm.gender}</td>
    		<td>${cm.birthdate}</td>
    		<td>${cm.phone}</td>
    		<td>${cm.email}</td>
    		<td>${cm.address}</td>
    		<td>${mode}</td>	
    		<c:if test="${cm.usertype==0 }">
    		<td>일반회원</td>
    		<td ><a href="/shoppingProject/Main/customerdel?userid=${cm.userid}">삭제</a></td>
    		 </c:if>
    		 <c:if test="${cm.usertype==1 }">	
    		 <td>관리자</td>
    		 </c:if>
    	</tr>
    </c:forEach>
    </tbody>
  </table>
 	</div>
