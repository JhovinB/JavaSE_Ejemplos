package com.jbac.javase.colleciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparadores{
	
	public static void main(String[] args) {
		
		List<Persona> lista = new ArrayList<>();
		
		lista.add(new Persona(1,"Jhovin",20));
		lista.add(new Persona(2,"developers",21));
		lista.add(new Persona(3,"backend",2));
		lista.add(new Persona(4,"Jaime",20));

	//	Collections.sort(lista,new ComparadorEdad());
		Collections.sort(lista,new ComparadorNombre());
		lista.forEach(nombre->System.out.println(nombre.getNombre()));
	}


}
