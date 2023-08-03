package com.reactivework.mysqldemo.commoncode;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
public class DBUtil {
	public  String [] Util(){
		Properties props = new Properties();

		
		FileInputStream in = null;
		try {
			in = new FileInputStream("src//main//resources//db.properties");
		} catch (FileNotFoundException e) {

		}
		try {
			props.load(in);
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}


		String driver = props.getProperty("jdbc.driver");
		if (driver != null) {
			try {
				Class.forName(driver) ;
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		String url = props.getProperty("jdbc.url");
		String username = props.getProperty("jdbc.username");
		String password = props.getProperty("jdbc.password");
		String [] s = new String[3];
		s[0] = url;
		s[1] = username;
		s[2] = password;
		
		return s;
	}
}
