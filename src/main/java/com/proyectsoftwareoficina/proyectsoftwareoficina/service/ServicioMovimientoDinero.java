package com.proyectsoftwareoficina.proyectsoftwareoficina.service;

import com.proyectsoftwareoficina.proyectsoftwareoficina.model.MovimientoDinero;
import com.proyectsoftwareoficina.proyectsoftwareoficina.repositories.RepositorioMovimientoDinero;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServicioMovimientoDinero {



    private RepositorioMovimientoDinero repositorio;


    public List<MovimientoDinero> listar(){
        return this.repositorio.findAll();
    }

    public MovimientoDinero crearRegistro (MovimientoDinero movimientoDinero){
        return  this.repositorio.save(movimientoDinero);
    }


    public MovimientoDinero actualizar(MovimientoDinero movimientoDinero) {
        return repositorio.save(movimientoDinero);
    }

    public void eliminar(Integer codigo) {repositorio.deleteById(codigo); }


    public MovimientoDinero ListarPorId(Integer codigo) {

        return repositorio.findById(codigo).orElse(null);
    }

/*
    public ServicioMovimientoDinero(){

        this.movimientoDinero = new MovimientoDinero(500000,"Pago obligaciones");

    }

    public MovimientoDinero getMovimientoDinero(){
        return this.movimientoDinero;
    }
*/
}
