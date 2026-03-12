package unidad5.ejercicios;

import java.util.Scanner;

public class Ejercicio789y10 {

	public static void main(String[] args) {
		float[] notas;
		notas = new float[5];
		
		float[] notas2;
		notas2 = new float[notas.length];
		
		String[] nombres;
		nombres = new String[notas.length];
		
		
		
		
		crearNotasArrayAutomatico(notas);
		crearNotasArrayAutomatico(notas2);
		introducirNombres(nombres);
		dosNotasYNombre(notas, notas2, nombres);
		dosNotasYNombre(notas, notas2, nombres, 2);
		
		mostrarOrdenadasMayorMenor(notas);
		mostrarOrdenadasMenorMayor(notas);
		
	}

	public static void introducirNombres(String[] nombres) {
		for (int i = 0; i < nombres.length; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Nombre: ");
			nombres[i] = sc.next();
			System.out.println();
		}
	}
	
	public static float mediaNotasAlumno(float[] notas, float[] notas2, int alumno) {
		
		float media = (notas[alumno]+notas2[alumno])/2;
		
		return media;
		
		
	}
	
	public static void dosNotasYNombre(float[] notas, float[] notas2, String[] nombres) {
		for(int i=0; i<notas.length; i++) {
			System.out.print(nombres[i]);
			System.out.print(" : ");
			System.out.print(notas[i]);
			System.out.print(", "+notas2[i]);
			System.out.println(" - Media: "+ mediaNotasAlumno(notas, notas2, i));
			System.out.println();
		}
	}
	
	public static void dosNotasYNombre(float[] notas, float[] notas2, String[] nombres, int alumno) { 
			
			System.out.println("Has solicitado las notas y la media del alumno llamado: "+nombres[alumno]+" en la posición: "+alumno);
		
			System.out.print(nombres[alumno]);
			System.out.print(" : ");
			System.out.print(notas[alumno]);
			System.out.print(", "+notas2[alumno]);
			System.out.println(" - Media: "+ mediaNotasAlumno(notas, notas2, alumno));
			System.out.println();
		}
	

	
	
	public static void crearNotasArrayAutomatico(float[] notasFuncion) {
		for (int i = 0; i < notasFuncion.length; i++) {

			int notaSinTruncar = (int) (Math.random() * 1000);
			notasFuncion[i] = (float) notaSinTruncar / 100;
		}
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
	
	public static void mostrarOrdenadasMayorMenor(float[] notas) {

		System.out.println();
		for (int i = 0; i < notas.length - 1; i++) {
			for (int j = 0; j < notas.length - 1; j++) {
				if (notas[j] < notas[j + 1]) {
					float temp;

					temp = notas[j];
					notas[j] = notas[j + 1];
					notas[j + 1] = temp;
				}
			}
		}
		System.out.println();
		System.out.print("Notas de mayor a menor: ");
		mostrarNotas(notas);
	}

	public static void mostrarOrdenadasMenorMayor(float[] notas) {

		System.out.println();
		for (int i = 0; i < notas.length - 1; i++) {
			for (int j = 0; j < notas.length - 1; j++) {
				if (notas[j] > notas[j + 1]) {
					float temp;

					temp = notas[j];
					notas[j] = notas[j + 1];
					notas[j + 1] = temp;
				}
			}
		}
		System.out.println();
		System.out.print("Notas de menor a mayor: ");
		mostrarNotas(notas);
	}
	
}
