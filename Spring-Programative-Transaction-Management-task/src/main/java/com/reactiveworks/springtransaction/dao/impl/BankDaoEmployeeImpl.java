package com.reactiveworks.springtransaction.dao.impl;

import java.sql.ResultSet;

import java.sql.SQLException;
import java.sql.Statement;
import org.springframework.jdbc.CannotGetJdbcConnectionException;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import com.reactiveworks.springtransaction.dao.BankDao;
import com.reactiveworks.springtransaction.datasourcekey.DynamicDataSourceContextHolder;
import com.reactiveworks.springtransaction.exception.InsufficientAccountBalanceException;
import com.reactiveworks.springtransaction.model.Account;

public class BankDaoEmployeeImpl implements BankDao{
	private AbstractRoutingDataSource dataSource;
	
	public void setDataSource(AbstractRoutingDataSource dataSource) {
		this.dataSource = dataSource;
	}
	public AbstractRoutingDataSource getDataSource() {
		return dataSource;
	}
	public void withdraw(Account fromAccount, Double withdrawAmt) throws InsufficientAccountBalanceException {
		Account accountFromDb = null;
		if (fromAccount != null && fromAccount.getAccountNumber() != null) {
			accountFromDb = getAccountFromDbP(fromAccount.getAccountNumber());
		} else {
			throw new RuntimeException("Account Number doesn't exits");
		}
		if (accountFromDb.getAccountBalance() >= withdrawAmt) {
			Double accountBalance = accountFromDb.getAccountBalance() - withdrawAmt;
			
			String sql = "UPDATE account set AccountBalance="+accountBalance+" WHERE AccountNumber="+fromAccount.getAccountNumber()+";";
			int update =0;
			try {
				update = getStatement().executeUpdate(sql);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			if (update > 0)
				System.out.println("Amount Rs:" + withdrawAmt + " is deducted from account:" + fromAccount.getAccountNumber());
		} else {
			throw new InsufficientAccountBalanceException("Insufficient account balance");
		}
	}

	public void deposit(Account toAccount, Double depositAmt) {
		Account accountFromDb = null;
		Double accountBalance = null;
		if (toAccount != null && toAccount.getAccountNumber() != null) {
			accountFromDb = getAccountFromDbP(toAccount.getAccountNumber());
			accountBalance = accountFromDb.getAccountBalance() + depositAmt;
		} else {
			throw new RuntimeException("Account Number doesn't exits");
		}
		String sql = "UPDATE account set AccountBalance="+accountBalance+" WHERE AccountNumber="+toAccount.getAccountNumber()+";";		
		int update =0;
		try {
			update = getStatement().executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (update > 0)
			System.out.println("Amount Rs: " + depositAmt + " is deposited in Account:" + toAccount.getAccountNumber());	
	}
	
	private Account getAccountFromDbP(Long accountNumber) {
		String SQL = "SELECT * FROM account WHERE AccountNumber =" + accountNumber + ";";
		Account account = null;
		try {
			 ResultSet rs =  getStatement().executeQuery(SQL);
			 rs.next();
			 account = new Account();
			 account.setAccountNumber(rs.getLong("AccountNumber"));
			 account.setAccountHolderName(rs.getString("AccountHolderName"));
			 account.setAccountBalance(rs.getDouble("AccountBalance"));
			 account.setAccountType(rs.getString("AccountType"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return account;
	}
	private  Statement getStatement() {
		System.out.println("BankDaoEmployee");
		DynamicDataSourceContextHolder.clearDataSourceKey();
		DynamicDataSourceContextHolder.setDataSourceKey("Employee");
		Statement conn = null;
		try {
			 conn = dataSource.getConnection().createStatement();
		} catch (CannotGetJdbcConnectionException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
}
