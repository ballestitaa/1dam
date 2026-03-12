package unidad7.ejemplos.controltower;

public class Avion {

    private String modelo;
    private int capacidad;
    private int velocidad;
    private float alturaMaxima;
    private String referencia;
    
// constructor por defecto

 
    public Avion() {
        setModelo("Desconocido");
        setCapacidad(0);
        setVelocidad(0);
        setAlturaMaxima(0.0F);
        setReferencia("N/A");
    }       

    
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }   
    public float getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    public int getVelocidad() {
        return velocidad;
    }
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    public float getAlturaMaxima() {
        return alturaMaxima;
    }
    public void setAlturaMaxima(float alturaMaxima) {
        this.alturaMaxima = alturaMaxima;
    }
    public void despegar() {
        System.out.println("El avión " + modelo + " está despegando.");
    }
    public void aterrizar() {
        System.out.println("El avión " + modelo + " está aterrizando.");
    }

    public String getReferencia() {
        return referencia;
    }
    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }


    public void imprimir() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Capacidad: " + this.capacidad + " pasajeros");
        System.out.println("Velocidad: " + this.velocidad + " km/h");
        System.out.println("Altura Máxima: " + this.alturaMaxima + " metros");
    }
    public String toString() {
        return "Avion [modelo=" + modelo + ", capacidad=" + capacidad + ", velocidad=" + velocidad
                + ", alturaMaxima=" + alturaMaxima + "]";
    }
}

