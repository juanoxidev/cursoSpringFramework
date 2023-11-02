package com.prueba.spring.IoC;

public class Informe implements CreacionInformes {

	// caracteristica en comun que van a tener todos los informes ya sea de secretario, jefe, directo
	public String getInforme() {
		return "Esta es la presentacion del informe";
	}

}
