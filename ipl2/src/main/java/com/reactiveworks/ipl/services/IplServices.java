package com.reactiveworks.ipl.services;


import java.util.ArrayList;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.reactiveworks.ipl.modelclass.Delivery;
import com.reactiveworks.ipl.modelclass.Match;

public class IplServices {
	private static Logger log = LogManager.getLogger();
	/**
	 * getScoreDetails Method where we calculate the data year by and team by.
	 * @param Deliveries List of Delivery Model Class Object 
	 * @param matches List of Match Model Class Object
	 * @return it return the List of year by four, year by six, Year by total Run, team by four, team by six,team by TotalRun.
	 */
	public List<Map<String,Object>> getScoreDetails(List<Delivery> Deliveries,List<Match> matches){
		log.info("I am inside the getScoreDetails Method");

		Map<String, Object> data = new LinkedHashMap<String, Object>(); 

		List<Map<String, Object>> list = new ArrayList<Map<String,Object>>(); 
	/*	
		matches.stream().forEach(y->Deliveries.stream().filter( i -> i.getMatchId() == ( y.getMatchId())).forEach( x -> { 
			if(x.getBatsmanRun() == 4) {
				data.put( "YEAR= " + y.getSeason() + ",TEAM_NAME= " + x.getBattingTeam() + " FOUR ",
						((Integer)data.getOrDefault( "YEAR= " + y.getSeason() + ",TEAM_NAME= " + x.getBattingTeam() + " FOUR ", 0)) + 1 );
			}
			if(x.getBatsmanRun() ==  6 ) {
				data.put( "YEAR= " + y.getSeason() + ",TEAM_NAME= " + x.getBattingTeam() + " SIX ",
						((Integer)data.getOrDefault( "YEAR= " + y.getSeason() + ",TEAM_NAME= " + x.getBattingTeam() + " SIX ", 0)) + 1 );
			}
			data.put( "][YEAR= " + y.getSeason() + ",TEAM_NAME= " + x.getBattingTeam() + " TOTAL_RUN ",
					Integer.parseInt(""+data.getOrDefault( "][YEAR= " + y.getSeason() + ",TEAM_NAME= " + x.getBattingTeam() + " TOTAL_RUN ", 0)) +  x.getTotalRun());
		})); 	*/  
		
		
		matches.stream().collect(Collectors.groupingBy(Match :: getSeason)).entrySet().stream().forEach(match-> {
			int year = match.getKey();
			Deliveries.stream().filter(delivery-> year == (getSeason(delivery.getMatchId(),matches)))
			.collect(Collectors.groupingBy(Delivery :: getBattingTeam)).entrySet().stream()
			.forEach(entry ->{
				String battingteam = entry.getKey();
				List<Delivery>  teamDeliveries = entry.getValue();
				int fours = (int)teamDeliveries.stream().filter(i-> i.getBatsmanRun() == 4).count();
				int sixes = (int)teamDeliveries.stream().filter(i-> i.getBatsmanRun() == 6).count();
				int totalRun = teamDeliveries.stream().mapToInt(Delivery:: getTotalRun).sum();
				Map<String, Object> teamScoreDetails = new LinkedHashMap<>();
				teamScoreDetails.put("YEAR", year);
				teamScoreDetails.put("TEAM_NAME", battingteam);
				teamScoreDetails.put("FOURS_COUNT", fours);
				teamScoreDetails.put("SIXES_COUNT", sixes);
				teamScoreDetails.put("TOTAL_SCORE", totalRun);
				list.add(teamScoreDetails);
			});
		});
//		list.add(data);
		return list;   
	} 
	//=============================================================================================================================

	private int getSeason(int matchId, List<Match> matches) {
		for(Match match : matches) {
			if(match.getMatchId() == matchId)
				return match.getSeason();
		}
		return 0;
	}
	/**
	 * getHighestRunRateTeamName Method where we calculate the data by team of maximum Net Run Rate in a year.
	 * @param Deliveries List of Delivery Model Class Object
	 * @param matches List of Match Model Class Object
	 * @return its return the  which team of maximum Net Run rate in the Year.
	 */
	public List<Map<String,Object>> getHighestRunRateTeamName(List<Delivery> Deliveries,List<Match> matches) {

		log.info("I am inside the getHighestRunRateTeamName Method");

		List<Map<String, Object>> list = new ArrayList<Map<String,Object>>();

		Map<String, Object> totalOver = new LinkedHashMap<String, Object>();

		Map<String, Object> totalRun = new LinkedHashMap<String, Object>();

	// ========================== TOTALRUN and TOTALOVER WITH YEAR AND TEAM =======================================================

		matches.stream().forEach(y-> { Deliveries.stream().filter( i -> i.getMatchId() == y.getMatchId()).forEach( x -> totalRun.put( x.getBattingTeam() + "-" + y.getSeason(), 
				Integer.parseInt(""+totalRun.getOrDefault( x.getBattingTeam() + "-" + y.getSeason(), 0 ))+  x.getTotalRun() ));
		for(int i = 1;i < Deliveries.size();i++) {
			if( y.getMatchId() == Deliveries.get(i-1).getMatchId() ){
				if( !Deliveries.get(i-1).getBattingTeam(). equals(Deliveries.get(i).getBattingTeam())) {
					totalOver.put(Deliveries.get(i-1).getBattingTeam() + "-" + y.getSeason(), 
							Integer.parseInt(""+totalOver.getOrDefault(Deliveries.get(i-1).getBattingTeam() + "-" + y.getSeason(), 0))+ Deliveries.get(i-1).getOver());
				}
			}
		} 
		});		
	// ===================================NET RUN RATE YEAR BY TEAM ==============================================================
		
		Map<String, Object> NetRunRate = new LinkedHashMap<String, Object>();
		totalRun.entrySet().stream().forEach(x -> NetRunRate.put(x.getKey(), (Double.parseDouble(""+x.getValue())/(Integer)totalOver.get(x.getKey()))));
	
	//====================================HIGHEST NET RUNRATE BY YEAR ============================================================

		Map<String, Object> HighestNetRunRateByYear = new LinkedHashMap<String, Object>();

		List<Integer> year = new ArrayList<>();

		year.addAll( matches.stream().map(a-> a.getSeason()).collect(Collectors.toSet()));
		Collections.sort(year);
		
		Map<String, Object> map  = new HashMap<>();

		year.stream().forEach(years->{
			NetRunRate.entrySet().stream().filter(i->years == Integer.parseInt(i.getKey().substring(i.getKey().length()-4,i.getKey().length()))).forEach(x->map.put(x.getKey(), x.getValue()));
			Object max = map.values().stream().max((a,b)->Double.parseDouble(""+a)>Double.parseDouble(""+b) ? 1:-1).get();
			map.entrySet().stream().filter(e -> e.getValue().equals(max)).forEach(x->HighestNetRunRateByYear.put(x.getKey(), x.getValue()));
			map.clear();
		}); 
		list.add(HighestNetRunRateByYear);  
		return list;
	}
}
