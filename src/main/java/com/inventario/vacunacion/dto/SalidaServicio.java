package com.inventario.vacunacion.dto;

import java.io.Serializable;

public class SalidaServicio implements Serializable{

	private static final long serialVersionUID = 9060514133702020469L;
	
	
	private String mensajeSalida;


	/**
	 * @param mensajeSalida
	 */
	public SalidaServicio(String mensajeSalida) {
		super();
		this.mensajeSalida = mensajeSalida;
	}
	
	public SalidaServicio() {
		
	}

	/**
	 * @return the mensajeSalida
	 */
	public String getMensajeSalida() {
		return mensajeSalida;
	}

	/**
	 * @param mensajeSalida the mensajeSalida to set
	 */
	public void setMensajeSalida(String mensajeSalida) {
		this.mensajeSalida = mensajeSalida;
	}
	

}
