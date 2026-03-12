package santiago_ballesta_carmona.ejercicio2;

public class HabitacionHotel extends Alojamiento{

	private int numCamas;
	private boolean incluyeDesayuno;
	
	public HabitacionHotel(String codigo, String direccion, int capacidad, double precioPorNoche, int numCamas, boolean incluyeDesayuno) {
		super(codigo, direccion, capacidad, precioPorNoche);
		this.numCamas = numCamas;
		this.incluyeDesayuno = incluyeDesayuno;
	}

	public int getNumCamas() {
		return numCamas;
	}

	public void setNumCamas(int numCamas) {
		this.numCamas = numCamas;
	}

	public boolean isIncluyeDesayuno() {
		return incluyeDesayuno;
	}

	public void setIncluyeDesayuno(boolean incluyeDesayuno) {
		this.incluyeDesayuno = incluyeDesayuno;
	}

	@Override
	public String toString() {
		return "HabitacionHotel [codigo=" + super.getCodigo() + ", direccion=" + super.getDireccion() + ", capacidad=" + super.getCapacidad()
				+ ", precioPorNoche=" + super.getPrecioPorNoche() + "numCamas=" + numCamas + ", incluyeDesayuno=" + incluyeDesayuno + "]";
	}

	public void mostrarInformacion() {
		System.out.println("HabitacionHotel [numCamas=" + numCamas + ", incluyeDesayuno=" + incluyeDesayuno + "]");
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {   // si me comparo conmigo mismo, true
				return true;
		}
	
		if (obj == null || this.getClass() != obj.getClass()) { 
			return false; // si no somos ni la misma clase o alguno es nulo, false
		}
		
		HabitacionHotel otra = (HabitacionHotel) obj; // casteo el obj into HabitacionHotel
	
		return (this.getCodigo().equals(otra.getCodigo()) 
				&& this.getDireccion().equals(otra.getDireccion()) 
				&& this.getCapacidad() == otra.getCapacidad() 
				&& this.getPrecioPorNoche() == otra.getPrecioPorNoche()
				&& this.numCamas == otra.numCamas
				&& this.incluyeDesayuno == otra.incluyeDesayuno);
	}
	
}
