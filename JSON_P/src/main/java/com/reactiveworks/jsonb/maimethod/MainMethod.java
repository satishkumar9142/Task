package com.reactiveworks.jsonb.maimethod;

import java.io.FileNotFoundException;

import com.reactiveworks.jsonb.util.Json_P;

public class MainMethod {
	public static void main(String[] args) throws FileNotFoundException {
		
		Json_P jsonP = new Json_P();
		jsonP.getParsingJson();
	}
}
