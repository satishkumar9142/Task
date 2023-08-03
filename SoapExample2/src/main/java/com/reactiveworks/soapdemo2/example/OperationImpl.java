package com.reactiveworks.soapdemo2.example;

public class OperationImpl implements Operation {

	@Override
	public int getAdd(int a, int b) {
		return (a+b);
	}

	@Override
	public int getSubtract(int a, int b) {
		return (a-b);
	}

	@Override
	public int getMultiply(int a, int b) {
		return (a*b);
	}

}
