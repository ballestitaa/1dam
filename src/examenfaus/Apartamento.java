package examenfaus;

public class Apartamento extends Alojamiento {
    private int numHabitaciones;
    private boolean tieneTerraza;

    public Apartamento(String codigo, String direccion, int capacidad, double precioPorNoche, int numHabitaciones, boolean tieneTerraza) {
        super(codigo, direccion, capacidad, precioPorNoche);
        this.numHabitaciones = numHabitaciones;
        this.tieneTerraza = tieneTerraza;
    }

    public int getNumHabitaciones() { return numHabitaciones; }
    public void setNumHabitaciones(int numHabitaciones) { this.numHabitaciones = numHabitaciones; }

    public boolean isTieneTerraza() { return tieneTerraza; }
    public void setTieneTerraza(boolean tieneTerraza) { this.tieneTerraza = tieneTerraza; }

    @Override
    public String toString() {
        return "Apartamento{" +
                "codigo='" + getCodigo() + '\'' +
                ", direccion='" + getDireccion() + '\'' +
                ", capacidad=" + getCapacidad() +
                ", precioPorNoche=" + getPrecioPorNoche() +
                ", numHabitaciones=" + numHabitaciones +
                ", tieneTerraza=" + tieneTerraza +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        if (getClass() != obj.getClass()) return false;
        Apartamento other = (Apartamento) obj;
        if (numHabitaciones != other.numHabitaciones) return false;
        if (tieneTerraza != other.tieneTerraza) return false;
        return true;
    }

    public void mostrarInformacion() {
        System.out.println("Apartamento - Código: " + getCodigo());
        System.out.println("Dirección: " + getDireccion());
        System.out.println("Capacidad: " + getCapacidad());
        System.out.println("Precio por noche: " + getPrecioPorNoche());
        System.out.println("Número de habitaciones: " + numHabitaciones);
        System.out.println("Tiene terraza: " + (tieneTerraza ? "Sí" : "No"));
    }
}


