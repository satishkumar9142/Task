package com.reactivework.cityexercise.daoInterface;

import com.reactivework.cityexercise.customexception.CityCustomException;

public interface Dao {
	
	void getAllDataFromCSVReader() throws CityCustomException;
	void getAllDataFromDB() throws CityCustomException;
}
