package com.common.dao;

import java.util.List;

import com.common.model.Empleado;

/**
 * @author gaspar
 *
 */
public interface EmpleadoDAO {

	public void saveEmpleado(Empleado empleado);
	
	public List<Empleado> getAllEmpleado();
	
	public Empleado selectEmpleadoByCuit(String cuit);

	public void deleteEmpleado(Empleado empleado);
	
	public void updateEmpleado(Empleado empleado);
	
}
