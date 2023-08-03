package com.reactiveworks.cxf.example;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(targetNamespace = "http://example.cxf.reactiveworks.com/", portName = "CalculatorImplPort", serviceName = "CalculatorImplService")
public class CalculatorImpl implements Calculator {

	@WebMethod(operationName = "getAdd", action = "urn:GetAdd")
	@Override
	public int getAdd(@WebParam(name = "arg0") int a, @WebParam(name = "arg1") int b) {
		// TODO Auto-generated method stub
		return (a+b);
	}

	@WebMethod(operationName = "getSubtract", action = "urn:GetSubtract")
	@Override
	public int getSubtract(@WebParam(name = "arg0") int a, @WebParam(name = "arg1") int b) {
		// TODO Auto-generated method stub
		return (a-b);
	}

	@WebMethod(operationName = "getMultiply", action = "urn:GetMultiply")
	@Override
	public int getMultiply(@WebParam(name = "arg0") int a, @WebParam(name = "arg1") int b) {
		// TODO Auto-generated method stub
		return (a*b);
	}

	@WebMethod(operationName = "getDivide", action = "urn:GetDivide")
	@Override
	public double getDivide(@WebParam(name = "arg0") int a, @WebParam(name = "arg1") int b) {
		// TODO Auto-generated method stub
		return (a/b);
	}
	
}
