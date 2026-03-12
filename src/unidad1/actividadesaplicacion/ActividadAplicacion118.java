package unidad1.actividadesaplicacion;
import java.util.Scanner;

/*
 
 Había puesto todas las variables en byte al principo ya que suponía que no se iban 
 a capturar mas de 127 por cada insecto pero como no estaba seguro, he puesto todas en int.

*/

public class ActividadAplicacion118 {
	public static void main(String[] args) {
		int nHormigas;		// 6 patas
		int nAranas;		// 8 patas
		int nCochinillas;	// 14 patas
		int nPatas;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bienvenido a la aplicación de contabilización de insectos capturados");
		System.out.println(" "); // Espacio en las líneas de la consola
		System.out.println("Introduzca el número de hormigas: ");
		nHormigas = sc.nextInt();
		System.out.println("Introduzca el número de arañas: ");
		nAranas = sc.nextInt();
		System.out.println("Introduzca el número de cochinillas: ");
		nCochinillas = sc.nextInt();
		sc.close();
		
		nPatas = (nHormigas*6) + (nAranas*8) + (nCochinillas*14);
		
		System.out.println("El número de patas en total es de: "+nPatas);
	}
}