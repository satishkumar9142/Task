package com.reactiveWork.ProductCategory.ProductService;

import java.util.ArrayList;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.reactiveWork.ProductCategory.CustomException.CustomException;
import com.reactiveWork.ProductCategory.individualProduct.Laptop;
import com.reactiveWork.ProductCategory.individualProduct.MobileDevice;
import com.reactiveWork.ProductCategory.individualProduct.Product;
import com.reactiveWork.ProductCategory.individualProduct.TV;
import com.reactiveWork.ProductCategory.individualProduct.WashingMachine;
import com.reactiveWork.ProductCategory.util.ProductCSVReader;
/**
 * ProductService Class
 */
public class ProductService {
	private static Logger log = LogManager.getLogger(ProductService.class);

	List<Product> list;
	/**
	 * Constructor from which we can read all data ProductCSVReader class.
	 * @throws CustomException if exception while reading the line or file.
	 */
	
	public ProductService() throws CustomException {
		ProductCSVReader csv = new ProductCSVReader();
		list = csv.getAllProducts();
	} 
	
	/**
	 * getProductForType Method 
	 * @param productType we will pass the ProductType of then itteriate over a list.
	 * @return and the whole product type which are found in the file as a list of product object.
	 */
	public List<Product> getProductForType(String productType){
		List<Product> list1 =new ArrayList<Product>();
		for(int i =0;i<list.size();i++) {
			String s = list.get(i).getProductType();
			if(s.equals(productType)) {
				list1.add(list.get(i)); 
				if("Laptop".equals(s)) {
					Laptop lp = new Laptop();
					log.info("This is Laptop DataType "  + (lp instanceof Laptop));
				}
				if("Mobile".equals(s)) {
					MobileDevice mobile = new MobileDevice();
					log.info("This is MobileDevice DataType "  + (mobile instanceof MobileDevice));
				}
				if("TV".equals(s)) {
					TV tv = new TV();
					log.info("This is TV DataType "  + (tv instanceof TV));
				}
				if("WashinMachine".equals(s)) {
					WashingMachine washing = new WashingMachine();
					log.info("This is WashingMachine DataType "  + (washing instanceof WashingMachine));
				}
			}
		}
		return list1;
	}
} 
