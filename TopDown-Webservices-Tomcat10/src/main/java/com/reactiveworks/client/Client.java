package com.reactiveworks.client;

public class Client {
	public static void main(String[] args) {
	 
		GetCurrentTemperature request = new GetCurrentTemperature();
		request.arg0.setCity("Patna");
		WeatherServicePortTypeImplService service = new WeatherServicePortTypeImplService();
		GetCurrentTemperatureResponse response = new GetCurrentTemperatureResponse();
		response._return = service.getWeatherServicePortTypeImplPort().getCurrentTemperature(request.arg0);
		String temp = response._return.getTemperature();
		System.out.println(temp);
	}
}
