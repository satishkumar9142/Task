package com.reactiveworks.cxf;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

public class Client {
	public static void main(String[] args) throws ServiceException, RemoteException {
		
		
		OperationsServiceSoapBindingStub stub = new OperationsServiceSoapBindingStub();
		OperationsServiceLocator operationServiceLocator = new  OperationsServiceLocator();
		Operations opertions = operationServiceLocator.getOperationsPort();
		int add = opertions.getAdd(10, 20);
//		int add = stub.getAdd(10, 20);
		System.out.println(add);

	}
}
