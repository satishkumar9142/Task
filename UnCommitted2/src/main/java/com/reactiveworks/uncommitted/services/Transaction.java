package com.reactiveworks.uncommitted.services;

import java.sql.Connection;

import java.sql.ResultSet;

import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.reactiveworks.uncommitted.customexception.UnCommittedException;
import com.reactiveworks.uncommitted.util.ConnectingToDataBase;


public class Transaction {

	private static Logger log = LogManager.getLogger(Transaction.class);
	
	public void Transaction1() throws UnCommittedException {
		ConnectingToDataBase util = new ConnectingToDataBase();
		try {
			Connection conn = util.getConnection();
			conn.setTransactionIsolation(1);
			conn.beginRequest();
			conn.createStatement().executeUpdate("UPDATE EMPLOYEE SET SALARY = 456345 WHERE ID = 1");
			ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM EMPLOYEE;");
			while (rs.next()) {
				log.info(rs.getInt("ID")+"  "+rs.getString("FIRST_NAME")+"  "+rs.getInt("SALARY"));   
			}
		} catch (SQLException e) {
			throw new UnCommittedException("Database access error");
		} catch (UnCommittedException e) {
			log.error(e);
		}
	}
	
	public void Transaction2() throws UnCommittedException {
		ConnectingToDataBase util = new ConnectingToDataBase();
		try {
			Connection conn = util.getConnection();
			conn.setTransactionIsolation(1);
			conn.beginRequest();
			ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM EMPLOYEE;");
			while (rs.next()) {
				   log.info(rs.getInt("ID")+"  "+rs.getString("FIRST_NAME")+"  "+rs.getInt("SALARY"));   
			}
		} catch (SQLException e) {
			throw new UnCommittedException("Database access error");
		}
		catch (UnCommittedException e) {
			log.error(e);
		}
	}
}
