package unidad7.ejemplos.controltower;

public class Aeropuerto {
    private String nombre;
    private String ubicacion;



    public Aeropuerto(String nombre, String ubicacion) {
        setNombre(nombre);
        setUbicacion(ubicacion);
    }
    
    // constructor por defecto
    
    public Aeropuerto() {
        setNombre("Desconocido");
        setUbicacion("Desconocida");
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String toString() {
        return "Aeropuerto [nombre=" + nombre + ", ubicacion=" + ubicacion + "]";
    }
}