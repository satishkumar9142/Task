package com.reactiveworks.client;

import java.io.FileNotFoundException;

import com.reactiveworks.util.Csvreader;

public class Test {
	public static void main(String[] args) throws FileNotFoundException {
	 
		Csvreader csv = new Csvreader();
		csv.ReadCsv();
		
		System.out.println("done");
	}
}
