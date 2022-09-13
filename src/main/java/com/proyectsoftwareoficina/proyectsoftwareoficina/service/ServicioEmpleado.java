package com.proyectsoftwareoficina.proyectsoftwareoficina.service;

import com.proyectsoftwareoficina.proyectsoftwareoficina.model.Empleado;
import com.proyectsoftwareoficina.proyectsoftwareoficina.model.Empresa1;
import com.proyectsoftwareoficina.proyectsoftwareoficina.model.MovimientoDinero;
import com.proyectsoftwareoficina.proyectsoftwareoficina.repositories.RespositorioEmpresa;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioEmpleado {
    private RespositorioEmpresa repositorio;

    public ServicioEmpleado(RespositorioEmpresa repositorio){
        this.repositorio = repositorio;

    }
    public List<Empresa1> listar(){
        return this.repositorio.findAll();
    }

    public Empresa1 crearRegistro (Empresa1 empresa1){
        return  this.repositorio.save(empresa1);
    }


    public Empresa1 actualizar(Empresa1 empresa1) {
        return repositorio.save(empresa1);
    }

    public void eliminar(Integer codigo) {repositorio.deleteById(codigo); }


    public Empresa1 ListarPorId(Integer codigo) {

        return repositorio.findById(codigo).orElse(null);
    }
}
