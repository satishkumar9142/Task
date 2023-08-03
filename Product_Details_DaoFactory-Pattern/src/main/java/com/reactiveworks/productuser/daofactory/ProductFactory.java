package com.reactiveworks.productuser.daofactory;

import com.reactiveworks.productuser.Implimentation.ProductDaoCSVReaderImpl;
import com.reactiveworks.productuser.Implimentation.ProductDaoMySqlImpl;
import com.reactiveworks.productuser.daointerface.ProductDao;

public class ProductFactory {
	
	 public static ProductDao getCityDAO(String type) { 
	        if (type.equalsIgnoreCase("jdbc")) {
	        	return new ProductDaoMySqlImpl();
	        	 
	        } else if(type.equalsIgnoreCase("CSV")){
	        	return new ProductDaoCSVReaderImpl();
	        }
	        return null;
	    }
}
