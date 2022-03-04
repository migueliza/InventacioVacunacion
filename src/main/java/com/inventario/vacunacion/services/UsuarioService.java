package com.inventario.vacunacion.services;

import com.inventario.vacunacion.dto.EntradaUsuario;
import com.inventario.vacunacion.dto.SalidaServicioActualzar;


public interface UsuarioService {

	public SalidaServicioActualzar crearUsuario(EntradaUsuario usuario) throws Exception;
	
}
