package com.reactiveworks.builder.util;

public class ChickenBurger extends Burger {
	
	public String name() {
		return "Chicken Burger";
	}
	@Override
	public float price() {
		return 50.5f;
	}
}
