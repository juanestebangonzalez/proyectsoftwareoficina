package com.proyectsoftwareoficina.proyectsoftwareoficina.model;


import javax.persistence.*;
import javax.persistence.Id;

@Entity
@Table(name="empresa1")
public class Empresa1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer nit;
    @Column(name="nombre_empresa", length = 100, nullable = false)
    private String nombreEmpresa;
    @Column(name="direccion", length = 100, nullable = false)
    private String direccion;
    @Column(name="telefono", length = 100, nullable = false)
    private String  telefono;

    @Transient
    Empleado empleado1;

    public Empresa1() {
    }

    public Empresa1(Integer nit, String nombreEmpresa, String direccion, String telefono, Empleado empleado1) {
        this.nit = nit;
        this.nombreEmpresa = nombreEmpresa;
        this.direccion = direccion;
        this.telefono = telefono;
        this.empleado1 = empleado1;
    }

    public void setNit(Integer nit) {
        this.nit = nit;
    }

    public Integer getNit() {
        return nit;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Empleado getEmpleado1() {return empleado1; }

    public void setEmpleado1(Empleado empleado1) {this.empleado1 = empleado1; }
}
