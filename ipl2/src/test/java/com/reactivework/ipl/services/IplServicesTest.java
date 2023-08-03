package com.reactivework.ipl.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.reactivework.ipl.csvreaderfortesting.CsvReader;
import com.reactiveworks.ipl.iplexception.IPLException;
import com.reactiveworks.ipl.modelclass.Delivery;
import com.reactiveworks.ipl.modelclass.Match;
import com.reactiveworks.ipl.readfromcsv.DeliveriesReadFromCsv;
import com.reactiveworks.ipl.readfromcsv.MatchReadFromCsv;
import com.reactiveworks.ipl.services.IplServices;

/**
 * IplServicesTest Class is used for Success Testing
 */
public class IplServicesTest {
	private static Logger log = LogManager.getLogger(IplServicesTest.class);
	
	private List<Delivery> deliveries;
	private List<Match> matches;
	/**
	 * setUp method is used to execute before the test and we read all data of MatchReadFromCsv and DeliveriesReadFromCsv.
	 * @throws IPLException If there is reading the path or reading the line or file not found
	 */ 
	@Before
	public void setUp() throws IPLException {
		log.info("I am inside the setuP Method of sucess class testing");		
		CsvReader csv = new CsvReader();
		deliveries = csv.getAllDataOfDeliveries("deliveries.csv");
		matches= csv.getAllDataOfMatches("matches.csv");
	}
	
	/**
	 * Testing GetScoreDetails method is correct or not. 
	 */
	@Test
	public void testGetScoreDetails() { 
		
		IplServices services = new IplServices();
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		list = services.getScoreDetails(deliveries, matches);
	   	String obj =""+ list.get(0).get("][YEAR= 2008,TEAM_NAME= Kolkata Knight Riders TOTAL_RUN ");
		Assert.assertEquals("Both Are Equal", "1942", obj);
		log.info("There is no error while testing the GetScoreDetails" );
	}
	@Test
	public void testGetHighestRunRateTeamName() {  
		IplServices services = new IplServices();
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		list = services.getHighestRunRateTeamName(deliveries, matches);
		Assert.assertEquals("Both Are Equal",8.873239436619718, list.get(0).get("Chennai Super Kings-2008"));
		log.info("There is no error while testing the testGetHighestRunRateTeamName" );
	}
}
