package com.reactiveworks.userproduct.productcsvreader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.reactiveworks.userproduct.customexceptionpackage.CustomException;
import com.reactiveworks.userproduct.productmodel.Product;
/**
 * 
 * Product Csv reader Class
 *
 */
public class ProductCsvReader {

	private static Logger log = LogManager.getLogger(ProductCsvReader.class);
	/**
	 * getAllProducts method used to read all data from product csv file to List of Product Object.
	 * @return its return the List of Product object.
	 * @throws CustomException if path is not correct or reading the line is not possible.
	 */
	public List<Product> getAllProducts() throws CustomException{
		log.info("I am inside the getAllProducts Method");
		List<Product> list = new ArrayList<Product>();
		Product product;
		BufferedReader br;
		  InputStream is = getClass().getClassLoader().getResourceAsStream("product.csv");
		  InputStreamReader isr = new InputStreamReader(is);
//		try {
			br = new BufferedReader(isr);
			String s = "";

			try {
				s = br.readLine();
				s = br.readLine();
			} catch (IOException e) {

			}
			while(s != null) {
				product = new Product();
				String [] s1 = s.split(",");
				product.setProductId(s1[0]); 
				product.setProductName(s1[1]);
				product.setProductCategory(s1[2]);
				try {
					product.setPrice(Double.parseDouble(s1[3]));
				}
				catch(NumberFormatException e) {
					try {
						s = br.readLine();
					} catch (IOException e1) {
						throw new CustomException("Problem in readint the line");
					}
					continue;
				}
				String [] s2 = s1[4].split("/");
				List<String> city = new ArrayList<String>();
				for(int i =0;i<s2.length;i++) {
					city.add(s2[i]);
				}
				product.setAvailableCity(city);
				list.add(product);
				try {
					s = br.readLine();
				} catch (IOException e) {
					throw new CustomException("Problem in readint the line");

				}
			}
//		} catch (FileNotFoundException e) {
//			throw new CustomException("Path of file not correct/ FIle not found ");
//		}
		return list;
	}
}
