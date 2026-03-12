package unidad1.actividadesaplicacion;
import java.util.Scanner;

public class ActividadAplicacion115 {
	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double x;
		double y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dado el siguiente polinomio, introduzca los valores de cada incógnita: y = ax² + bx + c");
		System.out.println("Incógnita 'a': ");
		a = sc.nextDouble();
		System.out.println("Incógnita 'b': ");
		b = sc.nextDouble();
		System.out.println("Incógnita 'c': ");
		c = sc.nextDouble();
		System.out.println("Incógnita 'x': ");
		x = sc.nextDouble();
		sc.close();
		
		//y = ax² + bx + c
		y = (a*x*x) + (b*x) + c;
		
		System.out.println("El valor de 'y' es: " + y);
	
	}
}