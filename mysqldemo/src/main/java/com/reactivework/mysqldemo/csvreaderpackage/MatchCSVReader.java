package com.reactivework.mysqldemo.csvreaderpackage;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.reactivework.mysqldemo.dataaddtomysql.WriteToMatches;
import com.reactivework.mysqldemo.modelpackage.Match;
import com.reactivework.mysqldemo.mysqlexception.MysqlException;


public class MatchCSVReader {
	private static Logger log = LogManager.getLogger(MatchCSVReader.class); 

	public List<Match> getAllDataOfMatches() throws MysqlException{

		log.info("I am inside the getAllDataOfMatches method");
		List<Match> list = new ArrayList<Match>();
		InputStream is = getClass().getClassLoader().getResourceAsStream("matches.csv");
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
		.forEach(i-> {Match match = new Match();
		try {
			match.setMatchId(Integer.parseInt(i[0]));
			match.setSeason(Integer.parseInt(i[1]));	
		}catch (NumberFormatException e) {
		}
		try {
			match.setCity(i[2]);		
			match.setDate(i[3]);		
			match.setTeam1(i[4]);		
			match.setTeam2(i[5]);		
			match.setToss_Win(i[6]);
			match.setToss_decisions(i[7]);
			match.setResult(i[8]);
			match.setWinner(i[9]);	
		}catch(ArrayIndexOutOfBoundsException e){
			
		}
		list.add(match);
		WriteToMatches conn = new WriteToMatches();
		conn.connectingToSql(match);
		});

		list.sort((o1,o2) -> o1.getSeason()- o2.getSeason());

		return list;
	} 
}
