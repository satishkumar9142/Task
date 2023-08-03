package com.reactiveworks.mysqlconnectionpool.crud;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.reactiveworks.mysqlconnectionpool.connectionpool.Util;
 
public class CRUD {
	private static Logger log = LogManager.getLogger(CRUD.class);

	public void Create() {
		try(Connection conn = Util.gerDataSource().getConnection();
				Statement stmt = conn.createStatement();) {
			String SQL = "CREATE TABLE STUDENTS (ID INT PRIMARY KEY,NAME VARCHAR(90) NOT NULL,ClASS VARCHAR(20),AGE INT);";
			stmt.executeUpdate(SQL);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void Insert() {
		try(Connection conn = Util.gerDataSource().getConnection();
			Statement stmt = conn.createStatement();) {
			stmt.executeUpdate( "INSERT INTO STUDENTS VALUES (1,'John', 'First', 5);");
			stmt.executeUpdate( "INSERT INTO STUDENTS VALUES (2,'Mary', 'Third', 7);");
			stmt.executeUpdate( "INSERT INTO STUDENTS VALUES (3,'Mike', 'Second', 6);");
			stmt.executeUpdate( "INSERT INTO STUDENTS VALUES (4,'Linda', 'Third', 7);");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void Read() {
		try(Connection conn = Util.gerDataSource().getConnection();
			Statement stmt = conn.createStatement();) {
			String SQL = "SELECT * FROM STUDENTS";
			ResultSet rs  = stmt.executeQuery(SQL);
			while (rs.next()) {
				log.info(rs.getInt("ID") + "  "+ rs.getString("NAME") +"  "+ rs.getString("ClASS")+ "  "+ rs.getInt("AGE"));          
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void Delete() {
		try(Connection conn = Util.gerDataSource().getConnection();
			Statement stmt = conn.createStatement();) {
			stmt.executeUpdate( "DELETE FROM STUDENTS WHERE AGE = 5;");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
