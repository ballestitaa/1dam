package ejercicio_practico3.ejercicio825;

public class Punto3D extends Punto{
	
	int z;
	
	public Punto3D(int x, int y, int z){
		super(x, y);
		this.z = z;
	}
		
	public double Distancia(Punto3D otroPunto) {
		double difX = this.x - otroPunto.x;
	    double difY = this.y - otroPunto.y;
	    double difZ = this.z - otroPunto.z;
	    
	    return Math.sqrt(Math.pow(difX, 2) + Math.pow(difY, 2) + Math.pow(difZ, 2));
	}

}
