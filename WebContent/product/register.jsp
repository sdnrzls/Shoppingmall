<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@include file="../Main/header.jsp" %>
   <%@ include file="../Main/side.jsp" %>


<div class="col-lg-9">


  <form action="register" method="post" id="frm">
	
	
    <div class="form-group">
      <label for="producttype">product type:</label>
      <input type="text" class="form-control" id="producttype" placeholder="Enter producttype" name="producttype">
    </div>

    <div class="form-group">
      <label for="productname">product name:</label>
      <input type="text" class="form-control" id="productname" placeholder="Enter produc tname" name="productname">
    </div>
    
    <div class="form-group">
      <label for="explanation">explanation:</label>
      <input type="text" class="form-control" id="explanation" placeholder="Enter explanation" name="explanation">
    </div>
    

    <div class="form-group">
      <label for="price">price:</label>
      <input type="text" class="form-control" id="price" placeholder="Enter price" name="price">
    </div>
    
    <div class="form-group">
      <label for="inventory">inventory:</label>
      <input type="text" class="form-control" id="inventory" placeholder="Enter inventory" name="inventory">
    </div>
    
    
 <button  id="send"  class="btn btn-primary">Submit</button>
  </form>
</div>

   </div>
    <!-- /.row -->

  </div>
  <!-- /.container -->	



    