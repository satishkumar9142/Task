package com.reactiveworks.util;

import java.io.Serializable;

public class ABC implements Serializable{

	private static ABC abc;

	//constructor
	private ABC() {
		if(abc != null) {
			throw new RuntimeException("You are trying to break singleton pattern");
		}
	}
	// Lazy way of creating singleton object
	public static ABC getABC() {
		if(abc == null) {
			synchronized (ABC.class) {
				if(abc ==null) {
					abc = new ABC();
				}
			}
		}
		return abc;
	}
	
	public Object readResolve() {
		return abc;
	}
}
