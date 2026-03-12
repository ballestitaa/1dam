package unidad3.ejerciciosintroduccion;
import java.util.Scanner;

public class ejercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		
		System.out.println("Introduce el número a multiplicar: ");
		numero = sc.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(numero + " por " + i + " es igual a: " + i*numero);
		}
		sc.close();
	}

}
