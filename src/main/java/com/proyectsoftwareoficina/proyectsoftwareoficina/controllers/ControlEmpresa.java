package com.proyectsoftwareoficina.proyectsoftwareoficina.controllers;

import com.proyectsoftwareoficina.proyectsoftwareoficina.model.Empresa1;
import com.proyectsoftwareoficina.proyectsoftwareoficina.service.ServicioEmpresa;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ControlEmpresa {
    /*
    ServicioEmpresa servicioEmpresa1 = new ServicioEmpresa();
    Empresa1 empresa1;

    public ControlEmpresa(){
        this.empresa1 = this.servicioEmpresa1.getEmpresa1();
    }

    @GetMapping("/informacion")
    public Empresa1 informacion(){
        return this.empresa1;
    }*/


    ServicioEmpresa servicioEmpresa;
    public ControlEmpresa(ServicioEmpresa servicioEmpresa){
        this.servicioEmpresa = servicioEmpresa;
    }
    @GetMapping("/informacion")
    public List<Empresa1> informacion(){
        return this.servicioEmpresa.getRepositorio() ;
    }

    @PostMapping("/informacion")
    public  Empresa1 crearEmpresa(@RequestBody Empresa1 empresa){
        return this.servicioEmpresa.crearRegistro(empresa);

    }
    @PutMapping("/informacion")
    public ResponseEntity<Empresa1> actualizar(@RequestBody Empresa1 empresa){
        Empresa1 obj = servicioEmpresa.actualizar(empresa);
        ResponseEntity<Empresa1> empresa1ResponseEntity = new ResponseEntity<>(obj, HttpStatus.OK);
        return empresa1ResponseEntity;

    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable("id") Integer id) throws Exception{
        Empresa1 obj = servicioEmpresa.ListarPorId(id);
        if(obj ==null) {
            throw new Exception("No se encontro el ID ");
        }
        servicioEmpresa.eliminar(id);
        ResponseEntity<Void> voidResponseEntity = new ResponseEntity<>(HttpStatus.NO_CONTENT);
        return voidResponseEntity;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Empresa1> ListarPorId(@PathVariable("id")Integer codigo)throws Exception{
        Empresa1 obj = servicioEmpresa.ListarPorId(codigo);
        if(obj == null) {
            throw new Exception("No se encontro el Pais ");
        }

        ResponseEntity<Empresa1> empresa1ResponseEntity = new ResponseEntity<>(obj, HttpStatus.OK);
        return empresa1ResponseEntity;

    }


}
