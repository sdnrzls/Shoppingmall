<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@include file="../Main/header.jsp" %>
   <%@ include file="../Main/side.jsp" %>
      
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
	<c:forEach items="${arr}" var="product" >
	<tr>
		<td><a href="detail?productid=${product.productid }">
		<img src="/shoppingProject/image/${product.uploadfile}" width="100" height="100"></a></td>
		<td>${product.productid}</td>
		<td>${product.producttype}</td>
		<td>${product.productname}</td>
		<td>${product.explanation}</td>
		<td>${product.price}</td>
		<td>${product.inventory}</td>
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
    </div>
    <!-- /.row -->

  </div>
  <!-- /.container -->	


<script type="text/javascript">
 $("#searchBtn").click(function() {
	 if($("#word").val()==""){
		 alert("검색어를 입력하세요");
		 $("#word").focus();
		 return false;
	 }
	$.getJSON("search",{"field":$("#field").val(),"word":$("#word").val()},
			function(data) {
				var htmlStr="";
				$.each(data.searchArr,function(key,val){
					htmlStr+="<tr>";
					htmlStr+="<td>"+val.uploadfile+"</td>";
					htmlStr+="<td>"+val.productid+"</td>";
					htmlStr+="<td>"+val.producttype+"</td>";
					htmlStr+="<td>"+val.productname+"</td>";
					htmlStr+="<td>"+val.explanation+"</td>";
					htmlStr+="<td>"+val.price+"</td>";
					htmlStr+="<td>"+val.inventory+"</td>";
					
					htmlStr+="</tr>";
				})
					$("table tbody").html(htmlStr);
					$("#cntSpan").text(data.searchCount.scount);
			}
	)//getJSON
});//searchBtn
</script>
