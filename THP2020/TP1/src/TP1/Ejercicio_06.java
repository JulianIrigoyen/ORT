package TP1;

import java.util.Scanner;

public class Ejercicio_06 {
	
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Ingrese un valor entero mayor que 0: ");
		int num1 = input.nextInt();
		input.nextLine();
		int modulo = num1 % 2;
		
		if(modulo == 0) {
			System.out.println("El numero es par.");
		} else {
			System.out.println("El numero es impar.");
		}
		
		input.close();
	}
}
