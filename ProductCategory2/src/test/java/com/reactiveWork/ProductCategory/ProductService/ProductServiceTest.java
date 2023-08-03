package com.reactiveWork.ProductCategory.ProductService;


import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.reactiveWork.ProductCategory.individualProduct.Product;


/**
 * 
 * ProductServiceTest Class from where test the success case.
 *
 */
public class ProductServiceTest {
	private static Logger log = LogManager.getLogger(ProductServiceTest.class);
	private List<Product> list;
	ProductService service;
	/**
	 * setUp method is execute every time before the test case execute so there we can assign the value of the list from calling the services class.
	 * @throws Exception if problem in reading the line or path is not correct.
	 */
	@Before
	public void setUp() throws Exception {
		log.info("I am inside setUp method ");
		service = new ProductService();	 
	} 
	/**
	 * testGetProductForType where we can check data are in proper way or not.
	 */ 
	@Test
	public void testGetProductForType() {
		list = service.getProductForType("Mobile");
		String expected = list.get(0).getProductType();
		String actual = "Mobile";
		list = service.getProductForType("Laptop");
		String expected2 = list.get(0).getProductType();
		String actual2 = "Laptop";
		Assert.assertEquals(expected2, actual2);
		list = service.getProductForType("TV");
		String expected3 = list.get(0).getProductType();
		String actual3 = "TV";
		Assert.assertEquals(expected3, actual3);
		list = service.getProductForType("WashinMachine");
		String expected4 = list.get(0).getProductType();
		String actual4 = "WashinMachine";
		Assert.assertEquals(expected4, actual4);
		log.info("There is no error while Testing the testGetProductForType");	
	}
}
