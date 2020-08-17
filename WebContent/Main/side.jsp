<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
   <script src="/shoppingProject/js/Main.js"></script>
   
     <!-- Bootstrap core CSS -->
  <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

  <!-- Custom styles for this template -->
  <link href="css/shop-homepage.css" rel="stylesheet">
	<style>
	ul{
  	 list-style:none;
  		 }
	</style>

	<div class="container">
	<div class="row">
      <div class="col-lg-3">

        <h1 class="my-4"><img src="/shoppingProject/image/title.png"></h1>
        <div class="list-group">
        Category
          <ul class="list-group-item">
          <li><a href="/shoppingProject/product/productlist?producttype=${1}">Outerwear</a></li>
          <li><a href="/shoppingProject/product/productlist?producttype=${2}" >Tops</a></li>
          <li><a href="/shoppingProject/product/productlist?producttype=${3}" >Bottoms</a></li>
          <li><a href="/shoppingProject/product/productlist?producttype=${4}" >shoes</a></li>
          <li><a href="/shoppingProject/product/productlist?producttype=${5}" >Accessories</a></li>
          </ul>
          Community
          <ul class="list-group-item">
          <li><a href="#" >공지사항</a></li>
          <li><a href="#" >상품 사용후기</a></li>
          <li><a href="#" >상품 Q&A</a></li>
          <li><a href="#" >자유게시판</a></li>
          <li><a href="#" >갤러리</a></li>
          </ul>
          Contact
          <ul class="list-group-item">
          <li><img src="">051-802-3500</li>
          <li>AM 11:30 ~PM 22:00 </li>
          <li>Lunch 12:00~13:00</li>
          <li>오프라인 토,일 정상엽업</li>
          <li>온라인 토,일 휴무</li>
          <li><a href="#" ><img src="/shoppingProject/image/facebook.png" width="30" height="30"></a>
          <a href="#" ><img src="/shoppingProject/image/instagram.png" width="30" height="30"></a>
         <a href="#" ><img src="/shoppingProject/image/youtube.png" width="30" height="30"></a></li>

 
          </ul>
          
        </div>
      </div>



