package com.inventario.vacunacion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inventario.vacunacion.dto.EntradaUsuario;
import com.inventario.vacunacion.dto.SalidaServicioActualzar;
import com.inventario.vacunacion.services.UsuarioService;

@RestController
@RequestMapping("/inventario-vacunacion")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	
	@PostMapping("/usuarios")
	public SalidaServicioActualzar crearUsuario(@RequestBody EntradaUsuario usuario) throws Exception {
		
		return this.usuarioService.crearUsuario(usuario);
		
	}
	
}
