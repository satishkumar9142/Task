package com.reactiveworks.cxf;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Operation {
	@WebMethod
	public int getAdd(int a, int b) {
		return a+b;
	}
}
