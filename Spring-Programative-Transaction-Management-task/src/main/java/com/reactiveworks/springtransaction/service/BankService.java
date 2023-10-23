package com.reactiveworks.springtransaction.service;

import com.reactiveworks.springtransaction.model.Account;

public interface BankService {
	
	public abstract void transferFund(Account fromAccount, Account toAccount, Double amount);
}
