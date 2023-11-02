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

		// COMO USAR EL CONTENEDOR SPRING
		// 1.Debemos crear un contexto con ClassPathXmlApplicationContext y al crearlo
		// debemos pasarle por parametro el archivo de configuracion
		// applicationContext.xml
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 2.Pedimos al contexto el bean, el objeto con .getBean y le pasamos por
		// parametro el id del bean y la interface.class o clase.class apartir de la cual debe generar ese bean
		DirectorEmpleado Juan = contexto.getBean("miEmpleado", DirectorEmpleado.class);
		// 3.Utilizamos el Bean
		// 3.A usamos el bean de informe dentro de empleado
		System.out.println(Juan.getTareas());
		System.out.println(Juan.getInforme());
		System.out.println(Juan.getEmail());
		System.out.println(Juan.getNombreEmpresa());
//		// 4.Cerramos el contexto
//		contexto.close();

		/*
		 * Inyeccion de dependencias: 2 formas de inyectar una dependencia: - Mediante
		 * un constructor en la clase que lo necesite. - Mediante un setter.
		 * 
		 * Con constructor: (ej en clase JefeEmpleado/Director)
		 * 1. Crear la clase e interfaz de la dependencia(En este caso
		 * haremos que los empleados tengan un Informe) 
		 * 2. Crear de constructor en la
		 * clase para la inyeccion de la dependencia. 
		 * 3. Configurar la inyeccion de
		 * dependencia en archivo XML (ApplicacionContext.html)
		 *
		 * Con metodo Setter: (ej en clase SecretarioEmpleado)
		 * 1. Crear la clase e interfaz de la dependencia(En este
		 * caso haremos que los empleados tengan un Informe) 
		 * 2. Crear de constructor en
		 * la clase para la inyeccion de la dependencia. 
		 * 3. Configurar la inyeccion de
		 * dependencia en archivo XML (ApplicacionContext.html)
		 */
		
		/* Inyeccion de campos ej nombreEmpresa, email. en clase SecretarioEmpleado */
		
		SecretarioEmpleado maria=contexto.getBean("miEmpleado2",SecretarioEmpleado.class);
		System.out.println(maria.getTareas());
		System.out.println(maria.getInforme());
		System.out.println("Email : " + maria.getEmail());
		System.out.println("Empresa : " + maria.getNombreEmpresa());
		
		SecretarioEmpleado pablo=contexto.getBean("miEmpleado2",SecretarioEmpleado.class);
		System.out.println("Email Pablo : " + pablo.getEmail());
		System.out.println("Empresa : " + pablo.getNombreEmpresa());
		contexto.close();
		
		
	}

}
