package com.reactiveworks.jsonschema.easpickingv2;

public class ExecutionGroup {
	private String groupIdentifer;
	private Object[] groupAttributes;
	private String parentGroup;
	public String getGroupIdentifer() {
		return groupIdentifer;
	}
	public void setGroupIdentifer(String groupIdentifer) {
		this.groupIdentifer = groupIdentifer;
	}
	public Object[] getGroupAttributes() {
		return groupAttributes;
	}
	public void setGroupAttributes(Object1[] groupAttributes) {
		this.groupAttributes = groupAttributes;
	}
	public String getParentGroup() {
		return parentGroup;
	}
	public void setParentGroup(String parentGroup) {
		this.parentGroup = parentGroup;
	}
	
}
