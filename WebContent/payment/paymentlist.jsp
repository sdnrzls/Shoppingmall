<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@include file="../Main/header.jsp" %>
   <%@ include file="../Main/side.jsp" %>
   <script   src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
 
<div class="col-lg-9">
<h3>payment List</h3><br>
	<table class="table table-white table-hover">
		<thead>
		<tr>
	
			<th>image</th>
			<th>User ID</th>
			<th>Product ID</th>
			<th>numbers</th>
			<th>price</th>
			<th>address</th>
			<th>phone</th>
			<th>creditcard number</th>
			
		</tr>
		</thead>
		<tbody>
	<c:forEach items="${arr}" var="paylist" >
	
	<tr>
		<td>
		<img src="/shoppingProject/image/${paylist.uploadfile}" width="100" height="100">
		</td>
		<td>${paylist.userid}</td>
		<td>${paylist.productid}</td>		
		<td>${paylist.numbers}</td>
		<td>${paylist.price}</td>
		<td>${paylist.address}</td>
		<td>${paylist.phone}</td>
		<td>${paylist.creditcardnumber}</td>
		</tr>
		</c:forEach>
	</tbody>
	</table>
	


</div>



