package com.proyectsoftwareoficina.proyectsoftwareoficina;

import com.proyectsoftwareoficina.proyectsoftwareoficina.model.Empleado;
import com.proyectsoftwareoficina.proyectsoftwareoficina.model.Empresa1;
import com.proyectsoftwareoficina.proyectsoftwareoficina.model.MovimientoDinero;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProyectsoftwareoficinaApplication {

	public static void main(String[] args) {SpringApplication.run(ProyectsoftwareoficinaApplication.class, args);
		Empleado empleado1 = new Empleado("juaan","juan@correo.com", "araza"
				, "admin", null);
		Empresa1 epmresa1 = new Empresa1(111223, "araza", "calle 10 ","456 ",
				empleado1 );
		MovimientoDinero movimientoDinero1 = new MovimientoDinero(500000, "pagoObigaciones");

	}

}
