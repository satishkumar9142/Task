package com.reactivework.cityexercise.model;

public class Product {
	
	private String productId;
	private String productName;
	private String productType;
	private String price;
	private String warranty;
	private String ManufectureDate;
	private String screenSize;
	private String OS;
	private String batterySize;
	private String NumCore;
	private String ram;
	private String simType;
	private String DisplaySize;
	private String DisplayType;
	private String isSmartTV;
	private String loadCapacity;
	private String isAutomation;
	private String doorType;
	private String GraphicsCard;
	
	public Product() {
	}

	public Product(String productId, String productName, String productType, String price, String warranty,
			String manufectureDate, String screenSize, String oS, String batterySize, String numCore, String ram,
			String simType, String displaySize, String displayType, String isSmartTV, String loadCapacity,
			String isAutomation, String doorType, String graphicsCard) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productType = productType;
		this.price = price;
		this.warranty = warranty;
		ManufectureDate = manufectureDate;
		this.screenSize = screenSize;
		OS = oS;
		this.batterySize = batterySize;
		NumCore = numCore;
		this.ram = ram;
		this.simType = simType;
		DisplaySize = displaySize;
		DisplayType = displayType;
		this.isSmartTV = isSmartTV;
		this.loadCapacity = loadCapacity;
		this.isAutomation = isAutomation;
		this.doorType = doorType;
		GraphicsCard = graphicsCard;
	}


	public void setProductId(String productId) {
		this.productId = productId;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public void setWarranty(String warranty) {
		this.warranty = warranty;
	}

	public void setManufectureDate(String manufectureDate) {
		ManufectureDate = manufectureDate;
	}

	public void setScreenSize(String screenSize) {
		this.screenSize = screenSize;
	}

	public void setOS(String oS) {
		OS = oS;
	}

	public void setBatterySize(String batterySize) {
		this.batterySize = batterySize;
	}

	public void setNumCore(String numCore) {
		NumCore = numCore;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public void setSimType(String simType) {
		this.simType = simType;
	}

	public void setDisplaySize(String displaySize) {
		DisplaySize = displaySize;
	}

	public void setDisplayType(String displayType) {
		DisplayType = displayType;
	}

	public void setIsSmartTV(String isSmartTV) {
		this.isSmartTV = isSmartTV;
	}

	public void setLoadCapacity(String loadCapacity) {
		this.loadCapacity = loadCapacity;
	}

	public void setIsAutomation(String isAutomation) {
		this.isAutomation = isAutomation;
	}

	public void setDoorType(String doorType) {
		this.doorType = doorType;
	}

	public void setGraphicsCard(String graphicsCard) {
		GraphicsCard = graphicsCard;
	}


	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productType=" + productType
				+ ", price=" + price + ", warranty=" + warranty + ", ManufectureDate=" + ManufectureDate
				+ ", screenSize=" + screenSize + ", OS=" + OS + ", batterySize=" + batterySize + ", NumCore=" + NumCore
				+ ", ram=" + ram + ", simType=" + simType + ", DisplaySize=" + DisplaySize + ", DisplayType="
				+ DisplayType + ", isSmartTV=" + isSmartTV + ", loadCapacity=" + loadCapacity + ", isAutomation="
				+ isAutomation + ", doorType=" + doorType + ", GraphicsCard=" + GraphicsCard + "]";
	}

}
