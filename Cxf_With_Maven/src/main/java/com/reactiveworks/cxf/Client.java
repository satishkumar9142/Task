package com.reactiveworks.cxf;


public class Client {
	public static void main(String[] args) {
		OperationsService operationService = new OperationsService();
		Operations operation = operationService.getOperationsPort();
		int add = operation.getAdd(10, 20);
		System.out.println(add);
	}
}
