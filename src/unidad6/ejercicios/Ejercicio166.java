package unidad6.ejercicios;

import java.util.Scanner;

public class Ejercicio166 {
	
	public static void main(String[] args) {
		
		System.out.println("Jugador A, introduzca la palabra secreta: ");

		String original = new Scanner(System.in).nextLine();
		char[] originalArray = original.toCharArray();
		char[] guiones = original.toCharArray();

		int intentos = 7;
		boolean completado = false;
		

		for (int i = 0; i < original.length(); i++) {
			guiones[i] = ('_');
		}
		
		System.out.printf("%n%n%n%n%n%n%n%n%n%n");
		System.out.println("Jugador B, adivine la palabra.");
		imprimir(guiones);
		
		do {
			System.out.println("Escriba una letra.");

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
		
		if(intentos == 0) {System.out.println("¡Jugador A ha ganado!");}
		else {System.out.println("¡Jugador B ha ganado!");}


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
