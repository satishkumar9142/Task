package com.reactiveworks.jackson.util;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class JsonUtil {
	private static Logger log = LogManager.getLogger(JsonUtil.class);
	private static ObjectMapper mapper;

	static {
		mapper = new ObjectMapper();
	}
	public static String convertJavaToJson(Object object) {
		String jsonResult ="";
		try {
//			jsonResult = mapper.writeValueAsString(object);
			jsonResult = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(object);
		} catch (JsonGenerationException e) {
			log.error("Exception Occured while converting Java Object into Json --->" + e.getMessage());
		} catch (JsonMappingException e) {
			log.error("Exception Occured while converting Java Object into Json --->" + e.getMessage());
		} catch (IOException e) {
			log.error("Exception Occured while converting Java Object into Json --->" + e.getMessage());
		}		
		return jsonResult;
	}
	
	public static  <T> T convertJsonToJava(String jsonString, Class<T> cls) {
		T result = null;
		try {
			result = mapper.readValue(jsonString, cls);
		} catch (JsonParseException e) {
			log.error("Exception Occured while converting Json into Java Object  --->" + e.getMessage());
		} catch (JsonMappingException e) {
			log.error("Exception Occured while converting Json into Java Object  --->" + e.getMessage());
		} catch (IOException e) {
			log.error("Exception Occured while converting Json into Java Object  --->" + e.getMessage());
		}
		
		return result;
	}
}
