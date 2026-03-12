package unidad5.ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		
		int [] notas = {9,1,2,4,6,7,8};
		
		notas = ordenarYAmpliar(notas); // Amplia en 1 el array, te pide que nota quieres añadir y lo ordena.

		System.out.println(Arrays.toString(notas));
	}

	public static int[] ordenarYAmpliar( int [] arrayIn ) {
		
		int [] arrayOut;
		
		arrayOut = Arrays.copyOf(arrayIn, arrayIn.length+1);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Que nota quieres añadir?");
		
		arrayOut[arrayOut.length-1] = sc.nextInt();
		
		ordenarMenorMayor(arrayOut);
		
		return arrayOut;
		
		
	}
	
	public static void ordenarMenorMayor(int[] arrayFuncion) {
		for (int i = 0; i < arrayFuncion.length; i++) {
			int acumulador;
			for (int j = i + 1; j < arrayFuncion.length; j++) {

				if (arrayFuncion[i] > arrayFuncion[j]) {

					acumulador = arrayFuncion[i];
					arrayFuncion[i] = arrayFuncion[j];
					arrayFuncion[j] = acumulador;

				}

			}

		}
	}
	
}


