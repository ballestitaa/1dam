package unidad5.ejercicios;

import java.util.Arrays;

public class Ejercicio14 {

	public static void main(String[] args) {

		int[] notas = { 5,4,3,2,1 };
		int[] notas2;
		
		ordenarMenorMayor(notas);

		System.out.println(Arrays.toString(notas));
		
		notas2 = Arrays.copyOf(notas, notas.length+1);
		
		System.out.println(Arrays.toString(notas2));
		
		
		

	}

	public static void ordenarMenorMayor(int[] nombres) {
		for (int i = 0; i < nombres.length; i++) {
			int acumulador;
			for (int j = i + 1; j < nombres.length; j++) {

				if (nombres[i] > nombres[j]) {

					acumulador = nombres[i];
					nombres[i] = nombres[j];
					nombres[j] = acumulador;

				}

			}

		}
	}

}
