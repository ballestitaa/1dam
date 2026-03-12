package unidad1.actividadesresueltas;
import java.util.Scanner;

public class ActividadResuelta16Ampliada {
	   public static void main(String[] args) {
		      int nota1, nota2;
		      double media;
		      Scanner sc = new Scanner(System.in);
		      System.out.print("Nota 1: ");
		      nota1 = sc.nextInt();
			  while (nota1 > 10) {
		      	if (nota1 > 10) {
			    	  System.out.print("Esta nota es mayor a 10, introduzca la nota correcta: ");
			    	  nota1 = sc.nextInt();
			    	  }
			  }
		      System.out.print("Nota 2: ");
		      nota2 = sc.nextInt();
		      while (nota2 > 10) {
			      	if (nota2 > 10) {
				    	  System.out.print("Esta nota es mayor a 10, introduzca la nota correcta: ");
				    	  nota2 = sc.nextInt();
				    	  }
				  }
		      sc.close();
		      //calculamos la media
		      media = (nota1 + nota2) / 2.0;
		      System.out.println("La media es: " + media);
		   }
}
