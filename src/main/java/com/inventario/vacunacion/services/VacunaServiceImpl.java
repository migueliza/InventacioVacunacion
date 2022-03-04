package com.inventario.vacunacion.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventario.vacunacion.dao.EmpleadoDao;
import com.inventario.vacunacion.dao.VacunaDao;
import com.inventario.vacunacion.dto.EntradaVacuna;
import com.inventario.vacunacion.dto.SalidaServicio;
import com.inventario.vacunacion.modelo.Empleado;
import com.inventario.vacunacion.modelo.Vacuna;

@Service
public class VacunaServiceImpl implements VacunaService{

	@Autowired
	private EmpleadoDao empleadoDao;
	
	@Autowired
	private VacunaDao vacunaDao;
	
	@Override
	public SalidaServicio ingresarVacuna(EntradaVacuna entrada) throws Exception {
		SalidaServicio salida = new SalidaServicio();
		try {
		Optional<Empleado> e = empleadoDao.findById(Integer.valueOf(entrada.getIdEmpleado()));
		
		if(e.get()==null) {
			salida.setMensajeSalida("Empleado no encontrado validar datos");
			return salida;
		}
		
		Vacuna vacuna = new Vacuna();
		vacuna.setTipo(entrada.getTipo());
		vacuna.setFechaVacunacion(entrada.getFechaVacunacion());
		vacuna.setNumeroDosis(entrada.getNumeroDosis());
		vacuna.setEmpleado(e.get());
		
		salida.setMensajeSalida("OK");
		
		vacunaDao.save(vacuna);
		}catch(Exception e) {
			salida.setMensajeSalida(e.getMessage()+" "+"no se encuentra el empleado");
			return salida;
		}
		return salida;
	}

}
