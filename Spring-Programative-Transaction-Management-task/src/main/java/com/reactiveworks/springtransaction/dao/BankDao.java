package com.reactiveworks.springtransaction.dao;



import com.reactiveworks.springtransaction.exception.InsufficientAccountBalanceException;
import com.reactiveworks.springtransaction.model.Account;

public interface BankDao {
	public abstract void withdraw(Account fromAccount,Double withdrawAmt) throws InsufficientAccountBalanceException;
	public abstract void deposit(Account toAccount,Double depositAmt);

}
