package com.basket.model;

public class Basket {

	private int basketid;
	private String userid;
	private int productid;
	private int numbers;
	private String uploadfile;
	private int price;
	
	
	public String getUploadfile() {
		return uploadfile == null ? "" : uploadfile.trim();
	}
	public void setUploadfile(String uploadfile) {
		this.uploadfile = uploadfile;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
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
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public int getNumbers() {
		return numbers;
	}
	public void setNumbers(int numbers) {
		this.numbers = numbers;
	}

	
}
