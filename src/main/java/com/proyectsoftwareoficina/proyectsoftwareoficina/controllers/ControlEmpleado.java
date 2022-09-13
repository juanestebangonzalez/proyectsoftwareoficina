package com.proyectsoftwareoficina.proyectsoftwareoficina.controllers;

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
    public ResponseEntity<List<Empresa1>> listar(){
        List<Empresa1> obj = servicioEmpleado.listar();
        return new ResponseEntity<List<Empresa1>>(obj, HttpStatus.OK);
    }


    @PostMapping
    public  Empresa1 crearEmpresa(@RequestBody Empresa1 empresa){
        return this.servicioEmpleado.crearRegistro(empresa);

    }
    @PutMapping
    public ResponseEntity<Empresa1> actualizar(@RequestBody Empresa1 empresa){
        Empresa1 obj = servicioEmpleado.actualizar(empresa);
        ResponseEntity<Empresa1> empresa1ResponseEntity = new ResponseEntity<>(obj, HttpStatus.OK);
        return empresa1ResponseEntity;

    }


    @DeleteMapping("/{nit}")
    public ResponseEntity<Void> eliminar(@PathVariable("nit") Integer nit) throws Exception{
        Empresa1 obj = servicioEmpleado.ListarPorId(nit);
        if(obj ==null) {
            throw new Exception("No se encontro el NIT ");
        }
        servicioEmpleado.eliminar(nit);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);

    }

    @GetMapping("/{nit}")
    public ResponseEntity<Empresa1> ListarPorId(@PathVariable("nit") Integer codigo)throws Exception{
        Empresa1 obj = servicioEmpleado.ListarPorId(codigo);
        if(obj == null) {
            throw new Exception("No se encontro el Pais ");
        }
        return new ResponseEntity<Empresa1>(obj, HttpStatus.OK);

    }
}
