package com.reactiveworks.json.feature;

import java.io.File;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.JsonProcessingException;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.reactiveworks.json.model.Employee;
import com.reactiveworks.json.model.Person;

public class JacksonAllfeature {
	private static Logger log = LogManager.getLogger(JacksonAllfeature.class);
	
//  Json parser to generic Object
	public void getJsonParseToGenericObject() throws JsonProcessingException, IOException {
		
		ObjectMapper jacksonObjectMapper = new ObjectMapper();
		JsonNode jacksonJsonNode = jacksonObjectMapper.readTree(new File("src//main//resources//sample.json"));
		
		log.info(
				"Jackson --> " + jacksonJsonNode.get("name").asText() + " " + jacksonJsonNode.get("age").asInt());
		jacksonJsonNode.get("hobbies").iterator().forEachRemaining(h -> log.info("Jackson --> " + h));
		log.info("Jackson --> " + jacksonJsonNode.get("address").get("street").asText() + " "
				+ jacksonJsonNode.get("address").get("city").asText());
 
	}
	
//  Json Bind to Specific Object
	public void getJsonBindToSpecificObject() throws JsonParseException, IOException  {
		ObjectMapper mapper = new ObjectMapper();
		Person jacksonPerson = mapper.readValue(new File("src//main//resources//sample.json"), Person.class);
		
		log.info("Jackson --> " + jacksonPerson.getName() + " " + jacksonPerson.getAge() + " "
				+ jacksonPerson.getHobbies() + " " + jacksonPerson.getAddress().getStreet() + " "
				+ jacksonPerson.getAddress().getCity());
	}
	
	
	public void getNullHundle() throws IOException {
		Employee employee = new Employee();
		employee.setName("John");
		employee.setMiddleName("");
		employee.setLastName(null);
		
		// Basic mapper
		ObjectMapper basicMapper = new ObjectMapper();
		log.info("Basic = " + basicMapper.writeValueAsString(employee));
		
		// Mapper to include non null
		ObjectMapper nonNullMapper = new ObjectMapper();
		nonNullMapper.setDefaultPropertyInclusion(JsonInclude.Include.NON_NULL);
		log.info("NON_NULL = " + nonNullMapper.writeValueAsString(employee));
		
		// Mapper to include non empty
		com.fasterxml.jackson.databind.ObjectMapper nonEmptyMapper = new ObjectMapper();
		nonEmptyMapper.setDefaultPropertyInclusion(JsonInclude.Include.NON_EMPTY);
		log.info("NON_EMPTY = " + nonEmptyMapper.writeValueAsString(employee));
		
		
		// Mapper to include non default
		ObjectMapper nonDefaultMapper = new ObjectMapper();
		nonDefaultMapper.setDefaultPropertyInclusion(JsonInclude.Include.NON_DEFAULT);
		log.info("NON_DEFAULT = " + nonDefaultMapper.writeValueAsString(employee));

	}
}
