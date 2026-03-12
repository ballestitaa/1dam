package examenSantiagoBallesta.ejercicio1;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int opcion;
		double grados;
		
		do {
		
			System.out.println("Introduzca la opción que desea realizar:");
			System.out.println("1. Cambio Celsius a Fahrenheit.");
			System.out.println("2. Cambio Celsius a Kelvin.");
			System.out.println("3. Cambio Fahrenheit a Celsius.");
			System.out.println("4. Cambio Kelvin a Celsius.");
			System.out.println("5. Salir");
			
			opcion = sc.nextInt();
			
			if (opcion < 1 || opcion > 5) {
				System.out.println("Error, introduzca un valor válido");
			}
			
			if (opcion == 1) {
				System.out.println("Cambio Celsius a Fahrenheit.");
				System.out.println("Introduzca los grados.");
				grados = sc.nextInt();
				System.out.println(celsiusFarenheit(grados));
				
				
			} else if (opcion == 2) {
				System.out.println("Cambio de Celsius a Kelvin.");
				System.out.println("Introduzca los grados.");
				grados = sc.nextInt();
				System.out.println(celsiusKelvin(grados));
				
				
			} else if (opcion == 3) {
				System.out.println("Cambio Fahrenheit a Celsius.");
				System.out.println("Introduzca los grados.");
				grados = sc.nextInt();
				System.out.println(fahrenheitCelsius(grados));
				
				
			} else if (opcion == 4) {
				System.out.println("Cambio Kelvin a Celsius.");
				System.out.println("Introduzca los grados.");
				grados = sc.nextInt();
				System.out.println(kelvinCelsius(grados));
				
				
			} else if (opcion==5){break;} // Pongo el IF aquí también para que si se introduce un valor que de error, vuelva a pedir una opción
		
		} while (true);
		
		sc.close();
	} // fin main
	
	public static double celsiusFarenheit(double grados) {
		double gradosCambiados;
		gradosCambiados = (grados * 9 / 5) + 32 ;
		return(gradosCambiados);
	}
	
	public static double celsiusKelvin(double grados) {
		double gradosCambiados;
		gradosCambiados = grados + 273.15 ;
		return(gradosCambiados);
	}
	
	public static double fahrenheitCelsius(double grados) {
		double gradosCambiados;
		gradosCambiados = (grados - 32) * (5 / 9) ;
		return(gradosCambiados);
	}
	
	public static double kelvinCelsius(double grados) {
		double gradosCambiados;
		gradosCambiados = grados - 273.15 ;
		return(gradosCambiados);
	}
	
} // fin class
