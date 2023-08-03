 package com.reactiveWork.ProductCategory.individualProduct;

import java.util.Map;

import com.reactiveWork.ProductCategory.CustomException.CustomException;


/**
 * 
 * Model Of Laptop Class Which extends to ProcessingDevice Class Model.
 *
 */
public class Laptop extends ProcessingDevice{
	
	String graphicCard;
	
	public String getGraphicCard() {
		return graphicCard;
	}

	/**
	 * Override toString Method which is used to Print the data which can be store in the class Model.
	 */
	@Override 
	public String toString() { 
		return "Laptop [graphicCard=" + graphicCard + ", screenSize=" + screenSize + ", os=" + os + ", batterySize="
				+ batterySize + ", numCore=" + numCore + ", RAM=" + RAM + ", productId=" + productId + ", productName="
				+ productName + ", productType=" + productType + ", price=" + price + ", warranty=" + warranty
				+ ", manufecturedDt=" + manufecturedDt + "]";
	}

	/** 
	 * buildProduct Method Of Laptop model Class Which is used to assign or set the value of class Model Attribute
	 * and its parent model by calling super.builproduct method.
	 * @param map Send the map which store all data of one single line.
	 * @throws CustomException if problem in matching the Data Type from which we want to convert.
	 */
	public void buildProduct(Map<String,String> map) throws CustomException {
		super.buildProduct(map);
		this.graphicCard = map.get("GraphicsCard");
	}
}
