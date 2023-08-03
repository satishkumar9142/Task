package com.reactiveworks.city.util;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import com.reactiveworks.city.exception.CityCustomException;
import com.reactiveworks.city.service.City;

public class CityCsvReader {
	
	public List<City> getAllDataOfCity() throws CityCustomException{
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
		
		 br.lines().filter(line->line != null).map(line->Pattern.compile(",").split(line))
		 .forEach((splitLine-> {
			 			boolean flag = false;
			 			City city = new City();
		 					try {
						    	city.setId(Integer.parseInt(splitLine[0]));
						    	city.setName(splitLine[1]);
						    	city.setCountryCode(splitLine[2]);
						    	city.setCity(splitLine[3]);
						    	city.setPopulation(Integer.parseInt(splitLine[4]));
		 					}
		 					catch (NumberFormatException e) {
		 						flag = true;
							}
		 			 if(!flag) {
		 				 data.add(city);
		 			 }
		 			}));
		 return data;
	}	
	

}
