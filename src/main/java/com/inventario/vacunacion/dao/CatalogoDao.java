package com.inventario.vacunacion.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inventario.vacunacion.modelo.Catalogo;

public interface CatalogoDao extends JpaRepository<Catalogo,Integer>{

}
