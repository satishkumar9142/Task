/**
 * Sample_Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.Sample;

public interface Sample_Service extends javax.xml.rpc.Service {
    public java.lang.String getSampleSOAPAddress();

    public org.example.www.Sample.Sample_PortType getSampleSOAP() throws javax.xml.rpc.ServiceException;

    public org.example.www.Sample.Sample_PortType getSampleSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
