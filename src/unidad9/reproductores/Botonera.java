package unidad9.reproductores;

public interface Botonera {
	void play (Cancion cancion);
	
	void stop(Cancion cancion);
	
	void pause(Cancion cancion);
	
	default void next() {
		System.out.println("Saltar a la siguiente canción");
	}
	
	default void previous() {
		System.out.println("Volver a la canción anterior");
	}
	
	
	
}
