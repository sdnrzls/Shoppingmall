<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@include file="../Main/header.jsp" %>
   <%@ include file="../Main/side.jsp" %>
   <script   src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
 
<div class="col-lg-9">
<h3>Product List(<span id="cntspan">${count }</span>)</h3><br>
	<table class="table table-white table-hover">
		<thead>
		<tr>
			<th>image</th>
			<th>Product ID</th>
			<th>Product Type</th>
			<th>Product Name</th>
			<th>Explanation</th>
			<th>Price</th>
			<th>Inventory</th>
		</tr>
		</thead>
		<tbody>
	<c:forEach items="${arr}" var="customer" >
	<tr>
		<td><a href="/shoppingProject/product/detailview?productid=${customer.productid}">
		<img src="/shoppingProject/image/${customer.uploadfile}" width="100" height="100"></a></td>
		<td>${customer.productid}</td>
		<td>${customer.producttype}</td>
		<td>${customer.productname}</td>
		<td>${customer.explanation}</td>
		<td>${customer.price}</td>
		<td>${customer.inventory}</td>
		</tr>
		</c:forEach>
	</tbody>
	</table>
		
<select name="field" id="field">
<option value="producttype">type</option>
<option value="productname">name</option>
</select>
<input type="text" name="word" id="word">
<input type="button" value="검색" id="searchBtn">

</div>


