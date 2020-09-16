package com.jbac.javase.poo;

public class App {

	public static void main(String[] args) {
		
		Curso c = new Curso(1,"Java","Java para desarrolladores");	
		System.out.println("El curso es: "+c.getNombre());
		
		Hija h = new Hija();
		h.metodo();
		
		
	}

}
