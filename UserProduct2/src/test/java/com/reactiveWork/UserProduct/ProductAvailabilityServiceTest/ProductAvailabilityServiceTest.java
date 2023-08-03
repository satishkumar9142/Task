package com.reactiveWork.UserProduct.ProductAvailabilityServiceTest;


import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.reactiveworks.userproduct.customexceptionpackage.CustomException;
import com.reactiveworks.userproduct.productavailabilityservice.ProductAvailabilityService;
import com.reactiveworks.userproduct.productcsvreader.ProductCsvReader;
import com.reactiveworks.userproduct.productmodel.Product;
import com.reactiveworks.userproduct.usercsvreader.UserCsvReader;
/**
 * 
 * ProductAvailabilityServiceTest success testing class 
 *
 */
public class ProductAvailabilityServiceTest {
	
	private static Logger log = LogManager.getLogger(ProductAvailabilityServiceTest.class);
	
	private List<Product> productAllData;
	UserCsvReader user = new UserCsvReader(); 
	ProductCsvReader product = new ProductCsvReader();
	ProductAvailabilityService services;

	/**
	 * SetUp method which will execute before the test annotation
	 * @throws CustomException if the path of file is not correct or problem in reading the line
	 * 
	 */
	@Before
	public void setUp() throws CustomException {
		log.info("I am inside the SetUp Method");
		productAllData = product.getAllProducts();
		services = new ProductAvailabilityService();
	}

	/**
	 * testGetAllProductForUser that will check the GetAllProductForUser method logic is correct or not.
	 */
	@Test
	public void testGetAllProductForUser() {
		List<Product> expected= new ArrayList<Product>();
		List<Product> actual = new ArrayList<Product>();
		actual = services.getAllProductForUser("U1007");
		String city = "Pune";
		for(int i = 0;i<productAllData.size();i++) {
			List<String> list1 = productAllData.get(i).getAvailableCity();
			for(int j =0;j <list1.size();j++) {
				if((list1.get(j)).equals(city)) {
					expected.add(productAllData.get(i));
				}
			} 
		}
		
			Assert.assertEquals(actual.get(0).getProductId(), expected.get(0).getProductId());
			Assert.assertEquals(actual.get(0).getProductCategory(), expected.get(0).getProductCategory());
			Assert.assertEquals("" + actual.get(0).getPrice(),"" +expected.get(0).getPrice());
			Assert.assertEquals(actual.get(0).getAvailableCity(), expected.get(0).getAvailableCity());
		
		log.error("There is no error while testing the testGetAllProductForUser");
	}

	/**
	 * testGetAllProductForUserForCategory that will check the GetAllProductForUserForCategory method logic is correct or not.
	 * 
	 */
	@Test
	public void testGetAllProductForUserForCategory() {
		List<Product> expected= new ArrayList<Product>();
		List<Product> actual = new ArrayList<Product>();
		String city = "Pune";
		
		actual = services.getAllProductForUserForCategory("U1007",city);
		
		for(int i = 0;i<productAllData.size();i++) {
			List<String> list1 = productAllData.get(i).getAvailableCity();
			for(int j =0;j <list1.size();j++) {
				if((list1.get(j)).equals(city)) {
					expected.add(productAllData.get(i));
				}
			} 
		}

			Assert.assertEquals(actual.get(0).getProductId(), expected.get(0).getProductId());
			Assert.assertEquals(actual.get(0).getProductCategory(), expected.get(0).getProductCategory());
			Assert.assertEquals("" + actual.get(0).getPrice(),"" +expected.get(0).getPrice());
			Assert.assertEquals(actual.get(0).getAvailableCity(), expected.get(0).getAvailableCity());
		
		log.error("There is no error while testing the testGetAllProductForUserForCategory");
	}

}
