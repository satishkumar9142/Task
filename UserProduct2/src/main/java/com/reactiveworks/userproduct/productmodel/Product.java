package com.reactiveworks.userproduct.productmodel;

import java.util.List;
/**
 * Model class for Product
 *
 */
public class Product {
	private String productId;
	private String ProductName;
	private String productCategory;
	private double price;
	private List<String> availableCity;
	
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public List<String> getAvailableCity() {
		return availableCity;
	}
	public void setAvailableCity(List<String> availableCity) {
		this.availableCity = availableCity;
	}
	
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", ProductName=" + ProductName + ", productCategory="
				+ productCategory + ", price=" + price + ", availableCity=" + availableCity + "]";
	}
}
