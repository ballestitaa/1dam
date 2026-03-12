package unidad9.ejercicioPractico1;

public class Motocicleta extends Vehiculo {

    public Motocicleta(float combustible, int pasajeros, int ruedas) {
        super(combustible, pasajeros, ruedas);
    }

    public void hacerCaballito() {
        System.out.println("La motocicleta hace un caballito.");
    }
}
