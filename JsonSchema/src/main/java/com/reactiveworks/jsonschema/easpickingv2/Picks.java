package com.reactiveworks.jsonschema.easpickingv2;

public class Picks {
	private String pickIdentifier;
	private String groupIdentifier;
	private String quantity;
	private String quantityUOM;
	private Attribute[] attribute;
//	Attribute[];
	private SourceGoods sourceGoods;
	private DestinationGoods destinationGoods;
	public String getPickIdentifier() {
		return pickIdentifier;
	}
	public void setPickIdentifier(String pickIdentifier) {
		this.pickIdentifier = pickIdentifier;
	}
	public String getGroupIdentifier() {
		return groupIdentifier;
	}
	public void setGroupIdentifier(String groupIdentifier) {
		this.groupIdentifier = groupIdentifier;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getQuantityUOM() {
		return quantityUOM;
	}
	public void setQuantityUOM(String quantityUOM) {
		this.quantityUOM = quantityUOM;
	}
	public Attribute[] getAttribute() {
		return attribute;
	}
	public void setAttribute(Attribute[] attribute) {
		this.attribute = attribute;
	}
	public SourceGoods getSourceGoods() {
		return sourceGoods;
	}
	public void setSourceGoods(SourceGoods sourceGoods) {
		this.sourceGoods = sourceGoods;
	}
	public DestinationGoods getDestinationGoods() {
		return destinationGoods;
	}
	public void setDestinationGoods(DestinationGoods destinationGoods) {
		this.destinationGoods = destinationGoods;
	}
	
	
}