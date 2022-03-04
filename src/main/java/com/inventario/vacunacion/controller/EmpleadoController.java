package com.inventario.vacunacion.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inventario.vacunacion.dto.EmpleadoDTO;
import com.inventario.vacunacion.dto.SalidaServicio;
import com.inventario.vacunacion.services.EmpleadoService;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/inventario-vacunacion")
public class EmpleadoController {

	@Autowired
	private EmpleadoService empleadoService;

	@GetMapping("/empleados")
	public List<EmpleadoDTO> listarEmpleados() {
		return this.empleadoService.listarEmpleados();
	}

	@GetMapping("/empleados/{empleadoId}")
	public EmpleadoDTO traerEmpleadoPorId(@PathVariable String empleadoId) {
		EmpleadoDTO empeladoEncontrado = this.empleadoService.traerEmpleado(empleadoId);
		return empeladoEncontrado;
	}

	@PostMapping("/empleados")
	public SalidaServicio addEmpleado(@RequestBody EmpleadoDTO empleado) throws Exception{
		return this.empleadoService.agregarEmpleado(empleado);
	}

	// update course using PUT request
	@PutMapping("/empleados")
	public SalidaServicio  actualizarEmpleado(@RequestBody EmpleadoDTO empleado) {
		
		SalidaServicio salida = this.empleadoService.actualizarEmpleado(empleado);
		
		return salida;
		
	}

}
