package unidad9.ejercicioPractico2;

public abstract class Vehiculo implements Comparable<Vehiculo> {

    protected float combustible;
    protected int pasajeros;
    protected int ruedas;

    public Vehiculo(float combustible, int pasajeros, int ruedas) {
        this.combustible = combustible;
        this.pasajeros = pasajeros;
        this.ruedas = ruedas;
    }

    public void arrancar() {
        System.out.println("El vehículo está arrancando...");
    }

    public float getCombustible() {
        return combustible;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public int getNumRuedas() {
        return ruedas;
    }

    @Override
    public int compareTo(Vehiculo otro) {
        // Orden natural: ascendente según el número de pasajeros
        return Integer.compare(this.pasajeros, otro.getPasajeros());
    }
}