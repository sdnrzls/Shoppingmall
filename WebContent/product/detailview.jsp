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