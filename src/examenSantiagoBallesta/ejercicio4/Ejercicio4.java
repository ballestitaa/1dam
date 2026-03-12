package examenSantiagoBallesta.ejercicio4;
import java.util.Scanner;
public class Ejercicio4 {

	public static void main(String[] args) {
		// jugarParesONones 0 = Gana jugador
		// jugarParesONones 1 = Gana máquina
		int rondasGanadasJugador = 0;
		int rondasGanadasMaquina = 0;
		int rondasTotales = 0;
		int ganador;
		do {
			
			ganador = jugarParesONones();
			if (ganador == 0) {
				rondasGanadasJugador++;
			} else rondasGanadasMaquina++;
			
			System.out.println("JUGADOR "+ rondasGanadasJugador + " - MÁQUINA "+ rondasGanadasMaquina);
			
			
			rondasTotales++;
			
		} while (rondasGanadasJugador<2 && rondasGanadasMaquina<2 && rondasTotales <=3);
		
		System.out.println();
		System.out.println(); // Dejar hueco para más claridad
		System.out.println();
		
		if (rondasGanadasJugador > rondasGanadasMaquina) {
			System.out.println("¡El jugador humano ha ganado la partida!");
		} else System.out.println("¡El jugador máquina ha ganado la partida!");
	}

	
	public static int jugarParesONones() {
		int paresONones;
		int jugador;
		int maquina;
		int ganador = -1;
		
		Scanner sc = new Scanner (System.in);

		do {
			maquina = ((int) (Math.random()*10));
		} while (maquina > 5 || maquina < 0);
		 // System.out.println(maquina); // Ver que número va a sacar la máquina
		
		do {
			System.out.println("Elige pares (0) o nones (1)");					
				paresONones = sc.nextInt();
		} while (paresONones > 1 || paresONones < 0);
		
		do {
			System.out.println("Elige tu jugada (Número del 0 al 5)");					
				jugador = sc.nextInt();
		} while (jugador > 5 || jugador < 0);
		
		System.out.println("La máquina ha sacado "+maquina);

		
		if (paresONones == 0) { // SE JUEGA A PARES
			if ((jugador + maquina) % 2 == 0) {
				System.out.println("¡Has ganado la ronda!");
				ganador = 0; // GANA HUMANO
			} else {
				System.out.println("¡Has perdido la ronda!");
				ganador = 1; // GANA MÁQUINA
			}
		}
			
		
		
		
		if (paresONones == 1) { // SE JUEGA A NONES
			if ((jugador + maquina) % 2 != 0) {
				System.out.println("¡Has ganado la ronda!");
				ganador = 0; // GANA HUMANO
			} else {
				System.out.println("¡Has perdido la ronda!");
				ganador = 1; // GANA MÁQUINA
			}
		}
		
		return ganador; // Sacar al main quien ha ganado
	}
	
	
}
