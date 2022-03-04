package com.inventario.vacunacion.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventario.vacunacion.dao.EmpleadoDao;
import com.inventario.vacunacion.dao.UsuarioDao;
import com.inventario.vacunacion.dto.EntradaUsuario;
import com.inventario.vacunacion.dto.SalidaServicioActualzar;
import com.inventario.vacunacion.modelo.Empleado;
import com.inventario.vacunacion.modelo.Usuario;

@Service
public class UsuarioServiceImpl implements UsuarioService{

	@Autowired
	private EmpleadoDao empleadoDao;
	
	@Autowired
	private UsuarioDao usuarioDao;
	
	@Override
	public SalidaServicioActualzar crearUsuario(EntradaUsuario usuario) throws Exception {
        
		Optional<Empleado> e = empleadoDao.findById(Integer.valueOf(usuario.getIdEmpleado()));
		
		SalidaServicioActualzar salida = new SalidaServicioActualzar();
		
		Usuario usuarioNuevo = new Usuario();
		usuarioNuevo.setClave(usuario.getClave());
		usuarioNuevo.setUsuario(usuario.getUsuario());
		usuarioNuevo.setEmpleado(e.get());
		usuarioDao.save(usuarioNuevo);
		
		salida.setPasswordGenerado(usuario.getClave());
		salida.setUsuarioGenerado(usuario.getUsuario());
		salida.setMensaje("OK");
		
		return salida;
	}

}
