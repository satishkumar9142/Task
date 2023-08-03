package com.reactiveWork.ProductCategory.individualProduct;

import java.util.Map;

import com.reactiveWork.ProductCategory.CustomException.CustomException;

/*
 * 	e.) create class TV(DisplaySize:Int,DisplayType:String,isSmartTV:boolean) extends Product  
 */
/**
 *  Model Of TV Class Which extends to Product Class Model.
 *
 */
public class TV  extends Product{

	int displaySize;
	String displayType; 
	boolean isSmartTV;
	 
	
	public int getDisplaySize() {
		return displaySize;
	}

	public String getDisplayType() {
		return displayType;
	}

	public boolean isSmartTV() {
		return isSmartTV;
	}

	/**
	 *  Override toString Method which is used to Print the data which can be store in the class Model.
	 *
	 */
	@Override
	public String toString() {
		return "TV [displaySize=" + displaySize + ", displayType=" + displayType + ", isSmartTV=" + isSmartTV
				+ ", productId=" + productId + ", productName=" + productName + ", productType=" + productType
				+ ", price=" + price + ", warranty=" + warranty + ", manufecturedDt=" + manufecturedDt + "]";
	}

	/**
	 *   buildProduct Method Of TV model Class Which is used to assign or set the value of class Model Attribute
	 *   and its parent model by calling super.builproduct method.
	 *   @param map Send the map which store all data of one single line.
	 * 	 @throws CustomException if problem in matching the Data Type from which we want to convert.
	 */
	public void buildProduct(Map<String,String> map) throws CustomException {
		super.buildProduct(map);
		this.displayType = map.get("DisplayType");
		try {
			this.displaySize = Integer.parseInt(map.get("DisplaySize"));
			this.isSmartTV = Boolean.parseBoolean("isSmartTV");
		}
		catch(NumberFormatException e) {
			throw new CustomException("Data Type is not in proper for which dataType we want to convert");
		}
	}
}
