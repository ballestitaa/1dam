package unidad1.actividadesaplicacion;
import java.util.Scanner;

public class ActividadAplicacion116 {
	public static void main(String[] args) {
		int inSegundos;
		int outHoras;
		int outMinutos;
		int outSegundos;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bienvenido a la calculadora de segundos.");
		System.out.println("Introduzca la cantidad de segundos para pasarlo a horas, minutos y segundos.");
		inSegundos = sc.nextInt();
		sc.close();
		
		outHoras = inSegundos / 3600;
		outMinutos = (inSegundos % 3600) / 60;
		outSegundos = inSegundos % 60;
		
		
		System.out.println("El valor introducido son "+outHoras+ " horas.");
		System.out.println("El valor introducido son "+outMinutos+ " minutos.");
		System.out.println("El valor introducido son "+outSegundos+ " segundos.");


	}
}