package com.reactivework.cityexercise.mainmethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.reactivework.cityexercise.customexception.CityCustomException;
import com.reactivework.cityexercise.daoInterface.Dao;
import com.reactivework.cityexercise.daofactory.CityDaoFactory;

public class CityMainMethod {  
	
	private static Logger log = LoggerFactory.getLogger(CityMainMethod.class);
	
	public static void main(String[] args) {
		log.info("Inside CityMainMethod");
		Dao dao = CityDaoFactory.getDAO("PRODUCT");
		try {
			dao.getAllDataFromCSVReader();
			dao.getAllDataFromDB();
		} catch (CityCustomException e) {
			log.error(""+e);
		}
		
		
	}
}
