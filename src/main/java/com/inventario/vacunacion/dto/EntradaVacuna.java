package com.inventario.vacunacion.dto;

import java.io.Serializable;
import java.util.Date;

public class EntradaVacuna implements Serializable{

	private static final long serialVersionUID = -8196905185376233790L;
	
	private Integer id;
	private Date fechaVacunacion;
	private Integer numeroDosis;
	private String tipo;
	private String idEmpleado;
	/**
	 * @param id
	 * @param fechaVacunacion
	 * @param numeroDosis
	 * @param tipo
	 * @param idEmpleado
	 */
	public EntradaVacuna(Integer id, Date fechaVacunacion, Integer numeroDosis, String tipo, String idEmpleado) {
		super();
		this.id = id;
		this.fechaVacunacion = fechaVacunacion;
		this.numeroDosis = numeroDosis;
		this.tipo = tipo;
		this.idEmpleado = idEmpleado;
	}
	/**
	 * 
	 */
	public EntradaVacuna() {
		super();
		// TODO Auto-generated constructor stub
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
	 * @return the fechaVacunacion
	 */
	public Date getFechaVacunacion() {
		return fechaVacunacion;
	}
	/**
	 * @param fechaVacunacion the fechaVacunacion to set
	 */
	public void setFechaVacunacion(Date fechaVacunacion) {
		this.fechaVacunacion = fechaVacunacion;
	}
	/**
	 * @return the numeroDosis
	 */
	public Integer getNumeroDosis() {
		return numeroDosis;
	}
	/**
	 * @param numeroDosis the numeroDosis to set
	 */
	public void setNumeroDosis(Integer numeroDosis) {
		this.numeroDosis = numeroDosis;
	}
	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
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
