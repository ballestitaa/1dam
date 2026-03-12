package unidad5.ejercicios;

import java.util.Arrays;

public class Ejercicio13 {

	public static void main(String[] args) {

		String[] nombres = { "c", "b", "a","d","o","p" };

		
		
		for (int i = 0; i < nombres.length; i++) {
			String acumulador;
			for (int j = i+1; j < nombres.length; j++) {

				if ((nombres[i].compareTo(nombres[j])) > 0) {
					
					acumulador = nombres[i];
					nombres[i]=nombres[j];
					nombres[j]=acumulador;
					

				}

			}

		}

		System.out.println(Arrays.toString(nombres));

	}

}
