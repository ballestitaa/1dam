package examenfaus;

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

	    public String getCodigo() { return codigo; }
	    public void setCodigo(String codigo) { this.codigo = codigo; }

	    public String getDireccion() { return direccion; }
	    public void setDireccion(String direccion) { this.direccion = direccion; }

	    public int getCapacidad() { return capacidad; }
	    public void setCapacidad(int capacidad) { this.capacidad = capacidad; }

	    public double getPrecioPorNoche() { return precioPorNoche; }
	    public void setPrecioPorNoche(double precioPorNoche) { this.precioPorNoche = precioPorNoche; }

	    @Override
	    public String toString() {
	        return "Alojamiento{" +
	                "codigo='" + codigo + '\'' +
	                ", direccion='" + direccion + '\'' +
	                ", capacidad=" + capacidad +
	                ", precioPorNoche=" + precioPorNoche +
	                '}';
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (obj == null) return false;
	        if (getClass() != obj.getClass()) return false;
	        Alojamiento other = (Alojamiento) obj;
	        if (codigo == null) {
	            if (other.codigo != null) return false;
	        } else if (!codigo.equals(other.codigo)) return false;
	        if (direccion == null) {
	            if (other.direccion != null) return false;
	        } else if (!direccion.equals(other.direccion)) return false;
	        if (capacidad != other.capacidad) return false;
	        if (Double.doubleToLongBits(precioPorNoche) != Double.doubleToLongBits(other.precioPorNoche)) return false;
	        return true;
	    }
	}


