package com.proyectsoftwareoficina.proyectsoftwareoficina.controllers;

import com.proyectsoftwareoficina.proyectsoftwareoficina.model.Empleado;
import com.proyectsoftwareoficina.proyectsoftwareoficina.model.Empresa1;
import com.proyectsoftwareoficina.proyectsoftwareoficina.service.ServicioEmpleado;
import com.proyectsoftwareoficina.proyectsoftwareoficina.service.ServicioEmpresa;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class ControlEmpleado {

    ServicioEmpleado servicioEmpleado;

    @GetMapping
    public ResponseEntity<List<Empleado>> listar(){
        List<Empleado> obj = servicioEmpleado.listar();
        return new ResponseEntity<List<Empleado>>(obj, HttpStatus.OK);
    }


    @PostMapping
    public  Empleado crearEmpresa(@RequestBody Empleado empleado){
        return this.servicioEmpleado.crearRegistro(empleado);

    }
    @PutMapping
    public ResponseEntity<Empleado> actualizar(@RequestBody Empleado empleado){
        Empleado obj = servicioEmpleado.actualizar(empleado);
        ResponseEntity<Empleado> empleadosponseEntity = new ResponseEntity<>(obj, HttpStatus.OK);
        return empleadosponseEntity;

    }


    @DeleteMapping("/{nit}")
    public ResponseEntity<Void> eliminar(@PathVariable("nit") Integer nit) throws Exception{
        Empleado obj = servicioEmpleado.ListarPorId(nit);
        if(obj ==null) {
            throw new Exception("No se encontro el NIT ");
        }
        servicioEmpleado.eliminar(nit);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);

    }

    @GetMapping("/{nit}")
    public ResponseEntity<Empleado> ListarPorId(@PathVariable("nit") Integer codigo)throws Exception{
        Empleado obj = servicioEmpleado.ListarPorId(codigo);
        if(obj == null) {
            throw new Exception("No se encontro el Pais ");
        }
        return new ResponseEntity<Empleado>(obj, HttpStatus.OK);

    }
}
