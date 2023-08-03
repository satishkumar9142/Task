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
import com.reactivework.cityexercise.daoInterface.Dao;
import com.reactivework.cityexercise.model.City;
import com.reactivework.cityexercise.model.Product;

public class CityDaoImpl implements Dao{
	
	private static final String URL = "jdbc:mysql://localhost:3306/person";
	private static final String USER = "root";
	private static final String PASS = "root";
	
	@Override
	public void getAllDataFromCSVReader() throws CityCustomException {
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

//		return list;
		 System.out.println("CityCSV");
			for(City prod1 : list)
				System.out.println(prod1);
	}

	@Override
	public void getAllDataFromDB() throws CityCustomException {
		List<City> AllDatafromDB = new ArrayList<>();
		int id; String name ,countryCode, cityOfCountryCode; Long population;
		City city = null; 
		
		try {
			Connection connection = DriverManager.getConnection(URL, USER, PASS);
			Statement stmt = connection.createStatement();
			String SQL = "SELECT * FROM cityexercise";
		    ResultSet rs  = stmt.executeQuery(SQL);
			while (rs.next()) {
//				   log.info(rs.getInt("ID")+"  "+rs.getString("name")+"  "+rs.getString("countrycode")+"  " + rs.getString("city")+"  "+ rs.getString("Population")); 
				   id = rs.getInt("ID");
				   name = rs.getString("name");
				   countryCode = rs.getString("countrycode");
				   cityOfCountryCode = rs.getString("city");
				   population = rs.getLong("Population");
				   city = new City(id, name, countryCode, cityOfCountryCode, population);
				   AllDatafromDB.add(city);
			}
		} catch (SQLException e) {
			throw new CityCustomException("Database connection is not correct");
		}
		 System.out.println("CityDB");
			for(City prod1 : AllDatafromDB)
				System.out.println(prod1);
//		return AllDatafromDB;
	}

}
