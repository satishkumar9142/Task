package com.reactivework.cityexercise.mainmethod;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.reactivework.cityexercise.customexception.CityCustomException;
import com.reactivework.cityexercise.daofactory.CityFactory;
import com.reactivework.cityexercise.model.City;


public class CityMainMethod {  
	
	private static Logger log = LoggerFactory.getLogger(CityMainMethod.class);
	
	public static void main(String[] args) {
		log.info("Inside CityMainMethod");
		Properties props = new Properties();
		ClassLoader loader = Thread.currentThread().getContextClassLoader();           
		InputStream stream = loader.getResourceAsStream("ds.properties");
		try {
			props.load(stream);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String dataSource = props.getProperty("mysql");
		List<City> allCityData = new ArrayList<>();
		try {
			allCityData = CityFactory.getCityDAO(dataSource).getAllDatafromDS();
		} catch (CityCustomException e) {
			log.error(""+e);
		}
		log.info(""+allCityData);	
	}
}
// 