package com.reactiveworks.json.feature;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.json.Json;
import javax.json.JsonReader;
import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.reactiveworks.json.model.Employee;


public class JsonP_AllFeature {

	private static Logger log = LogManager.getLogger(JsonP_AllFeature.class);
	
//  Json Parse To Generic Object	
	public void getJsonParseToGenericObject() throws FileNotFoundException {
	
		JsonReader jsonPReader = Json.createReader(new FileReader(new File("src//main//resources//sample.json")));
		javax.json.JsonObject jsonOPbject = jsonPReader.readObject();

		log.info("JSON-P --> " + jsonOPbject.getString("name") + " " + jsonOPbject.getInt("age") + " "
				+ jsonOPbject.getJsonArray("hobbies") + " " + jsonOPbject.getJsonObject("address").getString("street")
				+ " " + jsonOPbject.getJsonObject("address").getString("city"));
	}
	
//  Json Bind To Specific Object
	public void getJsonBindToSpecificObject()  {
		
		log.info("Json-P not support the Json Bind to Specific Object");
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
