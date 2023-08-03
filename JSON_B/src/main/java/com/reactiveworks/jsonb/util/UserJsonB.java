package com.reactiveworks.jsonb.util;

import java.util.Collections;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.reactiveworks.jsonb.model.User;

public class UserJsonB {
	private static Logger log = LogManager.getLogger(UserJsonB.class);
	
	public void JsonB() {
		// Cache Jsonb objects whenever possible. They are relatively expensive to create
		final Jsonb jsonb = JsonbBuilder.create();
		// ...

		// Convert POJO --> JSON
		User andy = new User(1234, "Andy", 77, Collections.singleton("admin"));
		String andyJson = jsonb.toJson(andy);
		log.info(andyJson); // prints: {"age":77,"id":1234,"name":"Andy","roles":["admin"]}

		// Convert JSON --> POJO
		String jsonData = "{\"age\":55,\"id\":5678,\"name\":\"Hank\",\"roles\":[\"member\"]}";
		User hank = jsonb.fromJson(jsonData, User.class);
		
		log.info(hank);
	}
}