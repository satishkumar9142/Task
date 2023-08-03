package com.reactiveworks.example;

import javax.jws.WebService;

@WebService(targetNamespace = "http://example.reactiveworks.com/", portName = "MathUtilityPort", serviceName = "MathUtilityService")
public class MathUtility {
	
	public int getAdd(int a, int b) {
		return (a+b);
	}
	
	public int factorial(int n) {
		int result =1;
		for(int i =2;i<=n;i++){
			result *= i;
		}
		return result;
	}

}
