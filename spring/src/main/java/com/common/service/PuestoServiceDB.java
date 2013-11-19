package com.common.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.common.dao.PuestoDAO;
import com.common.model.Puesto;

@Transactional
public class PuestoServiceDB implements PuestoService {

	@Autowired
	private PuestoDAO puestoDAO;




	public PuestoDAO getPuestoDAO() {
		return puestoDAO;
	}

	public void setPuestoDAO(PuestoDAO puestoDAO) {
		this.puestoDAO = puestoDAO;
	}

	@Override
	public Puesto getPuestoById(Long id) {
		return this.getPuestoDAO().getPuestoById(id);
	}

}
