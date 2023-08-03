package com.reactivework.mysqldemo.dataaddtomysql;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.reactivework.mysqldemo.commoncode.DBUtil;
import com.reactivework.mysqldemo.modelpackage.Match;

public class WriteToMatches {
	private static Logger log =  LogManager.getLogger(WriteToMatches.class); 
	
	public void connectingToSql(Match m) {
		
		log.info("I am inside the write the match to MysQl");
		DBUtil util = new DBUtil();
		String s [] = util.Util();
		
		Connection dbConnection = null;
		try {
			dbConnection = DriverManager.getConnection(s[0], s[1], s[2]);
			Statement stmt = dbConnection.createStatement();
			stmt.executeUpdate("insert into matches values(" + m.getMatchId() + "," + m.getSeason()  +", '"+
					m.getCity()+ "' , '" + m.getDate() +"' , '"+
					m.getTeam1() +"' , '" +m.getTeam2() +"' , '" + m.getToss_Win() +"' , '" + m.getToss_decisions() +"' , '" +
					m.getResult() +"' , '" + m.getWinner()+"')");
			} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}




