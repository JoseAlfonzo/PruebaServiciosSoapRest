/**
 * Empleado.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.parameta.model;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Empleado  implements java.io.Serializable {
    private java.lang.String apellidos;

    private java.lang.String cargo;

    private java.lang.String documento;

    private java.lang.Integer edad;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private java.util.Calendar fechaNacimiento;
    
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private java.util.Calendar fechaVinculacionACompania;

    private java.lang.Integer idEmpleado;

    private java.lang.String nombres;

    private java.lang.Double salario;

    private java.lang.String tipoDocumento;

    public Empleado() {
    }

    public Empleado(
           java.lang.String apellidos,
           java.lang.String cargo,
           java.lang.String documento,
           java.lang.Integer edad,
           java.util.Calendar fechaNacimiento,
           java.util.Calendar fechaVinculacionACompania,
           java.lang.Integer idEmpleado,
           java.lang.String nombres,
           java.lang.Double salario,
           java.lang.String tipoDocumento) {
           this.apellidos = apellidos;
           this.cargo = cargo;
           this.documento = documento;
           this.edad = edad;
           this.fechaNacimiento = fechaNacimiento;
           this.fechaVinculacionACompania = fechaVinculacionACompania;
           this.idEmpleado = idEmpleado;
           this.nombres = nombres;
           this.salario = salario;
           this.tipoDocumento = tipoDocumento;
    }


    /**
     * Gets the apellidos value for this Empleado.
     * 
     * @return apellidos
     */
    public java.lang.String getApellidos() {
        return apellidos;
    }


    /**
     * Sets the apellidos value for this Empleado.
     * 
     * @param apellidos
     */
    public void setApellidos(java.lang.String apellidos) {
        this.apellidos = apellidos;
    }


    /**
     * Gets the cargo value for this Empleado.
     * 
     * @return cargo
     */
    public java.lang.String getCargo() {
        return cargo;
    }


    /**
     * Sets the cargo value for this Empleado.
     * 
     * @param cargo
     */
    public void setCargo(java.lang.String cargo) {
        this.cargo = cargo;
    }


    /**
     * Gets the documento value for this Empleado.
     * 
     * @return documento
     */
    public java.lang.String getDocumento() {
        return documento;
    }


    /**
     * Sets the documento value for this Empleado.
     * 
     * @param documento
     */
    public void setDocumento(java.lang.String documento) {
        this.documento = documento;
    }


    /**
     * Gets the edad value for this Empleado.
     * 
     * @return edad
     */
    public java.lang.Integer getEdad() {
        return edad;
    }


    /**
     * Sets the edad value for this Empleado.
     * 
     * @param edad
     */
    public void setEdad(java.lang.Integer edad) {
        this.edad = edad;
    }


    /**
     * Gets the fechaNacimiento value for this Empleado.
     * 
     * @return fechaNacimiento
     */
    public java.util.Calendar getFechaNacimiento() {
        return fechaNacimiento;
    }


    /**
     * Sets the fechaNacimiento value for this Empleado.
     * 
     * @param fechaNacimiento
     */
    public void setFechaNacimiento(java.util.Calendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }


    /**
     * Gets the fechaVinculacionACompania value for this Empleado.
     * 
     * @return fechaVinculacionACompania
     */
    public java.util.Calendar getFechaVinculacionACompania() {
        return fechaVinculacionACompania;
    }


    /**
     * Sets the fechaVinculacionACompania value for this Empleado.
     * 
     * @param fechaVinculacionACompania
     */
    public void setFechaVinculacionACompania(java.util.Calendar fechaVinculacionACompania) {
        this.fechaVinculacionACompania = fechaVinculacionACompania;
    }


    /**
     * Gets the idEmpleado value for this Empleado.
     * 
     * @return idEmpleado
     */
    public java.lang.Integer getIdEmpleado() {
        return idEmpleado;
    }


    /**
     * Sets the idEmpleado value for this Empleado.
     * 
     * @param idEmpleado
     */
    public void setIdEmpleado(java.lang.Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }


    /**
     * Gets the nombres value for this Empleado.
     * 
     * @return nombres
     */
    public java.lang.String getNombres() {
        return nombres;
    }


    /**
     * Sets the nombres value for this Empleado.
     * 
     * @param nombres
     */
    public void setNombres(java.lang.String nombres) {
        this.nombres = nombres;
    }


    /**
     * Gets the salario value for this Empleado.
     * 
     * @return salario
     */
    public java.lang.Double getSalario() {
        return salario;
    }


    /**
     * Sets the salario value for this Empleado.
     * 
     * @param salario
     */
    public void setSalario(java.lang.Double salario) {
        this.salario = salario;
    }


    /**
     * Gets the tipoDocumento value for this Empleado.
     * 
     * @return tipoDocumento
     */
    public java.lang.String getTipoDocumento() {
        return tipoDocumento;
    }


    /**
     * Sets the tipoDocumento value for this Empleado.
     * 
     * @param tipoDocumento
     */
    public void setTipoDocumento(java.lang.String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Empleado)) return false;
        Empleado other = (Empleado) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.apellidos==null && other.getApellidos()==null) || 
             (this.apellidos!=null &&
              this.apellidos.equals(other.getApellidos()))) &&
            ((this.cargo==null && other.getCargo()==null) || 
             (this.cargo!=null &&
              this.cargo.equals(other.getCargo()))) &&
            ((this.documento==null && other.getDocumento()==null) || 
             (this.documento!=null &&
              this.documento.equals(other.getDocumento()))) &&
            ((this.edad==null && other.getEdad()==null) || 
             (this.edad!=null &&
              this.edad.equals(other.getEdad()))) &&
            ((this.fechaNacimiento==null && other.getFechaNacimiento()==null) || 
             (this.fechaNacimiento!=null &&
              this.fechaNacimiento.equals(other.getFechaNacimiento()))) &&
            ((this.fechaVinculacionACompania==null && other.getFechaVinculacionACompania()==null) || 
             (this.fechaVinculacionACompania!=null &&
              this.fechaVinculacionACompania.equals(other.getFechaVinculacionACompania()))) &&
            ((this.idEmpleado==null && other.getIdEmpleado()==null) || 
             (this.idEmpleado!=null &&
              this.idEmpleado.equals(other.getIdEmpleado()))) &&
            ((this.nombres==null && other.getNombres()==null) || 
             (this.nombres!=null &&
              this.nombres.equals(other.getNombres()))) &&
            ((this.salario==null && other.getSalario()==null) || 
             (this.salario!=null &&
              this.salario.equals(other.getSalario()))) &&
            ((this.tipoDocumento==null && other.getTipoDocumento()==null) || 
             (this.tipoDocumento!=null &&
              this.tipoDocumento.equals(other.getTipoDocumento())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getApellidos() != null) {
            _hashCode += getApellidos().hashCode();
        }
        if (getCargo() != null) {
            _hashCode += getCargo().hashCode();
        }
        if (getDocumento() != null) {
            _hashCode += getDocumento().hashCode();
        }
        if (getEdad() != null) {
            _hashCode += getEdad().hashCode();
        }
        if (getFechaNacimiento() != null) {
            _hashCode += getFechaNacimiento().hashCode();
        }
        if (getFechaVinculacionACompania() != null) {
            _hashCode += getFechaVinculacionACompania().hashCode();
        }
        if (getIdEmpleado() != null) {
            _hashCode += getIdEmpleado().hashCode();
        }
        if (getNombres() != null) {
            _hashCode += getNombres().hashCode();
        }
        if (getSalario() != null) {
            _hashCode += getSalario().hashCode();
        }
        if (getTipoDocumento() != null) {
            _hashCode += getTipoDocumento().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Empleado.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.parameta.com", "Empleado"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apellidos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.parameta.com", "apellidos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cargo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.parameta.com", "cargo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.parameta.com", "documento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("edad");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.parameta.com", "edad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaNacimiento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.parameta.com", "fechaNacimiento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaVinculacionACompania");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.parameta.com", "fechaVinculacionACompania"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idEmpleado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.parameta.com", "idEmpleado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombres");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.parameta.com", "nombres"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.parameta.com", "salario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://model.parameta.com", "tipoDocumento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
