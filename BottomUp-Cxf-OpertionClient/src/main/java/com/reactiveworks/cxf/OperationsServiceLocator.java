/**
 * OperationsServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.reactiveworks.cxf;

public class OperationsServiceLocator extends org.apache.axis.client.Service implements com.reactiveworks.cxf.OperationsService {

    public OperationsServiceLocator() {
    }


    public OperationsServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public OperationsServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for OperationsPort
    private java.lang.String OperationsPort_address = "http://localhost:8082/Cxf-BottomUp-Operation/services";

    public java.lang.String getOperationsPortAddress() {
        return OperationsPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String OperationsPortWSDDServiceName = "OperationsPort";

    public java.lang.String getOperationsPortWSDDServiceName() {
        return OperationsPortWSDDServiceName;
    }

    public void setOperationsPortWSDDServiceName(java.lang.String name) {
        OperationsPortWSDDServiceName = name;
    }

    public com.reactiveworks.cxf.Operations getOperationsPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(OperationsPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getOperationsPort(endpoint);
    }

    public com.reactiveworks.cxf.Operations getOperationsPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.reactiveworks.cxf.OperationsServiceSoapBindingStub _stub = new com.reactiveworks.cxf.OperationsServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getOperationsPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setOperationsPortEndpointAddress(java.lang.String address) {
        OperationsPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.reactiveworks.cxf.Operations.class.isAssignableFrom(serviceEndpointInterface)) {
                com.reactiveworks.cxf.OperationsServiceSoapBindingStub _stub = new com.reactiveworks.cxf.OperationsServiceSoapBindingStub(new java.net.URL(OperationsPort_address), this);
                _stub.setPortName(getOperationsPortWSDDServiceName());
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
        if ("OperationsPort".equals(inputPortName)) {
            return getOperationsPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://cxf.reactiveworks.com/", "OperationsService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://cxf.reactiveworks.com/", "OperationsPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("OperationsPort".equals(portName)) {
            setOperationsPortEndpointAddress(address);
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
