package com.reactiveworks.ipl.modelclass;
/**
 * 
 * Model of Match Class Object.
 *
 */
public class Match {

	 int matchId;
	 int season;
	public int getMatchId() {
		return matchId;
	}
	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}
	public int getSeason() {
		return season;
	}
	public void setSeason(int season) {
		this.season = season;
	}
	@Override
	public String toString() {
		return  matchId + "," +season;
	}
	
	
}
