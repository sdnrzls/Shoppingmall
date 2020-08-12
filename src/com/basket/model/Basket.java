package com.basket.model;

public class Basket {

	private int basketid;
	private String userid;
	private String productid;
	private int numbers;
	private int validity;
	public int getBasketid() {
		return basketid;
	}
	public void setBasketid(int basketid) {
		this.basketid = basketid;
	}
	public String getUserid() {
		return userid == null ? "" : userid.trim();
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getProductid() {
		return productid == null ? "" : productid.trim();
	}
	public void setProductid(String productid) {
		this.productid = productid;
	}
	public int getNumbers() {
		return numbers;
	}
	public void setNumbers(int numbers) {
		this.numbers = numbers;
	}
	public int getValidity() {
		return validity;
	}
	public void setValidity(int validity) {
		this.validity = validity;
	}
	
	
}
