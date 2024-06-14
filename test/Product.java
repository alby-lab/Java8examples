package com.demo.test;

public class Product {

	private int productId;
	private int productPrice;
	public Product(int productId, int productPrice) {
		super();
		this.productId = productId;
		this.productPrice = productPrice;
	}
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
	
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productPrice=" + productPrice + "]";
	}

}
