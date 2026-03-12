package santiago_ballesta_carmona.ejercicio2;

public class CasaRural extends Alojamiento{

	private double metrosTerreno;
	private boolean tienePiscina;
	
	public CasaRural(String codigo, String direccion, int capacidad, double precioPorNoche, double metrosTerreno, boolean tienePiscina) {
		super(codigo, direccion, capacidad, precioPorNoche);
		this.metrosTerreno = metrosTerreno;
		this.tienePiscina = tienePiscina;
	}

	public double getMetrosTerreno() {
		return metrosTerreno;
	}

	public void setMetrosTerreno(double metrosTerreno) {
		this.metrosTerreno = metrosTerreno;
	}

	public boolean isTienePiscina() {
		return tienePiscina;
	}

	public void setTienePiscina(boolean tienePiscina) {
		this.tienePiscina = tienePiscina;
	}

	@Override
	public String toString() {
		return "CasaRural [codigo=" + super.getCodigo() + ", direccion=" + super.getDireccion() + ", capacidad=" + super.getCapacidad()
				+ ", precioPorNoche=" + super.getPrecioPorNoche() + "metrosTerreno=" + metrosTerreno + ", tienePiscina=" + tienePiscina + "]";
	}
	
	public void mostrarInformacion() {
		System.out.println("CasaRural [metrosTerreno=" + metrosTerreno + ", tienePiscina=" + tienePiscina + "]");
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {   // si me comparo conmigo mismo, true
				return true;
		}
	
		if (obj == null || this.getClass() != obj.getClass()) { 
			return false; // si no somos ni la misma clase o alguno es nulo, false
		}
		
		CasaRural otra = (CasaRural) obj; // casteo el obj into CasaRural
	
		return (this.getCodigo().equals(otra.getCodigo()) 
				&& this.getDireccion().equals(otra.getDireccion()) 
				&& this.getCapacidad() == otra.getCapacidad() 
				&& this.getPrecioPorNoche() == otra.getPrecioPorNoche()
				&& this.metrosTerreno == otra.metrosTerreno
				&& this.tienePiscina == otra.tienePiscina);
	}
}


