package com.reactiveworks.jsonb.model;

import javax.json.bind.annotation.JsonbPropertyOrder;


@JsonbPropertyOrder(value = {
		"bitable",
		"name",
		"age"
})
public class Dog {
	
	public String name;
	public int age;
	public boolean bitable;
}
