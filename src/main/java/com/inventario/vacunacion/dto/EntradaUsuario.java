package com.inventario.vacunacion.dto;

import java.io.Serializable;

public class EntradaUsuario implements Serializable{


	private static final long serialVersionUID = -4988296412543780282L;

	private Integer id;

	private String clave;

	private String usuario;
	
	private String idEmpleado;

	/**
	 * @param id
	 * @param clave
	 * @param usuario
	 * @param idEmpleado
	 */
	public EntradaUsuario(Integer id, String clave, String usuario, String idEmpleado) {
		super();
		this.id = id;
		this.clave = clave;
		this.usuario = usuario;
		this.idEmpleado = idEmpleado;
	}
	
	
	public EntradaUsuario () {
		
	}


	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}


	/**
	 * @return the clave
	 */
	public String getClave() {
		return clave;
	}


	/**
	 * @param clave the clave to set
	 */
	public void setClave(String clave) {
		this.clave = clave;
	}


	/**
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}


	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


	/**
	 * @return the idEmpleado
	 */
	public String getIdEmpleado() {
		return idEmpleado;
	}


	/**
	 * @param idEmpleado the idEmpleado to set
	 */
	public void setIdEmpleado(String idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	
	
	
}
