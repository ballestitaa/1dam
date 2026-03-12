package unidad9.ejercicioPractico2;

public class Coche extends Vehiculo implements ReproductorMusica {
	 private int cilindraje;
	 private String cancionActual;
	 private String[] playlist;
	 private int numCanciones;
	 
	 public Coche(float combustible, int pasajeros, int ruedas, int cilindraje) {
		 super(combustible, pasajeros, ruedas);
		 this.cilindraje = cilindraje;
		 this.playlist = new String[100]; // Capacidad para 100 canciones
		 this.numCanciones = 0;
	 }
	 
	 public int getCilindraje() {
	        return cilindraje;
	    }

	    public void aparcar() {
	        System.out.println("El coche está aparcado.");
	    }

	    @Override
	    public void reproducirCancion(String cancion) {
	        // Comprobar que la canción existe en el array
	        boolean encontrada = false;
	        for (int i = 0; i < numCanciones; i++) {
	            if (playlist[i].equals(cancion)) {
	                encontrada = true;
	                break;
	            }
	        }

	        if (encontrada) {
	            this.cancionActual = cancion;
	            System.out.println("Coche reproduciendo la canción: " + cancion);
	        } else {
	            System.out.println("La canción '" + cancion + "' no se encuentra en la playlist.");
	        }
	    }

	    @Override
	    public String getCancionActual() {
	        return this.cancionActual;
	    }

	    @Override
	    public void agregarCancion(String cancion) {
	        if (numCanciones < playlist.length) {
	            playlist[numCanciones++] = cancion;
	            System.out.println("Se ha agregado la canción: " + cancion);
	        } else {
	            System.out.println("La playlist está llena. No se puede agregar más canciones.");
	        }
	    }

	    @Override
	    public void agregarCanciones(String[] canciones) {
	        for (String c : canciones) {
	            if (numCanciones < playlist.length) {
	                playlist[numCanciones++] = c;
	            } else {
	                System.out.println("La playlist se ha llenado. No se pudieron agregar todas las canciones.");
	                break;
	            }
	        }
	        System.out.println("Operación terminada: se intentaron agregar " + canciones.length + " canciones.");
	    }

	    public void detenerCancion() {
	        if (cancionActual != null) {
	            System.out.println("La canción '" + cancionActual + "' se ha detenido.");
	            this.cancionActual = null;
	        } else {
	            System.out.println("No hay ninguna canción en reproducción.");
	        }
	    }
	}
