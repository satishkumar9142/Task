package com.reactiveworks.jsonb.util;

import java.util.ArrayList;
import java.util.List;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.reactiveworks.jsonb.model.Dog;

public class Json_B {
	
	private static Logger log = LogManager.getLogger(Json_B.class);
	public void bindingJson() {
		List<Dog> list = new ArrayList<>();
		Dog dog = new Dog();
		dog.name = "Falco";
		dog.age = 4;
		dog.bitable = false;
		list.add(dog);
		
		dog = new Dog();
		dog.name = "Falfhfco";
		dog.age = 45;
		dog.bitable = true;
		list.add(dog);
		
		Jsonb jsonb = JsonbBuilder.create();
		String result = jsonb.toJson(list);
		
		log.info(result);
	}
}
