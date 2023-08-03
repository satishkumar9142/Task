package com.reactiveworks.mysqlconnectionpool.mainmethod;

import java.util.Arrays;

import com.reactiveworks.mysqlconnectionpool.crud.CRUD;

public class MainMethod {
	public static void main(String[] args) {
		CRUD crud = new CRUD();
//		crud.Create();
//		crud.Insert();
		crud.Delete();
		crud.Read();
		
		
	}
}
