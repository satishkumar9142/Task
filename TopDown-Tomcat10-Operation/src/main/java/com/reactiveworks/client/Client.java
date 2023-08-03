package com.reactiveworks.client;

import com.reactiveworks.client.NewOperation.Arg0;
import com.reactiveworks.client.NewOperationResponse.Return;

public class Client implements OperationImpl {

	@Override
	public Return newOperation(Arg0 arg0) {	
		Return result = new Return();
		result.setResult(arg0.getA() + arg0.getB());
		return result;
	}
	public static void main(String[] args) {
		
		Client client = new Client();
		Arg0 arg0 = new Arg0();
		arg0.setA(10);
		arg0.setB(16);
		int result = client.newOperation(arg0).getResult();
		System.out.println(result);
	}
}