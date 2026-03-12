package unidad2.actividadpropuesta;
import java.util.Scanner;

public class ActividadPropuesta24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero1;
		int numero2;
		
		System.out.println("Escribe el primer número: ");
		numero1 = sc.nextInt();
		System.out.println("Escribe el segundo número: ");
		numero2 = sc.nextInt();
		sc.close();
		
		if (numero1 % numero2 == 0) {
			System.out.println("true");
		} else System.out.println("false");
		
		
	}
}
