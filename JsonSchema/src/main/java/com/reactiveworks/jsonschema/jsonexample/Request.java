package com.reactiveworks.jsonschema.jsonexample;

public class Request {
	String loadId;
	String xboxNumber;
	String carrier;
	String parentDeliveryNumber;
	String esd;
	String trailerType;

	public String getLoadId() {
		return loadId;
	}
	public void setLoadId(String loadId) {
		this.loadId = loadId;
	}
	public String getXboxNumber() {
		return xboxNumber;
	}
	public void setXboxNumber(String xboxNumber) {
		this.xboxNumber = xboxNumber;
	}
	public String getCarrier() {
		return carrier;
	}
	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}
	public String getParentDeliveryNumber() {
		return parentDeliveryNumber;
	}
	public void setParentDeliveryNumber(String parentDeliveryNumber) {
		this.parentDeliveryNumber = parentDeliveryNumber;
	}
	public String getEsd() {
		return esd;
	}
	public void setEsd(String esd) {
		this.esd = esd;
	}
	public String getTrailerType() {
		return trailerType;
	}
	public void setTrailerType(String trailerType) {
		this.trailerType = trailerType;
	}
}
