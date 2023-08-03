/**
 * Sample_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.Sample;

public class Sample_ServiceLocator extends org.apache.axis.client.Service implements org.example.www.Sample.Sample_Service {

    public Sample_ServiceLocator() {
    }


    public Sample_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Sample_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SampleSOAP
    private java.lang.String SampleSOAP_address = "http://www.example.org/";

    public java.lang.String getSampleSOAPAddress() {
        return SampleSOAP_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SampleSOAPWSDDServiceName = "SampleSOAP";

    public java.lang.String getSampleSOAPWSDDServiceName() {
        return SampleSOAPWSDDServiceName;
    }

    public void setSampleSOAPWSDDServiceName(java.lang.String name) {
        SampleSOAPWSDDServiceName = name;
    }

    public org.example.www.Sample.Sample_PortType getSampleSOAP() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SampleSOAP_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSampleSOAP(endpoint);
    }

    public org.example.www.Sample.Sample_PortType getSampleSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.example.www.Sample.SampleSOAPStub _stub = new org.example.www.Sample.SampleSOAPStub(portAddress, this);
            _stub.setPortName(getSampleSOAPWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSampleSOAPEndpointAddress(java.lang.String address) {
        SampleSOAP_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.example.www.Sample.Sample_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                org.example.www.Sample.SampleSOAPStub _stub = new org.example.www.Sample.SampleSOAPStub(new java.net.URL(SampleSOAP_address), this);
                _stub.setPortName(getSampleSOAPWSDDServiceName());
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
        if ("SampleSOAP".equals(inputPortName)) {
            return getSampleSOAP();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.example.org/Sample/", "Sample");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.example.org/Sample/", "SampleSOAP"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SampleSOAP".equals(portName)) {
            setSampleSOAPEndpointAddress(address);
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
