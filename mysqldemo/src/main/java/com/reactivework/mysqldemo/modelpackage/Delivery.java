package com.reactivework.mysqldemo.modelpackage;

public class Delivery {
	private int matchId;
	private int inning;
	private String battingTeam;
	private String bowlingTeam;
	private int over;
	private int ball;
	private String batsman;
	private String bowller;
	private int wideRun;
	private int byeRun;
	private int legByeRun;
	private int noBallRUn;
	private int penalty;
	private int batsmanRun;
	private int extraRun;
	private int totalRun;
	public int getMatchId() {
		return matchId;
	}
	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}
	public int getInning() {
		return inning;
	}
	public void setInning(int inning) {
		this.inning = inning;
	}
	public String getBattingTeam() {
		return battingTeam;
	}
	public void setBattingTeam(String battingTeam) {
		this.battingTeam = battingTeam;
	}
	public String getBowlingTeam() {
		return bowlingTeam;
	}
	public void setBowlingTeam(String bowlingTeam) {
		this.bowlingTeam = bowlingTeam;
	}
	public int getOver() {
		return over;
	}
	public void setOver(int over) {
		this.over = over;
	}
	public int getBall() {
		return ball;
	}
	public void setBall(int ball) {
		this.ball = ball;
	}
	public String getBatsman() {
		return batsman;
	}
	public void setBatsman(String batsman) {
		this.batsman = batsman;
	}
	public String getBowller() {
		return bowller;
	}
	public void setBowller(String bowller) {
		this.bowller = bowller;
	}
	public int getWideRun() {
		return wideRun;
	}
	public void setWideRun(int wideRun) {
		this.wideRun = wideRun;
	}
	public int getByeRun() {
		return byeRun;
	}
	public void setByeRun(int byeRun) {
		this.byeRun = byeRun;
	}
	public int getLegByeRun() {
		return legByeRun;
	}
	public void setLegByeRun(int legByeRun) {
		this.legByeRun = legByeRun;
	}
	public int getNoBallRUn() {
		return noBallRUn;
	}
	public void setNoBallRUn(int noBallRUn) {
		this.noBallRUn = noBallRUn;
	}
	public int getPenalty() {
		return penalty;
	}
	public void setPenalty(int penalty) {
		this.penalty = penalty;
	}
	public int getBatsmanRun() {
		return batsmanRun;
	}
	public void setBatsmanRun(int batsmanRun) {
		this.batsmanRun = batsmanRun;
	}
	public int getExtraRun() {
		return extraRun;
	}
	public void setExtraRun(int extraRun) {
		this.extraRun = extraRun;
	}
	public int getTotalRun() {
		return totalRun;
	}
	public void setTotalRun(int totalRun) {
		this.totalRun = totalRun;
	}
	@Override
	public String toString() {
		return "Delivery [matchId=" + matchId + ", inning=" + inning + ", battingTeam=" + battingTeam + ", bowlingTeam="
				+ bowlingTeam + ", over=" + over + ", ball=" + ball + ", batsman=" + batsman + ", bowller=" + bowller
				+ ", wideRun=" + wideRun + ", byeRun=" + byeRun + ", legByeRun=" + legByeRun + ", noBallRUn="
				+ noBallRUn + ", penalty=" + penalty + ", batsmanRun=" + batsmanRun + ", extraRun=" + extraRun
				+ ", totalRun=" + totalRun + "]";
	}
}
