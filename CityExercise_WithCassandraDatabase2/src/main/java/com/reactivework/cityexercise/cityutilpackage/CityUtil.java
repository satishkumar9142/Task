package com.reactivework.cityexercise.cityutilpackage;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.reactivework.cityexercise.citycustomexceptionpackage.CityCustomException;
import com.reactivework.cityexercise.citymodelclasspackage.City;

public class CityUtil  {

	private static Logger log = LoggerFactory.getLogger(CityUtil.class); 

	public List<City> getCityList (String path) throws CityCustomException{ 
		log.info("Inside getCityList");
		List<City> data = new ArrayList<City>();    
		InputStream is = getClass().getClassLoader().getResourceAsStream("CityExercise.csv");
		InputStreamReader isr = new InputStreamReader(is);

		if(is == null) {
			throw new CityCustomException("File Not Found Exception");
		}
		BufferedReader br = new BufferedReader(isr);
		try {
			br.readLine();
		} catch (IOException e) {
			throw new CityCustomException("Problem in Reading the Line");
		}
		br.lines().filter(i->i != null).map(i->Pattern.compile(",").split(i))
		.forEach(x -> {
			int id = 0;long population = 0;
			try {
				id = Integer.parseInt(x[0]);
				population = Long.parseLong(x[4]);
			}catch (NumberFormatException e) {
				log.error("DataType is not correct");
			}
			String name = x[1];
			String countryCode = x[2];
			String city = x[3];
			data.add(new City(id, name, countryCode, city, population));
		});
		return data;
	}
}