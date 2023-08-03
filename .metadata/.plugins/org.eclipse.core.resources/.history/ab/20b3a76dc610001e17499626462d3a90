package com.reactiveWork.ProductCategory.individualProduct;

import java.util.Map;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.reactiveWork.ProductCategory.CustomException.CustomException;


/**
 * Model Of ProcessingDevice Class Which extends to Product Class Model.
 */
public class ProcessingDevice extends Product{
	private static Logger log = LogManager.getLogger();
	String screenSize;
	String  os;
	int batterySize;
	int numCore;
	int RAM;

	public String getScreenSize() {
		return screenSize;
	}

	public String getOs() {
		return os;
	}

	public int getBatterySize() {
		return batterySize;
	}

	public int getNumCore() {
		return numCore;
	}

	public int getRAM() {
		return RAM;
	}

	/**
	 * 	 buildProduct Method Of ProcessingDevice model Class Which is used to assign or set the value of class Model Attribute
	 *   and its parent model by calling super.builproduct method.
	 *   @param map Send the map which store all data of one single line.
	 * 	 @throws CustomException if problem in matching the Data Type from which we want to convert.
	 */
	public void buildProduct(Map<String,String> map) throws  CustomException{
		log.info("I am inside ProcessingDevice");
		super.buildProduct(map);
		this.screenSize = map.get("ScreenSize");
		this.os = map.get("OS"); 
		try {
			this.batterySize = Integer.parseInt(map.get("BatterySize"));
			this.numCore = Integer.parseInt(map.get("NumCore"));
			this.RAM = Integer.parseInt(map.get("RAM"));
		}
		catch(NumberFormatException e) {
			throw new CustomException("Data Type is not in proper for which dataType we want to convert");
		}
	}
}
