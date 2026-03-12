package unidad9.ejercicioPractico2;

public interface ReproductorMusica {
	 
	 void reproducirCancion(String cancion);
	 String getCancionActual();
	 void agregarCancion(String cancion);
	 void agregarCanciones(String[] canciones);
	 void detenerCancion();

}
