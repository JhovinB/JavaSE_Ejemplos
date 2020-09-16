package com.jbac.javase.abstractos;

public class Moto implements IVehiculo{

	@Override
	public String mostrarMarca() {
		return "Yamaha";
	}

	@Override
	public double mostrarPrecio() {
		return 5000;
	}


}
