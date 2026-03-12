package unidad2.actividadpropuesta;
import java.util.Scanner;
public class ActividadPropuesta22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int numero;
		
		System.out.println("Introduce el número, positivo o negativo: ");
		numero = sc.nextInt();
		sc.close();
		if (numero > 0) {
			System.out.println("El número es positivo");
		} else if (numero < 0) {
			System.out.println("El número es negativo");
		} else System.out.println("El número es 0");
		
		
		
	}
}