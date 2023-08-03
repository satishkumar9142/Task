
/**
 * AddSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
    package com.reactiveworks.axis2;
    /**
     *  AddSkeleton java skeleton for the axisService
     */
    public class AddSkeleton{
        
         
        /**
         * Auto generated method signature
         * 
                                     * @param getAdd 
             * @return getAddResponse 
         */
        
                 public com.reactiveworks.axis2.GetAddResponse getAdd(com.reactiveworks.axis2.GetAdd getAdd)
            {
                	 
                	 GetAddResponse resp = new GetAddResponse();
                	 int a = getAdd.getA();
                	 int b = getAdd.getB();
                	 
                	 resp.set_return(a+b);
                	 return resp;
                	 
//                throw new  java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#getAdd");
        }
     
    }
    