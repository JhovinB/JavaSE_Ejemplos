package com.jbac.javase.app;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Lista {
	public static void main(String[] args) {
		
		List<String> name = new ArrayList<>();
		name.add("php");
		name.add("java");
		name.add("c#");
		
		//Lambda
		name.forEach(curso->System.out.println(name));
		
		//Stream
		name.stream().forEach(System.out::println);
		
		//foreach
		for (Object curso : name) {
			System.out.println(curso);
		}
		System.out.println("==============");
		//HashSet
		Set<String> area = new HashSet<>();
		area.add("arte");
		area.add("digital");
		area.add("tecnologia");
		area.add("mantenimiento");
		
		area.forEach(System.out::println);
		
		System.out.println("==============");
		//TreeSet
		Set<String> area2 = new TreeSet<>();
		area2.add("arte");
		area2.add("digital");
		area2.add("digital");
		area2.add("tecnologia");
		area2.add("mantenimiento");
		
		area2.forEach(System.out::println);
		

	}
}
