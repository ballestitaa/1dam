package unidad12.ejerciciosPracticos.actividad16;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Socio implements Comparable<Socio>, Serializable {

    String dni;
    String nombre;
    LocalDate fechaAlta;

    public Socio(String dni, String nombre, String alta) {
        this.dni = dni;
        this.nombre = nombre;
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fechaAlta = LocalDate.parse(alta, f);
    }


    public Socio(String dni) {
        this.dni = dni;
    }

    int antiguedad() {
        return (int) fechaAlta.until(LocalDate.now(), ChronoUnit.YEARS);
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

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    @Override
    public int compareTo(Socio o) {
        return dni.compareTo(o.dni);
    }


    @Override
    public boolean equals(Object o) {
        return dni.equals(((Socio) o).dni);
    }

    @Override
    public String toString() {
        return "Socio{" + "dni=" + dni + ", nombre=" + nombre
                + ", antiguedad=" + antiguedad() + "}\n";
    }
}
