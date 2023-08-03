package com.reactiveworks.jsonschema.easpickingv2;

public class SourceGoods {
	private String parentIdentifier;
	private String goodsIdentifer;
	private String parentIdentifierType;
	private String goodsIdentifierType;
	private String[] identifiers;
	public String getParentIdentifier() {
		return parentIdentifier;
	}
	public void setParentIdentifier(String parentIdentifier) {
		this.parentIdentifier = parentIdentifier;
	}
	public String getGoodsIdentifer() {
		return goodsIdentifer;
	}
	public void setGoodsIdentifer(String goodsIdentifer) {
		this.goodsIdentifer = goodsIdentifer;
	}
	public String getParentIdentifierType() {
		return parentIdentifierType;
	}
	public void setParentIdentifierType(String parentIdentifierType) {
		this.parentIdentifierType = parentIdentifierType;
	}
	public String getGoodsIdentifierType() {
		return goodsIdentifierType;
	}
	public void setGoodsIdentifierType(String goodsIdentifierType) {
		this.goodsIdentifierType = goodsIdentifierType;
	}
	public String[] getIdentifiers() {
		return identifiers;
	}
	public void setIdentifiers(String[] identifiers) {
		this.identifiers = identifiers;
	}
	
	
}
