package com.proyectsoftwareoficina.proyectsoftwareoficina.model;

import javax.persistence.*;
import javax.persistence.Id;

@Entity
@Table(name="empleado")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idEmpleado;
    @Column(name = "nombresEmpleado", length = 100, nullable = false)
    protected String nombreEmpleado;
    @Column(name = "Email", length = 100, nullable = false)
    protected String correoElectronico;
    @Column(name = " NombreEmpresa", length = 100, nullable = false)
    protected String empresaEmpleado;
    @Column(name = "rol", length = 100, nullable = false)
    private String rol;
    @Transient
    protected MovimientoDinero movimientoDinero;

    public Empleado() {
    }

    public Empleado(String nombreEmpleado, String correoElectronico, String empresaEmpleado, String rol, MovimientoDinero movimientoDinero) {
        this.nombreEmpleado = nombreEmpleado;
        this.correoElectronico = correoElectronico;
        this.empresaEmpleado = empresaEmpleado;
        this.rol = rol;
        this.movimientoDinero = movimientoDinero;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }


    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getEmpresaEmpleado() {
        return empresaEmpleado;
    }

    public void setEmpresaEmpleado(String empresaEmpleado) {
        this.empresaEmpleado = empresaEmpleado;
    }

    public MovimientoDinero getMovimientoDinero() {
        return movimientoDinero;
    }

    public void setMovimientoDinero(MovimientoDinero movimientoDinero) {
        this.movimientoDinero = movimientoDinero;
    }
}
