package com.reactivework.cityexercise.daofactory;

import com.reactivework.cityexercise.Implimentation.CityDaoImpl;
import com.reactivework.cityexercise.Implimentation.ProductDaoImpl;
import com.reactivework.cityexercise.daoInterface.Dao;

public class CityDaoFactory {
	
	  public static Dao getDAO(String type) { 
	        if (type.equalsIgnoreCase("CITY")) {
	        	return new CityDaoImpl();
	        	 
	        } else if(type.equalsIgnoreCase("PRODUCT")){
	        	return new ProductDaoImpl();
	        }
	        return null;
	    }
}
