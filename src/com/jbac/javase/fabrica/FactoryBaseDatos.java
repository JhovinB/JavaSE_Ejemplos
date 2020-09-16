package com.jbac.javase.fabrica;

public class FactoryBaseDatos {
	
	public BaseDatos getBaseDatos(String tipo) {
		if(tipo==null) {
			return null;
		}
		if(tipo.equalsIgnoreCase("Oracle")) {
			return new Oracle();
		}else if(tipo.equalsIgnoreCase("MySQL")) {
			return new MySQL();
		}
		return null;
	}
}
