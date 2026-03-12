package unidad1.actividadesaplicacion;
import java.util.Scanner;

public class ActividadAplicacion111 {
	public static void main(String[] args) {
		
		float baseImponible;
		float iva;
		float importeTotal;
		float importeIva;
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Conectado y reproduciendo \n hola");

		
		System.out.println("Introduzca la base imponible: ");
		baseImponible = sc.nextFloat();
		System.out.println("Introduzca el IVA: ");
		iva = sc.nextFloat();
		sc.close();
		
		iva = (iva/100);
		importeIva = baseImponible * iva;
		iva++;
		importeTotal = iva * baseImponible;

		System.out.println("El importe total es de :" + importeTotal +"€");
		System.out.println("El importe del IVA es de :" + importeIva +"€");

	}
}
