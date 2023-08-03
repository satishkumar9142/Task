package com.reactiveworks.nosql.mainmethod;

import com.reactiveworks.nosql.keyspace.Operation;

public class MainMethod {
	public static void main(String[] args) {
	 
		Operation key = new Operation();
		key.CreateKeySpace();
		key.CreateTable();
		key.InsertData();
		key.UpdateData();
//		key.SearchData();
	}
}
  