package santiago_ballesta_carmona.ejercicio2;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Alojamiento[] alojamientos;
		alojamientos = new Alojamiento[20];

		//APARTAMENTOS
		alojamientos[0] = new Apartamento("APTO1", "AVDA 2", 12, 29.99, 12, true);
		alojamientos[1] = new Apartamento("APTO2", "AVDA 3", 2, 45.97, 1, false);
		
		//HABITACIONES
		alojamientos[2] = new HabitacionHotel("HAB1", "PLANTA2", 1, 29.99, 1, true);
		alojamientos[3] = new HabitacionHotel("HAB2", "PLANTA3", 2, 45.75, 2, false);
		
		//CASAS RURALES
		alojamientos[4] = new CasaRural("CR1", "MONTE1", 20, 1200.43, 1000.91, true);
		alojamientos[5] = new CasaRural("CR2", "MONTE2", 10, 750.21, 452.12, false);
		
		// APARTAMENTO
		// String codigo, String direccion, int capacidad, double precioPorNoche, int numHabitaciones, boolean tieneTerraza
		
		// HOTEL
		//String codigo, String direccion, int capacidad, double precioPorNoche, int numCamas, boolean incluyeDesayuno
		
		// CASA RURAL
		//String codigo, String direccion, int capacidad, double precioPorNoche, double metrosTerreno, boolean tienePiscina
		
		for(int i = 0; i<alojamientos.length; i++) {
			if (alojamientos[i] != null) {
				System.out.println(alojamientos[i].toString());
			} else {return;} // solo funciona si todos los nulos estan juntos al final, si no, podria dejarse alojamientos sin visualizar
		}
	}

}
