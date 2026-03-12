package ejercicio_practico2.transporteCajas;

public class CajaCarton extends Caja{

	public CajaCarton() {
		super();
	}
	
	public CajaCarton(int ancho, int alto, int fondo, String etiqueta) {
		super(ancho, alto, fondo, Unidad.CM, etiqueta);
	}
	
	@Override
	public double getVolumen() {
		return super.getVolumen() * 0.8;
	}
	
	public double getSuperficieCarton() {
		return 2 * (getAncho() * getAlto() + 
                	getAncho() * getFondo() + 
                	getAlto() * getFondo());
	}
}
