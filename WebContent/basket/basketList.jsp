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
	
			<th>image</th>
			<th>Basket ID</th>
			<th>User ID</th>
			<th>Product ID</th>
			<th>numbers</th>
			<th>price</th>
			<th>delete</th>
			
		</tr>
		</thead>
		<tbody>
	<c:forEach items="${arr}" var="basket" >
	
	<tr>
		<td>
		<img src="/shoppingProject/image/${basket.uploadfile}" width="100" height="100">
		</td>
		<td>${basket.basketid}</td>
		<td>${basket.userid}</td>
		<td>${basket.productid}</td>		
		<td>${basket.numbers}</td>
		<td>${basket.price}</td>
		<td><a href="/shoppingProject/basket/basketdel?basketid=${basket.basketid}" >삭제</a></td>
		</tr>
		</c:forEach>
	</tbody>
	</table>
	
<form name="form" method="post" action="">
<input type="hidden" name="productid" value="${basket.productid}">
<input type="hidden" name="uploadfile" value="${basket.uploadfile}">
<input type="hidden" name="price" value="${basket.price}">
<input type="hidden" name="numbers" value="${basket.numbers}">
<input type="button" value="결제" id="paymentBtn" onclick='paycheck()'>
</form>

</div>

<script>

function paycheck(){
	var gsWin = window.open("about:blank", "winName", 'width=1280, height=650, left=0, top=0, location, menubar, scrollbars, resizable'); 
	var frm = document.form;
	form.action = "/shoppingProject/payment/payment;" 
	form.target = "winName"; 
	form.submit();
	}
</script>

