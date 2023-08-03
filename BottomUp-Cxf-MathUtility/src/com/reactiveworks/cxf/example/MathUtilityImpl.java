package com.reactiveworks.cxf.example;

import javax.jws.WebService;

@WebService(targetNamespace = "http://example.cxf.reactiveworks.com/", portName = "MathUtilityImplPort", serviceName = "MathUtilityImplService")
public class MathUtilityImpl implements MathUtility{

	@Override
	public int getAdd(int a, int b) {
		// TODO Auto-generated method stub
		return (a+b);
	}

	@Override
	public int getFactorial(int n) {
		int result =1;
		for(int i =2;i<=n;i++)
			result *= i;
		return result;
	}

}
