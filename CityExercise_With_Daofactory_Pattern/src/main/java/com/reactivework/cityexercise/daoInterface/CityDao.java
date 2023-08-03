package com.reactivework.cityexercise.daoInterface;

import java.util.List;

import com.reactivework.cityexercise.customexception.CityCustomException;
import com.reactivework.cityexercise.model.City;

public interface CityDao {
	
	List<City> getAllDatafromDS() throws CityCustomException;
}
