package unidad9.reproductores;

import java.util.ArrayList;
import java.util.Collections;

public class PruebaArraylist {
	public static void main(String[] args) {
	
	ArrayList <Cancion> playlist = new ArrayList <Cancion> ();
	
	Cancion GigoloEuropeo = new Cancion("Gigolo Europeo", "yyy891 aka la influencia", "Urbano", 2023, 241, "Que solo sienta el bounce, que solo sienta el bounce...");
	Cancion DAB = new Cancion("DAB", "DISOBEY", "Urbano", 2023, 452, "Estas putas quieren dab, dab, dab...");
	Cancion LlamaYa = new Cancion("LlamaYa!", "yyy891 aka la influencia", "Urbano", 2022, 165, "LLama ya o me voy para el ático, me he comprao' un fusil que es táctico...");

	playlist.add(GigoloEuropeo);
	playlist.add(DAB);
	playlist.add(LlamaYa);
	
	System.out.println(playlist);
	playlist.sort(new ComparadorCanciones()); // -> COMPARATOR, le puedes poner null y funciona chill
	// Collections.sort(playlist); // -> COMPARABLE
	System.out.println(playlist);
	
	
	}
}
