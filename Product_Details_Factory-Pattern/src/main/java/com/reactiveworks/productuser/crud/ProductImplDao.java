package com.reactiveworks.productuser.crud;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.reactiveworks.productuser.modelinterface.Product;

public class ProductImplDao implements ProductDao{
	private static Logger log = LogManager.getLogger(ProductImplDao.class);
	
	private static final String URL = "jdbc:mysql://localhost:3306/person";
	private static final String USER = "root";
	private static final String PASS = "root";
	
	@Override
	public void createTable() {
		try {
			final String createtable = "CREATE TABLE ProductDetails"
					+ "(ProductId varchar(90) PRIMARY KEY, ProductName varchar(90), ProductType varchar(90),Price varchar(90),Warranty varchar(90),"
					+ " manufatureDate varchar(90), ScreenSize varchar(90), OS varchar(90), BatterySize varchar(90), NumCore varchar(90), RAM varchar(90),"
					+ " SimType varchar(90), DisplaySize varchar(90), DisplayType varchar(90), IsSmartTv varchar(90),LoadCapacity varchar(90),"
					+ " IsAutomatic varchar(90), DoorType varchar(90), GraphicCard varchar(90))";
			DriverManager.getConnection(URL, USER, PASS).createStatement().executeUpdate(createtable);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void InsertintoMySQl(List<Product> list) {
		try {
			Connection conn = DriverManager.getConnection(URL, USER, PASS);
			final String insertQuery = "INSERT INTO ProductDetails(ProductId,ProductName,ProductType,Price,Warranty,manufatureDate,"
					+ "ScreenSize,OS,BatterySize,NumCore,RAM,SimType,DisplaySize,DisplayType,IsSmartTv,LoadCapacity,"
					+ "IsAutomatic,DoorType,GraphicCard) Values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";	
			for(Product pr : list) {
				PreparedStatement psInsert = conn.prepareStatement(insertQuery);
			
				psInsert.execute();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void ReadfromMySQl() {
		try {
			Connection connection = DriverManager.getConnection(URL, USER, PASS);
			Statement stmt = connection.createStatement();
			String SQL = "SELECT * FROM ProductDetails";
			ResultSet rs  = stmt.executeQuery(SQL);
						while (rs.next()) {
							   log.info(rs.getString("ProductId")+"  "+rs.getString("ProductName")+"  "+rs.getString("ProductType")+"  " + rs.getString("Price")+"  "+ rs.getString("Warranty")+"  " + rs.getString("manufatureDate")+"  "+ rs.getString("ScreenSize") +   
							 "  " + rs.getString("OS")+"  "+rs.getString("BatterySize")+"  "+rs.getString("NumCore")+"  " + rs.getString("RAM")+"  "+ rs.getString("SimType")+"  " + rs.getString("DisplaySize")+"  "+ rs.getString("DisplayType")+
							 "  " + rs.getString("IsSmartTv")+"  "+rs.getString("LoadCapacity")+"  "+rs.getString("IsAutomatic")+"  " + rs.getString("DoorType")+"  "+ rs.getString("GraphicCard"));
						}
		} catch (SQLException e) {
				log.error(e);
		}
	}
}
