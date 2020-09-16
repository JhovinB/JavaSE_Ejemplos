package com.jbac.javase.app;

import java.util.Scanner;

public class Cifrado {
	public static void main(String[] args) {
		
		final String [] abc = {"a","b","j","c","d","v","f"};
		
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese cadena a cifrar");
		String texto = sc.next();
		System.out.println("Ingrese nivel del cifrado");
		int desplazamiento = sc.nextInt();
		
		for (int i = 0; i < texto.length(); i++) {
				char e = texto.charAt(i);
			for (int j = 0; j < abc.length; j++) {
				if (String.valueOf(e).equalsIgnoreCase(abc[j])) {
					int posicion = j+desplazamiento;
					if (posicion >=abc.length) {
						int x = posicion - abc.length;
						String cifrado = abc[x];
						sb.append(cifrado);
						//System.out.println(cifrado);
						break;
						
					}else {
						String cifrado = abc[posicion];
						sb.append(cifrado);
						//System.out.println(cifrado);
						break;
					}
				}
			}
		}
		System.out.println("El texto original es: "+texto);
		System.out.println("El texto cifrado es: "+sb.toString());
		sc.close();
	}
}
