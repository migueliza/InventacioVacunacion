package com.inventario.vacunacion.services;

import com.inventario.vacunacion.dto.EntradaVacuna;
import com.inventario.vacunacion.dto.SalidaServicio;

public interface VacunaService {
	
	public SalidaServicio ingresarVacuna(EntradaVacuna entrada) throws Exception;
}
