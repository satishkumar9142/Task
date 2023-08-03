package com.reactiveworks.builder.services;

import com.reactiveworks.builder.util.ChickenBurger;
import com.reactiveworks.builder.util.Coke;
import com.reactiveworks.builder.util.Pepsi;
import com.reactiveworks.builder.util.VegBurger;

public class MealBuilder {
	
	public Meal prepareVegMeal (){
	      Meal meal = new Meal();
	      meal.addItem(new VegBurger());
	      meal.addItem(new Coke());
	      return meal;
	   }   

	   public Meal prepareNonVegMeal (){
	      Meal meal = new Meal();
	      meal.addItem(new ChickenBurger());
	      meal.addItem(new Pepsi());
	      return meal;
	   }
}
