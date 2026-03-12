package unidad3.ejerciciosintroduccion;
import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
	float numero1 = 1;
	float numero2 = 1;
	float solucion;
	Scanner sc = new Scanner(System.in);

	
	
	while (numero1 > 0 && numero2>0) 
	{
		System.out.println("Primer número");
		numero1 = sc.nextInt();
		System.out.println("Segundo número");
		numero2 = sc.nextInt();
		solucion = numero1+numero2;
		System.out.println("Solución = " + solucion);
		
	}
	sc.close();
	}

}
