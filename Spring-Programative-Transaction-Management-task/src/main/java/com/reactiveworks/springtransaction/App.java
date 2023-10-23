package com.reactiveworks.springtransaction;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.reactiveworks.springtransaction.model.Account;
import com.reactiveworks.springtransaction.service.BankService;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
      BankService service = context.getBean("bankService", BankService.class);
      
       Account fromAccount = new Account();
       fromAccount.setAccountNumber(43243245345L);
       
       Account toAccount = new Account();
       toAccount.setAccountNumber(43213234324L);
       
       service.transferFund(fromAccount, toAccount, 100.0);
       
    }
}
