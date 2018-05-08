/**
 * ServiceDAOImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.parameta.dao;

public class ServiceDAOImplServiceLocator extends org.apache.axis.client.Service implements com.parameta.dao.ServiceDAOImplService {

    public ServiceDAOImplServiceLocator() {
    }


    public ServiceDAOImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ServiceDAOImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ServiceDAOImpl
    private java.lang.String ServiceDAOImpl_address = "http://localhost:8080/ParametaServicios/services/ServiceDAOImpl";

    public java.lang.String getServiceDAOImplAddress() {
        return ServiceDAOImpl_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ServiceDAOImplWSDDServiceName = "ServiceDAOImpl";

    public java.lang.String getServiceDAOImplWSDDServiceName() {
        return ServiceDAOImplWSDDServiceName;
    }

    public void setServiceDAOImplWSDDServiceName(java.lang.String name) {
        ServiceDAOImplWSDDServiceName = name;
    }

    public com.parameta.dao.ServiceDAOImpl getServiceDAOImpl() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ServiceDAOImpl_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getServiceDAOImpl(endpoint);
    }

    public com.parameta.dao.ServiceDAOImpl getServiceDAOImpl(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.parameta.dao.ServiceDAOImplSoapBindingStub _stub = new com.parameta.dao.ServiceDAOImplSoapBindingStub(portAddress, this);
            _stub.setPortName(getServiceDAOImplWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setServiceDAOImplEndpointAddress(java.lang.String address) {
        ServiceDAOImpl_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.parameta.dao.ServiceDAOImpl.class.isAssignableFrom(serviceEndpointInterface)) {
                com.parameta.dao.ServiceDAOImplSoapBindingStub _stub = new com.parameta.dao.ServiceDAOImplSoapBindingStub(new java.net.URL(ServiceDAOImpl_address), this);
                _stub.setPortName(getServiceDAOImplWSDDServiceName());
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
        if ("ServiceDAOImpl".equals(inputPortName)) {
            return getServiceDAOImpl();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://dao.parameta.com", "ServiceDAOImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://dao.parameta.com", "ServiceDAOImpl"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ServiceDAOImpl".equals(portName)) {
            setServiceDAOImplEndpointAddress(address);
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
