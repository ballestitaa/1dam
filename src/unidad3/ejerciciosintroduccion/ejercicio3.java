package unidad3.ejerciciosintroduccion;
import java.util.Scanner;

public class ejercicio3 {
	public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	int numero;
	
	do {
		System.out.println("Introduce un número");
		numero = sc.nextInt();
	
		
	} while(numero != 0);
	sc.close();
	}
}
