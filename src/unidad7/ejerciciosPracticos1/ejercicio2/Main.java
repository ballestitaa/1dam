package unidad7.ejerciciosPracticos1.ejercicio2;

public class Main {

	public static void main(String[] args) {
	    Punto p1 = new Punto(0, 0);
	    Punto p2 = new Punto(3, 4);

	    // Debe dar 5.0
	    System.out.println("Distancia: " + p1.distanciaEuclidea(p2));

	    System.out.println();
	    
	    // Debe dar X: 10.0, Y: 0.0
	    System.out.println("punto 1");
	    p1.desplaza(10);
	    p1.muestra();

	    System.out.println();
	    
	    //Debe dar X: 2.0, Y: 5.0
	    System.out.println("punto 2");
	    p2.desplaza(-1, 1);
	    p2.muestra();
	}

}
