/**
 * package for testing.
 */
package com.reactiveworks.cityexercise.testing;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.reactivework.cityexercise.citycustomexceptionpackage.CityCustomException;
import com.reactivework.cityexercise.citymodelclasspackage.City;
import com.reactivework.cityexercise.cityservicespackage.CityServices;
import com.reactivework.cityexercise.cityutilpackage.CityUtil;

import junit.framework.Assert;
/**
 * 
 * Success com.reactiveworks.cityexercise.testing
 *
 */
public class CityServicesSuccessTest {
	private static Logger log = LoggerFactory.getLogger(CityServicesSuccessTest.class);
	private List<City> list;
	private CityServices services;
	/**
	 * before annotation in testing.
	 * @throws CityCustomException if path is not valid
	 */
	@Before
	public void setUp() throws CityCustomException { 
		log.info("Inside CityServicesIdTest setUp");
		CityUtil util = new CityUtil();
		list = util.getCityList("src\\test\\resources\\CityExercise.csv");
		services = new CityServices(list);
	}
	private City idCity= null; 
	/**
	 * testing the id of the city.
	 * @throws CityCustomException if city is not matched
	 */
	@Test
	public void testCityName() throws CityCustomException {
		idCity = services.CityName(8);
		Assert.assertEquals(new Integer(8), idCity.getId());
		log.error("no error in testing id");
	}

	private List<City> city;
	/**
	 * testing CountryCode with City.
	 * @throws CityCustomException if CountryCode is invalid
	 */
	@Test
	public void testCityNameByCode() throws CityCustomException {
		city = services.CityNameByCode("AFG");
		for(int i =0;i<city.size();i++) {
			Assert.assertEquals("AFG", city.get(i).getCouCode());
		}
	}

	private City maxCity;
	/**
	 * testing maximum population.
	 */
	@Test
	public void testMaxPopulation() {
		maxCity = services.maxPopulation();
		Assert.assertEquals(45890648,maxCity.getPopulation() );
		log.error("no error in testing maxPopulation");
	}

	private City minCity;
	/**
	 *  testing minimum population.
	 */
	@Test
	public void testMinPopulation() {
		minCity = services.minPopulation();
		Assert.assertEquals(595,minCity.getPopulation() );
		log.error("no error in testing min Population");
	}
}
