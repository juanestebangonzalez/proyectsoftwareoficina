package com.proyectsoftwareoficina.proyectsoftwareoficina.repositories;

import com.proyectsoftwareoficina.proyectsoftwareoficina.model.Empresa1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RespositorioEmpresa extends JpaRepository<Empresa1, Integer > {



}
