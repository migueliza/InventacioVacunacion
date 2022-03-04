package com.inventario.vacunacion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inventario.vacunacion.dto.EntradaVacuna;
import com.inventario.vacunacion.dto.SalidaServicio;
import com.inventario.vacunacion.services.VacunaService;

@RestController
@RequestMapping("/inventario-vacunacion")
public class VacunaController {

	@Autowired
	private VacunaService vacunaService;
	
	@PostMapping("/vacuna")
	public SalidaServicio ingresarVacuna(@RequestBody EntradaVacuna entrada) throws Exception{
		return this.vacunaService.ingresarVacuna(entrada);
	}
	
}
