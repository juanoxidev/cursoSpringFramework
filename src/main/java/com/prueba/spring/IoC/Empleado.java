package com.prueba.spring.IoC;

//Cuando vamos a trabajar con diferentes tipos de objetos. la buena práctica es crear una abstracción de los datos, crear una entidad principal ej Empleados abstracta o interfaz y que todas las clases la implementen. 
public interface Empleado {

	public String getTareas();
}
