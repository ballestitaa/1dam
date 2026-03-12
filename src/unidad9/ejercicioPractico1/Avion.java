package unidad9.ejercicioPractico1;

public class Avion extends Vehiculo implements ReproductorMusica, PuedeVolar {

    private String cancionActual;
    private float altura;
    private String[] playlist;
    private int numCanciones;

    public Avion(float combustible, int pasajeros, int ruedas, float altura) {
        super(combustible, pasajeros, ruedas);
        this.altura = altura;
        this.playlist = new String[100]; // Capacidad máxima de 100 canciones
        this.numCanciones = 0;
    }

    public float getAltura() {
        return altura;
    }

    public void reportarFlota() {
        System.out.println("Reportando flota de aviones.");
    }

    public void reportarEstado() {
        System.out.println("Avión con " + getPasajeros() + " pasajeros a una altura de " + altura + " metros.");
    }

    @Override
    public void aterrizar() {
        System.out.println("El avión está aterrizando...");
        this.altura = 0;
    }

    @Override
    public void reproducirCancion(String cancion) {
        // Verificar si la canción está en la playlist
        boolean encontrada = false;
        for (int i = 0; i < numCanciones; i++) {
            if (playlist[i].equals(cancion)) {
                encontrada = true;
                break;
            }
        }

        if (encontrada) {
            this.cancionActual = cancion;
            System.out.println("Avión reproduciendo la canción: " + cancion);
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
            System.out.println("La playlist del avión está llena. No se puede agregar más canciones.");
        }
    }

    @Override
    public void agregarCanciones(String[] canciones) {
        for (String c : canciones) {
            if (numCanciones < playlist.length) {
                playlist[numCanciones++] = c;
            } else {
                System.out.println("La playlist del avión se ha llenado. No se pudieron agregar todas las canciones.");
                break;
            }
        }
        System.out.println("Se han agregado " + canciones.length + " canciones (o el máximo posible) a la playlist.");
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
