<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="../Main/header.jsp" %>
    <%@ include file="../Main/side.jsp" %>

 <div class="col-lg-9">

  <form action="join" method="post" id="frm">
    <div class="row">
	    <div class="col">
	
	      <label for="userid">id:</label>
	      <input type="text" class="form-control" id="userid" placeholder="Enter id" name="userid" >
	    </div>
      <div class="col align-self-end" >
          <button  type="button"  id="idcheckBtn"  class="btn btn-primary">중복확인</button>
    </div>
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
      <label for="pwd_check">Password Confirm:</label>
      <input type="password" class="form-control" id="pwd_check" placeholder="Enter password Confirm" name="pwd_check">
    </div>
    

    <div class="form-group">
      <label for="birthdate">birthdate:</label>
      <input type="date" class="form-control" id="birthdate" placeholder="Enter birthdate" name="birthdate">
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
    
    <div class="form-check-inline">
  <label class="form-check-label">
    <input type="radio" class="form-check-input" name="gender" value="man">남
  </label>
</div>
<div class="form-check-inline">
  <label class="form-check-label">
    <input type="radio" class="form-check-input" name="gender"  value="woman">여
  </label>
  </div>
  <br>
    
    <div class="form-check-inline">
  <label class="form-check-label">
    <input type="radio" class="form-check-input" name="usertype" value=1 >관리자
  </label>
</div>
<div class="form-check-inline">
  <label class="form-check-label">
    <input type="radio" class="form-check-input" name="usertype"  value=0 checked>일반회원
  </label>
</div>
<br/>
 <button  id="send"  class="btn btn-primary">Submit</button>
  </form>
</div>

  


