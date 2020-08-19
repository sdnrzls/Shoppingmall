<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
   <%@include file="../Main/header.jsp" %>
   <%@ include file="../Main/side.jsp" %>
   
  <script>
$(function(){
$("#cartin").click(function(){
	if(${empty sessionScope.user}){
		alert("로그인 해주세요");
		return false;
	}else if(${not empty sessionScope.user}){
		alert("장바구니에 성공적으로 담겼습니다");
	}

}); // cartin
});
</script>

   <div class="col-lg-9">
   <h2>product detail explanation</h2>
    <table border="1">
        <tr>
            <td>
                <img src="/shoppingProject/image/${dto.uploadfile}" width="600" height="500">
            </td>
              
            <td>
                <table  style="height: 500px; width: 400px;">
                    <tr align="center">
                        <td>name</td>
                        <td>${dto.productname}</td>
                    </tr>
                    <tr align="center">
                        <td>price</td>
                        <td>${dto.price}</td>
                    </tr>
                    <tr align="center">
                        <td>explanation</td>
                        <td>${dto.explanation}</td>
                    </tr>
                    <tr align="center">
                        <td colspan="2">
                            <form method="post" action="/shoppingProject/basket/insert">
                                <input type="hidden" name="productid" value="${dto.productid}">
                                <input type="hidden" name="uploadfile" value="${dto.uploadfile}">
                                <input type="hidden" name="price" value="${dto.price}">
                                <select name="inventory">
                                    <c:forEach begin="1" end="${dto.inventory}" var="i">
                                        <option value="${i}">${i}</option>
                                    </c:forEach>
                                </select>&nbsp;개
                                <input type="hidden" name="numbers" value="inventory">
                                <input type="submit" name="cartin" id="cartin" value="cart" >
                            </form>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
    </table>
     <div id ="other">
        <a href="/shoppingProject/product/detailview?productid=13">
        <img src="/shoppingProject/image/0 (28).jpg" width="200" height="150"></a>
        
        <a href="/shoppingProject/product/detailview?productid=19">
        <img src="/shoppingProject/image/0 (56).jpg" width="200" height="150" ></a>
        
       <a href="/shoppingProject/product/detailview?productid=34">
       <img  src="/shoppingProject/image/0 (192).jpg" width="200" height="150"></a>
        </div>  
    </div>
    
 
