package com.reactiveworks.productuser.model;


public class ProcessingDevice extends Product{
	String screenSize;
	String  os;
	int batterySize;
	int numCore;
	int RAM;

	public String getScreenSize() {
		return screenSize;
	}

	public String getOs() {
		return os;
	}

	public int getBatterySize() {
		return batterySize;
	}

	public int getNumCore() {
		return numCore;
	}

	public int getRAM() {
		return RAM;
	}

	public void setScreenSize(String screenSize) {
		this.screenSize = screenSize;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public void setBatterySize(int batterySize) {
		this.batterySize = batterySize;
	}

	public void setNumCore(int numCore) {
		this.numCore = numCore;
	}

	public void setRAM(int rAM) {
		RAM = rAM;
	}
	
}
