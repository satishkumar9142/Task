package com.reactivework.cityexercise.Implimentation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.reactivework.cityexercise.customexception.CityCustomException;
import com.reactivework.cityexercise.daoInterface.CityDao;
import com.reactivework.cityexercise.model.City;

public class CityDaoMySqllmpl implements CityDao {

	private static final String URL = "jdbc:mysql://localhost:3306/person";
	private static final String USER = "root";
	private static final String PASS = "root";
	
	@Override
	public List<City> getAllDatafromDS() throws CityCustomException {
		List<City> AllDatafromDB = new ArrayList<>();
		int id; String name ,countryCode, cityOfCountryCode; Long population;
		City city = null; 
		
		try {
			Connection connection = DriverManager.getConnection(URL, USER, PASS);
			Statement stmt = connection.createStatement();
			String SQL = "SELECT * FROM cityexercise";
		    ResultSet rs  = stmt.executeQuery(SQL);
			while (rs.next()) {
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
		return AllDatafromDB;
	}

}
