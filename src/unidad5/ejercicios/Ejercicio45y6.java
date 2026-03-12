package unidad5.ejercicios;

import java.util.Scanner;

public class Ejercicio45y6 {
	public static void main(String[] args) {
		float[] notas;
		notas = new float[5];
		crearNotasArray(notas);
		mostrarNotas(notas);
		System.out.println();
		System.out.println("¿Se ha repetido alguna nota?: "+repetidos(notas));
		System.out.println("Nota máxima: "+notaMaxima(notas));
		System.out.println("Nota mínima: "+notaMinima(notas));
	}// main

	public static void crearNotasArray(float[] notasFuncion) {
		for (int i = 0; i < notasFuncion.length; i++) {
			System.out.print("Introduce la nota " + i + ": ");
			Scanner sc = new Scanner(System.in);
			notasFuncion[i] = sc.nextFloat();

		}
	}

	public static boolean repetidos(float[] notas) {
		boolean repetidos = false;

		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas.length; j++) {
					if (notas[i] == notas[j] && i != j) {
						repetidos = true;
						break;
					}
			}
			if (repetidos == true) {
				break;
			}
		}

		return repetidos;
	}
	
	public static void mostrarNotas(float[] notasFuncion) {
		for (int i = 0; i < notasFuncion.length; i++) {
			if (i == (notasFuncion.length - 1)) {
				System.out.print(notasFuncion[i]);
			} else {
				System.out.print(notasFuncion[i] + ", ");
			}
		}
	}

	public static float notaMaxima(float[] notasFuncion) {

		float notaMaxima = notasFuncion[0];

		for (int i = 1; i < notasFuncion.length; i++) { // si empiezar por notasFuncion[0] en el notaMaxima, te saltas una iteracion
			if (notasFuncion[i] > notaMaxima) {
				notaMaxima = notasFuncion[i];
			}
		}
		return notaMaxima;
	}
	
	public static float notaMinima(float[] notasFuncion) {

		float notaMinima = notasFuncion[0];

		for (int i = 1; i < notasFuncion.length; i++) { // lo mismo que en la maxima
			if (notasFuncion[i] < notaMinima) {
				notaMinima = notasFuncion[i];
			}
		}
		return notaMinima;
	}
}// class
