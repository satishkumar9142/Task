package com.reactivework.cityexercise.Implimentation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import com.reactivework.cityexercise.customexception.CityCustomException;
import com.reactivework.cityexercise.daoInterface.CityDao;
import com.reactivework.cityexercise.model.City;

public class CityDaoCSVReaderImpl implements CityDao{
	

	@Override
	public List<City> getAllDatafromDS() throws CityCustomException {
		List<City> list = new ArrayList<>();
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
		 .forEach((i-> { 
			  int id = Integer.parseInt(i[0]);
			  String name = i[1];
			  String couCode = i[2];
			  String city = i[3];
			  Long population = Long.parseLong(i[4]);
			  
			  list.add(new City(id, name, couCode, city, population));
			}));
		return list;
	}

}
