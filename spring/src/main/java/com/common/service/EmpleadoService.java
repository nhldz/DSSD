package com.common.service;


import java.util.List;

import com.common.exception.EmpleadoException;
import com.common.model.Empleado;

public interface EmpleadoService {
	public List<Empleado> getAll() throws EmpleadoException;
	
	public long insertEmpleado(Empleado empleado) throws EmpleadoException;

	/**
	 * @param cuit
	 */
	 public void deleteEmpleado(String cuit);
	/**
	 * @param name
	 * @return
	 */
	public Empleado getEmpleado(String cuit);
	

	public long updateEmpleado(Empleado empleado) throws EmpleadoException;
}