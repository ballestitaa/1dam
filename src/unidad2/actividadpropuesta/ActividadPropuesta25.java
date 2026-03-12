package unidad2.actividadpropuesta;
import java.util.Scanner;

public class ActividadPropuesta25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int aforo;
		double precio;
		int entradas;
		double descontado;
		double totalDescuento;
		double totalNoDescuento;
		
		System.out.println("Introduce el aforo total: ");
		aforo = sc.nextInt();
		
		System.out.println("Introduce el precio de cada entrada: ");
		precio = sc.nextDouble();
		
		System.out.println("Introduce el número de entradas vendidas: ");
		entradas = sc.nextInt();
		
		sc.close();
		
		if ((aforo*0.2) > entradas) {
			System.out.println("El evento ha sido cancelado.");
		} else if ((aforo*0.5) > entradas) {
			descontado = precio * 0.75;
			totalDescuento = descontado * entradas;
			System.out.println("Las entradas ahora tienen un 25% de descuento");
			System.out.println("Su valor era de " + precio + "€");
			System.out.println("Su valor actual es de " + descontado + "€");
			System.out.println("El precio total es de " + totalDescuento + "€");
		} else {
			totalNoDescuento = entradas * precio;
			System.out.println("Las entradas tienen un precio total de:" + totalNoDescuento + "€");
		}
	
	
	}
}