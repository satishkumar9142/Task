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
import com.reactiveworks.ipl.modelclass.Match;
/**
 * 
 * MatchReadFromCsv class is used to read all data of Matches csv file to List of Match model class Object.
 *
 */
public class MatchReadFromCsv { 
	private static Logger log = LogManager.getLogger(MatchReadFromCsv.class); 

	/**
	 * getAllDataOfMatches Method is used to read the data from the csv file to List of Match Object Class.
	 * @return its return the value data read from the csv file and convert to List Of Match Object
	 * @throws IPLException if Path is not correct or file not found or problem in reading the line
	 */
	public List<Match> getAllDataOfMatches() throws IPLException{

		log.info("I am inside the getAllDataOfMatches method");
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

		 list.sort((o1,o2) -> o1.getSeason()- (o2.getSeason()));

		return list;
	} 
}
