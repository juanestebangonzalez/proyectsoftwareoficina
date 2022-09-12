package com.proyectsoftwareoficina.proyectsoftwareoficina.repositories;

import com.proyectsoftwareoficina.proyectsoftwareoficina.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioEmpleado extends JpaRepository<Empleado, Long > {

}
