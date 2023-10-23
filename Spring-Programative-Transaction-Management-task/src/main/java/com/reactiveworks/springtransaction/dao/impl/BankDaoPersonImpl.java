package com.reactiveworks.springtransaction.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.jdbc.CannotGetJdbcConnectionException;
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

import com.reactiveworks.springtransaction.dao.BankDao;
import com.reactiveworks.springtransaction.datasource.DynamicDataSource;
import com.reactiveworks.springtransaction.datasourcekey.DynamicDataSourceContextHolder;
import com.reactiveworks.springtransaction.exception.InsufficientAccountBalanceException;
import com.reactiveworks.springtransaction.model.Account;

public class BankDaoPersonImpl implements BankDao {
	
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
		System.out.println("BankDaoPerson");
		Statement conn = null;
		DynamicDataSourceContextHolder.clearDataSourceKey();
		DynamicDataSourceContextHolder.setDataSourceKey("person");

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




/*
	import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class CustomRoutingDataSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        // Implement your logic here to determine the current data source key
        // This could be based on a ThreadLocal variable, user context, etc.
        return YourContextHolder.getCurrentDataSourceKey();
    }
}

<bean id="dataSource1" class="org.apache.commons.dbcp2.BasicDataSource">
    <!-- Configure data source properties for dataSource1 -->
    <!-- ... -->
</bean>

<bean id="dataSource2" class="org.apache.commons.dbcp2.BasicDataSource">
    <!-- Configure data source properties for dataSource2 -->
    <!-- ... -->
</bean>

<bean id="routingDataSource" class="com.example.CustomRoutingDataSource">
    <property name="targetDataSources">
        <map>
            <entry key="dataSource1" value-ref="dataSource1"/>
            <entry key="dataSource2" value-ref="dataSource2"/>
        </map>
    </property>
    <property name="defaultTargetDataSource" ref="dataSource1"/>
</bean>

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceUtils;
import java.sql.Connection;

public class YourService {

    @Autowired
    private CustomRoutingDataSource routingDataSource; // Autowire the custom routing data source
    
    public void doSomething() {
        Connection connection = DataSourceUtils.getConnection(routingDataSource); // Obtain the connection
        
        try {
            // Use the connection to perform database operations
            // ...
        } finally {
            DataSourceUtils.releaseConnection(connection, routingDataSource); // Release the connection
        }
    }
}


*/