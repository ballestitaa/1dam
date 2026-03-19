package unidad12.ejerciciosPracticos.actividad37;
import java.util.*;

public class Main {
    public static void main(String[] args) {
    HashMap<Integer, Jugador> plantilla = new HashMap<>();

        Scanner sc = new Scanner(System.in);

        // Ejemplo rápido para que pruebes: alta del dorsal 10
        altaJugador(plantilla, 10);
        altaJugador(plantilla, 7);
        altaJugador(plantilla, 9);
        System.out.println();
        mostrar(plantilla);
        System.out.println();
        System.out.println("SE ELIMINA AL JUGADOR CON DORSAL 10");
        eliminarJugador(plantilla, 10);

        mostrar(plantilla);
        System.out.println();
        mostrar(plantilla, "DELANTERO");
    }

    static void altaJugador(Map<Integer, Jugador> plantilla, Integer dorsal) {
        Scanner sc = new Scanner(System.in);
        if (plantilla.containsKey(dorsal)) {
            System.out.println("Ese dorsal ya está ocupado.");
            return;
        }

        System.out.print("DNI: ");
        String dni = sc.nextLine();
        System.out.print("Nombre: ");
        String nom = sc.nextLine();
        System.out.print("Posición (Portero, Defensa, Centrocampista, Delantero): ");
        String pos = sc.nextLine();
        System.out.print("Estatura (cm): "); int est = sc.nextInt();

        plantilla.put(dorsal, new Jugador(dni, nom, pos, est));
    }

    static Jugador eliminarJugador(Map<Integer, Jugador> plantilla, Integer dorsal) {
        return plantilla.remove(dorsal);
    }

    static void mostrar(Map<Integer, Jugador> plantilla) {

        System.out.println("MOSTRANDO TODOS LOS JUGADORES");

        ArrayList<Integer> dorsales = new ArrayList<>(plantilla.keySet());
        Collections.sort(dorsales);
        for (Integer dorsal : dorsales) {
            System.out.println("Dorsal " + dorsal + " -> " + plantilla.get(dorsal));
        }
    }

    static void mostrar(Map<Integer, Jugador> plantilla, String posicion) {

        System.out.println("MOSTRANDO " + posicion.toUpperCase() + "S");

        for (Jugador jugador : plantilla.values()) {
            if (jugador.getPosicion().name().equalsIgnoreCase(posicion)) {
                System.out.println(jugador);
            }
        }
    }

    static boolean editarJugador(Map<Integer, Jugador> plantilla, Integer dorsal) {
        if (!plantilla.containsKey(dorsal)) return false;

        Scanner sc = new Scanner(System.in);
        Jugador jugador = plantilla.get(dorsal);
        System.out.print("Nuevo nombre: ");
        jugador.setNombre(sc.nextLine());
        System.out.print("Nueva posición: ");
        jugador.setPosicion(sc.nextLine());
        return true;
    }


}
