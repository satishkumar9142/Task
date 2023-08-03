package com.reactiveWork.ProductCategory.individualProduct;

public class AllDevice{
	String productId;
	String productName;
	String productType;
	String price; 
	String warranty; 
	String manufecturedDt;
	String screenSize;
	String  os;
	String batterySize;
	String numCore;
	String RAM;
	String simType;
	String displaySize;
	String displayType; 
	String isSmartTV;
	String loadCapacity;
	String isAutomatic;
	String doorType;
	String graphicCard;
	
	
	public String getProductId() {
		return productId;
	}


	public void setProductId(String productId) {
		this.productId = productId;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public String getProductType() {
		return productType;
	}


	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getWarranty() {
		return warranty;
	}
	public void setWarranty(String warranty) {
		this.warranty = warranty;
	}
	public String getManufecturedDt() {
		return manufecturedDt;
	}
	public void setManufecturedDt(String manufecturedDt) {
		this.manufecturedDt = manufecturedDt;
	}
	public String getScreenSize() {
		return screenSize;
	}
	public void setScreenSize(String screenSize) {
		this.screenSize = screenSize;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public String getBatterySize() {
		return batterySize;
	}
	public void setBatterySize(String batterySize) {
		this.batterySize = batterySize;
	}
	public String getNumCore() {
		return numCore;
	}
	public void setNumCore(String numCore) {
		this.numCore = numCore;
	}
	public String getRAM() {
		return RAM;
	}
	public void setRAM(String rAM) {
		RAM = rAM;
	}
	public String getSimType() {
		return simType;
	}
	public void setSimType(String simType) {
		this.simType = simType;
	}
	public String getDisplaySize() {
		return displaySize;
	}
	public void setDisplaySize(String displaySize) {
		this.displaySize = displaySize;
	}
	public String getDisplayType() {
		return displayType;
	} 
	public void setDisplayType(String displayType) {
		this.displayType = displayType;
	}
	public String getIsSmartTV() {
		return isSmartTV;
	}
	public void setIsSmartTV(String isSmartTV) {
		this.isSmartTV = isSmartTV;
	}
	public String getLoadCapacity() {
		return loadCapacity;
	}
	public void setLoadCapacity(String loadCapacity) {
		this.loadCapacity = loadCapacity;
	}
	public String getIsAutomatic() {
		return isAutomatic;
	}
	public void setIsAutomatic(String isAutomatic) {
		this.isAutomatic = isAutomatic;
	}
	public String getDoorType() {
		return doorType;
	}
	public void setDoorType(String doorType) {
		this.doorType = doorType;
	}
	public String getGraphicCard() {
		return graphicCard;
	}
	public void setGraphicCard(String graphicCard) {
		this.graphicCard = graphicCard;
	}
	@Override
	public String toString() {
		return "AllDevice ["+ productId + ", " + productName + ", " + productType
				+ ", " + price + ", " + warranty + ", " + manufecturedDt + ", "
				+ screenSize + ", " + os + ", " + batterySize + ", " + numCore + ", " + RAM
				+ ", " + displaySize + ", " + displayType + ", " + isSmartTV
				+ ", " + loadCapacity + ", " + isAutomatic + ", " + doorType
				+ ", " + graphicCard + ", " + simType + "]";
	}
}
