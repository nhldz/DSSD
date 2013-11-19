package com.common.web.service;

import java.util.List;

import com.common.model.Empleado;
import com.common.model.Objetivo;
import com.common.model.Puesto;
import com.common.service.EmpleadoService;
import com.common.service.PuestoService;

/**
 * 
 * @author Gaspar Rajoy
 **/

public class PersonWebServiceBean implements PersonWebService {

	private EmpleadoService personService;
	private PuestoService puestoService;

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

	@Override
	public boolean promoverEmpleado(String cuit) {
		Empleado empleado = personService.getEmpleado(cuit);
		Puesto nuevoPuesto = this.getPuestoService().getPuestoById(8L);
		
		empleado.setPuesto(nuevoPuesto);
		personService.updateEmpleado(empleado);
		
		return true;
	}

	public PuestoService getPuestoService() {
		return puestoService;
	}

	public void setPuestoService(PuestoService puestoService) {
		this.puestoService = puestoService;
	}
	
}