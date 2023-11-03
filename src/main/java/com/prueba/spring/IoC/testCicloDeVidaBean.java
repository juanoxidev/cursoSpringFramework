package com.prueba.spring.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testCicloDeVidaBean {

	public static void main(String[] args) {
	// carga de XML de configuracion
	ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext3.xml");
	// antes de inciarlizar el objeto juan va a ejecutar el metodo init
	Empleado Juan = contexto.getBean("miEmpleado", Empleado.class);
	
	System.out.println(Juan.getInforme());
	// cerramos el contexto y luego el bean va a ejecutar su metodo destroy
	contexto.close();
	
	/*
	 * Ciclo de vida de un bean 
		-Ejecutar tareas a realizar antes de la creación del Bean.
		-Ejecutar tareas a realizar después de la creación del Bean.

	 */
	}

}
