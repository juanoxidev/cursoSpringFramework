package com.prueba.spring.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testSingletonPrototype {

	public static void main(String[] args) {
		// carga de XML de configuracion
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");

		// peticion de beans al contenedor, por defecto spring trabaja con el patron singleton
		SecretarioEmpleado maria = contexto.getBean("miEmpleado2", SecretarioEmpleado.class);
		SecretarioEmpleado pedro = contexto.getBean("miEmpleado2", SecretarioEmpleado.class);
		// En el archivo de applicationContext a la hora de declarar el bean podemos definirle un atributo scope para que se comporte como patron prototype, por defecto se comporta como un singleton.
		// Si dejamos el bean por defecto (no lo modificamos) o indicamos que el scope es singleton los objetos maria y pedro apuntan al mismo espacio en memoria
		// Si agregamos al bean el scope y definimos prototype entonces los objetos creados van a apuntar a diferentes objetos en memoria
		System.out.println(maria==pedro?"es el mismo objeto":"son distintos objetos");
	
	
	}

}
