package unidad2.actividadaplicacion;
import java.util.Scanner;

public class ActividadAplicacion213 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double comidaDiaria;
		double kilosPorAnimal;
		int numAnimales;
		double comidaInsufic;
		

	
		System.out.println("Introduce la cantidad de kilos de comida comprada:");
		comidaDiaria = sc.nextInt();
		
		System.out.println("Introduce cuantos kilos come cada animal:");
		kilosPorAnimal = sc.nextInt();
		
		System.out.println("Introduce cuantos animales hay:");
		numAnimales = sc.nextInt();
	
		sc.close();
		
		if (comidaDiaria == 0 || kilosPorAnimal == 0 || numAnimales == 0) {
			System.out.println("Alguno de los valores introducidos no es válido");
		} else if (comidaDiaria >= (numAnimales * kilosPorAnimal)) {
			System.out.println("¡Perfecto! Hay suficiente comida para todos los animales.");
		} else {
			comidaInsufic = comidaDiaria / numAnimales;
			System.out.println("No hay suficiente comida para cada animal. Cada uno podrá comer: " + comidaInsufic + "kg.");		
		}	
	}
}
