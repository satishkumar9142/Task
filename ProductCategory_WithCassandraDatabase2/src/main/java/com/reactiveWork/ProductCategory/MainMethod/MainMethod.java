package com.reactiveWork.ProductCategory.MainMethod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.reactiveWork.ProductCategory.CustomException.CustomException;
import com.reactiveWork.ProductCategory.ProductService.CassandraServices;
import com.reactiveWork.ProductCategory.util.ProductCSVReader;
/**
 *    
 *  MainMethod Class It Execute whole Program from there.
 */
public class MainMethod {
	private static Logger log = LogManager.getLogger(MainMethod.class);
	public static void main(String[] args) throws CustomException {
//	 ProductService services = new ProductService();
//	 log.info("" + services.getProductForType("Mobile"));
//	 
	 ProductCSVReader csv = new ProductCSVReader();
	 csv.getAllDevicesDetails();
//	 log.info(csv.getAllProducts());
	 
	 CassandraServices conn = new CassandraServices();
	 conn.CreateKeySpace();
	 conn.CreateTable();
	 conn.InsertData(csv.getAllDevicesDetails());
	} 
}
 