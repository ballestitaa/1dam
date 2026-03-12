package unidad5.practicar;

import java.util.Scanner;

public class ArrayNotas {

	public static void main(String[] args) {

		// CREAR NOTAS

		float[] notas;
		notas = new float[12];

		// CREAR
		// crearNotasArray(notas);

		// ACTUALIZAR - FUNCIONA IGUAL QUE CREAR

		// BORRAR
		// llamada borrar
		// borrarNotasArray(notas);

		// LEER
		// llamada leer
		// float nota = leerNotasArray(notas);
		// System.out.println(nota);

		// MOSTRAR NOTA
		// mostrarNotas(notas);

		// NOTAS AUTOMATICO
		crearNotasArrayAutomatico(notas);

		mostrarNotas(notas);
		
		// MEDIA NOTAS
		// System.out.println(mediaNotas(notas));
		System.out.println("-------");

		// NOTA MÁXIMA Y MÍNIMA
		System.out.println("Nota máxima: " + notaMaxima(notas));
		System.out.println("Nota mínima: " + notaMinima(notas));

		System.out.println("------------");

		// NOTAS ORDENADAS DE MAYOR A MENOR
		notasOrdenarMayorAMenor(notas);
	}

	// INTRODUCIR TODAS LAS NOTAS A MANO
	
	public static void crearNotasArray(float[] notasFuncion) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Qué nota quieres crear/actualizar?");
		int indice = sc.nextInt();
		System.out.println("¿Qué nota quieres ponerle?");
		int valor = sc.nextInt();
		notasFuncion[indice] = valor;

	}

	// GENERAR DE FORMA "ALEATORIA" TODAS LAS NOTAS PARA FACILITAR TESTEO
	
	public static void crearNotasArrayAutomatico(float[] notasFuncion) {
		for (int i = 0; i < notasFuncion.length; i++) {

			int notaSinTruncar = (int) (Math.random() * 1000);
			notasFuncion[i] = (float) notaSinTruncar / 100;
		}
	}
	
	// BORRAR NOTA ELEGIDA

	public static void borrarNotasArray(float[] notasFuncion) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Qué nota quieres borrar?");
		int indice = sc.nextInt();
		notasFuncion[indice] = -1;

	}

	// MOSTRAR NOTA ELEGIDA
	
	public static float leerNotasArray(float[] notasFuncion) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Qué nota quieres leer?");
		int indice = sc.nextInt();
		float notaLeida = notasFuncion[indice];

		return notaLeida;
	}

	// MOSTRAR TODAS LAS NOTAS
	
	public static void mostrarNotas(float[] notasFuncion) {
		for (int i = 0; i < notasFuncion.length; i++) {
			if (i==(notasFuncion.length-1)) {
				System.out.print(notasFuncion[i]);
			} else {
				System.out.print(notasFuncion[i] + ", ");
			}
		}
	}

	// MEDIA NOTAS
	
	public static float mediaNotas(float[] notasFuncion) {

		float totalAcumulado = 0;
		float notasTomadas = 0;
		float media = 0;

		for (int i = 0; i < notasFuncion.length; i++) {
			if (notasFuncion[i] >= 0) { // >=
				totalAcumulado += notasFuncion[i];
				notasTomadas++;
			}
		}

		if (notasTomadas == 0) {
			System.out.println("Ha habido un error en la toma de notas, no es posible realizar la media.");
		} else {
			media = totalAcumulado / notasTomadas;
		}

		return media;
	}

	// NOTA MÁXIMA, NOTA MÍNIMA

	public static float notaMaxima(float[] notasFuncion) {

		float notaMaxima = notasFuncion[0];

		for (int i = 1; i < notasFuncion.length; i++) { // si empiezar por notasFuncion[0] en el notaMaxima, te saltas una iteracion
			if (notasFuncion[i] > notaMaxima) {
				notaMaxima = notasFuncion[i];
			}
		}
		return notaMaxima;
	}

	public static float notaMinima(float[] notasFuncion) {

		float notaMinima = notasFuncion[0];

		for (int i = 1; i < notasFuncion.length; i++) { // lo mismo que en la maxima
			if (notasFuncion[i] < notaMinima) {
				notaMinima = notasFuncion[i];
			}
		}
		return notaMinima;
	}

	public static void notasOrdenarMayorAMenor(float[] notasFuncion) {

		float[] notasSucio; // Lo he llamado notasSucio por que es el array que voy a utilizar como "hoja en
							// sucio" para poder borrar los valores (necesario para mi método de búsqueda)
							// sin perderos
		notasSucio = new float[12];

		float[] notasOrdenadas;
		notasOrdenadas = new float[12];

		int indice = 0;
		float notaMaxima = 0;

		for (int i = 0; i < notasFuncion.length; i++) { // duplicar array

			notasSucio[i] = notasFuncion[i];

		}

		for (int i = 0; i < notasSucio.length; i++) {   // Hace que el for interno que busca el mayor valor de nota
														// existente se repita tantas veces como valores haya en el
														// array.

			indice = 0;     // Reiniciar las variables ya que cada iteración del bucle exterior es como una
						    // búsqueda nueva del mayor existente
			notaMaxima = 0; // Reiniciar las variables

			for (int j = 0; j < notasSucio.length; j++) { // Prácticamente lo mismo que la función que busca el máximo.
				if (notasSucio[j] > notaMaxima) {
					indice = j;
					notaMaxima = notasSucio[j];

				}

			}

			notasOrdenadas[i] = notasSucio[indice]; // Una vez ha encontrado el mayor valor existente, lo pasa a la
													// posición que indica "i" para que cuando acabe tengas también un
													// array nuevo con todas las notas ordenadas.

			notasSucio[indice] = -1;

		}

		mostrarNotas(notasOrdenadas);   // Mostrar las notas del array notasOrdenadas para también verlas por pantalla
										// en el momento.

	}

}
