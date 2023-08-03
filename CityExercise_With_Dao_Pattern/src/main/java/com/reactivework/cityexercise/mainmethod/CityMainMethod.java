package com.reactivework.cityexercise.mainmethod;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.reactivework.cityexercise.customexception.CityCustomException;
import com.reactivework.cityexercise.daowithcsvreader.CityDaoWithCsvReadermpl;
import com.reactivework.cityexercise.daowithdb.CityDaoWithDBImpl;
import com.reactivework.cityexercise.model.City;

public class CityMainMethod {  
	private static Logger log = LoggerFactory.getLogger(CityMainMethod.class);
	public static void main(String[] args) {
		log.info("Inside CityMainMethod");
		
		CityDaoWithDBImpl impl = new CityDaoWithDBImpl();
		List<City> list = new ArrayList<>();
		CityDaoWithCsvReadermpl implcsv = new CityDaoWithCsvReadermpl();
		impl.ReadMySQl();
		try {
			list = implcsv.ReadCsv();
		} catch (CityCustomException e) {
			log.error(""+e);
		}
		log.info(""+list);
		
	}
}
