package com.reactiveworks.ipl.mainmethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.reactiveworks.ipl.iplexception.IPLException;
import com.reactiveworks.ipl.readfromcsv.DeliveriesReadFromCsv;
import com.reactiveworks.ipl.readfromcsv.MatchReadFromCsv;
import com.reactiveworks.ipl.services.IplServices;
/**
 * 
 * MainMethod class which execute the whole program.
 *
 */
public class MainMethod {
	private static Logger log = LogManager.getLogger(MainMethod.class); 
	/**
	 * 
	 * @param args here we read all data of delivery and Match and then we send the data to services class.
	 */
	public static void main(String[] args) {
		List<Map<String, Object>> list1 = new ArrayList<Map<String,Object>>();
		List<Map<String, Object>> list2 = new ArrayList<Map<String,Object>>();
		DeliveriesReadFromCsv dcsv = new DeliveriesReadFromCsv();

		MatchReadFromCsv mcsv = new MatchReadFromCsv(); 

		IplServices services = new IplServices(); 

		try {
			list1 = services.getScoreDetails(dcsv.getAllDataOfDeliveries(), mcsv.getAllDataOfMatches());
			list2 = services.getHighestRunRateTeamName(dcsv.getAllDataOfDeliveries(), mcsv.getAllDataOfMatches());
		} catch (IPLException e) {
			log.error(e);
		} 
		list1.stream().forEach(log::info);
		list2.stream().forEach(log::info);	
	}
}
