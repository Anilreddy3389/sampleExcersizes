package com.streams;

public class Product {

	int productId;
	int productPrice;
	String productName;
	String productBrand;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductBrand() {
		return productBrand;
	}
	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}
	public Product(int productId, int productPrice, String productName, String productBrand) {
		super();
		this.productId = productId;
		this.productPrice = productPrice;
		this.productName = productName;
		this.productBrand = productBrand;
	}
	

	
}

