package com.prueba.spring.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testSingletonPrototype {

	public static void main(String[] args) {
		// carga de XML de configuracion
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");

		// peticion de beans al contenedor Spring 14 min video
		SecretarioEmpleado maria = contexto.getBean("miEmpleado2", SecretarioEmpleado.class);
		SecretarioEmpleado pedro = contexto.getBean("miEmpleado2", SecretarioEmpleado.class);

	}

}
