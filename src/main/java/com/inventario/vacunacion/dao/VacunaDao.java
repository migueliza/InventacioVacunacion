package com.inventario.vacunacion.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inventario.vacunacion.modelo.Vacuna;

public interface VacunaDao extends JpaRepository<Vacuna,Integer>{

}
