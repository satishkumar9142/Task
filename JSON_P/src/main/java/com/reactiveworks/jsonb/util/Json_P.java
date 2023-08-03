package com.reactiveworks.jsonb.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;


import javax.json.Json;
import javax.json.JsonReader;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Json_P {
	private static Logger log = LogManager.getLogger(Json_P.class);
	public void getParsingJson() throws FileNotFoundException {
		JsonReader jsonPReader = Json.createReader(new FileReader(new File("src//main//resources//sample.json")));
		javax.json.JsonObject jsonOPbject = jsonPReader.readObject();

		log.info("JSON-P --> " + jsonOPbject.getString("name") + " " + jsonOPbject.getInt("age") + " "
				+ jsonOPbject.getJsonArray("hobbies") + " " + jsonOPbject.getJsonObject("address").getString("street")
				+ " " + jsonOPbject.getJsonObject("address").getString("city"));

		
	}
}
