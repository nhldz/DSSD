package com.common.exception;

import java.util.Date;

public class EmpleadoException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EmpleadoException(long id, String message, Date date) {
		this.id = id;
		this.message = message;
		this.date = date;
	}

	private long id;
	private String message;
	private Date date;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}