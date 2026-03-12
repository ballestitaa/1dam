	package examenfaus;

	public class CasaRural extends Alojamiento {
	    private double metrosTerreno;
	    private boolean tienePiscina;

	    public CasaRural(String codigo, String direccion, int capacidad, double precioPorNoche, double metrosTerreno, boolean tienePiscina) {
	        super(codigo, direccion, capacidad, precioPorNoche);
	        this.metrosTerreno = metrosTerreno;
	        this.tienePiscina = tienePiscina;
	    }

	    public double getMetrosTerreno() { return metrosTerreno; }
	    public void setMetrosTerreno(double metrosTerreno) { this.metrosTerreno = metrosTerreno; }

	    public boolean isTienePiscina() { return tienePiscina; }
	    public void setTienePiscina(boolean tienePiscina) { this.tienePiscina = tienePiscina; }

	    @Override
	    public String toString() {
	        return "CasaRural{" +
	                "codigo='" + getCodigo() + '\'' +
	                ", direccion='" + getDireccion() + '\'' +
	                ", capacidad=" + getCapacidad() +
	                ", precioPorNoche=" + getPrecioPorNoche() +
	                ", metrosTerreno=" + metrosTerreno +
	                ", tienePiscina=" + tienePiscina +
	                '}';
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (!super.equals(obj)) return false;
	        if (getClass() != obj.getClass()) return false;
	        CasaRural other = (CasaRural) obj;
	        if (Double.doubleToLongBits(metrosTerreno) != Double.doubleToLongBits(other.metrosTerreno)) return false;
	        if (tienePiscina != other.tienePiscina) return false;
	        return true;
	    }

	    public void mostrarInformacion() {
	        System.out.println("Casa Rural - Código: " + getCodigo());
	        System.out.println("Dirección: " + getDireccion());
	        System.out.println("Capacidad: " + getCapacidad());
	        System.out.println("Precio por noche: " + getPrecioPorNoche());
	        System.out.println("Metros de terreno: " + metrosTerreno);
	        System.out.println("Tiene piscina: " + (tienePiscina ? "Sí" : "No"));
	    }
	}

	

