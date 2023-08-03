package com.reactiveworks.r2dbc.mainmethod;

import java.io.FileNotFoundException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.reactiveworks.r2dbc.services.CRUD;

public class R2DBC {

	private static Logger log = LogManager.getLogger(R2DBC.class);

	public static void main(String[] args) {

		CRUD crud;
		try {
			crud = new CRUD();
//			crud.Create();
//			crud.Insert();
//			crud.Update();
//			crud.Delete();
			crud.Read();
		} catch (FileNotFoundException e) {
			log.error(e);
		}
	}
}
