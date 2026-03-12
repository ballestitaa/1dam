package unidad5.ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		float[] notas;
		notas = new float[5];

		String[] nombres;
		nombres = new String[notas.length];

		introducirNombresNotas(nombres, notas);
		mostrarNombresNotas(nombres, notas);

	}// MAIN

	public static void introducirNombresNotas(String[] nombres, float[] notas) {
		for (int i = 0; i < notas.length; i++) {
			Scanner sc = new Scanner(System.in);

			System.out.println();

			System.out.print("Nombre: ");
			nombres[i] = sc.next();

			System.out.print("Nota: ");
			notas[i] = sc.nextFloat();
		}
	}

	public static void mostrarNombresNotas(String[] nombres, float[] notas) {
		System.out.println("Notas: ");
		System.out.println();
		for (int i = 0; i < notas.length; i++) {

			System.out.print(nombres[i]);
			System.out.print(": ");
			System.out.print(notas[i]);

			System.out.println();
		}

	}
}// CLASS
