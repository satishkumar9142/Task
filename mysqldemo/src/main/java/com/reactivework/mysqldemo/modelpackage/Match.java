package com.reactivework.mysqldemo.modelpackage;

import java.sql.Connection;

public class Match {
	private int matchId;
	private int season;
	private String city;
	private String date;
	private String team1;
	private String team2;
	private String toss_Win;
	private String toss_decisions;
	private String result;
	private String winner;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTeam1() {
		return team1;
	}
	public void setTeam1(String team1) {
		this.team1 = team1;
	}
	public String getTeam2() {
		return team2;
	}
	public void setTeam2(String team2) {
		this.team2 = team2;
	}
	public String getToss_Win() {
		return toss_Win;
	}
	public void setToss_Win(String toss_Win) {
		this.toss_Win = toss_Win;
	}
	public String getToss_decisions() {
		return toss_decisions;
	}
	public void setToss_decisions(String toss_decisions) {
		this.toss_decisions = toss_decisions;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getWinner() {
		return winner;
	}
	public void setWinner(String winner) {
		this.winner = winner;
	}
	@Override
	public String toString() {
		return "Match [matchId=" + matchId + ", season=" + season + ", city=" + city + ", date=" + date + ", team1="
				+ team1 + ", team2=" + team2 + ", toss_Win=" + toss_Win + ", toss_decisions=" + toss_decisions
				+ ", result=" + result + ", winner=" + winner + "]";
	}
	
	
}
