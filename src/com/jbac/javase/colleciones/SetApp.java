package com.jbac.javase.colleciones;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetApp {
	
	private Set<Persona> lista; 
	
	public SetApp() {
		lista = new LinkedHashSet<>();
	}	
	
	public void llenar() {
		lista.add(new Persona(1,"Jhovin",20));
		lista.add(new Persona(2,"developers",21));
		lista.add(new Persona(1,"backend",21));
		lista.add(new Persona(3,"Jhovin",20));

	}
	public void imprimir() {
		lista.forEach(System.out::println);
	}
	public static void main(String[] args) {
		SetApp c = new SetApp();
		c.llenar();
		c.imprimir();
			
	}
}
