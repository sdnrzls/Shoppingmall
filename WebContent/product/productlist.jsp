<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@include file="../Main/header.jsp" %>
   <%@ include file="../Main/side.jsp" %>
   <script   src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
 
<div class="col-lg-9">

  <div class="row">
  
	<c:forEach items="${arr}" var="customer" >

	<div class="col-lg-4 col-md-6 mb-4">
            <div class="card h-100">
              <a href="/shoppingProject/product/detailview?productid=${customer.productid}">
              <img class="card-img-top" src="/shoppingProject/image/${customer.uploadfile}" alt=""></a>
              <div class="card-body">
                <h4 class="card-title">
                 ${customer.productname}
                </h4>
                <h5>${customer.price}</h5>
                <p class="card-text">${customer.explanation}</p>
                <p class="card-text">재고 : ${customer.inventory}</p>
                <p class="card-text" hidden="${customer.producttype}"></p>
              </div>
              <div class="card-footer">
                <small class="text-muted">&#9733; &#9733; &#9733; &#9733; &#9734;</small>
              </div>
            </div>
          </div>
          	</c:forEach>
		
</div>
</div>

<select name="field" id="field">
<option value="productname">name</option>
</select>
<input type="text" name="word" id="word">
<input type="button" value="검색" id="searchBtn">


