package com.payment.model;

public class Payment {
	private int paymentid;
	private String userid;
	private int productid;
	private int numbers;
	private String address;
	private String phone;
	private String creditcardnumber;
	private String creditcardpassword;
	private int price;
	private String uploadfile;
	
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getUploadfile() {
		return uploadfile == null ? "" : uploadfile.trim();
	}
	public void setUploadfile(String uploadfile) {
		this.uploadfile = uploadfile;
	}
	public int getPaymentid() {
		return paymentid;
	}
	public void setPaymentid(int paymentid) {
		this.paymentid = paymentid;
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
	public String getAddress() {
		return address == null ? "" : address.trim();
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getphone() {
		return phone == null ? "" : phone.trim();
	}
	public void setphone(String phone) {
		this.phone = phone;
	}
	public String getCreditcardnumber() {
		return creditcardnumber == null ? "" : creditcardnumber.trim();
	}
	public void setCreditcardnumber(String creditcardnumber) {
		this.creditcardnumber = creditcardnumber;
	}
	public String getCreditcardpassword() {
		return creditcardpassword == null ? "" : creditcardpassword.trim();
	}
	public void setCreditcardpassword(String creditcardpassword) {
		this.creditcardpassword = creditcardpassword;
	}
	
	
}
