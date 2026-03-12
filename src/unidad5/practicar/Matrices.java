package unidad5.practicar;

public class Matrices {

	public static void main(String[] args) {
		
		float [][] alumnosNotas;
		alumnosNotas =  new float [5][3]; // [alumnos] [notas]
		
//		rellenarMatriz(alumnosNotas);
				
		rellenarMatriz2(alumnosNotas);
		
		mostrarMatriz(alumnosNotas);

		mediaCadaAlumno(alumnosNotas);
		
//		mediaGeneral(alumnosNotas);
		
		
		
		notasTodasColumnas(alumnosNotas);
		
	
		
		
	}

	
	public static void notasColumnaElegida(float[][] alumnosNotas, int columna) {
		
		System.out.println("Notas de la columna "+ columna);
		for (int filas = 0; filas<alumnosNotas.length; filas++) {
			System.out.println(alumnosNotas[filas][columna]); // añadiendo -1 a columna se hace que pase de ser 0,1,2 a 1,2,3
		}
		
	}
	
	public static void notasTodasColumnas(float[][] alumnosNotas) {
		
		for (int columna = 0; columna<alumnosNotas[columna].length;columna++) {	
			System.out.println("Notas columnas "+ columna);
			for (int filas = 0; filas<alumnosNotas.length; filas++) {
				System.out.println(alumnosNotas[filas][columna]); 
			}
			System.out.println();
		}
		
		
	}

	public static void mediaGeneral(float[][] alumnosNotas) { // sin terminar
		float acumClase=0;
		
		for (int filas = 0; filas<alumnosNotas.length;filas++) {
			acumClase+=mediaNotas(alumnosNotas[filas]);
		}
		
		System.out.println("La media de todos los alumnos es "+ acumClase/alumnosNotas.length);
	}

	public static void mediaCadaAlumno(float[][] alumnosNotas) {
		for (int filas = 0; filas<alumnosNotas.length; filas++) {
				System.out.println("La media del alumno "+filas + " es: " +mediaNotas(alumnosNotas[filas]));
			}
	}

	public static void mostrarMatriz(float[][] alumnosNotas) {
		for (int filas = 0; filas<alumnosNotas.length; filas++) {
			System.out.println("Alumno: "+filas);
			System.out.println("------------------");
			for (int columnas = 0; columnas < alumnosNotas[filas].length; columnas++) {
				if (columnas == (alumnosNotas[filas].length - 1)) { // no coma (,) en la última nota
					System.out.println(alumnosNotas[filas][columnas]);
				} else {
					System.out.print(alumnosNotas[filas][columnas] + " | ");
				}
			}
			System.out.println("------------------");
			System.out.println();
		}
	}
	
	public static void rellenarMatriz2(float[][] alumnosNotas) {
		for (int filas = 0; filas<alumnosNotas.length; filas++) {
			for (int columnas = 0; columnas < alumnosNotas[filas].length; columnas++) {
				int notaSinTruncar = (int) (Math.random() * 1000);
				alumnosNotas[filas][columnas] = (float) notaSinTruncar / 100;
			}
		}
	}

	public static void rellenarMatriz(float[][] alumnosNotas) {
		for (int i = 0; i<alumnosNotas.length; i++) {
			crearNotasArrayAutomatico(alumnosNotas[i]);
		}
	}
	
	public static void crearNotasArrayAutomatico(float[] vector) {
		for (int i = 0; i < vector.length; i++) {
			vector[i] = (float) Math.random() * 10;
		}
	}
	
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
	

}// FIN CLASS
