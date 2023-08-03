package com.reactiveworks.userproduct.productavailabilityservice;


import java.util.List;
import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.reactiveworks.userproduct.Usermodel.UserModel;
import com.reactiveworks.userproduct.customexceptionpackage.CustomException;
import com.reactiveworks.userproduct.productcsvreader.ProductCsvReader;
import com.reactiveworks.userproduct.productmodel.Product;
import com.reactiveworks.userproduct.usercsvreader.UserCsvReader;
/**
 * 
 * ProductAvailabilityService class
 *
 */
public class ProductAvailabilityService {

	private static Logger log = LogManager.getLogger(ProductAvailabilityService.class);

	private List<Product> productList;
	private List<UserModel> userList;
	UserCsvReader user = new UserCsvReader();
	ProductCsvReader product = new ProductCsvReader();
	/**
	 * constructor
	 * @throws CustomException if path is not correct or while reading the line.
	 */
	public ProductAvailabilityService() throws CustomException {
		userList = user.getAllUsers();
		productList = product.getAllProducts();
	}
	
	//=====================================================================
	
	/**
	 * 
	 * @param userId give the userId of User Object. they will give the city of user Object and the same 
	 * city will in product Object and add to list of product Object.
	 * @return its return the list of product Object which have same city of user and product that the userId which we have passed. 
	 */
	
	public List<Product> getAllProductForUser(String userId)
	{
		log.info("I am Inside getAllProductForUser Method");
		UserModel user = userList.stream().filter(i->i.getUserId().equals(userId)).collect(Collectors.toList()).get(0);
		String city = user.getCity();
		return productList.stream().filter(i->i.getAvailableCity().contains(city)).collect(Collectors.toList());
	}

	//=========================================================================
	/**
	 * 
	 * @param userId take the userId and call the {@link getAllProductForUser} he will give the list 
	 * of product object of same city for product and User object.
	 * @param productCategory give the city name then he will give the output of same city in product and  store in the list of product object.
	 * @return  its give the same city in list of product object and and city we passed like productCategory.
	 */
	public List<Product> getAllProductForUserForCategory(String userId,String productCategory){
		log.info("I am Inside getAllProductForUserForCategory Method");
		
		List<Product> list1 = getAllProductForUser(userId);
		
		return list1.stream().filter(i->i.getAvailableCity().contains(productCategory)).collect(Collectors.toList());
	}
}
