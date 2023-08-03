package com.reactiveWork.ProductCategory.util;

import java.io.BufferedReader;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.reactiveWork.ProductCategory.CustomException.CustomException;
import com.reactiveWork.ProductCategory.individualProduct.Laptop;
import com.reactiveWork.ProductCategory.individualProduct.MobileDevice;
import com.reactiveWork.ProductCategory.individualProduct.Product;
import com.reactiveWork.ProductCategory.individualProduct.TV;
import com.reactiveWork.ProductCategory.individualProduct.WashingMachine;
/**
 * 
 * ProductCSVReader Class its read all data from the csv file.
 *
 */
public class ProductCSVReader {
	
	private static Logger log = LogManager.getLogger(ProductCSVReader.class);
	
//====================================================================================
	/** 
	 * getAllProducts Method WHich read the line by line of csv file. 
	 * @return its return List of product Object.
	 * @throws CustomException if data type not matched or file not found 
	 * or path is not correct or problem in reading the line
	 */
	public List<Product> getAllProducts() throws CustomException {
		log.info("I am inside the getAllProducts");
		List<Product> list= new ArrayList<Product>(); 
		BufferedReader br;
		String s ="";
		String s1 ="";
		  InputStream is = getClass().getClassLoader().getResourceAsStream("ProductDetail.txt");
		  InputStreamReader streamReader = new InputStreamReader(is, StandardCharsets.UTF_8);
        
//		try { 
			br = new BufferedReader(streamReader);
			try { 
				s = br.readLine();
				s1 = br.readLine();
			} catch (IOException e) {
				throw new CustomException("problem in reading the line");
			}
			
			String [] s2 = s.split(",");
			
			while(s1 != null) {		
				String [] s3 = s1.split(",");
				
				Map<String, String> map = new LinkedHashMap<String, String>();
				map = readLineInMap(s2, s3);
				list.add(SendMapToModelClass(map));
				
				try {
					s1 = br.readLine();
				} catch (IOException e) {
					throw new CustomException("problem in reading the line");
				}
			}
//		} catch (FileNotFoundException e) {
//			throw new CustomException("path of file is not correct/ or File Not found on this path");
//		}
		return list; 
	}
// ==============================================================================
	/**
	 * 
	 * @param map its take from getAllProducts method and call to the buildProduct method to set the data to model class Object.
	 * @return it return product type data to getAllProducts method.
	 * @throws CustomException if datType not matched.
	 */
	private static Product SendMapToModelClass(Map<String, String> map) throws CustomException {
		if(map.get("ProductType").equals("Laptop")) {
			Laptop laptop = new Laptop();
			laptop.buildProduct(map);
			return laptop;
		}
		if(map.get("ProductType").equals("Mobile")) {
			MobileDevice mobile = new MobileDevice();
			mobile.buildProduct(map);
			return mobile;
		}
		if(map.get("ProductType").equals("TV")) {
			TV tv = new TV();
			tv.buildProduct(map);
			return tv;
		}
		if(map.get("ProductType").equals("WashinMachine")) {
			WashingMachine washinMachine = new WashingMachine();
			washinMachine.buildProduct(map);
			return washinMachine;
		}
		return null;
	}
 
//================================================================================
	
	/**
	 * 
	 * @param s it is a array of the split line which can store in a key.
	 * @param s1 it is a array of split the line which can store in a value.
	 * @return its return the map to getAllProducts method.
	 */
	private static Map<String,String> readLineInMap(String [] s, String [] s1) {
		Map<String,String> map = new LinkedHashMap<String,String>();
		for(int i=0;i<s.length;i++) {
			try {
				map.put(s[i], s1[i]);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				map.put(s[i], "");
			}
		}
		return map;
	}
//======================================================================
}
