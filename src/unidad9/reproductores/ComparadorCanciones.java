package unidad9.reproductores;

import java.util.Comparator;

public class ComparadorCanciones implements Comparator<Cancion>{
	public int compare(Cancion c1, Cancion c2) { //       +1 a>b    0 IGUAL   -1 a<b
		
		return (c1.getArtista().compareTo(c2.getArtista()));
		/* Hacer lo de arriba es lo mismo que lo de abajo.
		
		
		if(c1.getArtista().compareTo(c2.getArtista()) > 0) { // el compareTo devuelve 1 0 -1, por eso hay q hacer eso
			return 1;
		} else if (c1.getArtista().compareTo(c2.getArtista()) < 0) {
			return -1;
		} else {return 0;}
		*/
	}
	
	/*public int compare(Cancion c1, Cancion c2) { //       +1 a>b    0 IGUAL   -1 a<b
		if(c1.getDuracionSegundos() > c2.getDuracionSegundos()) {
			return 1;
		} else if (c1.getDuracionSegundos() < c2.getDuracionSegundos()) {
			return -1;
		} else {return 0;}
		
	}*/
	
	
}
