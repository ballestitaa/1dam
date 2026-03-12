package unidad2.actividadpropuesta;
import java.util.Scanner;
public class ActividadPropuesta21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int valor1;
		int valor2;
		
		boolean menor;
		boolean igual;
		boolean mayor;
		boolean distinto;
		
		
		System.out.println("Introduce el primer valor:");
		valor1 = sc.nextInt();
		
		System.out.println("Introduce el segundo valor:");
		valor2 = sc.nextInt();
	
		
		menor = valor1<valor2;
		mayor = valor1>valor2;
		igual = valor1==valor2;
		distinto = valor1!=valor2;
		
		System.out.println("¿El valor 1 es menor al valor 2?: " + menor);
		
		System.out.println("¿El valor 1 es mayor al valor 2?: " + mayor);
		
		System.out.println("¿El valor 1 es igual al valor 2?: " + igual);
		
		System.out.println("¿El valor 1 es distinto al valor 2?: " + distinto);

	
		sc.close();
	}
}