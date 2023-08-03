package com.reactivework.cityexercise.citymainmethodpackage;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.reactivework.cityexercise.citycustomexceptionpackage.CityCustomException;
import com.reactivework.cityexercise.citymodelclasspackage.City;
import com.reactivework.cityexercise.cityservicespackage.Cassandra_CRUD_Services;
import com.reactivework.cityexercise.cityservicespackage.CityServices;
import com.reactivework.cityexercise.cityutilpackage.CityUtil;
/**
 * 
 * This is the CityExercise Main Method Class.
 *
 */
public class CityMainMethod {  
	private static Logger log = LoggerFactory.getLogger(CityMainMethod.class);
	/**
	 * main method 
	 * @param args - This is main method.
	 */
	public static void main(String[] args) {
		log.info("Inside CityMainMethod");
		List<City> allCityData = new ArrayList<City>();
		CityServices service = null;
		
		List<City> CityNameByCodeAllData = null;
		City id = null;
		City maxPop = null;
		City minPop = null;
		
	//  Create Instance of CityUtil Class
		CityUtil util = new CityUtil();
		try {
			allCityData = util.getCityList("src\\main\\resources\\CityExercise.csv");
			service = new CityServices(allCityData); 
			id = service.CityName(8);
			CityNameByCodeAllData = service.CityNameByCode("AFG");
			minPop = service.minPopulation();   // get minimum population of Customer details  
			maxPop = service.maxPopulation();   // get maximum Population of Customer details  
		} catch (CityCustomException e) {
			System.err.println(e); 
			log.error("error in main Method Class");
		}
		Cassandra_CRUD_Services cassandraservices = new Cassandra_CRUD_Services();
		cassandraservices.CreateKeySpace();
		cassandraservices.CreateTable();
		cassandraservices.InsertData(allCityData);
		log.info("allCityData = " + allCityData + " ] ");
		log.info("id Customer" + id + " ] ");
		log.info("CityCustomer = " + CityNameByCodeAllData + " ] ");
		log.info("Minimum popuplation customer = " + minPop + " ] ");
		log.info("max Population Customer " + maxPop + " ] ");
	}
}
