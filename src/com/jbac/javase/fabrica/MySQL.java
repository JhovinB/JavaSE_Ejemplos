package com.jbac.javase.fabrica;

public class MySQL implements BaseDatos {

	@Override
	public void conectarse() {
		System.out.println("Conectado a MySQL");
	}

}
