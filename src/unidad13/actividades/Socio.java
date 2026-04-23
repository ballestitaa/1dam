package unidad13.actividades;

import java.time.LocalDate;

public class Socio implements Comparable<Socio> {
    private String dni;
    private String nombre;
    private LocalDate fechaNacimiento;
    private LocalDate fechaAlta;
    private int cuota;
    private int familiares;

    public Socio(String dni, String nombre, LocalDate fechaNacimiento, LocalDate fechaAlta, int cuota, int familiares) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaAlta = fechaAlta;
        this.cuota = cuota;
        this.familiares = familiares;
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

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public int getCuota() {
        return cuota;
    }

    public void setCuota(int cuota) {
        this.cuota = cuota;
    }

    public int getFamiliares() {
        return familiares;
    }

    public void setFamiliares(int familiares) {
        this.familiares = familiares;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Socio socio = (Socio) o;
        return dni.equals(socio.dni);
    }

    @Override
    public String toString() {
        return "Socio{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", fechaAlta=" + fechaAlta +
                ", cuota=" + cuota +
                ", familiares=" + familiares +
                '}';
    }

    public int compareTo(Socio otro){
        return this.dni.compareTo(otro.dni);
    }

    public int edad(){
        return LocalDate.now().getYear() - getFechaNacimiento().getYear();
    }

    public int antiguedad(){
        return (LocalDate.now().getMonthValue()+(LocalDate.now().getYear()*12)) - (getFechaAlta().getMonthValue()+(getFechaAlta().getYear()*12));
    }



}
