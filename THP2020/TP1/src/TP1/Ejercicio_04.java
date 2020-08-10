package TP1;

import java.util.Scanner;

public class Ejercicio_04 {

	public static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Ingrese un numero: ");
		int num1 = input.nextInt();
		input.nextLine();
		System.out.println("Ingrese otro numero: ");
		int num2 = input.nextInt();
		input.nextLine();
		int suma = num1 + num2;
		
		System.out.println("La suma entre " + num1 + " y " 
		+ num2 + " da como resultado = " + suma);
		
		input.close();
	}

}
