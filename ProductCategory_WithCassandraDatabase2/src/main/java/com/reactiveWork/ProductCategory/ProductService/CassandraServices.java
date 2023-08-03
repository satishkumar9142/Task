package com.reactiveWork.ProductCategory.ProductService;


import java.util.List;

import com.datastax.driver.core.BoundStatement;
import com.datastax.driver.core.PreparedStatement;
import com.reactiveWork.ProductCategory.CustomException.CustomException;
import com.reactiveWork.ProductCategory.individualProduct.AllDevice;
import com.reactiveWork.ProductCategory.util.CassandraConnection;

public class CassandraServices {
	CassandraConnection conn = new CassandraConnection();
	public CassandraServices() {
		conn.connectdb("localhost", 9042);
	}
	public void CreateKeySpace() {
		try {
			final String createproductKeySpace = "CREATE KEYSPACE IF NOT EXISTS Product_keySpace WITH "
					+ "replication = {'class' : 'SimpleStrategy','replication_factor' :3}";	
			conn.getSession().execute(createproductKeySpace);
		}
		catch (Exception e) {
			e.printStackTrace();
			}
	}
	public void CreateTable() {
		try {
			final String createtable = "CREATE TABLE IF NOT EXISTS Product_keySpace.product"
					+ "(ProductId varchar PRIMARY KEY, ProductName varchar, ProductType varchar,Price varchar,Warranty varchar,"
					+ " manufatureDate varchar, ScreenSize varchar, OS varchar, BatterySize varchar, NumCore varchar, RAM varchar,"
					+ " SimType varchar, DisplaySize varchar, DisplayType varchar, IsSmartTv varchar,LoadCapacity varchar,"
					+ " IsAutomatic varchar, DoorType varchar, GraphicCard varchar)";	
			conn.getSession().execute(createtable);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void InsertData(List<AllDevice> data) throws CustomException {
			final String insertQuery = "INSERT INTO Product_keySpace.product(ProductId,ProductName,ProductType,Price,Warranty,manufatureDate,"
					+ "ScreenSize,OS,BatterySize,NumCore,RAM,SimType,DisplaySize,DisplayType,IsSmartTv,LoadCapacity,"
					+ "IsAutomatic,DoorType,GraphicCard) Values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";	
			PreparedStatement psInsert = conn.getSession().prepare(insertQuery);
			for(AllDevice pr : data) {
				BoundStatement bsInsert = psInsert.bind(pr.getProductId(), pr.getProductName(), pr.getProductType(), pr.getPrice(),pr.getWarranty(),
						pr.getManufecturedDt(),pr.getScreenSize(),pr.getOs(),pr.getBatterySize(),pr.getNumCore(),pr.getRAM(),
						pr.getSimType(), pr.getDisplaySize(),pr.getDisplayType(), pr.getIsSmartTV(),pr.getLoadCapacity(),pr.getIsAutomatic(),pr.getDoorType(),pr.getGraphicCard());
				conn.getSession().execute(bsInsert);
			}
			conn.close();
	}
/*	public void UpdateData() {
		try {
			final String updateQuery = "UPDATE movies_keyspace.movies SET rating= ? WHERE tittle = ? AND year = ?";
			
			PreparedStatement psUpdate = conn.getSession().prepare(updateQuery);
			BoundStatement bsUpdate = psUpdate.bind("10.0","Annabelle",2019);
			conn.getSession().execute(bsUpdate);
			
			conn.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	} */
	

}
