package com.reactiveworks.mysql.crudoperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.reactiveworks.mysql.withoutconnectionpool.Util;

public class CRUD {
	
	private static final Logger log = LogManager.getLogger(Util.class);
	
	public void Create() throws Exception{
		Util util = new Util();
		String [] datafromProperties = util.util();
		Connection dbConnection = null;
		try {
			dbConnection = DriverManager.getConnection(datafromProperties[0], datafromProperties[1], datafromProperties[2]);
			Statement stmt = dbConnection.createStatement();
			stmt.executeUpdate("CREATE TABLE EMPLOYEE (ID INT,FIRST_NAME VARCHAR(90),LAST_NAME VARCHAR(90),AGE INT,SALARY INT,EMAIL VARCHAR(90));");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void Insert() throws Exception{
		Util util = new Util();
		String [] datafromProperties = util.util();
		Connection dbConnection = null;
		try {
			dbConnection = DriverManager.getConnection(datafromProperties[0], datafromProperties[1], datafromProperties[2]);
			Statement stmt = dbConnection.createStatement();
			stmt.executeUpdate("INSERT INTO EMPLOYEE VALUES(1, 'RAMU', 'BTM', 22, 4000, 'R@G.IN');");
			stmt.executeUpdate("INSERT INTO EMPLOYEE VALUES(2, 'RAVI', 'RAO', 24, 3000, 'R@G.IN');");
			stmt.executeUpdate("INSERT INTO EMPLOYEE VALUES(3, 'MANU', 'BTM', 23, 5000, 'M@G.IN');");
			stmt.executeUpdate("INSERT INTO EMPLOYEE VALUES(4, 'MURALI', 'RAO', 26, 5500, 'M@G.IN');");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void Read() throws Exception{
		Util util = new Util();
		String [] datafromProperties = util.util();
		Connection dbConnection = null;
		try {
			dbConnection = DriverManager.getConnection(datafromProperties[0], datafromProperties[1], datafromProperties[2]);
			Statement stmt = dbConnection.createStatement();
			String SQL = "SELECT * FROM EMPLOYEE";
		    ResultSet rs  = stmt.executeQuery(SQL);
			while (rs.next()) {
				   log.info(rs.getInt("ID")+"  "+rs.getString("FIRST_NAME")+"  "+rs.getString("LAST_NAME")+"  " + rs.getInt("AGE")+"  "+ rs.getString("EMAIL"));   
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void Update() throws Exception{
		Util util = new Util();
		String [] datafromProperties = util.util();
		Connection dbConnection = null;
		try {
			dbConnection = DriverManager.getConnection(datafromProperties[0], datafromProperties[1], datafromProperties[2]);
			Statement stmt = dbConnection.createStatement();
			stmt.executeUpdate("UPDATE EMPLOYEE SET FIRST_NAME='RAVI' WHERE ID = 4;");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void Delete() throws Exception{
		Util util = new Util();
		String [] datafromProperties = util.util();
		Connection dbConnection = null;
		try {
			dbConnection = DriverManager.getConnection(datafromProperties[0], datafromProperties[1], datafromProperties[2]);
			Statement stmt = dbConnection.createStatement();
			stmt.executeUpdate("DELETE FROM EMPLOYEE WHERE ID = 4;");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
