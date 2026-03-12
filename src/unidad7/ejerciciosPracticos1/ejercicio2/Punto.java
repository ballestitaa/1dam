package unidad7.ejerciciosPracticos1.ejercicio2;

public class Punto {
	private double x;
	private double y;
	
	
	Punto(double x, double y){
		setX(x);
		setY(y);
	}
	
	
	public void setX(double inX){
		this.x = inX;
	}
	
	public void setY(double inY){
		this.y = inY;
	}
	
	public void desplaza(double dx){
		setX(this.x+dx);
	}
	
	public void desplaza(double dx, double dy){
		setX(this.x+dx);
		setY(this.y+dy);
	}
	
	public double distanciaEuclidea(Punto otro) {
		return Math.sqrt(Math.pow(this.x - otro.x, 2) + Math.pow(this.y - otro.y, 2));
	}
	
	public void muestra() {
		
		System.out.println("(" + x + ", " + y + ")");
		
	}
}
