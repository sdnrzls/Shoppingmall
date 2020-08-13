<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@include file="../Main/header.jsp" %>
   <%@ include file="../Main/side.jsp" %>
   <script   src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
 
<div class="col-lg-9">
<h3>Product List</h3><br>
	<table class="table table-white table-hover">
		<thead>
		<tr>
			<th>Check</th>
			<th>image</th>
			<th>Basket ID</th>
			<th>User ID</th>
			<th>Product ID</th>
			<th>numbers</th>
			<th>price</th>
			
		</tr>
		</thead>
		<tbody>
	<c:forEach items="${arr}" var="basket" >
	<tr>
		<td><input type="checkbox"></td>
		<td>
		<img src="/shoppingProject/image/${basket.uploadfile}" width="100" height="100">
		</td>
		<td>${basket.basketid}</td>
		<td>${basket.userid}</td>
		<td>${basket.productid}</td>		
		<td>${basket.numbers}</td>
		<td>${basket.price}</td>
		</tr>
		</c:forEach>
	</tbody>
	</table>
		

<input type="button" value="결제" id="paymentBtn">

</div>


