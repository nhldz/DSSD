package com.common.web.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.common.model.Empleado;
import com.common.model.Objetivo;

/**

 * @author Gaspar Rajoy

 **/
@WebService(endpointInterface = "com.common.web.service.PersonWebService", serviceName="personService")
public interface PersonWebService {
 
	@WebMethod
	public Empleado getEmpleado(@WebParam(name="cuit") String cuit);

	@WebMethod
	@WebResult(name="objetivos")
	public List<Objetivo> getObjetivosParaEmpleado(@WebParam(name="cuit") String cuit);
}