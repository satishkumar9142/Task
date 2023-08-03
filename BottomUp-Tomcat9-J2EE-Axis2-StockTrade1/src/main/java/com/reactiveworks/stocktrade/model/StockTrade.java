package com.reactiveworks.stocktrade.model;


public class StockTrade {
	private String sequrity;
	private String  date;
	private double open;
	private double high;
	private double low;
	private double close;
	private double vol;
	private double adjClose;
    
	public String getSequrity() {
		return sequrity;
	}

	public void setSequrity(String sequrity) {
		this.sequrity = sequrity;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public double getOpen() {
		return open;
	}

	public void setOpen(double open) {
		this.open = open;
	}

	public double getHigh() {
		return high;
	}

	public void setHigh(double high) {
		this.high = high;
	}


	public double getLow() {
		return low;
	}

	public void setLow(double low) {
		this.low = low;
	}

	public double getClose() {
		return close;
	}
	
	public void setClose(double close) {
		this.close = close;
	}

	public double getVol() {
		return vol;
	}

	public void setVol(double vol) {
		this.vol = vol;
	}

	public double getAdjClose() {
		return adjClose;
	}


	public void setAdjClose(double adjClose) {
		this.adjClose = adjClose;
	}
	
	@Override
	public String toString() {
		return "[" + "sequrity=" + sequrity + ", date=" + date + ", open=" + open + ", high=" + high
				+ ", low=" + low + ", close=" + close + ", vol=" + vol + ", adjClose=" + adjClose + "]";
	}
}
