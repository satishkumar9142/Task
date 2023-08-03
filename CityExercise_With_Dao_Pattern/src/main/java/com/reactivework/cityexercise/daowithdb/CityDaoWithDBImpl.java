package com.reactivework.cityexercise.daowithdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CityDaoWithDBImpl implements CityDaoWithDB {
	
	private static Logger log = LoggerFactory.getLogger(CityDaoWithDBImpl.class);
	
	private static final String URL = "jdbc:mysql://localhost:3306/person";
	private static final String USER = "root";
	private static final String PASS = "root";
	
	@Override
	public void ReadMySQl()  {
		try {
			Connection connection = DriverManager.getConnection(URL, USER, PASS);
			Statement stmt = connection.createStatement();
			String SQL = "SELECT * FROM cityexercise";
		    ResultSet rs  = stmt.executeQuery(SQL);
			while (rs.next()) {
				   log.info(rs.getInt("ID")+"  "+rs.getString("name")+"  "+rs.getString("countrycode")+"  " + rs.getString("city")+"  "+ rs.getString("Population"));   
			}
		} catch (SQLException e) {
			log.error(""+e);
		}
	}
}
