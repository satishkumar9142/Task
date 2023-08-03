package com.reactiveworks.repeatable.mainmethod;

import com.reactiveworks.repeatable.customexception.RepeatableReadException;
import com.reactiveworks.repeatable.services.Transaction;

public class ReapeatableRead {
	public static void main(String[] args) {
		Transaction trans = new Transaction();
		try {
			trans.Transaction1();
			trans.Transaction2();
			trans.Transaction2();
			trans.Transaction2();
			trans.Transaction2();
			trans.Transaction2();
		} catch (RepeatableReadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
