package com.reactiveworks.jsonschema.easpickingv2;

public class DataInsideData {
	private String id;
	private String context;
	private String kind;
	private Pickable pickable;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public Pickable getPickable() {
		return pickable;
	}
	public void setPickable(Pickable pickable) {
		this.pickable = pickable;
	}
	
	
}
