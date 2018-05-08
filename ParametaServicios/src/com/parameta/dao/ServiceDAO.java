package com.parameta.dao;

import com.parameta.model.Empleado;

public interface ServiceDAO {
	
	public long agregarEmpleado(Empleado empleado);
	public Empleado getEmpleado(int id);

}
