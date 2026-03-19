package unidad12.ejerciciosPracticos.actividad25;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class Socio implements Comparable<Socio>, Serializable {

    String apodo;
    String nombre;
    LocalDate fechaAlta;

    public Socio(String apodo, String nombre, String alta) {
        this.apodo = apodo;
        this.nombre = nombre;
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fechaAlta = LocalDate.parse(alta, f);
    }


    public Socio(String apodo) {
        this.apodo = apodo;
    }

    int antiguedad() {
        return (int) fechaAlta.until(LocalDate.now(), ChronoUnit.YEARS);
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
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
        return apodo.compareTo(o.apodo);
    }


    @Override
    public boolean equals(Object o) {

        if (this == o){
            return true;
        }

        if (o == null || this.getClass() != o.getClass()){
            return false;
        }

        return apodo.equals(((Socio) o).apodo);
    }

    @Override
    public String toString() {
        return "Socio{" + "apodo=" + apodo + ", nombre=" + nombre
                + ", antiguedad=" + antiguedad() + "}\n";
    }

    @Override
    public int hashCode() {
        return Objects.hash(apodo);
    }
}
