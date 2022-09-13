package com.proyectsoftwareoficina.proyectsoftwareoficina.service;

import com.proyectsoftwareoficina.proyectsoftwareoficina.model.Empleado;
import com.proyectsoftwareoficina.proyectsoftwareoficina.model.Empresa1;
import com.proyectsoftwareoficina.proyectsoftwareoficina.model.MovimientoDinero;
import com.proyectsoftwareoficina.proyectsoftwareoficina.repositories.RepositorioEmpleado;
import com.proyectsoftwareoficina.proyectsoftwareoficina.repositories.RespositorioEmpresa;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioEmpleado {
    private RepositorioEmpleado repositorio;

    public ServicioEmpleado(RepositorioEmpleado repositorio){
        this.repositorio = repositorio;

    }
    public List<Empleado> listar(){
        return this.repositorio.findAll();
    }

    public Empleado crearRegistro (Empleado empleado){
        return  this.repositorio.save(empleado);
    }


    public Empleado actualizar(Empleado empleado) {
        return repositorio.save(empleado);
    }

    public void eliminar(Integer codigo) {repositorio.deleteById(codigo); }


    public Empleado ListarPorId(Integer codigo) {

        return repositorio.findById(codigo).orElse(null);
    }
}
