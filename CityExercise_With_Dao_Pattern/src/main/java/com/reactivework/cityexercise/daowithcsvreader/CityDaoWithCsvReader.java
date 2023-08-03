package com.reactivework.cityexercise.daowithcsvreader;

import java.util.List;

import com.reactivework.cityexercise.customexception.CityCustomException;
import com.reactivework.cityexercise.model.City;

public interface CityDaoWithCsvReader {

	List<City> ReadCsv() throws CityCustomException;

}
