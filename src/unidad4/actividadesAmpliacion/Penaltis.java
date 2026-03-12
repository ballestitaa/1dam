package unidad4.actividadesAmpliacion;
import java.util.Scanner;

public class Penaltis {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i=1;
		int puntosCPU = 0;
		int puntosUser = 0;
		
		
		while ( i <= 5 && puntosCPU < 3 && puntosUser < 3 ) {
		
			System.out.println();			
			System.out.println();
			System.out.println();
			
		if (decidirGanador( lanzarPenalti() )) {
			puntosCPU++;
			System.out.println("¡Te han parado el penalti!");
		} else {
			System.out.println("¡GOOOOOOOL!");
			puntosUser++;
		}
		
		mostrarMarcador(puntosCPU, puntosUser);
			
			
		
			i++;
		}
		
		if (puntosCPU >= 3) {
			System.out.println();
			System.out.println();
			System.out.println();
			
			System.out.println("La CPU ha ganado :(");
		} else {
			System.out.println();
			System.out.println();
			System.out.println();
			
			System.out.println("¡Has ganado!");

		}
		

	}

	
	public static void dibujarPorteria() {
        System.out.println(" _______________________________________"); 
        System.out.println("|                                       |");
        System.out.println("|                                       |");
        System.out.print("|");
        System.out.print(" 1- izquierda "); 
        System.out.print(" 2- centro ");     
        System.out.print("  3- derecha "); 
        System.out.println(" |"); 
        System.out.println("|                                       |");
        System.out.println("|                                       |");
        System.out.println("|_______________________________________|");
	}

	
	
	
	public static int lanzarPenalti() {
		Scanner sc = new Scanner(System.in);
		int lanzamiento;
		
		System.out.println("¿A dónde quieres lanzar el penalti?");
		dibujarPorteria();
		lanzamiento = sc.nextInt();
		
		
		return lanzamiento;
		
		
	}
	
	
	public static boolean decidirGanador(int jugadaUser) {
		int paradaCPU;
		boolean decision;
		
		do {
			paradaCPU = (int) (Math.random() * 100);
		} while (paradaCPU < 0 || paradaCPU > 4);
		
		
		
		if (jugadaUser == paradaCPU) {
			decision = true; // La ha parado
		} else {
			decision = false; // No la ha parado
		}
		
		return decision;
		
	}
	
	
	
	
	public static void mostrarMarcador(int victoriasCPU, int victoriasUser) {
		
			System.out.println("El marcador es: CPU " + victoriasCPU + " - Usuario "+ victoriasUser);
		}
		
	}
		
	
	
	
	
	

