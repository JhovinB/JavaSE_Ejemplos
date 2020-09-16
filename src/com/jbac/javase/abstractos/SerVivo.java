package com.jbac.javase.abstractos;

public abstract class SerVivo {
	
	
	private String nombre;
	
	public abstract void alimentar();
	
	
	public abstract void dormir();
	
	public void respirar() {
		System.out.println("Respirando...");
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
