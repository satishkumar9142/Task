package com.reactiveworks.userproduct.mainmethod;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.reactiveworks.userproduct.customexceptionpackage.CustomException;
import com.reactiveworks.userproduct.productavailabilityservice.ProductAvailabilityService;
import com.reactiveworks.userproduct.productmodel.Product;
/**
 * 
 * MainMEthod class here we read all services that we have creating in productActivityServices.
 *
 */
public class MainMethod {

	private static Logger log = LogManager.getLogger(MainMethod.class);
	/**
	 * 
	 * @param args - main method we read all data of product that are read from productCsvReader class
	 * and call the method getAllProductForUser and getAllProductForUserForCategory to get output.
	 */

	public static void main(String[] args)  {
 
		ProductAvailabilityService service = null;
		try {
			service = new ProductAvailabilityService();
		} catch (CustomException e) {
			log.error("Error while USing the ProductAvailabilityService");
		}
		List<Product> product1 = new ArrayList<Product>();
		List<Product> product2 = new ArrayList<Product>();

		product1 = service.getAllProductForUser("U1004");
		log.info("AllProductForUser" + product1);
		
		product2 = service.getAllProductForUserForCategory("U1008","Mumbai");
		log.info("AllProductForUserForCategory" + product2);
	}
}
