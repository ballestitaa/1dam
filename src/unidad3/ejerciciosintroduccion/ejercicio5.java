package unidad3.ejerciciosintroduccion;
import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String palabra = "a";
		int i;
		
		for (i=0 ; i<=20 ; i++) {
			
			System.out.println(i);
			System.out.println("Introduce -parar- si quieres parar la secuencia.");
			palabra = sc.next();
			
			if (palabra.equals("parar")) {
				break;
			}
			
		}
		sc.close();
	}

}
