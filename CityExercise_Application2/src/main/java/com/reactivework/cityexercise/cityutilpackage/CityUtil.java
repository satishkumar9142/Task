package com.reactivework.cityexercise.cityutilpackage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.reactivework.cityexercise.citycustomexceptionpackage.CityCustomException;
import com.reactivework.cityexercise.citymodelclasspackage.City;

/**
 * 
 * This is CityUtil Class.
 *
 */
public class CityUtil  { 
	private static Logger log = LoggerFactory.getLogger(CityUtil.class); 
	/**
	 * This is method for reading all data from file.
	 * @param path This is path of file from where we read all data.
	 * @return all data of the file.
	 * @throws CityCustomException if path is invalid or numberformat exception
	 */
	@SuppressWarnings("resource") 
	public List<City> getCityList (String path) throws CityCustomException{ 
		log.info("Inside getCityList");
		List<City> data = new ArrayList<City>();    

		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(path));

			String s = "";	 		
			City customer = null;

			while(s != null) 
			{
				int id;
				long population;
				String [] s1 = s.split(",");
				try {
					id = Integer.parseInt(s1[0]);
					population = Long.parseLong(s1[4]);

				}
				catch(NumberFormatException e) {
					try {
						s = br.readLine();
					} catch (IOException e1) {
						log.error("error will Occur in CityUtilClass ");
					}
					continue; 
				}		
				String name = s1[1];
				String countryCode = s1[2];
				String city = s1[3];
				customer = new City(id, name, countryCode, city, population);
				data.add(customer);

				try {
					s = br.readLine();
				} catch (IOException e) {
					log.error("IoException in CityUtil Class");
					throw new CityCustomException("Error reading to File",e);
				} 
			}
		} catch (FileNotFoundException e) {
			log.error("FIleNotFoundException in CityUtil Class");
			throw new CityCustomException("File Not Found / File Path is not Correct",e);
		}
		return data;
	}
}