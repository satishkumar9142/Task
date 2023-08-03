package com.reactiveworks.uncommitted.util;


import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.reactiveworks.uncommitted.customexception.UnCommittedException;

public class ConnectingToDataBase {

	private static final Logger log = LogManager.getLogger(ConnectingToDataBase.class);

	public  Connection getConnection() throws UnCommittedException{
		log.info("Connecting to MySQl");
		Properties props = new Properties();
		InputStream is = getClass().getClassLoader().getResourceAsStream("db.properties");
		InputStreamReader isr = new InputStreamReader(is);
		if(is == null) {
			throw new UnCommittedException("Properties file not found / path is not correct");
		}
		try {
			props.load(isr);
		} catch (IOException e) {
			throw new UnCommittedException("Problem in reading the properties file");
		}
		String driver = props.getProperty("jdbc.driver");
		if (driver != null) {
			try {
				Class.forName(driver) ;
			} catch (ClassNotFoundException e) {
				throw new UnCommittedException("class for driver are not there in properties / not correct ");
			}
		}
		String url = props.getProperty("jdbc.url");
		String username = props.getProperty("jdbc.username");
		String password = props.getProperty("jdbc.password");

		Connection dbConnection;
		try {
			dbConnection = DriverManager.getConnection(url, username,password);
		} catch (SQLException e) {
			throw new UnCommittedException("Database access error");
		}

		return dbConnection;
	}
}
