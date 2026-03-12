package santiago_ballesta_carmona.ejercicio1;

public class Dispositivo {

	private String codigo;
	private String nombre;
	private TipoDispositivo tipo;
	private double precio;
	private char sistemaOperativo;
	
	public Dispositivo(String codigo, String nombre, TipoDispositivo tipo, double precio, char sistemaOperativo) {
		setCodigo(codigo);
		setNombre(nombre);
		setTipo(tipo);
		setPrecio(precio);
		setSistemaOperativo(sistemaOperativo);
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		if (codigo.length() == 6) {
			this.codigo = codigo;
		} else {System.out.println("Error en el código.");}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (nombre.length() <= 50) {
			this.nombre = nombre;
		} else {System.out.println("Error en el nombre.");}
	}

	public TipoDispositivo getTipo() {
		return tipo;
	}

	public void setTipo(TipoDispositivo tipo) { // PORTATIL TABLET SMARTPHONE
		this.tipo = tipo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public char getSistemaOperativo() {
		return sistemaOperativo;
	}

	public void setSistemaOperativo(char sistemaOperativo) {
		String sistemaOperativoString;
		
		sistemaOperativoString = Character.toString(sistemaOperativo);
		if (	   sistemaOperativoString.equals("A") 
				|| sistemaOperativoString.equals("I") 
				|| sistemaOperativoString.equals("W")) {
			this.sistemaOperativo = sistemaOperativo;
		} else {System.out.println("Error, este SO no existe.");}
	}

	@Override
	public String toString() {
		return "Dispositivo [codigo=" + codigo + ", nombre=" + nombre + ", tipo=" + tipo + ", precio=" + precio
				+ ", sistemaOperativo=" + sistemaOperativo + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {   // si me comparo conmigo mismo, true
				return true;
		}
	
		if (obj == null || this.getClass() != obj.getClass()) { 
			return false; // si no somos ni la misma clase o alguno es nulo, false
		}
		
		Dispositivo otra = (Dispositivo) obj; // casteo el obj into Dispositivo
	
		return (this.getCodigo().equals(otra.getCodigo())
				&& this.getNombre().equals(otra.getNombre())
				&& this.getTipo().equals(otra.getTipo())
				&& this.precio == otra.precio
				&& this.sistemaOperativo == otra.sistemaOperativo);
	}
	
	

}
