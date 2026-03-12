package ejercicio_practico3.ejercicio825;

public class Punto {

	int x;
	int y;
	
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public double distancia (Punto otroPunto) {
		double difX = this.x - otroPunto.x;
	    double difY = this.y - otroPunto.y;
	    return Math.sqrt(Math.pow(difX, 2) + Math.pow(difY, 2));
	}

}
