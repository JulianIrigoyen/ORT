package TP1;

import java.util.Arrays;
import java.util.Scanner;


public class Ejercicio_07 {

	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Ingrese el primero de tres numeros: ");
		int num1 = input.nextInt();
		input.nextLine();
		System.out.println("Ingrese el segundo numero: ");
		int num2 = input.nextInt();
		input.nextLine();
		System.out.println("Ingrese el ultimo numero: ");
		int num3 = input.nextInt();
		input.nextLine();
		
		if((num1 == num2) && (num1 == num3) && (num2 == num3)) {
			System.out.println("Todos los numeros son iguales.");
		} else if((num1 > num2) && (num1 > num3)) {
			System.out.println("El mayor numero es " + num1);
		} else if ((num2 > num1) && (num2 > num3)) {
			System.out.println("El mayor numero es " + num2);
		} else {
			System.out.println("El mayor numero es " + num3);
		}
	
		
		/**
		 * Con streams
		 */
		int[] numeros = {num1, num2, num3};
		int mayor = Arrays.stream(numeros).max().getAsInt(); 
        System.out.println("El mayor numero es " + mayor); 
        
        input.close();			
	}
	
}


