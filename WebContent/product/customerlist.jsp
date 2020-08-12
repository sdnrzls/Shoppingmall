<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@include file="../Main/header.jsp" %>
   <%@ include file="../Main/side.jsp" %>
   <script   src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
   

 <script>
 $(document).ready(function(){
 	$("#send").click(function(){
 		if($("#numbers").val()==""){
 			alert("수량을 입력하세요");
 			$("#numbers").focus();
 			return false;
 		}
 		$.post("zip.do",{"dong":$("#dong").val()},
 		 function(data){
 		  data = JSON.parse(data);
       	  var htmlStr="";
 		  htmlStr +="<table>";
       	  for(var i=0; i<data.jarr.length;i++){
       		  htmlStr+="<tr>";
       		  htmlStr+="<td>"+data.jarr[i].zipcode+"</td>";
       		  htmlStr+="<td>"+data.jarr[i].sido+"</td>";
       		  htmlStr+="<td>"+data.jarr[i].gugun+"</td>";
       		  htmlStr+="<td>"+data.jarr[i].dong+"</td>";
       		  htmlStr+="<td>"+data.jarr[i].bunji+"</td>";
       		  htmlStr+="</tr>";
       	  }
       	    htmlStr+="</table>";
       	  $("#area").html(htmlStr);
         }
 		);//post
 		
 		$("#area").on("click","tr", function(){
 			var address = $("td:eq(1)",this).text()+"  " +
 										   $("td:eq(2)",this).text()+"  " +
 										   $("td:eq(3)",this).text()+"  " +
 										  $("td:eq(4)",this).text();
 			$(opener.document).find("#zipcode").val($("td:eq(0)",this).text());
 			$(opener.document).find("#addr").val(address);
 			self.close();
 			
 		});//area
 	})//send
 })//document
 </script>
      
<div class="col-lg-9">
<h3>Product List(<span id="cntspan">${count }</span>)</h3><br>
	<table class="table table-white table-hover">
		<thead>
		<tr>
			<th>Product ID</th>
			<th>Product Type</th>
			<th>Product Name</th>
			<th>Explanation</th>
			<th>Price</th>
			<th>Inventory</th>
		</tr>
		</thead>
		<tbody>
	<c:forEach items="${arr}" var="board" >
	<tr>
		<td><a href="/shoppingProject/product/detailview?productid=${board.productid}">${board.productid}</a></td>
		<td>${board.producttype}</td>
		<td>${board.productname}</td>
		<td>${board.explanation}</td>
		<td>${board.price}</td>
		<td>${board.inventory}</td>
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


