package com.reactivework.mysqldemo.csvreaderpackage;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import com.reactivework.mysqldemo.dataaddtomysql.WriteToDeliveries;
import com.reactivework.mysqldemo.modelpackage.Delivery;
import com.reactivework.mysqldemo.mysqlexception.MysqlException;

public class DeliveryCSVReader {
	private static Logger log = (Logger) LogManager.getLogger(DeliveryCSVReader.class);
	
	public List<Delivery> getAllDataOfDeliveries() throws MysqlException{
		log.info("I am inside the getAllDataOfDeliveries method csv reader");
		List<Delivery> list = new ArrayList<Delivery>();
		WriteToDeliveries conn = new WriteToDeliveries();
		InputStream is = getClass().getClassLoader().getResourceAsStream("deliveries.csv");
		InputStreamReader isr = new InputStreamReader(is);	
		if(is == null) {
			throw new MysqlException("File Not Found Exception");
		}
		BufferedReader br = new BufferedReader(isr);
		try {
			br.readLine();
		} catch (IOException e) {
			throw new MysqlException("Problem in Reading the Line");
		}
	    br.lines().filter(i->i != null).map(i->Pattern.compile(",").split(i))
	    .forEach(i ->{
	    	Delivery delivery = new Delivery();
	    	try {
				delivery.setMatchId(Integer.parseInt(i[0]));
				delivery.setInning(Integer.parseInt(i[1]));
				delivery.setBattingTeam(i[2]);
				delivery.setBowlingTeam(i[3]);
				delivery.setOver(Integer.parseInt(i[4]));
				delivery.setBall(Integer.parseInt(i[5]));
				delivery.setBatsman(i[6]);
				delivery.setBowller(i[7]);
				delivery.setWideRun(Integer.parseInt(i[8]));
				delivery.setByeRun(Integer.parseInt(i[9]));
				delivery.setLegByeRun(Integer.parseInt(i[10]));
				delivery.setNoBallRUn(Integer.parseInt(i[11]));
				delivery.setPenalty(Integer.parseInt(i[12]));
				delivery.setBatsmanRun(Integer.parseInt(i[13]));
				delivery.setExtraRun(Integer.parseInt(i[14]));
				delivery.setTotalRun(Integer.parseInt(i[15]));
			}
			catch (NumberFormatException e) {
			}
	    	conn.connectingToSql(delivery);
			list.add(delivery); 
	    });
		return list;
	}
}
