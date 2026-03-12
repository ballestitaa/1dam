package unidad5.ejercicios;

import java.util.Scanner;

public class EjercicioPizarra {

	public static void main(String[] args) {

		float[][] matrizNotas = { { 1, 7, 3, 1 }, //
				{ 3, 5, 6, 7 }, { 1, 2, 3, 4 }//

		};
		String[] nombres = { "Javi", "Maria", "Santi" };

		String nombreAlumno;

		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce el nombre del alumno: ");
		nombreAlumno = sc.next();

		for (int fila = 0; fila < nombres.length; fila++) {
			if (nombreAlumno.equalsIgnoreCase(nombres[fila])) {

				for (int columna = 0; columna < matrizNotas[fila].length; columna++) {

					System.out.print(matrizNotas[fila][columna] + "  ");

				}

			}
		}

	}

}
