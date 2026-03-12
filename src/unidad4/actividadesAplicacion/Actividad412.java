package unidad4.actividadesAplicacion;

public class Actividad412 {

	public static void main(String[] args) {
		
		System.out.println(distancia(1, 1, 1, 1));
		
	}

	public static double distancia(double x1, double y1, double x2, double y2) {
		
		double distancia;
		
		distancia = Math.sqrt( Math.pow((x1-x2), 2) + Math.pow(y1-y2, 2) );
		
		return distancia;
		
	}
}
