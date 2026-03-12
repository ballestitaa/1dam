package santiago_ballesta_carmona.ejercicio2;

public class Apartamento extends Alojamiento{

	private int numHabitaciones;
	private boolean tieneTerraza;
	
	public Apartamento(String codigo, String direccion, int capacidad, double precioPorNoche, int numHabitaciones, boolean tieneTerraza) {
		super(codigo, direccion, capacidad, precioPorNoche);
		this.numHabitaciones = numHabitaciones;
		this.tieneTerraza = tieneTerraza;
	}

	public int getNumHabitaciones() {
		return numHabitaciones;
	}

	public void setNumHabitaciones(int numHabitaciones) {
		this.numHabitaciones = numHabitaciones;
	}

	public boolean isTieneTerraza() {
		return tieneTerraza;
	}

	public void setTieneTerraza(boolean tieneTerraza) {
		this.tieneTerraza = tieneTerraza;
	}

	@Override
	public String toString() {
		return "Apartamento [codigo=" + super.getCodigo() + ", direccion=" + super.getDireccion() + ", capacidad=" + super.getCapacidad()
				+ ", precioPorNoche=" + super.getPrecioPorNoche() + "numHabitaciones=" + numHabitaciones + ", tieneTerraza=" + tieneTerraza + "]";
	}
	
	
	
	public void mostrarInformacion() {
		System.out.println("Apartamento [numHabitaciones=" + numHabitaciones + ", tieneTerraza=" + tieneTerraza + "]"); 
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {   // si me comparo conmigo mismo, true
				return true;
		}
	
		if (obj == null || this.getClass() != obj.getClass()) { 
			return false; // si no somos ni la misma clase o alguno es nulo, false
		}
		
		Apartamento otra = (Apartamento) obj; // casteo el obj into Apartamento
		
		return (this.getCodigo().equals(otra.getCodigo()) 
				&& this.getDireccion().equals(otra.getDireccion()) 
				&& this.getCapacidad() == otra.getCapacidad() 
				&& this.getPrecioPorNoche() == otra.getPrecioPorNoche()
				&& this.numHabitaciones == otra.numHabitaciones
				&& this.tieneTerraza == otra.tieneTerraza);
	}
	
}
