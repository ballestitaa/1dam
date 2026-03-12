package unidad4.actividadesAmpliacion;

public class TiraElDado {

	public static void main(String[] args) {
		
		int jugador1;
		int jugador2;
		int jugador3;
		int jugador4;
		
		
		do {
			jugador1 = tirarDado();
			jugador2 = tirarDado();
			jugador3 = tirarDado();
			jugador4 = tirarDado();
			
			if (jugador1 == jugador2 || jugador1 == jugador3 || jugador1 == jugador4 || 
			         jugador2 == jugador3 || jugador2 == jugador4 || 
			         jugador3 == jugador4) {
				System.out.println("Empate, volvemos a tirar.");
				System.out.println();
			}
			
		} while (jugador1 == jugador2 || jugador1 == jugador3 || jugador1 == jugador4 || 
		         jugador2 == jugador3 || jugador2 == jugador4 || 
		         jugador3 == jugador4);
		
		System.out.println("Las jugadas son:");
		
		
		System.out.println("Jugador 1: "+jugador1);
		System.out.println("Jugador 2: "+jugador2);
		System.out.println("Jugador 3: "+jugador3);
		System.out.println("Jugador 4: "+jugador4);
		
		System.out.println();
		System.out.println();
		System.out.println();

		
		comprobarResultado(jugador1, jugador2, jugador3, jugador4);

	}

	public static int tirarDado() {
		
		int dado;
		
		do {
			dado = (int) (Math.random()*100);
		} while (dado <= 0 || dado > 6);
		
		return dado;
	}
	
	public static void comprobarResultado (int jugador1, int jugador2, int jugador3, int jugador4) {
		
		int ganador;
		
		ganador = Math.max(jugador1, jugador2);
		ganador = Math.max(ganador, jugador3);
		ganador = Math.max(ganador, jugador4);
		
		System.out.print("Y el ganador es... ¡");
		
		if (jugador1 == ganador) {
		    System.out.print("Jugador 1");
		}
		if (jugador2 == ganador) {
		    System.out.print("Jugador 2");
		}
		if (jugador3 == ganador) {
		    System.out.print("Jugador 3");
		}
		if (jugador4 == ganador) {
		    System.out.print("Jugador 4");
		} 
		
		System.out.print("!");
	}
	
}
