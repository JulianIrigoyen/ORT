package TP1;

import java.util.Scanner;

public class Ejercicio_05 {
	
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Ingrese un numero: ");
		int num1 = input.nextInt();
		input.nextLine();
		System.out.println("Ingrese otro numero: ");
		int num2 = input.nextInt();
		input.nextLine();
		
		if(num2 == 0) {
			System.out.println("No se puede dividir por 0");
		} else {
			int division = num1 / num2;
			System.out.println(num1 + " / " + num2 + 
					" = " + division);
		}
		
		input.close();
	}
}
