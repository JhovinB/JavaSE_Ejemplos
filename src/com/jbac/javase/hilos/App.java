package com.jbac.javase.hilos;

public class App {
	public static void main(String[] args) {
		
		Hilo1 h1 = new Hilo1();
		Hilo2 h2 = new Hilo2();
		Thread h3 = new Thread(new Hilo3());
		
		h1.start();
		h2.start();
		h3.start();
		
		//Clase anonima
		Thread h4 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Hilo4 - Runnable");
			}
				
		});
		h4.start();
		
	}
}
