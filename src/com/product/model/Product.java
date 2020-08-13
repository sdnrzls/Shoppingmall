package com.product.model;

public class Product {
	
	private int productid;
	private int producttype;
	private String productname;
	private String explanation;
	private int price;
	private int inventory;
	private String uploadfile;
	
	

	public String getUploadfile() {
		return uploadfile == null ? "" : uploadfile.trim();
	}
	public void setUploadfile(String uploadfile) {
		this.uploadfile = uploadfile;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public int getProducttype() {
		return producttype;
	}
	public void setProducttype(int producttype) {
		this.producttype = producttype;
	}
	public String getProductname() {
		return productname == null ? "" : productname.trim();
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getExplanation() {
		return explanation == null ? "" : explanation.trim();
	}
	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getInventory() {
		return inventory;
	}
	public void setInventory(int inventory) {
		this.inventory = inventory;
	}
	
	
}
