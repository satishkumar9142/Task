package com.reactivework.mysqldemo.databaseconnection;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;

import com.mysql.cj.jdbc.MysqlDataSource;

public class DBUTIL {
	/*
	public Connection getConnection() {
		Connection conn = null;

	    BasicDataSource  bds = new BasicDataSource();
	    bds.setDriverClassName("com.mysql.cj.jdbc.Driver");
	    bds.setUrl("jdbc:mysql://localhost:3306/ipl");
	    bds.setUsername("root");
	    bds.setPassword("root");

	    try{
	        System.out.println("Attempting Database Connection");
	        conn = bds.getConnection();
	        System.out.println("Connected Successfully");
	    }catch(SQLException e){
	        System.out.println("Caught SQL Exception: " + e);
	    }
	    return conn;
	} */

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

			dataSource.setMinIdle(100);
			dataSource.setMaxIdle(1000);
		}
		catch (IOException e) {
			// TODO: handle exception
		}
	}
	public static DataSource gerDataSource() {
		return dataSource;
	}
}
