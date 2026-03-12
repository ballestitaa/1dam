package unidad3.juegos;
import java.util.Scanner; 							// AÑADIR
													// CONTADOR DE VICTORIAS (HECHO)
public class PiedraPapelTijera {					// QUIEN HA GANADO EL GLOBAL (HECHO)
	public static void main(String [] args) {		// QUE CUANDO UN JUGADOR HAYA GANADO MÁS DE LA MITAD DE LAS RONDAS, GANE AUTOMÁTICAMENTE. (IDENTIFICAR UN GANADOR)
		int jugada1; 								
		int jugada2; 
		int contadorJugador1;
		int contadorJugador2;
		int contadorRondas;
		int rondasMaximas;
		contadorRondas = 1;
		contadorJugador1 = 0;
		contadorJugador2 = 0;
		rondasMaximas = 0;
		jugada1 = 0;
		jugada2 = 0;
		
		Scanner sc = new Scanner (System.in);

		
		do 
		{
		    System.out.println("Elige el número de rondas máxima.");
		    rondasMaximas = sc.nextInt(); 
		    
		    if (rondasMaximas % 2 == 0 || rondasMaximas < 0) {
		        System.out.println("-----------------------ERROR: El número de rondas era 0, par o negativo.-----------------------");	
		    }

		} while ( rondasMaximas % 2 == 0 || rondasMaximas < 0 ); 
		
		
		
		
		
		do 
		{	
		
			do
			{
			
				
				
				
			
				System.out.println("Introduce la jugada del primer jugador (Ronda Nº "+ contadorRondas +")");
			    System.out.println("1: Piedra | 2: Papel | 3: Tijera");
				jugada1 = sc.nextInt(); 
				
				
				System.out.println("Introduce la jugada del segundo jugador");
			    System.out.println("1: Piedra | 2: Papel | 3: Tijera");
				jugada2 = sc.nextInt(); 
		
				
				if ((jugada1 < 1 || jugada1 > 3 || jugada2 < 1 || jugada2 > 3)) {
					System.out.println("-----------------Error. Introduzca jugadas del 1 al 3.----------------------");
				}
			
	
			// Repetir MIENTRAS sea INVÁLIDA
			} while (jugada1 < 1 || jugada1 > 3 || jugada2 < 1 || jugada2 > 3);			
			
			
			
			
			int resultado = ((jugada1 - jugada2) %3); // %3 NO HACE NADA EN ESTE CASO - Funcionaría y sería necesario en RPSLS (Rock Paper Scissors Lizard Spo).
			
			if (resultado == 0) {
				System.out.println("Empate");
			} else if (resultado == 1 || resultado == -2) {
				System.out.println("La ronda la gana el Jugador 1");
				contadorJugador1++;
				contadorRondas++;
			} else {
				System.out.println("La rodna la gana el Jugador 2");
				contadorJugador2++;
				contadorRondas++;
			}
		
		} while (contadorRondas <= rondasMaximas  // FIN DEL DO-WHILE
			    && contadorJugador1 <= (rondasMaximas / 2) 
			    && contadorJugador2 <= (rondasMaximas / 2));
		
		
		// COMPROBADOR DE CONTADOR GLOBAL
		
		
		if (contadorJugador1 > (rondasMaximas/2)) {
			System.out.println("");
			System.out.println("¡El jugador 1 ha ganado la partida!");
		} else if (contadorJugador2 > (rondasMaximas/2)) {
			System.out.println("");
			System.out.println("¡El jugador 2 ha ganado la partida!");
		}
		
		
		
		sc.close();
		System.out.println("");
		System.out.println("El jugador 1 ha ganado " + contadorJugador1 + " ronda/s, mientras que el jugador 2 ha ganado "+ contadorJugador2 + " ronda/s.");
		
		
	}
}	