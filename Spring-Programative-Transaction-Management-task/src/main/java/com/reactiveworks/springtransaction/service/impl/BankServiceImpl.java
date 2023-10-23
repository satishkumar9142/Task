package com.reactiveworks.springtransaction.service.impl;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import com.reactiveworks.springtransaction.dao.BankDao;
import com.reactiveworks.springtransaction.exception.InsufficientAccountBalanceException;
import com.reactiveworks.springtransaction.model.Account;
import com.reactiveworks.springtransaction.service.BankService;

public class BankServiceImpl implements BankService {

	private TransactionTemplate transactionTemplate;
	
	public TransactionTemplate getTransactionTemplate() {
		return transactionTemplate;
	}
	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
		this.transactionTemplate = transactionTemplate;
	}
	
	private BankDao bankDaoPerson;
	
	public void setBankDaoPerson(BankDao bankDaoPerson) {
		this.bankDaoPerson = bankDaoPerson;
	}
	public BankDao getBankDaoPerson() {
		return bankDaoPerson;
	}
	private BankDao bankDaoEmployee;
	
	public void setBankDaoEmployee(BankDao bankDaoEmployee) {
		this.bankDaoEmployee = bankDaoEmployee;
	}
	public BankDao getBankDaoEmployee() {
		return bankDaoEmployee;
	}
	public void transferFund(final Account fromAccount, final Account toAccount, final Double amount) {
		System.out.println("service");
		transactionTemplate.execute(new TransactionCallback<Void>() {
			public Void doInTransaction(TransactionStatus status) {
				try {
					bankDaoEmployee.withdraw(fromAccount, amount);
					bankDaoEmployee.deposit(toAccount, amount);
					
					bankDaoPerson.withdraw(fromAccount, amount);
					bankDaoPerson.deposit(toAccount, amount);
					
				} catch (InsufficientAccountBalanceException e) {
					e.printStackTrace();
				}
				return null;
			}
		});
	}
}
