package com.reactiveworks.json.feature;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.reactiveworks.json.model.Employee;
import com.reactiveworks.json.model.Person;



public class JsonB_AllFeature {

	private static Logger log = LogManager.getLogger(JsonB_AllFeature.class);
	
	//  Json Parse To Generic Object
	public  void getJsonParseToGenericObject() {
		
		log.info("Json-B Not support the Json Parse to Generic Object");
	}
	
	// Json Bind To Specific Object
	public void getJsonBindToSpecificObject() throws FileNotFoundException   {
		
		Jsonb jsonb = JsonbBuilder.create();
		Person jsonBPerson = jsonb.fromJson(new FileReader(new File("src//main//resources//sample.json")), Person.class);
		
		log.info(
				"JSON-B --> " + jsonBPerson.getName() + " " + jsonBPerson.getAge() + " " + jsonBPerson.getHobbies()
						+ " " + jsonBPerson.getAddress().getStreet() + " " + jsonBPerson.getAddress().getCity());

	}
	
	public void getNullHundle() {
		Employee employee = new Employee();
		employee.setName("John");
		employee.setMiddleName("");
		employee.setLastName(null);
 
		// Basic binding excludes null
		Jsonb basicJsonb = JsonbBuilder.create();
		log.info(basicJsonb.toJson(employee));
 
		// Global configuration to allow null
		JsonbConfig nillableConfig = new JsonbConfig().withNullValues(true);
		Jsonb nillableJsonb = JsonbBuilder.create(nillableConfig);
		log.info(nillableJsonb.toJson(employee));
	}

}
