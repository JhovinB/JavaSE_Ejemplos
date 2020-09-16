package com.jbac.javase.app;

import java.util.ArrayList;

public class Ciclos {

	public static void main(String[] args) {
		
		String [] name = {"jbac","jhovin"};
		for (String ele:name) {
			System.out.println(ele);
		}
		
		ArrayList lista = new ArrayList<>();
		lista.add("java");
		lista.add("php");
		
		lista.forEach(x->System.out.println(lista));
		lista.stream().forEach(System.out::println);
		
		for (int i = 0; i <lista.size(); i++) {
			System.out.println(lista.get(i));
		}
	}
	

}
