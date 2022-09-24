package com.proyectsoftwareoficina.proyectsoftwareoficina.controllers;


import com.proyectsoftwareoficina.proyectsoftwareoficina.model.MovimientoDinero;
import com.proyectsoftwareoficina.proyectsoftwareoficina.service.ServicioMovimientoDinero;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/enterprises/{id}/movements")
public class ControlMovimientoDinero {

    ServicioMovimientoDinero servicioMovimientoDinero;

    public ControlMovimientoDinero(ServicioMovimientoDinero servicioMovimientoDinero) { this.servicioMovimientoDinero = servicioMovimientoDinero;}

    @GetMapping("/movements")
    public List<MovimientoDinero> informacion(){return this.servicioMovimientoDinero.listar();}

    @PostMapping("/movements")
    public MovimientoDinero crearRegistro(@RequestBody MovimientoDinero movimientoDinero){
        return movimientoDinero;
    };

    @PutMapping("/movements/{id}")
    public MovimientoDinero actualizar(@PathVariable Long id, @RequestBody MovimientoDinero md){
        return md;
    }

    @DeleteMapping("/movements/{id}")
    public MovimientoDinero eliminar(@PathVariable(value = "id") Long id){
        return null;
    }


}
