package com.proyectsoftwareoficina.proyectsoftwareoficina.service;

import com.proyectsoftwareoficina.proyectsoftwareoficina.model.Empleado;
import com.proyectsoftwareoficina.proyectsoftwareoficina.model.Empresa1;
import com.proyectsoftwareoficina.proyectsoftwareoficina.model.MovimientoDinero;

public class ServicioMovimientoDinero {
    MovimientoDinero movimientoDinero;


    public ServicioMovimientoDinero(){

        this.movimientoDinero = new MovimientoDinero(500000,"Pago obligaciones");

    }

    public MovimientoDinero getMovimientoDinero(){
        return this.movimientoDinero;
    }

}
