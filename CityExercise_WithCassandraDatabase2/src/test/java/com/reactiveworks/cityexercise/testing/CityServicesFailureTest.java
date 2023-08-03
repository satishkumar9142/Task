/**
 * 
 * package for com.reactiveworks.cityexercise.testing.
 * 
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
 * failure testing
 *
 */
public class CityServicesFailureTest {
	private static Logger log = LoggerFactory.getLogger(CityServicesSuccessTest.class);
	private List<City> list;
	private CityServices services;
	/**
	 * This is Before annotation.
	 * @throws CityCustomException if path is not valid.
	 */
	@Before
	public void setUp() throws CityCustomException { 
		log.info("Inside CityServicesIdTest setUp");
		CityUtil util = new CityUtil();
		list = util.getCityList("src\\test\\resources\\CityExercis.csv");
		services = new CityServices(list);
	}
	private City idCity= null;
	/**
	 * com.reactiveworks.cityexercise.testing City name by id.
	 * @throws CityCustomException if id is not matched.
	 */
	@Test
	public void testCityName() throws CityCustomException {
		idCity = services.CityName(6996);
		Assert.assertEquals(new Integer(8), idCity.getId());
		log.error("no error in testing id");
	}
	
	private List<City> city;
	/**
	 * com.reactiveworks.cityexercise.testing CountryCode by city details.
	 * @throws CityCustomException if CountryCode is not valid.
	 */
	@Test
	public void testCityNameByCode() throws CityCustomException {
		city = services.CityNameByCode("AF"); 
		for(int i =0;i<city.size();i++) {
			Assert.assertEquals("AFG", city.get(i).getCouCode());
		}
	}
}
