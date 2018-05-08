package com.parameta.dao;

public class ServiceDAOImplProxy implements com.parameta.dao.ServiceDAOImpl {
  private String _endpoint = null;
  private com.parameta.dao.ServiceDAOImpl serviceDAOImpl = null;
  
  public ServiceDAOImplProxy() {
    _initServiceDAOImplProxy();
  }
  
  public ServiceDAOImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initServiceDAOImplProxy();
  }
  
  private void _initServiceDAOImplProxy() {
    try {
      serviceDAOImpl = (new com.parameta.dao.ServiceDAOImplServiceLocator()).getServiceDAOImpl();
      if (serviceDAOImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)serviceDAOImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)serviceDAOImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (serviceDAOImpl != null)
      ((javax.xml.rpc.Stub)serviceDAOImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.parameta.dao.ServiceDAOImpl getServiceDAOImpl() {
    if (serviceDAOImpl == null)
      _initServiceDAOImplProxy();
    return serviceDAOImpl;
  }
  
  public long agregarEmpleado(com.parameta.model.Empleado empleado) throws java.rmi.RemoteException{
    if (serviceDAOImpl == null)
      _initServiceDAOImplProxy();
    return serviceDAOImpl.agregarEmpleado(empleado);
  }
  
  public com.parameta.model.Empleado getEmpleado(int id) throws java.rmi.RemoteException{
    if (serviceDAOImpl == null)
      _initServiceDAOImplProxy();
    return serviceDAOImpl.getEmpleado(id);
  }
  
  
}