package com.reactiveworks.cxf;

import javax.jws.WebService;

@WebService(targetNamespace = "http://cxf.reactiveworks.com/", portName = "OperationsPort", serviceName = "OperationsService")
public class Operations {
	
	public int getAdd(int a, int b) {
		return a+b;
	}
}
