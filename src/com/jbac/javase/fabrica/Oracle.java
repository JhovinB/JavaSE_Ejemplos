package com.jbac.javase.fabrica;

public class Oracle implements BaseDatos{

	@Override
	public void conectarse() {
		System.out.println("Conectado a Oracle");
	}

}
