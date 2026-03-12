package unidad3.juegos;
import java.util.Scanner;

public class PiedraPapelTijeraTodoEnUno {
	public static void main(String [] args) throws InterruptedException {		// QUE CUANDO UN JUGADOR HAYA GANADO MÁS DE LA MITAD DE LAS RONDAS, GANE AUTOMÁTICAMENTE. (IDENTIFICAR UN GANADOR)
		String jugarDeNuevo = "a";
		String modoDeJuego = "a";
		Scanner sc = new Scanner (System.in);

		
		do {
			int jugada1; 								
			int jugada2; 
			int contadorJugador1;
			int contadorJugador2;
			int contadorRondas;
			int rondasMaximas;


			
			jugarDeNuevo = "a";
			contadorRondas = 1;
			contadorJugador1 = 0;
			contadorJugador2 = 0;
			rondasMaximas = 0;
			jugada1 = 0;
			jugada2 = 0;
			
			
			System.out.println("Dime el modo de juego que prefieres jugar:");
			System.out.println("1jugador:");
			System.out.println("2jugadores:");
			System.out.println("Simulacion:");
			modoDeJuego = sc.next();
			
			
			if (modoDeJuego.equalsIgnoreCase("2jugadores")) {
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
				
				
				
				 
				System.out.println("");
				System.out.println("El jugador 1 ha ganado " + contadorJugador1 + " ronda/s, mientras que el jugador 2 ha ganado "+ contadorJugador2 + " ronda/s.");
				
				
			} else if (modoDeJuego.equalsIgnoreCase("1jugador")) {
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
						
						
						System.out.println("La máquina (Jugador 2) está eligiendo...");
						Thread.sleep(2000);
						
						do {  // Para que todas las jugadas tengan las mismas probabilidades, quito el 9 para tener un número igual de valores en todas las jugadas.
							jugada2 = ((int) (Math.random()*10));
							
							
							if (jugada2>=0 && jugada2<=2) 
							{
								jugada2=1;
							} else if (jugada2>=3 && jugada2<=5) 
							{
								jugada2=2;
							} else if (jugada2>=6 && jugada2<=8) 
							{
								jugada2=3;
							}
							
							// System.out.println(jugada2); // JUGADA MÁQUINA
						} while (jugada2==9);
				
						
						if ((jugada1 < 1 || jugada1 > 3)) {
							System.out.println("-----------------Error. Introduzca jugadas del 1 al 3.----------------------");
						}
					
			
					// Repetir MIENTRAS sea INVÁLIDA
					} while (jugada1 < 1 || jugada1 > 3);			
					
					
					
					
					int resultado = ((jugada1 - jugada2) %3); // %3 NO HACE NADA EN ESTE CASO - Funcionaría y sería necesario en RPSLS (Rock Paper Scissors Lizard Spo).
					
					if (resultado == 0) {
						System.out.println("Empate");
					} else if (resultado == 1 || resultado == -2) {
						System.out.println("La ronda la gana el Jugador 1");
						contadorJugador1++;
						contadorRondas++;
					} else {
						System.out.println("La ronda la gana el Jugador 2");
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
				
				
				
				 
				System.out.println("");
				System.out.println("El jugador 1 ha ganado " + contadorJugador1 + " ronda/s, mientras que el jugador 2 ha ganado "+ contadorJugador2 + " ronda/s.");
				
				
			} else if (modoDeJuego.equalsIgnoreCase("Simulacion")) {
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
					
						
						
						
					
						System.out.println("La máquina 1 está eligiendo... (Ronda Nº "+ contadorRondas +")");
						Thread.sleep(2000);			    
						do {  // Para que todas las jugadas tengan las mismas probabilidades, quito el 9 para tener un número igual de valores en todas las jugadas.
							jugada1 = ((int) (Math.random()*10));
							
							
							if (jugada1>=0 && jugada1<=2) 
							{
								jugada1=1;
							} else if (jugada1>=3 && jugada1<=5) 
							{
								jugada1=2;
							} else if (jugada1>=6 && jugada1<=8) 
							{
								jugada1=3;
							}
							
							// System.out.println(jugada1); // JUGADA MÁQUINA
						} while (jugada1==9); 
						
						
						System.out.println("La máquina 2 está eligiendo...");
						Thread.sleep(2000);
						
						do {  // Para que todas las jugadas tengan las mismas probabilidades, quito el 9 para tener un número igual de valores en todas las jugadas.
							jugada2 = ((int) (Math.random()*10));
							
							
							if (jugada2>=0 && jugada2<=2) 
							{
								jugada2=1;
							} else if (jugada2>=3 && jugada2<=5) 
							{
								jugada2=2;
							} else if (jugada2>=6 && jugada2<=8) 
							{
								jugada2=3;
							}
							
							// System.out.println(jugada2); // JUGADA MÁQUINA
						} while (jugada2==9);
					} while (jugada1 < 1 || jugada1 > 3);			
					
					
					
					
					int resultado = ((jugada1 - jugada2) %3); // %3 NO HACE NADA EN ESTE CASO - Funcionaría y sería necesario en RPSLS (Rock Paper Scissors Lizard Spo).
					
					if (resultado == 0) {
						System.out.println("Empate");
					} else if (resultado == 1 || resultado == -2) {
						System.out.println("La ronda la gana el Jugador 1");
						contadorRondas++;
						contadorJugador1++;
					} else {
						System.out.println("La ronda la gana el Jugador 2");
						contadorRondas++;
						contadorJugador2++;
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
				
				
				
				 
				System.out.println("");
				System.out.println("El jugador 1 ha ganado " + contadorJugador1 + " ronda/s, mientras que el jugador 2 ha ganado "+ contadorJugador2 + " ronda/s.");
				
				
			}
			
			
			
			
			
			
			System.out.println("¿Quieres volver a jugar?");
			jugarDeNuevo = sc.next();
		} while (jugarDeNuevo.equalsIgnoreCase("Si"));
		
		System.out.println("¡Vale! Gracias por jugar.");
		sc.close();
	
	}
}
