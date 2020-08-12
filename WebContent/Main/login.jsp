<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@include file="../Main/header.jsp" %>
     <%@ include file="../Main/side.jsp" %>
   
<script>
$(function(){
$("#loginBtn").click(function(){
	if($("#userid").val()==""){
		alert(" ID  입력");
		$("#userid").focus();
		return false;
	}
	if($("#password").val()==""){
		alert("PWD 입력");
		$("#password").focus();
		return false;
	}
	$.ajax({
		type:	"post",
		url:	"login",
		data :{"userid" : $("#userid").val(),"password":$("#password").val()},
		success : function(value) {
					if(value.trim()==0){
						alert("일반회원 로그인");
						location.href="main.jsp"
					}else if(value.trim()==1){
						alert("관리자 로그인");
						location.href="main.jsp"
					}else if(value.trim()==-1){
						alert("회원이 아닙니다. 회원가입 하세요");
						location.href="join.jsp"
					}else if(value.trim()==2){
						alert("비밀번호를 확인하세요");
					}
		},
		error : function(e) {
			alert("error : " + e);
		}
	});//ajax
});//loginBtn
});
</script>

  	<form action="login" method="post">
    <div class="form-group">
      <label for="userid">id</label>
      <input type="text" class="form-control" id="userid" placeholder="Enter id" name="userid">
    </div>
    
    <div class="form-group">
      <label for="pwd">Password</label>
      <input type="password" class="form-control" id="password" placeholder="Enter password" name="password">
    </div>
    
    <div class="form-group form-check">
      <label class="form-check-label">
        <input class="form-check-input" type="checkbox" name="remember"> Remember me
      </label>
    </div>
    
    <input type="button" value="로그인"	id="loginBtn"> 
  </form>

 </div>
    <!-- /.row -->
  </div>
  <!-- /.container -->
  
 

