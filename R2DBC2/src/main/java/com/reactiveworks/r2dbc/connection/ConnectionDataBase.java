package com.reactiveworks.r2dbc.connection;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import dev.miku.r2dbc.mysql.MySqlConnectionConfiguration;
import dev.miku.r2dbc.mysql.MySqlConnectionFactory;
import io.r2dbc.spi.ConnectionFactory;

public class ConnectionDataBase {
	
	private static Logger log = LogManager.getLogger(ConnectionDataBase.class);
	
	public ConnectionFactory getConnection() throws FileNotFoundException{
	
		Properties props = new Properties();
		InputStream is = getClass().getClassLoader().getResourceAsStream("db.properties");
		InputStreamReader isr = new InputStreamReader(is);
		if(is == null) {
			throw new FileNotFoundException();
		}
		try {
			props.load(isr);
		} catch (IOException e) {
			log.error(e);
		}
		String host = props.getProperty("host");
		int port = Integer.parseInt(props.getProperty("port"));
		String user = props.getProperty("username");
		String password = props.getProperty("password"); 
		String database = props.getProperty("database"); 
		
		  ConnectionFactory connectionFactory = MySqlConnectionFactory.from(MySqlConnectionConfiguration.builder()
	                .host(host)
	                .port(port)
	                .user(user)
	                .password(password)
	                .database(database)
	                .build());
		  return connectionFactory; 
	}
}
