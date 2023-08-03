package com.reactiveworks.services;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public class OperationImpl implements Operation{

	@Override
	@WebMethod
	public AddResponse newOperation(Add parameters) {
		// TODO Auto-generated method stub
		System.out.println(parameters.getA()+ " + " + parameters.getB());
		ObjectFactory factory = new ObjectFactory();
		AddResponse response = factory.createAddResponse();
		response.setResult(parameters.getA()+ parameters.getB());
		return response;
	}
}
