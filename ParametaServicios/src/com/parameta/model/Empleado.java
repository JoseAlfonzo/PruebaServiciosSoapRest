package com.parameta.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="empleado")
public class Empleado implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1354934764466287520L;

	@Id
	@Column(name="idempleado")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idEmpleado;
	
	@Column(name="nombres")
	private String nombres;
	
	@Column(name="apellidos")
	private String apellidos;
	
	@Column(name="tipo_documento")
	private String tipoDocumento;
	
	@Column(name="numero_documento")
	private String documento;
	
	@Column(name="fecha_nacimiento")
	private Date fechaNacimiento;

	@Column(name="edad")
	private Integer edad;
	
	@Column(name="fecha_vinculacion_compania")
	private Date fechaVinculacionACompania;
	
	@Column(name="cargo")
	private String cargo;
	
	@Column(name="salario")
	private Double salario;
	
	public Empleado() {}
	
	public Empleado(String nombres,String apellidos,String tipoDocuento,String documento,
			Date fechaNacimiento,Date fechaVinculacionACompania,String cargo,Double salario){
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.tipoDocumento = tipoDocuento;
		this.documento = documento;
		this.fechaNacimiento = fechaNacimiento;
		this.fechaVinculacionACompania = fechaVinculacionACompania;
		this.cargo = cargo;
		this.salario = salario;
	}

	public Integer getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(Integer idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Date getFechaVinculacionACompania() {
		return fechaVinculacionACompania;
	}

	public void setFechaVinculacionACompania(Date fechaVinculacionACompania) {
		this.fechaVinculacionACompania = fechaVinculacionACompania;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	

}
