package com.reactivework.mysqldemo.dataaddtomysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.reactivework.mysqldemo.commoncode.DBUtil;
import com.reactivework.mysqldemo.modelpackage.Delivery;

public class WriteToDeliveries {


	public void connectingToSql(Delivery D) {
		
		DBUtil util = new DBUtil();
		String s [] = util.Util();
		
		Connection dbConnection = null;
		try {
			dbConnection = DriverManager.getConnection(s[0], s[1], s[2]);
			Statement stmt = dbConnection.createStatement();
			stmt.executeUpdate("insert into deliveries values(" + D.getMatchId() + "," + D.getInning()  +", '" +D.getBattingTeam()+ "' , '" + D.getBowlingTeam() +"' , '"+
					D.getOver() +"' , '" +D.getBall()+"' , '" + D.getBatsman()+"' , '" + D.getBowller()+"' , '" +
					D.getWideRun() +"' , '" + D.getByeRun() +"' , '" + D.getLegByeRun() + "' , '" + D.getNoBallRUn()  +"' , '" + D.getPenalty() +
					"' , '" + D.getBatsmanRun() +"' , '" + D.getExtraRun() +"' , '" + D.getTotalRun() + "')");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	} 
}

