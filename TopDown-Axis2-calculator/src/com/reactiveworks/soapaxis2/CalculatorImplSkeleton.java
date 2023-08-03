
/**
 * CalculatorImplSkeleton.java
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
package com.reactiveworks.soapaxis2;
/**
 *  CalculatorImplSkeleton java skeleton for the axisService
 */
public class CalculatorImplSkeleton{

	/**
	 * Auto generated method signature
	 * 
	 * @param getSubtract 
	 * @return getSubtractResponse 
	 */
	public com.reactiveworks.soapaxis2.GetSubtractResponse getSubtract(com.reactiveworks.soapaxis2.GetSubtract getSubtract)
	{
		//TODO : fill this with the necessary business logic
		throw new  java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#getSubtract");
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param getDivide 
	 * @return getDivideResponse 
	 */
	public com.reactiveworks.soapaxis2.GetDivideResponse getDivide(com.reactiveworks.soapaxis2.GetDivide getDivide)
	{
		//TODO : fill this with the necessary business logic
		throw new  java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#getDivide");
	}

	/**
	 * Auto generated method signature
	 * @param getAdd 
	 * @return getAddResponse 
	 */
	public com.reactiveworks.soapaxis2.GetAddResponse getAdd(com.reactiveworks.soapaxis2.GetAdd getAdd)
	{
		//TODO : fill this with the necessary business logic
		getAdd.setA(10);
		getAdd.setB(20);
		
		GetAddResponse addRes = new GetAddResponse();
		return addRes;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param getMultiply 
	 * @return getMultiplyResponse 
	 */
	public com.reactiveworks.soapaxis2.GetMultiplyResponse getMultiply(com.reactiveworks.soapaxis2.GetMultiply getMultiply)
	{
		//TODO : fill this with the necessary business logic
		throw new  java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#getMultiply");
	}

}
