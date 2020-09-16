package com.jbac.javase.colleciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EliminarElementos {
	public static void main(String[] args) {
		List<Persona> lista = new ArrayList<>();
		
		lista.add(new Persona(1,"Jhovin",20));
		lista.add(new Persona(2,"developers",21));
		lista.add(new Persona(3,"backend",2));
		lista.add(new Persona(4,"Jaime",20));
	
		
		int contador = 0;
		Iterator<Persona> it = lista.iterator();
		while (it.hasNext()) {
			it.next();
			if(contador == 2) {
				it.remove();
			}
			contador++;
		}
		lista.forEach(name->System.out.println(name.getCodigo()));
		
		
	}
}
