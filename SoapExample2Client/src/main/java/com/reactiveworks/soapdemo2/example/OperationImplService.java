/**
 * OperationImplService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.reactiveworks.soapdemo2.example;

public interface OperationImplService extends javax.xml.rpc.Service {
    public java.lang.String getOperationImplAddress();

    public com.reactiveworks.soapdemo2.example.OperationImpl getOperationImpl() throws javax.xml.rpc.ServiceException;

    public com.reactiveworks.soapdemo2.example.OperationImpl getOperationImpl(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
