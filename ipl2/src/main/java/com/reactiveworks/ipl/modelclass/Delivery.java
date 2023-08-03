package com.reactiveworks.ipl.modelclass;
/**
 * 
 * Model Class For Delivery
 *
 */
public class Delivery {
     int matchId;
     String battingTeam;
     int over;
     int batsmanRun;
     int totalRun;
	public int getMatchId() {
		return matchId;
	}
	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}
	public String getBattingTeam() {
		return battingTeam;
	}
	public void setBattingTeam(String battingTeam) {
		this.battingTeam = battingTeam;
	}
	public int getOver() {
		return over;
	}
	public void setOver(int over) {
		this.over = over;
	}
	public int getBatsmanRun() {
		return batsmanRun;
	}
	public void setBatsmanRun(int batsmanRun) {
		this.batsmanRun = batsmanRun;
	}
	public int getTotalRun() {
		return totalRun;
	}
	public void setTotalRun(int totalRun) {
		this.totalRun = totalRun;
	}
	@Override
	public String toString() {
		return "Delivery [matchId=" + matchId + ", battingTeam=" + battingTeam + ", over=" + over + ", batsmanRun="
				+ batsmanRun + ", totalRun=" + totalRun + "]";
	}
	
	
}
