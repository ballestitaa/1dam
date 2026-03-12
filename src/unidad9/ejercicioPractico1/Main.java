package unidad9.ejercicioPractico1;

public class Main {

    public static void main(String[] args) {
        casoUsoCoche();
        System.out.println("-----------------------------------");
        casoUsoAvion();
        System.out.println("-----------------------------------");
        casoUsoMotocicleta();
    }

    private static void casoUsoCoche() {
        System.out.println("=== PRUEBA DE COCHE ===");
        Coche miCoche = new Coche(50.0f, 4, 4, 1600);
        
        miCoche.agregarCancion("Jazz en la ciudad");
        miCoche.agregarCanciones(new String[] {"Swing en la noche", "Blues urbano"});
        
        miCoche.reproducirCancion("Jazz en la ciudad");
        System.out.println("Canción actual en el coche: " + miCoche.getCancionActual());
        
        miCoche.aparcar();
        miCoche.detenerCancion();
    }

    private static void casoUsoAvion() {
        System.out.println("=== PRUEBA DE AVIÓN ===");
        Avion miAvion = new Avion(200.0f, 150, 3, 10000.0f);
        
        miAvion.agregarCancion("Vuela alto");
        miAvion.agregarCanciones(new String[] {"Cielos abiertos", "Vientos del este"});
        
        miAvion.reproducirCancion("Vuela alto");
        System.out.println("Canción actual en el avión: " + miAvion.getCancionActual());
        
        miAvion.reportarEstado();
        miAvion.aterrizar();
    }

    private static void casoUsoMotocicleta() {
        System.out.println("=== PRUEBA DE MOTOCICLETA ===");
        Motocicleta miMoto = new Motocicleta(10.0f, 1, 2);
        miMoto.hacerCaballito();
    }
}
