package com.proyectsoftwareoficina.proyectsoftwareoficina.repositories;

import com.proyectsoftwareoficina.proyectsoftwareoficina.model.Empresa1;
import com.proyectsoftwareoficina.proyectsoftwareoficina.model.MovimientoDinero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioMovimientoDinero extends JpaRepository<MovimientoDinero, Integer > {
}
