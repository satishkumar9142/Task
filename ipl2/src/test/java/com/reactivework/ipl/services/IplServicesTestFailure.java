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
import com.reactiveworks.ipl.services.IplServices;


public class IplServicesTestFailure {

	private static Logger log = LogManager.getLogger(IplServicesTest.class);

	private List<Delivery> deliveries;
	private List<Match> matches;
	@Before
	public void setUp() throws IPLException { 
		CsvReader csv = new CsvReader();
		deliveries = csv.getAllDataOfDeliveries("deliveries.csv");
		matches= csv.getAllDataOfMatches("matchesf.csv");
		log.info(deliveries);
		log.info(matches); 
	}	 

	@Test
	public void testGetScoreDetails() { 
		IplServices services = new IplServices();
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		list = services.getScoreDetails(deliveries, matches);
		String obj =""+ list.get(0).get("][YEAR= 2008,TEAM_NAME= Kolkata Knight Riders TOTAL_RUN ");
		Assert.assertEquals("Both Are Equal", "1943", obj);
		log.info("There is no error while testing the GetScoreDetails" );
	}

	@Test
	public void testGetHighestRunRateTeamName() {
		IplServices services = new IplServices();
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		list = services.getHighestRunRateTeamName(deliveries, matches);
		Assert.assertEquals("Both Are Equal", 9.49152542372813, list.get(0).get("Mumbai Indians-2017"));
		log.info("There is no error while testing the testGetHighestRunRateTeamName" );
	}
}
