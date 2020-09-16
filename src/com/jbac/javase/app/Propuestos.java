package com.jbac.javase.app;

import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Propuestos {

	public static void main(String[] args) {
		Propuestos p = new Propuestos();
//		p.Pregunta1();
//		p.Pregunta2();
//		p.Pregunta3();
//		p.Pregunta4();
//		p.Pregunta5();
//		p.Pregunta6();
		p.Pregunta7();
	}
	public void Pregunta1() {
	
		int a=1;
		
//		if(a>=0) {
//			System.out.println("Es positivo");
//		}else {
//			System.out.println("Es negativo");
//		}
		String numero= a >=0 ? "Es positivo":"Es negativo";
		System.out.println(numero);
	}

	public void Pregunta2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un numero");
		int num= sc.nextInt();
		
		String res = (num%2==0 ?"Es par":"Es impar");
		System.out.println(res);
		
		sc.close();
	}

	public void Pregunta3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese primer numero");
		int a = sc.nextInt();
		System.out.println("Ingrese segundo numero");
		int b = sc.nextInt();
		System.out.println("Ingrese tercer numero");
		int c = sc.nextInt();
		
		if (a>b) {
			if(a>c) {
				System.out.println("El mayor numero: "+a);
			}else {
				System.out.println("El mayor numero: "+c);
			}
		}else if (b>c) {
			System.out.println("El mayor numero: "+b);
		}else {
			System.out.println("El mayor numero:" +c);
		}
		
		sc.close();
	}

	public void Pregunta4() {
		
		//Numero capicua
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese texto: ");
		
		String tx= sc.next();
		
		StringBuilder sb= new StringBuilder(tx);
		String rv =sb.reverse().toString();
		
		String res = tx.equalsIgnoreCase(rv)?"Es capicua":"No es capicua";
		System.out.println(res);
		
		sc.close();
		
	}

	public void Pregunta5() {
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese cadena de texto");	
		String tx = sc.nextLine();
		
		Random ale = new Random();
		int num =ale.nextInt(9);
		System.out.println(num);
		
//		tx = tx.replace(String.valueOf(tx.charAt(0)),String.valueOf(num));
		tx = tx.replaceAll("\\s", "");
		System.out.println(tx);
		sc.close();
		
		
	}

	public void Pregunta6() {
	
		final int LIMITE_USD = 500;
		final double TIPO_CAMBIO_SOL = 3.36;
		final double TIPO_CAMBIO_PESO = 21;
		
		String name= JOptionPane.showInputDialog("Ingrese nombre de la persona");
		JOptionPane.showMessageDialog(null, "Bienvenido "+name);
		
		String divisa= JOptionPane.showInputDialog("Seleccione Divisa \n 1-Soles \n 2-Pesos");
		JOptionPane.showMessageDialog(null, "Divisa seleccionada "+divisa);
		
		String monto ="";
		double conversion = 0.0;
		switch (divisa) {
		case "1":
			//sol
			monto = JOptionPane.showInputDialog("Ingrese monto en soles");
			conversion = Double.parseDouble(monto)/TIPO_CAMBIO_SOL;
			if (conversion<LIMITE_USD && conversion >0) {
				JOptionPane.showMessageDialog(null, "El monto convertido es: "+Math.round(conversion));
			}else {
				JOptionPane.showMessageDialog(null, "Limite no permitido");
			}
			break;
		case "2":
			//pesos
			monto = JOptionPane.showInputDialog("Ingrese monto en pesos");
			conversion = Double.parseDouble(monto)/TIPO_CAMBIO_PESO;
			if (conversion<LIMITE_USD && conversion >0) {
				JOptionPane.showMessageDialog(null, "El monto convertido es: "+Math.round(conversion));
			}else {
				JOptionPane.showMessageDialog(null, "Limite no permitido");
			}
			break;
		default:
			JOptionPane.showMessageDialog(null, "Divisa inválida");
			break;
		}
		
	}
	public void Pregunta7() {
		
		int existencias = 50;
		Scanner tec = new Scanner(System.in);
		System.out.println("Ingrese usuario");
		String usuario = tec.next();
		System.out.println("Ingrese clave");
		String clave = tec.next();

		if (usuario.equalsIgnoreCase("user") && clave.equalsIgnoreCase("123")) {
			System.out.println("Existencia actual: " + existencias);
			System.out.println("Elija una operacion: \n 1-Comprar Producto \n 2-Devolver Producto");

			int operacion = tec.nextInt();
			int comprados = 0;

			switch (operacion) {
			case 1:
				System.out.println("Ingrese cantidad de productos a comprar");
				comprados = tec.nextInt();
				if (comprados > 0 && comprados < existencias) {
					existencias -= comprados;
					System.out.println("Existencia actual: " + existencias);
				} else {
					System.out.println("Cantidad no permitida");
				}
				break;
			case 2:
				System.out.println("Ingrese los productos a devolver");
				comprados = tec.nextInt();
				existencias += comprados;
				System.out.println("Existencia actual: " + existencias);
				break;
			default:
				System.out.println("");
				break;
			}
		} else {
			System.out.println("Credenciasles incorrectas");
			System.exit(0);
		}

	}
	
	
}
