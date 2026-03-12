package unidad1.actividadesaplicacion;
import java.util.Scanner;


public class ActividadAplicacion119 {
	public static void main(String[] args) {
		
		byte entradaInfantil;
		byte entradaAdulto;
		double precioTotal;
		double precioDescontado;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("¡Bienvenido a Aqualandia!");
		System.out.println("");
		System.out.println("Las entradas tienen los siguientes precios: ");
		System.out.println("	Infantiles: 15,50€");
		System.out.println("	Adultos: 20€ ");
		
		System.out.println("Introduzca el número de entradas infantiles que quiera: ");
		entradaInfantil = sc.nextByte();
		System.out.println("Introduzca el número de entradas adulto que quiera: ");
		entradaAdulto = sc.nextByte();
		sc.close();
		
		precioTotal = (entradaInfantil*15.50) + (entradaAdulto*20); 
		if (precioTotal>=100) {
			precioDescontado = precioTotal * 0.95;
			System.out.println("¡Enhorabuena! Ha conseguido un descuento del 5%.");
			System.out.println("");
			System.out.println("Sus entradas tenían un precio total de: " + precioTotal + "€");
			System.out.println("Pero gracias al descuento, se ha quedado en: " + precioDescontado + "€");		
		} else {
			System.out.println("El precio total de sus entradas es de: " + precioTotal + "€");
		}
	
	}
}