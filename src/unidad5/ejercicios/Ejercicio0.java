package unidad5.ejercicios;
import java.util.Scanner;

public class Ejercicio0 {

	public static void main(String[] args) {
	float[] notas;
	notas = new float[5];
	
	crearNotasArray(notas);
	System.out.println("La media es: " + mediaNotas(notas));
	
	}
	
	public static void crearNotasArray(float[] notasFuncion) {
		for (int i = 0; i<notasFuncion.length;i++) {
			System.out.print("Introduce la nota "+i+": ");
			Scanner sc = new Scanner(System.in);
			notasFuncion[i] = sc.nextFloat();
			
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
}
