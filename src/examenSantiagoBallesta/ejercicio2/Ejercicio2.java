package examenSantiagoBallesta.ejercicio2;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//ENTRADA
		double precioKgCacao, precioGCacao;
		double precioKgAzucar, precioGAzucar;
		double precioKgLeche, precioGLeche;
		double precioPorEnvoltorio;
		double cacaoPorTableta;
		double azucarPorTableta;
		double lechePorTableta;
		int unidadesPorCaja;
		
		//SALIDA
		double costeTableta;
		double costeCaja;
		
		
		System.out.println("Calculadora de tabletas y cajas de chocolate: ");
		
		System.out.println("Introduzca el precio por kilo de cacao");
		precioKgCacao = sc.nextDouble();
		precioGCacao = precioKgCacao / 1000;
		
		System.out.println("Introduzca el precio por kilo de azúcar");
		precioKgAzucar = sc.nextDouble();
		precioGAzucar = precioKgAzucar / 1000;
		
		System.out.println("Introduzca el precio por kilo de leche en polvo");
		precioKgLeche = sc.nextDouble();
		precioGLeche = precioKgLeche / 1000;
		
		System.out.println("Introduzca el precio en euros por envoltorio");
		precioPorEnvoltorio = sc.nextDouble();
		
		System.out.println("Introduzca la cantidad en gramos de cacao por tableta");
		cacaoPorTableta = sc.nextDouble();
		
		System.out.println("Introduzca la cantidad en gramos de azúcar por tableta");
		azucarPorTableta = sc.nextDouble();
		
		System.out.println("Introduzca la cantidad en gramos de leche en polvo por tableta");
		lechePorTableta = sc.nextDouble();
		
		System.out.println("Introduzca la cantidad de unidades por caja");
		unidadesPorCaja = sc.nextInt();
		
		sc.close();
		
		costeTableta = (precioGCacao * cacaoPorTableta) + (precioGAzucar * azucarPorTableta) + (precioGLeche * lechePorTableta) + precioPorEnvoltorio;
		costeCaja = costeTableta * unidadesPorCaja;
		
		System.out.println("El precio por tableta es de: "+costeTableta+"€");
		System.out.println("El precio por caja es de: "+costeCaja+"€");
	}

}
