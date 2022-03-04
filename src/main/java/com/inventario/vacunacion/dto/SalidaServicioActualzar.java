package com.inventario.vacunacion.dto;

import java.io.Serializable;

public class SalidaServicioActualzar implements Serializable{

	private static final long serialVersionUID = 8961521047745050526L;

	private String usuarioGenerado;
	private String passwordGenerado;
	private String mensaje;
	/**
	 * @param usuarioGenerado
	 * @param passwordGenerado
	 */
	public SalidaServicioActualzar(String usuarioGenerado, String passwordGenerado, String mensaje) {
		super();
		this.usuarioGenerado = usuarioGenerado;
		this.passwordGenerado = passwordGenerado;
		this.mensaje = mensaje;
	}
	
	public SalidaServicioActualzar() {
		
	}

	/**
	 * @return the usuarioGenerado
	 */
	public String getUsuarioGenerado() {
		return usuarioGenerado;
	}

	/**
	 * @param usuarioGenerado the usuarioGenerado to set
	 */
	public void setUsuarioGenerado(String usuarioGenerado) {
		this.usuarioGenerado = usuarioGenerado;
	}

	/**
	 * @return the passwordGenerado
	 */
	public String getPasswordGenerado() {
		return passwordGenerado;
	}

	/**
	 * @param passwordGenerado the passwordGenerado to set
	 */
	public void setPasswordGenerado(String passwordGenerado) {
		this.passwordGenerado = passwordGenerado;
	}

	/**
	 * @return the mensaje
	 */
	public String getMensaje() {
		return mensaje;
	}

	/**
	 * @param mensaje the mensaje to set
	 */
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	
}
