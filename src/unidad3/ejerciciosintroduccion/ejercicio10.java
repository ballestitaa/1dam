package unidad3.ejerciciosintroduccion;
import java.util.Scanner;

public class ejercicio10 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		double numeroAleatorio;
		int numeroEncontrar= 0;
		int numeroIntroducido= 0;

		System.out.println("Tienes 5 intentos para encontrar el número");
		
		do {
			numeroAleatorio = Math.random()*10;
			numeroEncontrar = (int)numeroAleatorio;
		} while (numeroEncontrar <= 1 && numeroEncontrar >=10);
		
		  //  System.out.println(numeroEncontrar);   // SABER NÚMERO A ADIVINAR
		
		
		for (int intentos=1; intentos<=5; intentos++) {
			System.out.println("*************************************");
			System.out.println("Intento número " + intentos);
			System.out.println("Introduce el número");
			System.out.println("*************************************");
			numeroIntroducido = sc.nextInt();
			
			if (numeroEncontrar==numeroIntroducido) {
				System.out.println("Felicidades, has ganado");
				break;
			}
		}
		
		if (numeroEncontrar!=numeroIntroducido) {
			System.out.println("¡Has perdido!");
		}
		sc.close();
		
	}
}