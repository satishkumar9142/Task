package com.reactiveworks.repeatable.services;

import java.sql.Connection;

import java.sql.ResultSet;

import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.reactiveworks.repeatable.customexception.RepeatableReadException;
import com.reactiveworks.repeatable.util.ConnectionToDataBase;

public class Transaction {

	private static Logger log = LogManager.getLogger(Transaction.class);

	public void Transaction1() throws RepeatableReadException {
		ConnectionToDataBase util = new ConnectionToDataBase();
		try {
			Connection conn = util.getConnection();
			conn.setAutoCommit(false);
			conn.setTransactionIsolation(4);
			conn.beginRequest();
			conn.createStatement().executeUpdate("UPDATE EMPLOYEE SET SALARY = 12345 WHERE ID = 1");
			ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM EMPLOYEE;");
			while (rs.next()) {
				log.info(rs.getInt("ID")+"  "+rs.getString("FIRST_NAME")+"  "+rs.getInt("SALARY"));   
			}
		} catch (SQLException e) {
			throw new RepeatableReadException("database Access error");
		} catch (RepeatableReadException e) {
			log.error(e);
		}
	}
	
	public void Transaction2() throws RepeatableReadException {
		ConnectionToDataBase util = new ConnectionToDataBase();
		try {
			Connection conn = util.getConnection();
			conn.setAutoCommit(false);
			conn.setTransactionIsolation(4);
			conn.beginRequest();
			ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM EMPLOYEE;");
			while (rs.next()) {
				   log.info(rs.getInt("ID")+"  "+rs.getString("FIRST_NAME")+"  "+rs.getInt("SALARY"));   
			}
		} catch (SQLException e) {
			throw new RepeatableReadException("Database access error");
		}	
		catch (RepeatableReadException e) {
			log.error(e);
		}
	}
}
