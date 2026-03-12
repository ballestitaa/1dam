package unidad4.actividadesAplicacion;
import java.util.Scanner;

public class Actividad411 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double radioIntroducido;
		
		System.out.print("Introduce el radio de la esfera a calcular en cm: ");
		radioIntroducido = sc.nextDouble();
		sc.close();
		
		calculadora(radioIntroducido);
		
	}


	public static void calculadora(double radio){

		double superficie;
		double volumen;
		
		superficie = (4 * Math.PI) *Math.pow(radio, 2);
		
		volumen = ((4*Math.PI) / 3) * Math.pow(radio, 3);
	
		System.out.println("La superficie es: "+superficie+"cm");
		System.out.println("El volumen es: "+volumen+"cm");
		
	}
}
