package com.prueba.spring.IoC;

public class SecretarioEmpleado implements Empleado {

	private CreacionInformes informeNuevo;
	private String email;
	private String nombreEmpresa;
	
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

	// Metodo encargado de creear la inyeccion de dependencia
	public void setInformeNuevo(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	@Override
	public String getTareas() {
		return "Gestionar la agenda de los Jefes";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe generado por el secretario: " +informeNuevo.getInforme();
	}
	
	// Crear metodo Init. Ejecutar tareas antes de que el bean este disponible
	public void metodoInicial() {
		System.out.println("Dentro del metodo init. Aqui irian las tareas ejecutar " + "antes de que el bean este listo");
		
	}
	
	// Crear metodo destroy. Ejecutar tareas despues de que el bean haya sido utilizado.
	public void metodoFinal() {
		System.out.println("Dentro del metodo destroy. Aqui irian las tareas ejecutar " + "despues de utilizar el bean");
		
	}

}
