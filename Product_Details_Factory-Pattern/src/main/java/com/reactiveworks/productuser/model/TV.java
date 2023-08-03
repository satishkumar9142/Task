package com.reactiveworks.productuser.model;

public class TV  extends Product{

	int displaySize;
	String displayType; 
	boolean isSmartTV;
	 
	
	public int getDisplaySize() {
		return displaySize;
	}

	public String getDisplayType() {
		return displayType;
	}

	public boolean isSmartTV() {
		return isSmartTV;
	}

	public void setDisplaySize(int displaySize) {
		this.displaySize = displaySize;
	}

	public void setDisplayType(String displayType) {
		this.displayType = displayType;
	}

	public void setSmartTV(boolean isSmartTV) {
		this.isSmartTV = isSmartTV;
	}

	
}
