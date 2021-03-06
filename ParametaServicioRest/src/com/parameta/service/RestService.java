package com.parameta.service;

import java.net.URISyntaxException;
import java.rmi.RemoteException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.rpc.ServiceException;

import com.parameta.dao.ServiceDAOImpl;
import com.parameta.dao.ServiceDAOImplServiceLocator;
import com.parameta.model.Empleado;
 
@Path("/service")
public class RestService {
	
	ServiceDAOImplServiceLocator locator = new ServiceDAOImplServiceLocator();
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getEmpleado(@PathParam("id") Integer id) {
 
		Empleado emp = null;

	    if(id  < 0){
	        return Response.noContent().build();
	    }
	    
		try {
			ServiceDAOImpl service = locator.getServiceDAOImpl();
			
			emp = service.getEmpleado(id);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	     
	    GenericEntity<Empleado> entity = new GenericEntity<Empleado>(emp, Empleado.class);
	    return Response.ok().entity(entity).build();
	}
	
	@POST
	@Consumes("application/x-www-form-urlencoded;charset=UTF-8")
	@Produces(MediaType.APPLICATION_JSON)
	public Response agregarEmpleado(
			@FormParam("nombres") String nombres,
			@FormParam("apellidos") String apellidos,
			@FormParam("tipoDocumento") String tipoDocumento,
			@FormParam("documento") String documento,
			@FormParam("fechaNacimiento") String fechaNacimiento,
			@FormParam("cargo") String cargo,
			@FormParam("salario") Double salario
			) throws URISyntaxException
	{
	     
		Calendar fechaNaci = GregorianCalendar.getInstance();
		Calendar fechaVinculacion = GregorianCalendar.getInstance();
		Integer edad = 0;
		
	    if(nombres == null || nombres.isEmpty()) {
	        return Response.status(400).entity("Por favor ingrese el nombre del empleado").build();
	    }
	    
	    if(apellidos == null || apellidos.isEmpty()) {
	        return Response.status(400).entity("Por favor ingrese el apellidos del empleado").build();
	    }
	    
	    if(tipoDocumento== null || tipoDocumento.isEmpty()) {
	        return Response.status(400).entity("Por favor ingrese el tipoDocumento del empleado").build();
	    }
	    
	    if(documento== null || documento.isEmpty()) {
	        return Response.status(400).entity("Por favor ingrese el documento del empleado").build();
	    }
	    
	    if(fechaNacimiento == null) {
	        return Response.status(400).entity("Por favor ingrese el fechaNacimiento del empleado").build();
	    }else {
	    	if(!validarFecha(fechaNacimiento)) {
	    		return Response.status(400).entity("El formato de la fecha es incorrecto").build();
	    	}else {
	    		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	    		sdf.setLenient(false);
    			Date fecha;
				try {
					fecha = sdf.parse(fechaNacimiento);
	    			fechaNaci.setTime(fecha);
				} catch (ParseException e) {}

	    	}
	    		
	    }
	    
	    if(cargo == null || cargo.isEmpty()) {
	        return Response.status(400).entity("Por favor ingrese el  cargo del empleado").build();
	    }
	    
	    if(salario == null) {
	        return Response.status(400).entity("Por favor ingrese el salario del empleado").build();
	    }
	    
	    edad = calcularEdad(fechaNaci.getTime());
	    
	    if(edad < 18) {
	        return Response.status(400).entity("El empleado no es mayor de edad").build();
	    }
	    
		ServiceDAOImplServiceLocator locator = new ServiceDAOImplServiceLocator();
		
		Empleado emp = new Empleado();
		
		emp.setNombres(nombres);
		emp.setApellidos(apellidos);
		emp.setTipoDocumento(tipoDocumento);
		emp.setDocumento(documento);
		emp.setFechaNacimiento(fechaNaci);
		emp.setFechaVinculacionACompania(fechaVinculacion);
		emp.setCargo(cargo);
		emp.setSalario(salario);
		emp.setEdad(edad);
		
		long id = 0;
		
		try {
			
			ServiceDAOImpl service = locator.getServiceDAOImpl();
			
			id = service.agregarEmpleado(emp);
			System.out.println(emp.getNombres());
		} catch (ServiceException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	   
	    return getEmpleado((int) id);
	}
	
	private boolean validarFecha(String fechaAValidar){
		
		if(fechaAValidar == null){
			return false;
		}
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		sdf.setLenient(false);
		
		try {
			
			Date date = sdf.parse(fechaAValidar);
			System.out.println(date);
		
		} catch (ParseException e) {

			return false;
		}
		
		return true;
	}
	
	private static int calcularEdad(Date fechaNacimiento) {
		Calendar dob = Calendar.getInstance();
		dob.setTime(fechaNacimiento);
		Calendar fechaHoy = Calendar.getInstance();
		int age = fechaHoy.get(Calendar.YEAR) - dob.get(Calendar.YEAR);
		if (fechaHoy.get(Calendar.DAY_OF_YEAR) <= dob.get(Calendar.DAY_OF_YEAR))
		age--;
		return age;
    }
}