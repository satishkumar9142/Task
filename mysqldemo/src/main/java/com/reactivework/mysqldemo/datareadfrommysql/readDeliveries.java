package com.reactivework.mysqldemo.datareadfrommysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.reactivework.mysqldemo.commoncode.DBUtil;
import com.reactivework.mysqldemo.dataaddtomysql.WriteToDeliveries;

public class readDeliveries {
	private static Logger log = LogManager.getLogger(WriteToDeliveries.class);
	public static void ReadDataFromMySql() {
		
		DBUtil util = new DBUtil();
		String s [] = util.Util();
		
		Connection dbConnection = null;	 
		try {
			dbConnection = DriverManager.getConnection(s[0],s[1], s[2]);
			Statement stmt = dbConnection.createStatement();
			ResultSet rs   = stmt.executeQuery("select BattingTeam , BowlingTeam "+ "from deliveries");
			
			while (rs.next()) {
				   log.info(rs.getString("BattingTeam") + "  "  +
				                      rs.getString("BowlingTeam"));               
				}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
