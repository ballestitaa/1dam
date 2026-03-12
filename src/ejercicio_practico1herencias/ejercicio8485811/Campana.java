package ejercicio_practico1herencias.ejercicio8485811;

public class Campana extends Instrumento{

	public Campana() {
		super();
	}
	
	@Override
	public void interpretar() {
		
		for (Nota nota : melodia) { // recorro todo el array melodia, y saco cada
			switch (nota) {			// "hueco" y lo guardo en la variable nota
			
			case DO -> System.out.print("DONG (do) ");
	        case RE -> System.out.print("DONG (re) ");
	        case MI -> System.out.print("DONG (mi) ");
	        case FA -> System.out.print("DONG (fa) ");
	        case SOL -> System.out.print("DONG (sol) ");
	        case LA -> System.out.print("DONG (la) ");
	        case SI -> System.out.print("DONG (si) ");
			
			
			}
		}
		
	}

}
