package ejercicio_practico1herencias.ejercicio8485811;

public class Piano extends Instrumento{

	public Piano() {
		super();
	}

	@Override
	public void interpretar() {
		
		for (Nota nota : melodia) { // recorro todo el array melodia, y saco cada
			switch (nota) {			// "hueco" y lo guardo en la variable nota
			
			case DO -> System.out.print("do ");
	        case RE -> System.out.print("re ");
	        case MI -> System.out.print("mi ");
	        case FA -> System.out.print("fa ");
	        case SOL -> System.out.print("sol ");
	        case LA -> System.out.print("la ");
	        case SI -> System.out.print("si ");
			
			
			}
		}
		
	}
}
