package com.reactiveworks.soapaxis2;

import java.rmi.RemoteException;

public class CalculatorServicesForClient {
	
	public static void main(String[] args) throws RemoteException {
		
		CalculatorImplStub stub = new CalculatorImplStub();
		
		CalculatorImplStub.GetAdd inputAdd = new CalculatorImplStub.GetAdd() ;
		CalculatorImplStub.GetSubtract inputSub = new CalculatorImplStub.GetSubtract() ;
		CalculatorImplStub.GetMultiply inputMul = new CalculatorImplStub.GetMultiply() ;
		CalculatorImplStub.GetDivide inputDiv = new CalculatorImplStub.GetDivide() ;
		
		inputAdd.setA(12);
		inputAdd.setB(13);
		
		inputSub.setA(15);
		inputSub.setB(10);
		
		inputMul.setA(10);
		inputMul.setB(11);
		
		inputDiv.setA(12);
		inputDiv.setB(7);
		
		
		CalculatorImplStub.GetAddResponse addOutput = stub.getAdd(inputAdd);
		CalculatorImplStub.GetSubtractResponse subOutput = stub.getSubtract(inputSub);
		CalculatorImplStub.GetMultiplyResponse  mulOutput = stub.getMultiply(inputMul);
		CalculatorImplStub.GetDivideResponse divOutput = stub.getDivide(inputDiv);
		
		int add = addOutput.get_return();
		int sub = subOutput.get_return();
		int mul = mulOutput.get_return();
		double div = divOutput.get_return();
		
		System.out.println(add);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
	}
}
