/**
 * OperationImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.reactiveworks.soapdemo2.example;

public class OperationImplServiceLocator extends org.apache.axis.client.Service implements com.reactiveworks.soapdemo2.example.OperationImplService {

    public OperationImplServiceLocator() {
    }


    public OperationImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public OperationImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for OperationImpl
    private java.lang.String OperationImpl_address = "http://localhost:8082/SoapExample2/services/OperationImpl";

    public java.lang.String getOperationImplAddress() {
        return OperationImpl_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String OperationImplWSDDServiceName = "OperationImpl";

    public java.lang.String getOperationImplWSDDServiceName() {
        return OperationImplWSDDServiceName;
    }

    public void setOperationImplWSDDServiceName(java.lang.String name) {
        OperationImplWSDDServiceName = name;
    }

    public com.reactiveworks.soapdemo2.example.OperationImpl getOperationImpl() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(OperationImpl_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getOperationImpl(endpoint);
    }

    public com.reactiveworks.soapdemo2.example.OperationImpl getOperationImpl(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.reactiveworks.soapdemo2.example.OperationImplSoapBindingStub _stub = new com.reactiveworks.soapdemo2.example.OperationImplSoapBindingStub(portAddress, this);
            _stub.setPortName(getOperationImplWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setOperationImplEndpointAddress(java.lang.String address) {
        OperationImpl_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.reactiveworks.soapdemo2.example.OperationImpl.class.isAssignableFrom(serviceEndpointInterface)) {
                com.reactiveworks.soapdemo2.example.OperationImplSoapBindingStub _stub = new com.reactiveworks.soapdemo2.example.OperationImplSoapBindingStub(new java.net.URL(OperationImpl_address), this);
                _stub.setPortName(getOperationImplWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("OperationImpl".equals(inputPortName)) {
            return getOperationImpl();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://example.soapdemo2.reactiveworks.com", "OperationImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://example.soapdemo2.reactiveworks.com", "OperationImpl"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("OperationImpl".equals(portName)) {
            setOperationImplEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
