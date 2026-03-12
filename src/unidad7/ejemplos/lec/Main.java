package unidad7.ejemplos.lec;

public class Main {

	public static void main(String[] args) {
		
		
		Jugador myrwn = new Jugador( "Myrwn", "Toplaner", "MKOI", 2.5F, 323.4F, 43  );
		Jugador defecto = new Jugador();
		
		
		//para "dupliacr" un objeto, uno nuevo con los mismos datos
		
		Jugador myrwn2;
		
		myrwn2 = new Jugador(myrwn);
		
		// acceso directo a la memoria del objeto
		// myrwn.partidosJugados++;
		
		//como en el jugador.java he puesto todas las variables en private, no se pueden acceder directamente desde aqui, solo a traves de funciones
		
		//System.out.println(myrwn.nombre);
		//System.out.println("El jugador es " + myrwn.rol + " juega para " + myrwn.equipo+ ".");
		
		//System.out.println("El jugador " +myrwn.nombre+ " ha farmeado "+myrwn.minionsTotales()+" en total.");
		myrwn.imprimir();
		
		System.out.println();
		System.out.print("Myrwn2: ");
		myrwn2.imprimir();
		defecto.imprimir();
		
		
		
		
		myrwn.setCsMedio(20);
		
		System.out.println(myrwn);
	}

}
