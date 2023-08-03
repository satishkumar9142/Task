package com.reactiveworks.soapforaxis;

import java.net.MalformedURLException;
import java.rmi.RemoteException;

import org.apache.axis.AxisFault;

public class ASMDServiceClient {
	
	public static void main(String[] args) {
		java.net.URL endpointURL = null;
		try {
			 endpointURL = new java.net.URL("http://localhost:8082/SoapForAxis/services/ASMDImpl");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		org.apache.axis.client.Service Service = new org.apache.axis.client.Service();
		ASMDImplSoapBindingStub stub = null;
		try {
			 stub = new ASMDImplSoapBindingStub(endpointURL, Service);
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			int add = stub.getAdd(10, 12);
			int sub = stub.getSubtract(12, 10);
			int mul = stub.getMultiply(12, 12);
			double div = stub.getDivide(11, 10);
			System.out.println(add);
			System.out.println(sub);
			System.out.println(mul);
			System.out.println(div);
			
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
