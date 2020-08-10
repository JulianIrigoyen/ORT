package TP1;

import java.util.Scanner;

public class Ejercicio_03 {
	
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Ingrese su nombre: ");
		String nombre = input.nextLine();
		input.nextLine();
		System.out.println("Bienvenido, " + nombre + "!");
		
		input.close();
		
	}

}
