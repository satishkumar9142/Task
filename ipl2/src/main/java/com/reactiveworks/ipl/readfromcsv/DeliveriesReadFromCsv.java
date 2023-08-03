package com.reactiveworks.ipl.readfromcsv;

import java.io.BufferedReader;



import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import com.reactiveworks.ipl.iplexception.IPLException;
import com.reactiveworks.ipl.modelclass.Delivery;
/**
 * 
 * DeliveriesReadFromCsv class is used to read all data of deliveries csv file to List of Delivery model class Object.
 *
 */
public class DeliveriesReadFromCsv {

	private static Logger log = LogManager.getLogger(DeliveriesReadFromCsv.class);
	/**
	 * getAllDataOfDeliveries Method is used to read the data from the csv file to List of Delivery Object Class.
	 * @return its return the value data read from the csv file and convert to List Of Delivery Object
	 * @throws IPLException if Path is not correct or file not found or problem in reading the line
	 */
	public List<Delivery> getAllDataOfDeliveries() throws IPLException{
		log.info("I am inside the getAllDataOfDeliveries method csv reader");
		List<Delivery> list = new ArrayList<Delivery>();
		InputStream is = getClass().getClassLoader().getResourceAsStream("deliveries.csv");
		InputStreamReader isr = new InputStreamReader(is);	
		if(is == null) {
			throw new IPLException("File Not Found Exception");
		}
		BufferedReader br = new BufferedReader(isr);
		try {
			br.readLine();
		} catch (IOException e) {
			throw new IPLException("Problem in Reading the Line");
		}
	    br.lines().filter(i->i != null).map(i->Pattern.compile(",").split(i))
	    .forEach(i ->{
	    	Delivery delivery = new Delivery();
	    	try {
				delivery.setMatchId(Integer.parseInt(i[0]));
				delivery.setBattingTeam(i[2]);
	  			delivery.setOver(Integer.parseInt(i[4])); 
				delivery.setBatsmanRun(Integer.parseInt(i[13]));
				delivery.setTotalRun(Integer.parseInt(i[15]));
			}
			catch (NumberFormatException e) {
			}
			list.add(delivery); 				
	    });
		return list;
	}
}
