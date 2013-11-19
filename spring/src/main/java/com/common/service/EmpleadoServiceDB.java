package com.common.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.common.dao.EmpleadoDAO;
import com.common.exception.EmpleadoException;
import com.common.model.Empleado;

@Transactional
public class EmpleadoServiceDB implements EmpleadoService {

	@Autowired
	private EmpleadoDAO empleadoDAO;

	/**
	 * @return the personDAO
	 */
	public EmpleadoDAO getEmpleadoDAO() {
		return empleadoDAO;
	}

	/**
	 * @param personDAO the personDAO to set
	 */
	public void setEmpleadoDAO(EmpleadoDAO personDAO) {
		this.empleadoDAO = personDAO;
	}

	public List<Empleado> getAll() throws EmpleadoException {
		List<Empleado> persons = empleadoDAO.getAllEmpleado();

		return persons;
	}

	public long insertEmpleado(Empleado person) throws EmpleadoException {
		empleadoDAO.saveEmpleado(person);
		return 0;
	}
	
	
	public void deleteEmpleado(String id){
		try{
			empleadoDAO.deleteEmpleado(empleadoDAO.selectEmpleadoByCuit(id));
		}
		catch (Exception e){
		}
	}

	public Empleado getEmpleado(String cuit) {
		return empleadoDAO.selectEmpleadoByCuit(cuit);
	}

	@Override
	public long updateEmpleado(Empleado person) throws EmpleadoException {

		try{
			empleadoDAO.updateEmpleado(person);
		}
		catch (Exception e){
		}
		return 0;
	}

}
