package examenSantiagoBallesta.ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float precioPorGallina;
		int vidaMediaGallina;
		float precioComidaDiaria;
		float huevosGallinaDiarios;

		System.out.println("Calculadora de precio de huevos del gallinero");
		
		System.out.println("Introduzca el precio por gallina: ");
		precioPorGallina = sc.nextFloat();
		System.out.println("Introduzca la vida media en días naturales de una gallina: ");
		vidaMediaGallina = sc.nextInt();
		System.out.println("Introduzca el precio medio del pienso que come una gallina cada día: ");
		precioComidaDiaria = sc.nextFloat();
		System.out.println("Introduzca el número de huevos medio que pone una gallina al día: ");
		huevosGallinaDiarios = sc.nextFloat();
		
		sc.close();
		
		
		System.out.println("El precio por cada huevo es de: " + calcularPrecio(precioPorGallina, vidaMediaGallina, precioComidaDiaria, huevosGallinaDiarios)+"€.");
	}
	
	
		public static float calcularPrecio( float precioGallina, int vidaDiasGallina, float precioDiaPienso, float huevosDia ) {
			
			float precioPiensoTotal = vidaDiasGallina * precioDiaPienso;
			float huevosVida = vidaDiasGallina * huevosDia;
			
			float precioHuevo = (precioGallina + precioPiensoTotal ) / huevosVida;
			
			return precioHuevo;
			
			
		}

}
