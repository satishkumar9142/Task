package com.reactiveworks.builder.util;

public class Pepsi extends ColdDrink{

	public String name() {
		return "pepsi";
	}
	
	@Override
	public float price() {
		return 35.0f;
	}

}
