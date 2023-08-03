package com.reactiveworks.services;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public class Hello {
	@WebMethod
	public String sayHello(String name) {
		return "Hello From " + name;
	}
}
