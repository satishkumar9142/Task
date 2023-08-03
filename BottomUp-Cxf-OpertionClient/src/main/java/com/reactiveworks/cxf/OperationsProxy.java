package com.reactiveworks.cxf;

public class OperationsProxy implements com.reactiveworks.cxf.Operations {
  private String _endpoint = null;
  private com.reactiveworks.cxf.Operations operations = null;
  
  public OperationsProxy() {
    _initOperationsProxy();
  }
  
  public OperationsProxy(String endpoint) {
    _endpoint = endpoint;
    _initOperationsProxy();
  }
  
  private void _initOperationsProxy() {
    try {
      operations = (new com.reactiveworks.cxf.OperationsServiceLocator()).getOperationsPort();
      if (operations != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)operations)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)operations)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (operations != null)
      ((javax.xml.rpc.Stub)operations)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.reactiveworks.cxf.Operations getOperations() {
    if (operations == null)
      _initOperationsProxy();
    return operations;
  }
  
  public int getAdd(int arg0, int arg1) throws java.rmi.RemoteException{
    if (operations == null)
      _initOperationsProxy();
    return operations.getAdd(arg0, arg1);
  }
  
  
}