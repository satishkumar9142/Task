package com.reactivework.mysqldemo.readandwritethroughconnectionpool;

import java.sql.Connection;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.reactivework.mysqldemo.dataaddtomysql.WriteToDeliveries;
import com.reactivework.mysqldemo.databaseconnection.DBUTIL;

public class ReadmatchesThrouhConncectionPool {
	private static Logger log = LogManager.getLogger(WriteToDeliveries.class);

	public void ReadMatch() {
		
		try(Connection conn = DBUTIL.gerDataSource().getConnection();
				Statement stmt = conn.createStatement();) {
			String SQL = "select matchId, teamfirst from matches";
		    ResultSet rs  = stmt.executeQuery(SQL);
			while (rs.next()) {
				   log.info(rs.getInt("matchId") + "  "  +
				                      rs.getString("teamfirst"));          
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
