package com.reactiveworks.gson.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.reactiveworks.gson.model.Employee;

public class GsonD {
	
	public String getJson(Employee emp) {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
//		Gson gson = new Gson();
		String json = gson.toJson(emp);
		return json;
	}

	public Employee getObje(String json) {

		Gson gson = new Gson();
		Employee emp = gson.fromJson(json, Employee.class);
		
		return emp;

	}
}
