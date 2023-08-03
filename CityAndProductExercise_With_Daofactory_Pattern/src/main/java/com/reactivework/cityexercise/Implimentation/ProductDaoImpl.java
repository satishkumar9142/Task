package com.reactivework.cityexercise.Implimentation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import com.reactivework.cityexercise.customexception.CityCustomException;
import com.reactivework.cityexercise.daoInterface.Dao;
import com.reactivework.cityexercise.model.Product;

public class ProductDaoImpl implements Dao {
	
	private static final String URL = "jdbc:mysql://localhost:3306/person";
	private static final String USER = "root";
	private static final String PASS = "root";
	@Override
	public void getAllDataFromCSVReader() throws CityCustomException {
		List<Product> list = new ArrayList<>();
		BufferedReader br;
		InputStream is = getClass().getClassLoader().getResourceAsStream("ProductDetail.csv");
		InputStreamReader isr = new InputStreamReader(is);
		if(is == null) {
			throw new CityCustomException("File Not found Exception");
		}
		br = new BufferedReader(isr);
		try {
			br.readLine();
		} catch (IOException e) {
			throw new CityCustomException("Problem in Reading the Line");
		}
		br.lines().filter(i->i != null).map(i->Pattern.compile(",").split(i)).forEach(x->{
			Product prod = new Product();
			try {
				prod.setProductId(x[0]);
				prod.setProductName(x[1]);
				prod.setProductType(x[2]);
				prod.setPrice(x[3]);
				prod.setWarranty(x[4]);
				prod.setManufectureDate(x[5]);
				prod.setScreenSize(x[6]);
				prod.setOS(x[7]);
				prod.setBatterySize(x[8]);
				prod.setNumCore(x[9]);
				prod.setRam(x[10]);
				prod.setSimType(x[11]);
				prod.setDisplaySize(x[12]);
				prod.setDisplayType(x[13]);
				prod.setIsSmartTV(x[14]);
				prod.setLoadCapacity(x[15]);
				prod.setIsAutomation(x[16]);
				prod.setDoorType(x[17]);
				prod.setGraphicsCard(x[18]);

			}catch (ArrayIndexOutOfBoundsException e) {
			}
			finally {
				list.add(prod);
			}
		});
//		return list;
		System.out.println("ProductCSV");
		for(Product prod1 : list)
			System.out.println(prod1);
	}

	@Override
	public void getAllDataFromDB() throws CityCustomException {
		List<Product> AllDataFromDB = new ArrayList<>();

		String ProductId,ProductName,ProductType,Price,Warranty,manufatureDate,ScreenSize,os,BatterySize,NumCore,RAM,simType,DisplaySize,DisplayType,
		IsSmartTv,LoadCapacity,IsAutomatic,DoorType,GraphicCard = "";

		Product prod = null;

		try {
			Connection connection = DriverManager.getConnection(URL, USER, PASS);
			Statement stmt = connection.createStatement();
			String SQL = "SELECT * FROM ProductDetails";
			ResultSet rs  = stmt.executeQuery(SQL);
			while (rs.next()) {
				ProductId = rs.getString("ProductId");  ProductName = rs.getString("ProductName");ProductType=rs.getString("ProductType"); Price =rs.getString("Price");Warranty=rs.getString("Warranty");manufatureDate = rs.getString("manufatureDate");ScreenSize = rs.getString("ScreenSize");
				os = rs.getString("OS");BatterySize = rs.getString("BatterySize"); NumCore = rs.getString("NumCore"); RAM = rs.getString("ram"); simType = rs.getString("SimType"); DisplaySize = rs.getString("DisplaySize"); DisplayType = rs.getString("DisplayType");
				IsSmartTv = rs.getString("IsSmartTv"); LoadCapacity = rs.getString("LoadCapacity"); IsAutomatic = rs.getString("IsAutomatic");DoorType = rs.getString("DoorType"); GraphicCard = rs.getString("GraphicCard");

				prod = new Product(ProductId, ProductName, ProductType, Price, Warranty, manufatureDate, ScreenSize, os, BatterySize, NumCore, RAM, simType, DisplaySize, DisplayType, IsSmartTv, LoadCapacity, IsAutomatic, DoorType, GraphicCard);

				AllDataFromDB.add(prod);

			}
		} catch (SQLException e) {
			throw new CityCustomException("DataBased is not connected");
		}
		
//		return AllDataFromDB;
		System.out.println("ProductDB");
		for(Product prod1 : AllDataFromDB)
		System.out.println(prod1);
	}
}
// 