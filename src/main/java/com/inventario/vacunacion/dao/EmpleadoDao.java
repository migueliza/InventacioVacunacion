package com.inventario.vacunacion.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inventario.vacunacion.modelo.Empleado;

public interface EmpleadoDao extends JpaRepository<Empleado, Integer>{

}
