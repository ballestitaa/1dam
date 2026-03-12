package ejercicio_practico2.transporteCajas;

public class Caja {
	private int ancho;
	private int alto;
	private int fondo;
	private Unidad unidad;
	private String etiqueta;
	
	// getVolumen b x f x h
	// setEtiqueta
	// toString
	
	public Caja() {
		this.ancho = 0;
		this.alto = 0;
		this.fondo = 0;
		this.unidad = null;
		this.etiqueta = "null";
	}
	
	public Caja(int ancho, int alto, int fondo, Unidad unidad, String etiqueta) {
		setAncho(ancho);
		setAlto(alto);
		setFondo(fondo);
		setUnidad(unidad);
		setEtiqueta(etiqueta);
	}
	
	public double getVolumen() { 		
		return (double) ancho*alto*fondo;	
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public int getFondo() {
		return fondo;
	}

	public void setFondo(int fondo) {
		this.fondo = fondo;
	}

	public Unidad getUnidad() {
		return unidad;
	}

	public void setUnidad(Unidad unidad) {
		this.unidad = unidad;
	}

	public String getEtiqueta() {
		return etiqueta;
	}

	public void setEtiqueta(String etiqueta) {
		if (etiqueta.length() <= 30) {
			this.etiqueta = etiqueta;
		} else {System.out.println("Error");}
	}
	
	@Override
	public String toString() {
		return "Esta caja mide "+ alto + unidad +" de alto, "+ ancho + unidad +" de ancho y "+ fondo + unidad +" de fondo";
	}

}
