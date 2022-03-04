package com.inventario.vacunacion.services;

import java.util.List;

import com.inventario.vacunacion.dto.EmpleadoDTO;
import com.inventario.vacunacion.dto.SalidaServicio;
import com.inventario.vacunacion.modelo.Empleado;

public interface EmpleadoService {

	public List<EmpleadoDTO> listarEmpleados();
	
	public EmpleadoDTO traerEmpleado(String empleadoId);
	
	public SalidaServicio agregarEmpleado(Empleado empleado) throws Exception;
	
	public SalidaServicio actualizarEmpleado(EmpleadoDTO empleado);
	
}
