package com.jbac.javase.colleciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Arreglos {
	 public static void main(String[] args) {
		
		 String [] arreglo = {"Jhovin","Maho","Jbac","Boni"};
		 List<String> lista = new ArrayList<>( Arrays.asList(arreglo));
		 lista.forEach(System.out::println);
	 }
}	
