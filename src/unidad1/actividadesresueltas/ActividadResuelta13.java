package unidad1.actividadesresueltas;
import java.util.Scanner;

public class ActividadResuelta13 {
	public static void main(String[] args) {
	      int edad; 
	      Scanner sc = new Scanner(System.in);
	      System.out.print("Escriba su edad: ");
	      edad = sc.nextInt();
	      sc.close();
	      edad++; 
	      System.out.println("El próximo año su edad será: " + edad + " años");
	   }
}
