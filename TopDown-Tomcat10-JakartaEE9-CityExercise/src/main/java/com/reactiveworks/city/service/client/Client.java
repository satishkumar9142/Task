package com.reactiveworks.city.service.client;

public class Client {
	public static void main(String[] args) {
	 
		CityServiceImplService service = new CityServiceImplService();
		CityServiceImpl port = service.getCityServiceImplPort();
		System.out.println(port.getCityById(2));
		System.out.println(port.getListOfCityByCountryCode("NLD"));
		System.out.println(port.getMaxPopulationOfCity());
		System.out.println(port.getMinPopulationOfCity());
	}
}
