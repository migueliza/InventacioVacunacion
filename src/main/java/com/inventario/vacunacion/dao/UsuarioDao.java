package com.inventario.vacunacion.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inventario.vacunacion.modelo.Usuario;

public interface UsuarioDao extends JpaRepository<Usuario,Integer>{

}
