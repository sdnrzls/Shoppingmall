<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="../Main/header.jsp" %>
    <%@ include file="../Main/side.jsp" %>


 <div class="col-lg-9">

  <form action="update" method="post" id="frm">
    <div class="row">
	    <div class="col">
	
  <div class="form-group">
      <label for="userid">userid:</label>
      <input type="text" class="form-control" id="userid"  name="userid" readonly="readonly">
    </div>

    <div class="form-group">
      <label for="username">username:</label>
      <input type="text" class="form-control" id="username" placeholder="Enter name" name="username">
    </div>

    <div class="form-group">
      <label for="pwd">Password:</label>
      <input type="password" class="form-control" id="password" placeholder="Enter password" name="password">
    </div>
    
    
    <div class="form-group">
      <label for="email">Email:</label>
      <input type="text" class="form-control" id="email" placeholder="Enter Eamil" name="email">
    </div>
    
    <div class="form-group">
      <label for="phone">phone:</label>
      <input type="tel" class="form-control" id="phone" placeholder="Enter phone" name="phone">
    </div>
    
    <div class="form-group">
      <label for="address">address:</label>
      <input type="text" class="form-control" id="address" placeholder="Enter address" name="address">
    </div>
    
  
 <button  id="updatesend"  class="btn btn-primary">Submit</button>
  </form>
</div>