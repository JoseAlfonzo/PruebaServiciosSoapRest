/**
 * ServiceDAOImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.parameta.dao;

public interface ServiceDAOImpl extends java.rmi.Remote {
    public long agregarEmpleado(com.parameta.model.Empleado empleado) throws java.rmi.RemoteException;
    public com.parameta.model.Empleado getEmpleado(int id) throws java.rmi.RemoteException;
}
