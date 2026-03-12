package unidad1.actividadesaplicacion;
import java.util.Scanner;

public class ActividadAplicacion117 {
	public static void main(String[] args) {
		float medidaMm;				// Medida en milímetros
		float medidaCm;				// Medida en centímetros
		float medidaM;				// Medida en metros
		float medidaFinal;			// Medida final con las operaciones ya realizadas
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Se le van a solicitar tres medidas en diferentes unidades de medida para finalmente devolverle una suma con todas ellas en cm.");
		System.out.println("Introduzca la medida en milímetros");
		medidaMm = sc.nextFloat();
		System.out.println("Introduzca la medida en centímtros");
		medidaCm = sc.nextFloat();
		System.out.println("Introduzca la medida en metros");
		medidaM = sc.nextFloat();
		sc.close();
		
		medidaFinal = (medidaMm / 100) + (medidaCm) + (medidaM * 100); // Paréntesis innecesarios pero así me queda mas claro al programarlo.
		
		System.out.println("Calculando...");		
		System.out.println("El valor de todas las medidas en cm es de: " + medidaFinal);
	}
}