package com.reactiveworks.uncommitted.mainmethod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.reactiveworks.uncommitted.customexception.UnCommittedException;
import com.reactiveworks.uncommitted.services.Transaction;

public class Uncommitted {
	private static Logger log = LogManager.getLogger(Uncommitted.class);
	
	public static void main(String[] args) {
		Transaction trans = new Transaction();
		try {
			trans.Transaction1();
			trans.Transaction2();
		} catch (UnCommittedException e) {
			log.error(e);
		}	
	}
}
