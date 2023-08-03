package com.reactiveworks.productuser.model;

public class WashingMachine extends Product{
	
	int loadCapacity;
	boolean isAutomatic;
	String doorType;
	
	public int getLoadCapacity() {
		return loadCapacity;
	}

	public boolean isAutomatic() {
		return isAutomatic;
	}

	public String getDoorType() {
		return doorType;
	}

	public void setLoadCapacity(int loadCapacity) {
		this.loadCapacity = loadCapacity;
	}

	public void setAutomatic(boolean isAutomatic) {
		this.isAutomatic = isAutomatic;
	}

	public void setDoorType(String doorType) {
		this.doorType = doorType;
	}
	
}

