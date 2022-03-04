package com.inventario.vacunacion.services;

import java.util.List;

import com.inventario.vacunacion.dto.EmpleadoDTO;
import com.inventario.vacunacion.dto.SalidaServicio;


public interface EmpleadoService {

	public List<EmpleadoDTO> listarEmpleados();
	
	public EmpleadoDTO traerEmpleado(String empleadoId);
	
	public SalidaServicio agregarEmpleado(EmpleadoDTO empleado) throws Exception;
	
	public SalidaServicio actualizarEmpleado(EmpleadoDTO empleado);
	
}
