package com.inventario.vacunacion.services;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventario.vacunacion.dao.CatalogoDao;
import com.inventario.vacunacion.dao.EmpleadoDao;
import com.inventario.vacunacion.dto.EmpleadoDTO;
import com.inventario.vacunacion.dto.SalidaServicio;
import com.inventario.vacunacion.modelo.Catalogo;
import com.inventario.vacunacion.modelo.Empleado;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {

	@Autowired
	private EmpleadoDao empleadoDao;

	@Autowired
	private CatalogoDao catalogoDao;

	@Override
	public List<EmpleadoDTO> listarEmpleados() {

		List<Empleado> listaEmpleados = empleadoDao.findAll();
		List<EmpleadoDTO> listaEmpleadosDTO = new ArrayList<EmpleadoDTO>();

		for (Empleado e : listaEmpleados) {

			EmpleadoDTO empDTO = new EmpleadoDTO(e.getId(), e.getCedula(), e.getNombres(), e.getApellidos(),
					e.getCorreoElectronico(), coalesce(e.getFechaNacimiento(), null),
					coalesce(e.getDireccionDomicilio(), null), coalesce(e.getTelefonoMovil(), null));

			if (e.getCatalogo() != null) {
				empDTO.setEstadoVacuna(e.getCatalogo().getDescripcion());
			}

			listaEmpleadosDTO.add(empDTO);
		}

		return listaEmpleadosDTO;
	}

	@Override
	public EmpleadoDTO traerEmpleado(String empleadoId) {
		Optional<Empleado> e = empleadoDao.findById(Integer.valueOf(empleadoId));
		EmpleadoDTO empDTO = new EmpleadoDTO(e.get().getId(), e.get().getCedula(), e.get().getNombres(),
				e.get().getApellidos(), e.get().getCorreoElectronico(), coalesce(e.get().getFechaNacimiento(), null),
				coalesce(e.get().getDireccionDomicilio(), null), coalesce(e.get().getTelefonoMovil(), null));

		if (e.get().getCatalogo() != null) {
			empDTO.setEstadoVacuna(e.get().getCatalogo().getDescripcion());
		}

		return empDTO;
	}

	@Override
	public SalidaServicio agregarEmpleado(Empleado empleado) throws Exception {

		SalidaServicio salida = new SalidaServicio();
		try {
			if (empleado.getCedula().equals("") || empleado.getNombres().equals("")
					|| empleado.getApellidos().equals("") || empleado.getCorreoElectronico().equals("")) {
				salida.setMensajeSalida("Revisar campos  requeridos");
				return salida;
			}
			if (!ValidaCedula(empleado.getCedula())) {
				salida.setMensajeSalida("Cedula invalida");
				return salida;
			}
			if (!ValidaCorreo(empleado.getCorreoElectronico())) {
				salida.setMensajeSalida("Correo invalido");
				return salida;
			}
			if (!ValidarCaracteres(empleado.getNombres())){
				salida.setMensajeSalida("Solo debe contener letras");
				return salida;
			}

			if (!ValidarCaracteres(empleado.getApellidos())){
				salida.setMensajeSalida("Solo debe contener letras");
				return salida;
			}
			
		} catch (Exception e) {
			salida.setMensajeSalida(e.getMessage());
			return salida;
		}
		empleadoDao.save(empleado);
		salida.setMensajeSalida("OK");
		return salida;
	}

	@Override
	public SalidaServicio actualizarEmpleado(EmpleadoDTO empleado) {

		SalidaServicio salida = new SalidaServicio();

		try {
			Optional<Catalogo> cata = catalogoDao.findById(Integer.valueOf(empleado.getEstadoVacuna()));

			Optional<Empleado> e = empleadoDao.findById(Integer.valueOf(empleado.getId()));

			e.get().setApellidos(empleado.getApellidos());
			e.get().setCatalogo(cata.get());
			e.get().setCedula(empleado.getCedula());
			e.get().setCorreoElectronico(empleado.getCorreoElectronico());
			e.get().setDireccionDomicilio(empleado.getDireccionDomicilio());
			e.get().setFechaNacimiento(empleado.getFechaNacimiento());
			e.get().setNombres(empleado.getNombres());
			e.get().setTelefonoMovil(empleado.getTelefonoMovil());

			empleadoDao.save(e.get());

		} catch (Exception e) {
			salida.setMensajeSalida(e.getMessage());
			return salida;
		}

		return salida;

	}

	public String GeneraUsuario(EmpleadoDTO empleadoActualizar) {

		String usuario = "";

		String prefijo = empleadoActualizar.getNombres().substring(0, 2);
		usuario = prefijo + empleadoActualizar.getApellidos();

		return usuario;
	}

	public String GeneraPassword(EmpleadoDTO empleadoActualizar) {

		String password = "";
		String[] symbols = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "-", "*", "$", "a", "b", "c", "d",
				"e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r" };
		int length = 10;
		Random random;
		try {
			random = SecureRandom.getInstanceStrong();
			StringBuilder sb = new StringBuilder(length);
			for (int i = 0; i < length; i++) {
				int indexRandom = random.nextInt(symbols.length);
				sb.append(symbols[indexRandom]);
			}
			password = sb.toString();
			System.out.println(password);
		} catch (NoSuchAlgorithmException e) {
			System.out.println(e.toString());
		}
		return password;

	}

	public static <T> T coalesce(T one, T two) {
		return one != null ? one : two;
	}

	public boolean ValidaCedula(String cedula) {

		if (cedula.length() == 10) {
			return true;
		}
		return false;

	}

	public boolean ValidaCorreo(String correo) {

		// Patrón para validar el email
		Pattern pattern = Pattern.compile(
				"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

		Matcher mather = pattern.matcher(correo);

		if (mather.find() == true) {
			System.out.println("El email ingresado es válido.");
			return true;
		} else {
			System.out.println("El email ingresado es inválido.");
			return false;
		}
	}

	public boolean ValidarCaracteres(String entrada) {

		return entrada.matches("[A-Za-z]*");
	}
}
