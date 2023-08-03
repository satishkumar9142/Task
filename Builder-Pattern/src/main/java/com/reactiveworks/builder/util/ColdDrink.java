package com.reactiveworks.builder.util;

import com.reactiveworks.builder.model.Item;
import com.reactiveworks.builder.model.Packing;

public abstract class ColdDrink implements Item {
	
	public Packing packing() {
       return new Bottle();
	}

	public abstract float price();

}
