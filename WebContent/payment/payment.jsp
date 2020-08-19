<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <script   src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<div class="col-lg-9">
<h3>Payment</h3><br>
	<table class="table table-white table-hover">
		<thead>
		<tr>
	
			<th>image</th>
			<th>User ID</th>
			<th>Product ID</th>
			<th>numbers</th>
			<th>price</th>
			
		</tr>
		</thead>
		<tbody>
		<c:set var="gum" value="0" />
	<c:forEach items="${arr}" var="payment" >
	<tr>
		<td>
		<img src="/shoppingProject/image/${payment.uploadfile}" width="100" height="100">
		</td>
		<td id="userid">${payment.userid}</td>
		<td id="productid">${payment.productid}</td>		
		<td id="numbers">${payment.numbers}</td>
		<td id="price">${payment.price}</td>
		</tr>
		<c:set var="gum" value="${payment.price}"/>
		<c:set var="total" value="${total+gum}"/>
		</c:forEach>
		<tr>
		<td>총금액:${total}</td>
		</tr>
	</tbody>
	</table>
</div>
<form action="paymentinsert" method="post">
    <div class="form-group">
      <label for="address">address</label>
      <input type="text" class="form-control" id="address" placeholder="Enter address" name="address">
    </div>
    
    <div class="form-group">
      <label for="phone">phone</label>
      <input type="tel" class="form-control" id="phone" placeholder="Enter phone" name="phone">
    </div>
    
    <div class="form-group">
      <label for="creditcardnumber">creditcard number</label>
      <input type="text" class="form-control" id="creditcardnumber" placeholder="Enter creditcardnumber" name="creditcardnumber">
    </div>
    
    <div class="form-group">
      <label for="creditcardpassword">creditcard password</label>
      <input type="password" class="form-control" id="creditcardpassword" placeholder="Enter creditcardpassword" name="creditcardpassword">
    </div>
    
    <input type="button" value="결제완료" id="pBtn">
    </form>
    
  
    <script>
    $(document).ready(function() {
    	//userid
    	$("#pBtn").click(function() {
    		if($("#address").val()==""){
    			alert("주소를를 입력하세요");
    			$("#addresss").focus();
    			return false;
    		}
    		if($("#phone").val()==""){
    			alert("전화번호를 입력하세요");
    			$("#phone").focus();
    			return false;
    		}
    		if($("#creditcardnumber").val()==""){
    			alert("결제하실 카드 번호를 입력하세요");
    			$("#creditcardnumber").focus();
    			return false;
    		}
    		if($("#creditcardpassword").val()==""){
    			alert("카드의 비밀번호를 입력하세요");
    			$("#creditcardpassword").focus();
    			return false;
    		}
    		alert("주문이 완료되었습니다")
    	   	close();
    	})//send
    });//document
    </script>
    
    



   
 
  
