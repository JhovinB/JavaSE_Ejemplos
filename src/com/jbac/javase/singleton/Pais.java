package com.jbac.javase.singleton;

import java.util.ArrayList;
import java.util.List;

public class Pais {
	
	private static Pais instancia =null;
	private static List<String> lista;
	
	public static Pais getInstance() {
		if (instancia == null) {
			instancia = new Pais();
			System.out.println("Se ha creado una instancia");
			lista = new ArrayList<>();
			listar();
			imprimir();
		}
		
		return instancia;
	}
	
	public Pais() {
		lista = new ArrayList<>();
	}
	
	public static void listar() {
		lista.add("Peru");
		lista.add("Colombia");
		lista.add("Ecuador");
	}
	public static void imprimir() {
		lista.forEach(System.out::println);
	}
}
