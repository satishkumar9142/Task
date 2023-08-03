package com.reactiveworks.cityexercise.services;

import java.util.List;
import java.util.stream.Collectors;

import com.reactiveworks.cityexercise.exception.CityCustomException;
import com.reactiveworks.cityexercise.model.City;
import com.reactiveworks.cityexercise.util.CityCsvReader;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public class ListOfCityByCountryCode {
	
	@WebMethod
	public List<City> getListOfCityNameByCode(String cCode) throws CityCustomException {
		CityCsvReader csv = new CityCsvReader();
		List<City> list = csv.getCityList();
		List<City> cityNameByCouCode = list.stream().filter(i-> i.getCouCode().equals(cCode)).collect(Collectors.toList());
		if(cityNameByCouCode.isEmpty()) {
			throw new CityCustomException("Country Code is Invalid",new CityCustomException());
		}	 
		return cityNameByCouCode;
	}
}
