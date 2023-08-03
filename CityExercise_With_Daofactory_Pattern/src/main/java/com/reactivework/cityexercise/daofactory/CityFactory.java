package com.reactivework.cityexercise.daofactory;

import com.reactivework.cityexercise.Implimentation.CityDaoCSVReaderImpl;
import com.reactivework.cityexercise.Implimentation.CityDaoMySqllmpl;
import com.reactivework.cityexercise.daoInterface.CityDao;

public class CityFactory {
	
	  public static CityDao getCityDAO(String type) {
		  
	        if (type.equalsIgnoreCase("MySql")) {
	        	return new CityDaoMySqllmpl();// new CityDBDAO
	        	
	        } else if(type.equalsIgnoreCase("CSV")){
	        	return new CityDaoCSVReaderImpl();// new CityDBDao
	        }
	        return null;
	    }
}






























