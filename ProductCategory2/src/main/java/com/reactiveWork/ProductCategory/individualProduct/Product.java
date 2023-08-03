package com.reactiveWork.ProductCategory.individualProduct;
/*
 * 
	a.) Create a class Product with following fields Product(ProductId:String,ProductName:String,ProductType:String,Price:Double,Warranty:Int,ManufecturedDt:Date)
 *
 */
import java.time.LocalDate;

import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.reactiveWork.ProductCategory.CustomException.CustomException;

/**
 *   Model Of Product Class.
 */
public class Product {
	private static Logger log = LogManager.getLogger();
	String productId;
	String productName;
	String productType;
	double price; 
	int warranty; 
	LocalDate manufecturedDt;
	
	/**
	 * getProductType Method to get the data from this method.
	 * @return productType
	 */
	public String getProductType() {
		return productType;
	}
	public static Logger getLog() {
		return log;
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
	public LocalDate getManufecturedDt() {
		return manufecturedDt;
	}
	
	/** 
	 * 	
	 * buildProduct Method Of Product model Class Which is used to assign or set the value of class Model Attribute.
	 * @param map Send the map which store all data of one single line.
	 * @throws CustomException if problem in matching the Data Type from which we want to convert.
	 */
	public void buildProduct(Map<String,String> map) throws CustomException{
		log.info("I am inside Product");
		this.productId = map.get("ProductId");
		this.productName = map.get("ProductName");
		this.productType = map.get("ProductType");
		try {
			this.price = Double.parseDouble(map.get("Price"));
			this.warranty = Integer.parseInt(map.get("Warranty"));
		}
		catch(NumberFormatException e) {
			throw new CustomException("Data Type is not in proper for which dataType we want to convert");
		}
		LocalDate date;
		try {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		    date = LocalDate.parse(map.get("ManufecturedDt"), formatter);	
		}
		catch(DateTimeParseException e) {
			throw new CustomException("Date Formate Is not Correct");
		}
		this.manufecturedDt = date;	
	}
}
