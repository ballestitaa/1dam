package examenfaus;

public class HabitacionHotel extends Alojamiento {
    private int numeroCamas;
    private boolean incluyeDesayuno;

    public HabitacionHotel(String codigo, String direccion, int capacidad, double precioPorNoche, int numeroCamas, boolean incluyeDesayuno) {
        super(codigo, direccion, capacidad, precioPorNoche);
        this.numeroCamas = numeroCamas;
        this.incluyeDesayuno = incluyeDesayuno;
    }

    public int getNumeroCamas() { return numeroCamas; }
    public void setNumeroCamas(int numeroCamas) { this.numeroCamas = numeroCamas; }

    public boolean isIncluyeDesayuno() { return incluyeDesayuno; }
    public void setIncluyeDesayuno(boolean incluyeDesayuno) { this.incluyeDesayuno = incluyeDesayuno; }

    @Override
    public String toString() {
        return "HabitacionHotel{" +
                "codigo='" + getCodigo() + '\'' +
                ", direccion='" + getDireccion() + '\'' +
                ", capacidad=" + getCapacidad() +
                ", precioPorNoche=" + getPrecioPorNoche() +
                ", numeroCamas=" + numeroCamas +
                ", incluyeDesayuno=" + incluyeDesayuno +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        if (getClass() != obj.getClass()) return false;
        HabitacionHotel other = (HabitacionHotel) obj;
        if (numeroCamas != other.numeroCamas) return false;
        if (incluyeDesayuno != other.incluyeDesayuno) return false;
        return true;
    }

    public void mostrarInformacion() {
        System.out.println("Habitación de Hotel - Código: " + getCodigo());
        System.out.println("Dirección: " + getDireccion());
        System.out.println("Capacidad: " + getCapacidad());
        System.out.println("Precio por noche: " + getPrecioPorNoche());
        System.out.println("Número de camas: " + numeroCamas);
        System.out.println("Incluye desayuno: " + (incluyeDesayuno ? "Sí" : "No"));
    }
}
