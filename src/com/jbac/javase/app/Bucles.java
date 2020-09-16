package com.jbac.javase.app;

public class Bucles {

	public static void main(String[] args) {
		
		outer:
		for (int i = 0; i < 6; i++) {
			for (int j = 0; i < 6; j++) {
				System.out.println(i+j);
				 break outer;
			}
		}
	}

}
