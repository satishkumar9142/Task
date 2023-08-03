package com.reactiveworks.serializabletransaction.mainmethod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.reactiveworks.serializabletransaction.crudoperation.Transaction;
import com.reactiveworks.serializabletransaction.customexception.SerializableException;

public class serializableTransaction {
	
	private static Logger log = LogManager.getLogger(serializableTransaction.class);
	public static void main(String[] args) {
		Transaction trans = new Transaction();
		try {
			trans.Transaction1();
			trans.Transaction2();
		} catch (SerializableException e) {
			log.error(e);
		}
			
	}
}
