package com.reactiveworks.util;

public class XYZ {

	// Eager way of creating singleton object
	private static XYZ xyz = new XYZ();
	
	public static XYZ getXYZ() {
		return xyz;
	}
}
