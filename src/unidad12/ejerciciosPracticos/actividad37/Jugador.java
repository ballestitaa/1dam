package unidad12.ejerciciosPracticos.actividad37;

import java.util.Objects;

public class Jugador {
    private String dni;
    private String nombre;
    private Posicion posicion;
    private int altura;

    public Jugador(String dni, String nombre, String posicionString, int altura) {
        this.dni = dni;
        this.nombre = nombre;
        setPosicion(posicionString);
        this.altura = altura;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicionString) {
        this.posicion = Posicion.valueOf(posicionString.toUpperCase());
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Jugador jugador = (Jugador) o;
        return altura == jugador.altura && Objects.equals(dni, jugador.dni) && Objects.equals(nombre, jugador.nombre) && posicion == jugador.posicion;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni, nombre, posicion, altura);
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", posicion=" + posicion +
                ", altura=" + altura +
                '}';
    }
}
