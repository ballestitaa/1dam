package unidad1.actividadesresueltas;
import java.util.Scanner;

public class ActividadResuelta14 {
	   public static void main(String[] args) {
		      int aActual;
		      int aNacimiento;
		      int edad;
		      Scanner sc = new Scanner(System.in);
		      System.out.print("Año de nacimiento: ");
		      aNacimiento = sc.nextInt();
		      System.out.print("Año actual: ");
		      aActual = sc.nextInt();
		      sc.close();
		      edad = aActual - aNacimiento;
		      System.out.println("Su edad es: " + edad + " años.");
		   }
}
