package com.inventario.vacunacion.dto;

import java.io.Serializable;
import java.util.Date;

public class EmpleadoDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private String cedula;
	private String nombres;
	private String apellidos;
	private String correoElectronico;
	private Date fechaNacimiento;
	private String direccionDomicilio;
	private String telefonoMovil;
	private String estadoVacuna;
	
	
	
	/**
	 * 
	 */
	public EmpleadoDTO() {
		super();
	}
	/**
	 * @param id
	 * @param cedula
	 * @param nombres
	 * @param apellidos
	 * @param correoElectronico
	 * @param fechaNacimiento
	 * @param direccionDomicilio
	 * @param telefonoMovil
	 * @param estadoVacuna
	 */
	public EmpleadoDTO(Integer id, String cedula, String nombres, String apellidos, String correoElectronico,
			Date fechaNacimiento, String direccionDomicilio, String telefonoMovil, String estadoVacuna) {
		super();
		this.id = id;
		this.cedula = cedula;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.correoElectronico = correoElectronico;
		this.fechaNacimiento = fechaNacimiento;
		this.direccionDomicilio = direccionDomicilio;
		this.telefonoMovil = telefonoMovil;
		this.estadoVacuna = estadoVacuna;
	}
	
	public EmpleadoDTO(Integer id, String cedula, String nombres, String apellidos, String correoElectronico,
			Date fechaNacimiento, String direccionDomicilio, String telefonoMovil) {
		super();
		this.id = id;
		this.cedula = cedula;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.correoElectronico = correoElectronico;
		this.fechaNacimiento = fechaNacimiento;
		this.direccionDomicilio = direccionDomicilio;
		this.telefonoMovil = telefonoMovil;
		
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
	 * @return the cedula
	 */
	public String getCedula() {
		return cedula;
	}
	/**
	 * @param cedula the cedula to set
	 */
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	/**
	 * @return the nombres
	 */
	public String getNombres() {
		return nombres;
	}
	/**
	 * @param nombres the nombres to set
	 */
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}
	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	/**
	 * @return the correoElectronico
	 */
	public String getCorreoElectronico() {
		return correoElectronico;
	}
	/**
	 * @param correoElectronico the correoElectronico to set
	 */
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	/**
	 * @return the fechaNacimiento
	 */
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	/**
	 * @param fechaNacimiento the fechaNacimiento to set
	 */
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	/**
	 * @return the direccionDomicilio
	 */
	public String getDireccionDomicilio() {
		return direccionDomicilio;
	}
	/**
	 * @param direccionDomicilio the direccionDomicilio to set
	 */
	public void setDireccionDomicilio(String direccionDomicilio) {
		this.direccionDomicilio = direccionDomicilio;
	}
	/**
	 * @return the telefonoMovil
	 */
	public String getTelefonoMovil() {
		return telefonoMovil;
	}
	/**
	 * @param telefonoMovil the telefonoMovil to set
	 */
	public void setTelefonoMovil(String telefonoMovil) {
		this.telefonoMovil = telefonoMovil;
	}
	/**
	 * @return the estadoVacuna
	 */
	public String getEstadoVacuna() {
		return estadoVacuna;
	}
	/**
	 * @param estadoVacuna the estadoVacuna to set
	 */
	public void setEstadoVacuna(String estadoVacuna) {
		this.estadoVacuna = estadoVacuna;
	}
	
	

}
