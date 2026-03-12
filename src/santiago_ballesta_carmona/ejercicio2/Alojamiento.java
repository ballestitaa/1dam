package santiago_ballesta_carmona.ejercicio2;

public class Alojamiento {
	private String codigo;
	private String direccion;
	private int capacidad;
	private double precioPorNoche;
	
	public Alojamiento(String codigo, String direccion, int capacidad, double precioPorNoche) {
		this.codigo = codigo;
		this.direccion = direccion;
		this.capacidad = capacidad;
		this.precioPorNoche = precioPorNoche;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public double getPrecioPorNoche() {
		return precioPorNoche;
	}

	public void setPrecioPorNoche(double precioPorNoche) {
		this.precioPorNoche = precioPorNoche;
	}

	@Override
	public String toString() {
		return "Alojamiento [codigo=" + codigo + ", direccion=" + direccion + ", capacidad=" + capacidad
				+ ", precioPorNoche=" + precioPorNoche + "]";
	}
	
	public boolean equals(Object obj) {
		if (this == obj) {   // si me comparo conmigo mismo, true
				return true;
		}
	
		if (obj == null || this.getClass() != obj.getClass()) { 
			return false; // si no somos ni la misma clase o alguno es nulo, false
		}
		
		Alojamiento otra = (Alojamiento) obj; // casteo el obj into Alojamiento
	
		return(this.codigo.equals(otra.codigo) && this.direccion.equals(otra.direccion)
				&& this.capacidad==otra.capacidad && this.precioPorNoche == otra.precioPorNoche);
	}
	
}
