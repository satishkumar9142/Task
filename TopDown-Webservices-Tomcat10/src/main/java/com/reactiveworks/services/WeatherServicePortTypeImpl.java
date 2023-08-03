package com.reactiveworks.services;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public class WeatherServicePortTypeImpl implements WeatherServicePortType {

	@Override
	@WebMethod
	public GetCurrentTemperatureRs getCurrentTemperature(GetCurrentTemperatureRq parameters) {
		
		System.out.println(parameters.getCity());
		ObjectFactory factory = new ObjectFactory();
		GetCurrentTemperatureRs response = factory.createGetCurrentTemperatureRs();
		response.setTemperature(Math.random()*100 + "Degree Celcius");
		return response;
	}
}
