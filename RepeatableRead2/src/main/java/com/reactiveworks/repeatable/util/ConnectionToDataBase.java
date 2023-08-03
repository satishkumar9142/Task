package com.reactiveworks.repeatable.util;


import java.io.IOException;


import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.reactiveworks.repeatable.customexception.RepeatableReadException;


public class ConnectionToDataBase {

	private static final Logger log = LogManager.getLogger(ConnectionToDataBase.class);

	public  Connection getConnection() throws RepeatableReadException{
		log.info("Connecting to MySQl");
		Properties props = new Properties();
		InputStream is = getClass().getClassLoader().getResourceAsStream("db.properties");
		InputStreamReader isr = new InputStreamReader(is);
		if(is == null) {
			throw new RepeatableReadException("Properties file not found / path is not correct");
		}
		try {
			props.load(isr);
		} catch (IOException e) {
			throw new RepeatableReadException("Problem in reading the properties file");
		}
		String driver = props.getProperty("jdbc.driver");
		if (driver != null) {
			try {
				Class.forName(driver) ;
			} catch (ClassNotFoundException e) {
				throw new RepeatableReadException("class for driver are not there in properties / not correct ");
			}
		}
		String url = props.getProperty("jdbc.url");
		String username = props.getProperty("jdbc.username");
		String password = props.getProperty("jdbc.password");

		Connection dbConnection;
		try {
			dbConnection = DriverManager.getConnection(url, username,password);
		} catch (SQLException e) {
			throw new RepeatableReadException("Database access error");
		}

		return dbConnection;
	}
}
