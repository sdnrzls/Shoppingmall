<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
   <%@include file="../Main/header.jsp" %>
   <%@ include file="../Main/side.jsp" %>

     
    <div class="col-lg-9">

  <form action="update" method="post" id="frm">
  <input type="hidden"  name="productid" value=${dto.productid }>
    <div class="row">
	    <div class="col">
	
	      <label for="productid"> product id:</label>
	      <input type="text" class="form-control" id="productid" placeholder="Enter id" name="productid" value="${dto.productid }" >
	    </div>
    </div>
    
    <div class="form-group">
      <label for="producttype">product type:</label>
      <input type="text" class="form-control" id="producttype" placeholder="Enter name" name="producttype" value="${dto.producttype }">
    </div>

    <div class="form-group">
      <label for="productname">product name:</label>
      <input type="text" class="form-control" id="productname" placeholder="Enter produc tname" name="productname" value="${dto.productname }">
    </div>
    
    <div class="form-group">
      <label for="explanation">explanation:</label>
      <input type="text" class="form-control" id="explanation" placeholder="Enter explanation" name="explanation" value="${dto.explanation }">
    </div>
    

    <div class="form-group">
      <label for="price">price:</label>
      <input type="text" class="form-control" id="price" placeholder="Enter price" name="price" value="${dto.price }">
    </div>
    
    <div class="form-group">
      <label for="inventory">inventory:</label>
      <input type="text" class="form-control" id="inventory" placeholder="Enter inventory" name="inventory" value="${dto.inventory }">
    </div>
    
    
  <input  type="submit"  id="update" class="btn btn-primary" value="update"></button>
  <input type="button" value="삭제" onclick="location.href='delete?productid=${dto.productid}'">
  <input type="reset" value="취소">
  </form>
</div>

    </div>
    <!-- /.row -->

  </div>
  <!-- /.container -->
   