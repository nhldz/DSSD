package com.common.web.service;

import java.util.List;

import com.common.model.Empleado;
import com.common.model.Objetivo;
import com.common.service.EmpleadoService;

/**
 * 
 * @author Gaspar Rajoy
 **/

public class PersonWebServiceBean implements PersonWebService {

	private EmpleadoService personService;

	/**
	 * @param personService
	 *            the personService to set
	 */
	public void setPersonService(EmpleadoService personService) {
		this.personService = personService;
	}

	public Empleado getEmpleado(String cuit) {

		Empleado person = personService.getEmpleado(cuit);

		return person;
	}

	public List<Objetivo> getObjetivosParaEmpleado(String cuit) {

		Empleado person = personService.getEmpleado(cuit);

		return person.getPuesto().getObjetivos();
	}
	
}