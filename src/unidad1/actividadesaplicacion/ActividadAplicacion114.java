package unidad1.actividadesaplicacion;
import java.util.Scanner;

public class ActividadAplicacion114 {
	public static void main(String[] args) {
		float altura;
		float base;
		float area;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca la base del triángulo (cm): ");
		base = sc.nextFloat();
		System.out.println("Introduzca la altura del triángulo (cm): ");
		altura = sc.nextFloat();
		sc.close();
	
		area = (base*altura)/2;
		
		System.out.println("El área del triángulo es de " + area + "cm.");
	}
}
	