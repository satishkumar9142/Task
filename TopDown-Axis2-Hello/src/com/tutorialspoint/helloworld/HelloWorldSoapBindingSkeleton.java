/**
 * HelloWorldSoapBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.tutorialspoint.helloworld;

public class HelloWorldSoapBindingSkeleton implements com.tutorialspoint.helloworld.HelloWorldPortType, org.apache.axis.wsdl.Skeleton {
    private com.tutorialspoint.helloworld.HelloWorldPortType impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://helloworld.tutorialspoint.com/", "greetings"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://helloworld.tutorialspoint.com/", "greetings"), com.tutorialspoint.helloworld.Greetings.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("greetings", _params, new javax.xml.namespace.QName("http://helloworld.tutorialspoint.com/", "greetingsResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://helloworld.tutorialspoint.com/", "greetingsResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "greetings"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("greetings") == null) {
            _myOperations.put("greetings", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("greetings")).add(_oper);
    }

    public HelloWorldSoapBindingSkeleton() {
        this.impl = new com.tutorialspoint.helloworld.HelloWorldSoapBindingImpl();
    }

    public HelloWorldSoapBindingSkeleton(com.tutorialspoint.helloworld.HelloWorldPortType impl) {
        this.impl = impl;
    }
    public com.tutorialspoint.helloworld.GreetingsResponse greetings(com.tutorialspoint.helloworld.Greetings parameters) throws java.rmi.RemoteException
    {
        com.tutorialspoint.helloworld.GreetingsResponse ret = impl.greetings(parameters);
        return ret;
    }

}
