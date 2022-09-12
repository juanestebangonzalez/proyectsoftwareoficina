package com.proyectsoftwareoficina.proyectsoftwareoficina.service;
import com.proyectsoftwareoficina.proyectsoftwareoficina.repositories.RespositorioEmpresa;

import com.proyectsoftwareoficina.proyectsoftwareoficina.model.Empleado;
import com.proyectsoftwareoficina.proyectsoftwareoficina.model.Empresa1;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServicioEmpresa {
/*
    Empresa1 empresa1;
    ServicioEmpleado servicioEmpleado1 = new ServicioEmpleado();
    public ServicioEmpresa(){
        Empleado empleado1 = this.servicioEmpleado1.getEmpleado1();
       this.empresa1 = new Empresa1(111223, "araza", "calle 10 ","456 ",
               empleado1);
    }
    public Empresa1 getEmpresa1(){
        return this.empresa1;
    }

*/
    private RespositorioEmpresa repositorio;

    public ServicioEmpresa (RespositorioEmpresa repositorio){
        this.repositorio = repositorio;

    }

    public List<Empresa1> getRepositorio(){
        return this.repositorio.findAll();
    }

    public Empresa1 crearRegistro (Empresa1 empresa1){
        return  this.repositorio.save(empresa1);
    }


    public Empresa1 actualizar(Empresa1 empresa1) {
        return repositorio.save(empresa1);
    }

    public void eliminar(Integer codigo) {
        repositorio.deleteById(Long.valueOf(codigo));
    }


    public Empresa1 ListarPorId(Integer codigo) {

        return this.repositorio.findById(Long.valueOf(codigo)).orElse(null);
    }

}
