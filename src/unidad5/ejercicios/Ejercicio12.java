package unidad5.ejercicios;

import java.util.Arrays;

public class Ejercicio12 {

	public static void main(String[] args) {

		int [] vector = {1,2,3,4};
		int [] vector2 = {1,2,3,4};
		
		if (Arrays.compare(vector, vector2) == 0) {
			System.out.println("Son iguales");
		}else {
			System.out.println("No son iguales");
		}
	}

}
