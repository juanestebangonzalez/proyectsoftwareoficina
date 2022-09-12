package com.proyectsoftwareoficina.proyectsoftwareoficina.service;

import com.proyectsoftwareoficina.proyectsoftwareoficina.model.Empleado;
import com.proyectsoftwareoficina.proyectsoftwareoficina.model.Empresa1;
import com.proyectsoftwareoficina.proyectsoftwareoficina.model.MovimientoDinero;

public class ServicioEmpleado {
    Empleado empleado1;

    ServicioMovimientoDinero servicioMovimientoDinero = new ServicioMovimientoDinero();
    public ServicioEmpleado(){
        MovimientoDinero movimientoDinero = this.servicioMovimientoDinero.getMovimientoDinero();
        this. empleado1 = new Empleado("juaan","juan@correo.com", "araza"
                , "admin",movimientoDinero);
    }

    public Empleado getEmpleado1(){
        return this.empleado1;
    }
}
