package com.reactiveworks.json.feature;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.reactiveworks.json.model.Employee;
import com.reactiveworks.json.model.Person;

public class GsonAllFeature {
	private static Logger log = LogManager.getLogger(GsonAllFeature.class);
	
	//  Json Parse To Generic Object	
	public void getJsonParseToGenericObject() throws IOException {
		@SuppressWarnings("deprecation")
		JsonObject gsonJsonObject = new JsonParser().parse(Files.readString(new File("src//main//resources//sample.json").toPath()))
				.getAsJsonObject();
		log.info("GSON --> " + gsonJsonObject.get("name").getAsString() + " "
				+ gsonJsonObject.get("age").getAsInt() + " " + gsonJsonObject.get("hobbies").getAsJsonArray() + " "
				+ gsonJsonObject.get("address").getAsJsonObject().get("street") + " "
				+ gsonJsonObject.get("address").getAsJsonObject().get("city"));

	}
	
	//  Json Bind To Specific Object
	public void getJsonBindToSpecificObject() throws  FileNotFoundException  {
		Gson gson = new Gson();
		Person gsonPerson = gson.fromJson(new FileReader(new File("src//main//resources//sample.json")), Person.class);
		
		log.info("GSON --> " + gsonPerson.getName() + " " + gsonPerson.getAge() + " " + gsonPerson.getHobbies()
						+ " " + gsonPerson.getAddress().getStreet() + " " + gsonPerson.getAddress().getCity());
	}
	
	// Null Hundle
	public void getNullHundle() throws IOException {
		Employee employee = new Employee();
		employee.setName("John");
		employee.setMiddleName("");
		employee.setLastName(null);
		
		Gson basicGson = new Gson();
		log.info(basicGson.toJson(employee));
 
		Gson nonNullGson = new GsonBuilder().serializeNulls().create();
		log.info(nonNullGson.toJson(employee));

	}
}
