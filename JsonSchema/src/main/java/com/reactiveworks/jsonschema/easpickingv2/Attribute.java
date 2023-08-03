package com.reactiveworks.jsonschema.easpickingv2;

public class Attribute {
	private String attributeName;
	private String requiredFlag;
	private String[] identifierList;
	public String getAttributeName() {
		return attributeName;
	}
	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}
	public String getRequiredFlag() {
		return requiredFlag;
	}
	public void setRequiredFlag(String requiredFlag) {
		this.requiredFlag = requiredFlag;
	}
	public String[] getIdentifierList() {
		return identifierList;
	}
	public void setIdentifierList(String[] identifierList) {
		this.identifierList = identifierList;
	}
	
	
}
