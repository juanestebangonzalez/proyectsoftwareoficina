package com.proyectsoftwareoficina.proyectsoftwareoficina.model;

import javax.persistence.*;

@Entity
@Table(name="movimientoDinero")
public class MovimientoDinero {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idMovimientoDinero;
    @Column(name = "montoMovimiento", length = 100, nullable = false)
    private double montoMovimiento;
    @Column(name = "conceptoMovimiento", length = 100, nullable = false)
    private String conceptoMovimiento;


    public MovimientoDinero() {
    }

    public MovimientoDinero(double montoMovimiento, String conceptoMovimiento) {
        this.montoMovimiento = montoMovimiento;
        this.conceptoMovimiento = conceptoMovimiento;
    }

    public Integer getIdMovimientoDinero() {
        return idMovimientoDinero;
    }

    public void setIdMovimientoDinero(Integer idMovimientoDinero) {
        this.idMovimientoDinero = idMovimientoDinero;
    }

    public double getMontoMovimiento() {
        return montoMovimiento;
    }

    public void setMontoMovimiento(double montoMovimiento) {
        this.montoMovimiento = montoMovimiento;
    }

    public String getConceptoMovimiento() {
        return conceptoMovimiento;
    }

    public void setConceptoMovimiento(String conceptoMovimiento) {
        this.conceptoMovimiento = conceptoMovimiento;
    }

    public String UsuarioRegistraMovimiento() {
        return "-1";
    }

    public double crearMonto(){
        return -1;
    }


}
