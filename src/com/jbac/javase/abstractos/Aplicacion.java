package com.jbac.javase.abstractos;

public class Aplicacion {
	
	public static void main(String[] args) {
		IVehiculo m = new Moto();
		System.out.println(m.mostrarMarca());
		
	}
}
