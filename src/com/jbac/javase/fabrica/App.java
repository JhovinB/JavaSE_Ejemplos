package com.jbac.javase.fabrica;

public class App {
	public static void main(String[] args) {
		
		FactoryBaseDatos fa = new FactoryBaseDatos();
		BaseDatos bd = fa.getBaseDatos("mysql");
		bd.conectarse();
		
	}

}
