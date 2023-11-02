package com.prueba.spring.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {

		// Creacion de objetos de tipo Empleado

//		Empleado Empleado1 = new JefeEmpleado();
//		Empleado Empleado2 = new SecretarioEmpleado();
//		Empleado Empleado3 = new DirectorEmpleado();

		// Uso de los objetos creados

//		System.out.println(Empleado1.getTareas());
//		System.out.println(Empleado2.getTareas());
//		System.out.println(Empleado3.getTareas());

		//COMO USAR EL CONTENEDOR SPRING
		// 1.Debemos crear un contexto con ClassPathXmlApplicationContext y al crearlo
		// debemos pasarle por parametro el archivo de configuracion
		// applicationContext.xml
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 2.Pedimos al contexto el bean, el objeto con .getBean y le pasamos por
		// parametro el id del bean y la interface.class
		Empleado Juan = contexto.getBean("miEmpleado", Empleado.class);
		// 3.Utilizamos el Bean
		System.out.println(Juan.getTareas());
		// 4.Cerramos el contexto
		contexto.close();
	
	}

}
