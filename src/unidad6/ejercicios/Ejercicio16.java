package unidad6.ejercicios;

import java.util.Scanner;

public class Ejercicio16 {
	public static void main(String[] args) {

		String original = "aramasa";
		char[] originalArray;
		int intentos = 7;
		boolean completado = false;
		char[] guiones;

		originalArray = original.toCharArray();
		guiones = original.toCharArray();

		for (int i = 0; i < original.length(); i++) {
			guiones[i] = ('_');
		}
		imprimir(guiones);
		do {

			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();

			intentos = intentos + intentar(originalArray, guiones);
			System.out.println("Te quedan: " + intentos + " intentos.");

			for (int i = 0; i < guiones.length; i++) {
				if (guiones[i] == '_') {
					completado = false;
					break;
				}

				completado = true;
			}

			imprimir(guiones);

		} while (intentos > 0 && !completado);

	}

	public static int intentar(char[] original, char[] guiones) {
		char letra;
		letra = new Scanner(System.in).next().charAt(0);
		int intento = 0;
		int cambio = 0;

		for (int i = 0; i < original.length; i++) {

			if (letra == original[i]) {

				guiones[i] = letra;
				cambio++;

			}

		}

		if (cambio == 0) {
			intento--;
		}

		return intento;

	}

	public static void imprimir(char[] adivinar) {
		for (int i = 0; i < adivinar.length; i++) {
			System.out.print(adivinar[i]);
			System.out.print(" ");
		}
	}
}
