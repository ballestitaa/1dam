package unidad5.ejercicios;

import java.util.Arrays;

public class Ejercicio11 {

	public static void main(String[] args) {

		int[] vector = {1,2,3,4};
		
		int[] vector2 = Arrays.copyOf(vector, vector.length+1);
	
		
		System.out.println(Arrays.toString(vector2));
		
		
		
		
	}

}
