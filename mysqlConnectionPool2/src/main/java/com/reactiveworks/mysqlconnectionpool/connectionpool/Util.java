package com.reactiveworks.mysqlconnectionpool.connectionpool;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Util {
	private static final Logger log = LogManager.getLogger(Util.class);
	
	private static final String DB_USERNAME = "jdbc.username";
	private static final String DB_PASSWORD = "jdbc.password";
	private static final String DB_URL = "jdbc.url";
	private static final String DB_DRIVER_CLASS = "jdbc.driver.class.name";

	private static Properties properties = null;
	private static BasicDataSource dataSource;
	static {
		try{
			properties = new Properties();
			properties.load(new FileInputStream("src//main//resources//db.properties"));

			dataSource = new BasicDataSource();
			dataSource.setDriverClassName(properties.getProperty(DB_DRIVER_CLASS));
			dataSource.setUrl(properties.getProperty(DB_URL));
			dataSource.setUsername(properties.getProperty(DB_USERNAME));
			dataSource.setPassword(properties.getProperty(DB_PASSWORD));

			dataSource.setMinIdle(5);
			dataSource.setMaxIdle(10);
			dataSource.setMaxTotal(15);
		}
		catch (IOException e) {
			log.error("problem in reading");
		}
	}
	public static DataSource gerDataSource() {
		return dataSource;
	}
}
