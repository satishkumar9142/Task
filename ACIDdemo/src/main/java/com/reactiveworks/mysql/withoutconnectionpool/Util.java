package com.reactiveworks.mysql.withoutconnectionpool;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Util {
	private static final Logger log = LogManager.getLogger(Util.class);
	public  String [] util() throws Exception{
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
		String driver = props.getProperty("jdbc.driver");
		if (driver != null) {
			try {
				Class.forName(driver) ;
			} catch (ClassNotFoundException e) {
				log.error(e);
			}
		}
		String url = props.getProperty("jdbc.url");
		String username = props.getProperty("jdbc.username");
		String password = props.getProperty("jdbc.password");
		String [] datafrompropertiesfile = new String[3];
		datafrompropertiesfile[0] = url;
		datafrompropertiesfile[1] = username;
		datafrompropertiesfile[2] = password;
		
		return datafrompropertiesfile;
	}

}
