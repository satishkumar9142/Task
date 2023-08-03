package com.reactiveworks.cityexercise.services;

import java.util.List;
import java.util.stream.Collectors;

import com.reactiveworks.cityexercise.exception.CityCustomException;
import com.reactiveworks.cityexercise.model.City;
import com.reactiveworks.cityexercise.util.CityCsvReader;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public class CityNameById {

	private List<City> list;
	public CityNameById() throws CityCustomException {
		CityCsvReader csv = new CityCsvReader();
		list = csv.getCityList();
	}
	@WebMethod
	public City getCityNameById(int id) throws CityCustomException {
		
		List<City> searchId = list.stream().filter(i->i.getId()== id).collect(Collectors.toList());
		if(!searchId.isEmpty())
		return searchId.get(0);
		throw new CityCustomException("Id Not Found Exception",new CityCustomException());
	}
	
}	

