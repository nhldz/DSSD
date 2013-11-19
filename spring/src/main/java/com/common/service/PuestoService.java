package com.common.service;


import org.springframework.transaction.annotation.Transactional;

import com.common.model.Puesto;

@Transactional
public interface PuestoService {
	public Puesto getPuestoById(Long id);
	
}