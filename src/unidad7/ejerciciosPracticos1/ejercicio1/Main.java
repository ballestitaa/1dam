package unidad7.ejerciciosPracticos1.ejercicio1;

public class Main {

	public static void main(String[] args) {
		
		Calendario fecha = new Calendario(2026, 5, 30);
		
		System.out.println(fecha.toString()); 
		
		fecha.incrementarDia(10);
		fecha.incrementarMes(2);
		fecha.incrementarAnyo(-2027);
		
		
		System.out.println(fecha.toString());
	}

}
