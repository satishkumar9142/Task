package com.reactiveworks.soapdemo2.example;

public class OperationImplProxy implements com.reactiveworks.soapdemo2.example.OperationImpl {
  private String _endpoint = null;
  private com.reactiveworks.soapdemo2.example.OperationImpl operationImpl = null;
  
  public OperationImplProxy() {
    _initOperationImplProxy();
  }
  
  public OperationImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initOperationImplProxy();
  }
  
  private void _initOperationImplProxy() {
    try {
      operationImpl = (new com.reactiveworks.soapdemo2.example.OperationImplServiceLocator()).getOperationImpl();
      if (operationImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)operationImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)operationImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (operationImpl != null)
      ((javax.xml.rpc.Stub)operationImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.reactiveworks.soapdemo2.example.OperationImpl getOperationImpl() {
    if (operationImpl == null)
      _initOperationImplProxy();
    return operationImpl;
  }
  
  public int getSubtract(int a, int b) throws java.rmi.RemoteException{
    if (operationImpl == null)
      _initOperationImplProxy();
    return operationImpl.getSubtract(a, b);
  }
  
  public int getMultiply(int a, int b) throws java.rmi.RemoteException{
    if (operationImpl == null)
      _initOperationImplProxy();
    return operationImpl.getMultiply(a, b);
  }
  
  public int getAdd(int a, int b) throws java.rmi.RemoteException{
    if (operationImpl == null)
      _initOperationImplProxy();
    return operationImpl.getAdd(a, b);
  }
  
  
}