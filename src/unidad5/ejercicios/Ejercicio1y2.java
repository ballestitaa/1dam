package unidad5.ejercicios;

public class Ejercicio1y2 {

	public static void main(String[] args) {

		float[] notas;
		notas = new float[5];

		crearNotasArrayAutomatico(notas);
		mostrarNotas(notas);
		ordenDeEntrada(notas);
		
		nAprobadosNSuspensos(notas);

	}// FIN MAIN

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

	public static void ordenDeEntrada(float[] notas) {
		System.out.println();
		System.out.println("Notas en orden de entrada: ");
		for (int i = 0; i < notas.length; i++) {
			System.out.print(notas[i] + " ");
		}

		System.out.println();
		System.out.println("Notas en orden inverso de entrada: ");
		for (int i = notas.length - 1; i >= 0; i--) {
			System.out.print(notas[i] + " ");
		}
	}

	

	public static void nAprobadosNSuspensos(float[] notas) {
		int aprobados = 0;
		int suspensos = 0;
		System.out.println();
		for (int i = 0; i < notas.length; i++) {

			if (notas[i] >= 5) {
				aprobados++;
			} else {
				suspensos++;
			}

		}
		System.out.println();
		System.out.println("Número de aprobados: " + aprobados);
		System.out.println("Número de suspensos: " + suspensos);
	}

}// FIN CLASS
