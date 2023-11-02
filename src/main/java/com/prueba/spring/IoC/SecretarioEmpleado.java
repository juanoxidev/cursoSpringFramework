package com.prueba.spring.IoC;

public class SecretarioEmpleado implements Empleado {

	@Override
	public String getTareas() {
		return "Gestionar la agenda de los Jefes";
	}

}
