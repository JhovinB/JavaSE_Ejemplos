package com.jbac.javase.hilos;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class PoolHilos {
	public static void main(String[] args) {
		
		ExecutorService pool = Executors.newFixedThreadPool(3);
		Future<Double> task =pool.submit(new Operacion());

//		Thread th1 = new Thread(()->System.out.println("Proceso alterno1"));
//		th1.start();
		
		//Mientras la tarea no este terminada
		while (!task.isDone()) {
				System.out.println("En proceso");
		}
		try {
			System.out.println(task.get());
		} catch (InterruptedException |ExecutionException e) {
			e.printStackTrace();
		}
		
	}
}
