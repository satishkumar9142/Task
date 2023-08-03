package com.reactiveworks.axis2;


public class CalculatorImpl implements Calculator {

	@Override
	public int getAdd(int a, int b) {
		// TODO Auto-generated method stub
		return (a+b);
	}

	@Override
	public int getSubtract(int a, int b) {
		// TODO Auto-generated method stub
		return (a-b);
	}

	@Override
	public int getMultiply(int a, int b) {
		// TODO Auto-generated method stub
		return (a*b);
	}

	@Override
	public double getDivide(int a, int b) {
		// TODO Auto-generated method stub
		return (a/b);
	}

}
