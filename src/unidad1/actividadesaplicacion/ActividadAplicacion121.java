package unidad1.actividadesaplicacion;
import java.util.Scanner;

public class ActividadAplicacion121 {
	public static void main(String[] args) {
		double a;
		double b;
		boolean c;
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("--Comparador de dos valores--");
		System.out.println("");
		System.out.println("Introduzca el primer valor:");
		a = sc.nextDouble();
		System.out.println("Introduzca el segundo valor:");
		b = sc.nextDouble();
		sc.close();
		c = a == b ? true: false;
		
		System.out.println(c);
	}
}
