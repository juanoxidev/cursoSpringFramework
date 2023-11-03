package com.prueba.spring.IoC;

public class DirectorEmpleado implements Empleado {

	
	// Creamos el campo tipo CreacionInforme (interfaz)
	private CreacionInformes informeNuevo;
	private String email;
	private String nombreEmpresa;
	
	// Creacion de constructor que inyecta la dependencia
	public DirectorEmpleado(CreacionInformes infNuevo) {
		this.informeNuevo=infNuevo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestionar la plantilla de la empresa";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe creado por el Director: " + informeNuevo.getInforme();
	}
	
	// Crear metodo Init. Ejecutar tareas antes de que el bean este disponible
	public void metodoInicial() {
		System.out.println("Dentro del metodo init. Aqui irian las tareas ejecutar " + "antes de que el bean este listo");
		
	}
	
	// Crear metodo destroy. Ejecutar tareas despues de que el bean haya sido utilizado.
	public void metodoFinal() {
		System.out.println("Dentro del metodo destroy. Aqui irian las tareas ejecutar " + "despues de utilizar el bean");
		
	}
	// Generarmente el metodo init o destroy no devuelven informacion, por ello en su mayoria son void 

}
