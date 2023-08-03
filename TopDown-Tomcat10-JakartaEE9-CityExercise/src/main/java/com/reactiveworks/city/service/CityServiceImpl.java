package com.reactiveworks.city.service;

import java.util.List;
import java.util.stream.Collectors;

import com.reactiveworks.city.exception.CityCustomException;
import com.reactiveworks.city.util.CityCsvReader;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public class CityServiceImpl implements CityService {
	
	List<City> list;
	public CityServiceImpl() throws CityCustomException {
		CityCsvReader csv = new CityCsvReader();
		list = csv.getAllDataOfCity();
	}
	
	@Override
	@WebMethod
	public City getCityById(int id) {
		
		return list.stream().filter(i->i.getId() == id).collect(Collectors.toList()).get(0);
	}

	@Override
	@WebMethod
	public List<City> getListOfCityByCountryCode(String countryCode) {
		
		return list.stream().filter(i -> i.getCountryCode().equals(countryCode)).collect(Collectors.toList());
	}

	@Override
	@WebMethod
	public City getMaxPopulationOfCity() {
		return list.stream().max((a,b)-> a.getPopulation()> b.getPopulation() ? +1 :-1).get();
	}

	@Override
	@WebMethod
	public City getMinPopulationOfCity() {
		return list.stream().min((a,b)-> a.getPopulation()> b.getPopulation() ? +1 :-1).get();
	}

}
