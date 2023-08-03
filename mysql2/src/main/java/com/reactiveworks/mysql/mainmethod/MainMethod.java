package com.reactiveworks.mysql.mainmethod;

import java.util.Arrays;

import com.reactiveworks.mysql.crudoperation.CRUD;

public class MainMethod {
	public static void main(String[] args) {
		CRUD crud = new CRUD();
		try {
//			crud.Create();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
//			crud.Insert();
			crud.Update();
//			crud.Delete();
			crud.Read();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
