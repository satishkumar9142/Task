package com.reactiveworks.soapforaxis;

public class ASMDImplProxy implements com.reactiveworks.soapforaxis.ASMDImpl {
  private String _endpoint = null;
  private com.reactiveworks.soapforaxis.ASMDImpl aSMDImpl = null;
  
  public ASMDImplProxy() {
    _initASMDImplProxy();
  }
  
  public ASMDImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initASMDImplProxy();
  }
  
  private void _initASMDImplProxy() {
    try {
      aSMDImpl = (new com.reactiveworks.soapforaxis.ASMDImplServiceLocator()).getASMDImpl();
      if (aSMDImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)aSMDImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)aSMDImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (aSMDImpl != null)
      ((javax.xml.rpc.Stub)aSMDImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.reactiveworks.soapforaxis.ASMDImpl getASMDImpl() {
    if (aSMDImpl == null)
      _initASMDImplProxy();
    return aSMDImpl;
  }
  
  public int getSubtract(int a, int b) throws java.rmi.RemoteException{
    if (aSMDImpl == null)
      _initASMDImplProxy();
    return aSMDImpl.getSubtract(a, b);
  }
  
  public double getDivide(int a, int b) throws java.rmi.RemoteException{
    if (aSMDImpl == null)
      _initASMDImplProxy();
    return aSMDImpl.getDivide(a, b);
  }
  
  public int getMultiply(int a, int b) throws java.rmi.RemoteException{
    if (aSMDImpl == null)
      _initASMDImplProxy();
    return aSMDImpl.getMultiply(a, b);
  }
  
  public int getAdd(int a, int b) throws java.rmi.RemoteException{
    if (aSMDImpl == null)
      _initASMDImplProxy();
    return aSMDImpl.getAdd(a, b);
  }
  
  
}