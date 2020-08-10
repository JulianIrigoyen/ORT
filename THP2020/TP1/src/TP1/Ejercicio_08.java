package TP1;

import java.util.Scanner;

public class Ejercicio_08 {

	public static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Ingrese un numero entre 1 y 7 (inclusive):  ");
		int numero = input.nextInt();
		input.nextLine();
		
		if(numero > 0 && numero < 8) {
			switch(numero) {
			case 1: System.out.println("Domingo");
			break;
			case 2: System.out.println("Lunes");
			break;
			case 3: System.out.println("Martes");
			break;
			case 4: System.out.println("Miercoles");
			break;
			case 5: System.out.println("Jueves");
			break;
			case 6: System.out.println("Viernes");
			break;
			case 7: System.out.println("Sabado");
			break;
			}
		} else System.out.println("El dia ingresado no es valido. ");
		
		input.close();	
	}
}
