package com.reactiveWork.ProductCategory.ProductService;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.reactiveWork.ProductCategory.individualProduct.Product;


/**
 * ProductServiceTest2 class used to check failure or error of services method.
 */
public class ProductServiceTest2 {
	private static Logger log = LogManager.getLogger(ProductServiceTest.class);
	private List<Product> list;
	
	/**
	 * setUp method is execute every time before the test case execute so there we can assign the value of the list from calling the services class.
	 * @throws Exception if problem in reading the line or path is not correct.
	 */
	
	@Before
	public void setUp() throws Exception {
		log.info("I am inside setUp method ");
		ProductService service = new ProductService(); 
		list = service.getProductForType("Mobile");
	}
	
	/**
	 * testGetProductForType where we can check data are in proper way or not.
	 */
	
	@Test
	public void testGetProductForType() {
		String expected = list.get(0).getProductType(); 
		String actual = "Laptop";
		Assert.assertEquals(expected, actual);
		log.info("There is no error while Testing the testGetProductForType");
	}
}
