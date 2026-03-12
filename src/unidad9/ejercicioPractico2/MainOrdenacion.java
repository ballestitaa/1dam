package unidad9.ejercicioPractico2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainOrdenacion {

    public static void main(String[] args) {
        List<Coche> coches = new ArrayList<>();
        
        coches.add(new Coche(50.0f, 4, 4, 1800));
        coches.add(new Coche(45.0f, 4, 4, 1600));
        coches.add(new Coche(60.0f, 4, 4, 2000));

        // Orden natural (por número de pasajeros, definido en Vehiculo)
        Collections.sort(coches);
        System.out.println("Ordenados por número de pasajeros:");
        for (Coche coche : coches) {
            System.out.println("Cilindraje: " + coche.getCilindraje() + ", Pasajeros: " + coche.getPasajeros());
        }

        // Ordenados por cilindraje, usando Comparator
        Collections.sort(coches, new CocheCilindrajeComparator());
        System.out.println("Ordenados por cilindraje:");
        for (Coche coche : coches) {
            System.out.println("Cilindraje: " + coche.getCilindraje() + ", Pasajeros: " + coche.getPasajeros());
        }
    }
}

