package com.reactiveworks.productuser.model;

public class Product {
	String productId;
	String productName;
	String productType;
	double price; 
	int warranty; 
	String manufecturedDt;

	public String getProductType() {
		return productType;
	}
	public String getProductId() {
		return productId;
	}
	public String getProductName() {
		return productName;
	}
	public double getPrice() {
		return price;
	}
	public int getWarranty() {
		return warranty;
	}
	public String getManufecturedDt() {
		return manufecturedDt;
	}
	public void setManufecturedDt(String manufecturedDt) {
		this.manufecturedDt = manufecturedDt;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}
}
