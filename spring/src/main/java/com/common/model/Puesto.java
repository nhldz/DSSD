package com.common.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Puesto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String descripcion;

	@OneToMany(targetEntity=Objetivo.class)
	private List<Objetivo> objetivos;
	
	public List<Objetivo> getObjetivos() {
		return objetivos;
	}
	public void setObjetivos(List<Objetivo> objetivos) {
		this.objetivos = objetivos;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
