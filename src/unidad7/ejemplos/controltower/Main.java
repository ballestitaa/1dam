package unidad7.ejemplos.controltower;

public class Main {

    public static void main(String[] args) {
        Avion avion1 = new Avion();
        avion1.setModelo("Boeing 747");
        avion1.setCapacidad(660);
        avion1.setVelocidad(917);
        avion1.setAlturaMaxima(13100.0F);
        avion1.setReferencia("REF12345");
        Aeropuerto aeropuerto1 = new Aeropuerto("Aeropuerto Miguel Hernandez", "Alicante, España");

        // System.out.println("Modelo: " + avion1.getModelo());
        // System.out.println("Capacidad: " + avion1.getCapacidad() + " pasajeros");
        // System.out.println("Velocidad: " + avion1.getVelocidad() + " km/h");
        // System.out.println("Altura Máxima: " + avion1.getAlturaMaxima() + " metros");
        // System.out.println("Referencia: " + avion1.getReferencia());

        avion1.despegar();
        
        System.out.println(avion1);
        System.out.println(aeropuerto1);
        avion1.aterrizar();
    
    }

}
