package com.reactiveworks.userproduct.usercsvreader;

import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.reactiveworks.userproduct.Usermodel.UserModel;
import com.reactiveworks.userproduct.customexceptionpackage.CustomException;
/**
 * 
 * UserCsvReader class
 *
 */
public class UserCsvReader {
	
	private static Logger log = LogManager.getLogger(UserCsvReader.class);
	@SuppressWarnings("resource")
	/**
	 * getAllUsers method used to read all data from USer csv file to List of User Object.
	 * @return its return the List of User object.
	 * @throws CustomException if path is not correct or reading the line is not possible.
	 */
	public List<UserModel> getAllUsers() throws CustomException {
			log.info("I am inside UserCsv File reader");
		List<UserModel> list = new ArrayList<UserModel>();
		UserModel user;
		BufferedReader br;

		 InputStream is = getClass().getClassLoader().getResourceAsStream("User.csv");
		  InputStreamReader isr = new InputStreamReader(is);
//		try {
			br = new BufferedReader(isr);
			String s = "";
			try {
				s = br.readLine();
				s = br.readLine();
			}
			catch(IOException e) {
				throw new CustomException("Problem in reading the line");
			}
			while(s != null) 
			{
				user = new UserModel();
				String [] s1 = s.split(",");
				user.setUserId(s1[0]);
				user.setUserName(s1[1]);
				user.setEmailId(s1[2]);
				user.setPhoneNo(s1[3]);
				user.setCity(s1[4]);	
				try {
					s = br.readLine();
				} catch (IOException e) {
					throw new CustomException("Problem in reading the line");
				}
				list.add(user);
			}
//		} catch (FileNotFoundException e) {
//			throw new CustomException("Path of file is not correct/File not found");
//		}
		return list;
	}
}

