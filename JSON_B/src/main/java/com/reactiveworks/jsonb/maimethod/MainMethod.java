package com.reactiveworks.jsonb.maimethod;

import com.reactiveworks.jsonb.util.Json_B;
import com.reactiveworks.jsonb.util.UserJsonB;

public class MainMethod {
	public static void main(String[] args) {
		
		Json_B jsonB = new Json_B();
		jsonB.bindingJson();
		
		UserJsonB js = new UserJsonB();
		js.JsonB();
	  
		
	}
}
