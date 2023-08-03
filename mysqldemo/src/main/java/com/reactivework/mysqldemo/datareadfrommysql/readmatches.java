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

public class readmatches {
	private static Logger log = LogManager.getLogger(WriteToDeliveries.class);
	public static void ReadDataFromMySql() {
		Connection dbConnection = null;
		DBUtil util = new DBUtil();
		String s [] = util.Util();
		try {
			dbConnection = DriverManager.getConnection(s[0], s[1], s[2]);
			Statement stmt = dbConnection.createStatement();
			ResultSet rs   = stmt.executeQuery("select matchId, teamfirst "+ "from matches");
			while (rs.next()) {
				   log.info(rs.getString("matchId") + "  "  +
				                      rs.getString("teamfirst"));          
				}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
