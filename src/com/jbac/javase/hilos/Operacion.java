package com.jbac.javase.hilos;

import java.util.concurrent.Callable;

public class Operacion implements Callable<Double>{

	
	@Override
	public Double call() throws Exception {
		
		Thread.sleep(5000);
		return 2.0;
	}

}
