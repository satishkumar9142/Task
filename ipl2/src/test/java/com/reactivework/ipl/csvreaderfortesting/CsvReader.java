package com.reactivework.ipl.csvreaderfortesting;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import com.reactiveworks.ipl.iplexception.IPLException;
import com.reactiveworks.ipl.modelclass.Delivery;
import com.reactiveworks.ipl.modelclass.Match;

public class CsvReader {

	public List<Delivery> getAllDataOfDeliveries(String path) throws IPLException{
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
	public List<Match> getAllDataOfMatches(String path) throws IPLException{
		 
		List<Match> list = new ArrayList<Match>();
		InputStream is = getClass().getClassLoader().getResourceAsStream("matches.csv");
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
		 .forEach((i-> {Match match = new Match();
						match.setMatchId(Integer.parseInt(i[0]));
						match.setSeason(Integer.parseInt(i[1]));		
						list.add(match);
			}));

		 list.sort((o1,o2) -> o1.getSeason() - (o2.getSeason()));

		return list;
	} 

}
