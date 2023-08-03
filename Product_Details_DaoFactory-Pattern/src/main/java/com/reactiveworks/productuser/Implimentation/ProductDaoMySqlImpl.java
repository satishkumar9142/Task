package com.reactiveworks.productuser.Implimentation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.reactiveworks.productuser.daointerface.ProductDao;
import com.reactiveworks.productuser.exception.ProductException;
import com.reactiveworks.productuser.model.Product;

public class ProductDaoMySqlImpl implements ProductDao{
	private static final String URL = "jdbc:mysql://localhost:3306/person";
	private static final String USER = "root";
	private static final String PASS = "root";

	@Override
	public List<Product> getAlldatafromDS() throws ProductException {

		List<Product> allDataFromDB = new ArrayList<>();

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
				os = rs.getString("OS");BatterySize = rs.getString("BatterySize"); NumCore = rs.getString("NumCore"); RAM = rs.getString("RAM"); simType = rs.getString("SimType"); DisplaySize = rs.getString("DisplaySize"); DisplayType = rs.getString("DisplayType");
				IsSmartTv = rs.getString("IsSmartTv"); LoadCapacity = rs.getString("LoadCapacity"); IsAutomatic = rs.getString("IsAutomatic");DoorType = rs.getString("DoorType"); GraphicCard = rs.getString("GraphicCard");

				prod = new Product(ProductId, ProductName, ProductType, Price, Warranty, manufatureDate, ScreenSize, os, BatterySize, NumCore, RAM, simType, DisplaySize, DisplayType, IsSmartTv, LoadCapacity, IsAutomatic, DoorType, GraphicCard);

				allDataFromDB.add(prod);
			}
		} catch (SQLException e) {
			throw new ProductException("DataBased is not connected");
		}
		return allDataFromDB;
	}
}


